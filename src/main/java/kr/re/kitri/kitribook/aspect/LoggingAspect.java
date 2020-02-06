package kr.re.kitri.kitribook.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* kr.re.kitri.kitribook.service.KitriBookService.*(..))")
    public void logBefore(JoinPoint joinPoint) {
        String clsName = joinPoint.getSignature().getDeclaringTypeName();
        String methodName = joinPoint.getSignature().getName();
        System.out.println(clsName + ", "+ methodName + "메소드에서 AOP로 로그 남김");
    }
}
