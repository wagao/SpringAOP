/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aspect;

import model.Circle;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 *
 * @author Emma
 */
@Aspect
public class LoggingAspc {
//    @Around("allGetter()")
     public Object myAround(ProceedingJoinPoint pjp){
         Object returnValue =null;
         try{
            System.out.println("before Around");         
            returnValue = pjp.proceed(); // execute target method
            System.out.println("After Around Return");   
         }catch(Throwable E){
            System.out.println("After Around Throw");               
         }
        System.out.println("After Around Finally");
        return returnValue;
     }
//     
     public void logAdv(){
        System.out.println("log Adv");  
     }
}
