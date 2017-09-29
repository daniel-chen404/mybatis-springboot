package com.example.utils;

public class Test {

    private Test() {

    }


    private static class A{
       private static Test instance = new Test();
    }

    private static Test getInstance(){
        return A.instance;
    }
}
