package kr.re.kitri.kitribook.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1000)
public class PerformanceMeasureAspect {

    @Around("execution(* kr.re.kitri.kitribook.controller.*.*(..))")
    public Object measureMethodRunningTime(ProceedingJoinPoint joinPoint) throws Throwable {
        String clsName = joinPoint.getSignature().getDeclaringTypeName();
        String methodName = joinPoint.getSignature().getName();
        long startTime = System.currentTimeMillis();

        Object targetMethod = joinPoint.proceed();
        long endTime = System.currentTimeMillis();

        long estimatedTime = endTime - startTime;
        System.out.println(clsName + ", " + methodName + ", " + estimatedTime);


        return targetMethod;
    }
}
