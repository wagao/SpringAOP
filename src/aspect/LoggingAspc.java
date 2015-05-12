/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aspect;

import model.Circle;
import org.aspectj.lang.JoinPoint;
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
    
    @Before("allCircleMed()")// combine pointcuts
    public void loggingAdvi(JoinPoint joinP){
//        System.out.println(joinP.toString()); // get the Called info
//        System.out.println(joinP.getTarget()); // get caller and use it
//        Circle c= (Circle) joinP.getTarget();        
    }
     @Before("args(str)")
     public void stringArgumentsMed(String str){
        System.out.println("Meds take String as Para:"+str);         
     }
     
    
    @Pointcut("within(model.Circle)") // any method within that Class    
//    @Pointcut("within(model.Circle..*)") // any method or subPackage method, or class
    public void allCircleMed(){    }
    
    
    
//    @Pointcut(args())
//    public void allCircle(){    }
}
