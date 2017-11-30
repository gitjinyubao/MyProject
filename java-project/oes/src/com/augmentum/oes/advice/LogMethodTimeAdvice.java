package com.augmentum.oes.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.apache.log4j.Logger;

import com.augmentum.oes.AppContext;
import com.augmentum.oes.service.impl.UserServiceImpl;

public class LogMethodTimeAdvice implements MethodInterceptor{
    private final Logger logger = Logger.getLogger(UserServiceImpl.class);

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        System.out.println("invoke");
        long startTime = System.currentTimeMillis();

        //call target method
        Object returnValue = invocation.proceed();
        String methodName = invocation.getMethod().getName();

        long endTime = System.currentTimeMillis();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(AppContext.getAppContent().getUserName());
        stringBuilder.append(":");
        stringBuilder.append(invocation.getMethod().getDeclaringClass().getSimpleName());
        stringBuilder.append(":");
        stringBuilder.append(methodName);
        stringBuilder.append(":");
        stringBuilder.append(endTime-startTime);

        logger.info(stringBuilder);

        return returnValue;
    }

}
