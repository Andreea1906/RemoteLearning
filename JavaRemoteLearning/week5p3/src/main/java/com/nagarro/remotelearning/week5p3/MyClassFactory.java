package com.nagarro.remotelearning.week5p3;

import com.nagarro.remotelearning.week5p3.MyClass;

public class MyClassFactory {
    private MyClass myClassInstance;

    public MyClassFactory(MyClass myClassInstance) {
        this.myClassInstance = myClassInstance;
    }

    public MyClass createMyClassInstance() {
        return myClassInstance;
    }

//    public com.nagarro.remotelearning.week5p3.MyClass reloadMyClassInstance(String classFilePath) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
//
//    }
}

