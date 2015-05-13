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
//    @Before("execution(public * model.*.get*(..))")
    
//    @After("args(str)")
//     public void stringArgumentsMed(String str){
//        System.out.println("after Meds take String as Para:"+str);         
//     }
//     
//    @AfterReturning("args(str)")
//     public void stringArgumentsMedAfterReturn(String str){
//        System.out.println("run after Meds Return"+str);         
//     }
//     
//    @AfterThrowing("args(str)")
//     public void theAfterThrow(String str){
//        System.out.println("Exception:  ");         
//     }
//     
//    @AfterReturning(pointcut="args(str)", returning="returningObje")
//     public void myReturnSet(String str,Object returningObje){
//        System.out.println("Return after Return "+returningObje);         
//     }
//    
//     
//    @AfterThrowing(pointcut="args(str)", throwing="throwEx")
//     public void myThrowSet(String str,  NullPointerException throwEx){
//        System.out.println("Throw after Null Ex:"+ throwEx );         
//     }
//     
//    @AfterThrowing(pointcut="args(str)", throwing="throwEx")
//     public void myThrowSet2(String str, IndexOutOfBoundsException throwEx){
//        System.out.println("out of bound Ex:"+ throwEx );         
//     }
//     
     @Around("allGetter()")
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
     
    @Pointcut("execution(* get*())")
    public void allGetter(){}
}
