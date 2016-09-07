package mainpackage;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * Create Aspect
 * Created by vijitha on 07/09/16.
 */
@Aspect
@Component
public class AspectCar {

    @Around("execution(* *.*.carName())")
    public void  doBasicProfiling(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("Start");
        pjp.proceed();
        System.out.println("End");
    }

}
