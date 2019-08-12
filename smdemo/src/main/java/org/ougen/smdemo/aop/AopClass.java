package org.ougen.smdemo.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.ougen.smdemo.event.QueryEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Author: OuGen
 * Discription:
 * Date: 14:53 2019/7/25
 */
@Aspect
@Component
public class AopClass {
    private static Logger logger = LoggerFactory.getLogger(AopClass.class);
    @Autowired
    private ApplicationContext context;
    @Pointcut("execution(* org.ougen.smdemo.service.impl.StudentServiceImpl.getOne(..)))")
    public void p1(){}

    @Before("p1()")
    public void before(JoinPoint joinPoint){
        logger.info("监听方法{}",joinPoint.getSignature().getName());
        logger.info("监听方法{}",joinPoint.getKind());
        context.publishEvent(new QueryEvent("查询开始"));
    }
}
