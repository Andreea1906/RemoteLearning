package com.nagarro.remotelearning.week5p2.service;

import com.nagarro.remotelearning.week5p2.GivenInterface;
import com.nagarro.remotelearning.week5p2.Logged;

class MethodImplementation implements GivenInterface {
    @Override
    @Logged
    public void method() {
        System.out.println("Some method implementation");
    }
}
