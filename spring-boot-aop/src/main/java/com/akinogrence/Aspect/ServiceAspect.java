package com.akinogrence.Aspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ServiceAspect {

    @Before("execution(* com.akinogrence.services.MessageService.sendMessageWithUser(..))")
    public void beforeSendMessage(JoinPoint joinPoint) {
        System.out.println("Mesaj gonder metodundan önce parametre yakalandi param: " + joinPoint.getArgs()[0]);
        System.out.println(joinPoint.getSignature());

    }

    @After("execution(* com.akinogrence.services.MessageService.sendMessageWithUser(..))")
    public void afterSendMessage(JoinPoint joinPoint) {
        System.out.println("Mesaj gonder metodundan sonra parametre yakalandi param: " + joinPoint.getArgs()[0]);
        System.out.println(joinPoint.getSignature());
    }
}
