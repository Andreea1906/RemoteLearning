package com.nagarro.remotelearning.week5p2.service;


import java.lang.reflect.*;
import java.util.Arrays;

class LoggingProxyFactory {
    @SuppressWarnings("unchecked")
    public static <T> T createProxy(T target) {
        return (T) Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                (proxy, method, args) -> {

                    boolean isLogged = method.isAnnotationPresent(Logged.class) || target.getClass().isAnnotationPresent(Logged.class);

                    if (isLogged) {

                        System.out.println("Method invoked: " + method.getName());
                        System.out.println("Object: " + target);
                        System.out.println("Object type: " + target.getClass());
                        System.out.println("Parameters: " + Arrays.toString(args));
                    }

                    return method.invoke(target, args);
                });
    }
}