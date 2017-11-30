package com.augmentum.oes.advice;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

import com.augmentum.oes.AppContext;
import com.augmentum.oes.service.impl.UserServiceImpl;

public class LogMethodTimeAspect{
    private final Logger logger = Logger.getLogger(UserServiceImpl.class);

    public void doAfter(JoinPoint jp) {
        System.out.println("log Ending method :" + jp.getTarget().getClass().getName() + "." + jp.getSignature().getName());
    }

    public Object doAround(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("invoke");
        long startTime = System.currentTimeMillis();

        //call target method
        Object returnValue = pjp.proceed();
        String methodName = pjp.getSignature().getName();

        long endTime = System.currentTimeMillis();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(AppContext.getAppContent().getUserName());
        stringBuilder.append(":");
        stringBuilder.append(pjp.getTarget().getClass().getSimpleName());
        stringBuilder.append(":");
        stringBuilder.append(methodName);
        stringBuilder.append(":");
        stringBuilder.append(endTime-startTime);

        logger.info(stringBuilder);

        return returnValue;
    }
}
