package com.augmentum.oes.advice;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class MethBeforeAdvice implements MethodBeforeAdvice {

    @Override
    public void before(Method arg0, Object[] arg1, Object arg2)
            throws Throwable {
        System.out.println("before");
    }
}
