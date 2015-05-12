/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aspect;

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
    
    @Before("allGetter() && allCircleMed()")// combine pointcuts
    public void loggingAdvi(){
        System.out.println("Log in Advice Log Aspect.Before method");
    }
    
//    @Before("execution(* get*(..))")
    @Before("allGetter()") 
    public void secAdv(){
        System.out.println("Exc Log in Sec Advice Log Aspect.");
    }
    @Pointcut("execution(* get*(..))")
    public void allGetter(){    }
    
    @Pointcut("within(model.Circle)") // any method within that Class    
//    @Pointcut("within(model.Circle..*)") // any method or subPackage method, or class
    public void allCircleMed(){    }
    
    
    
//    @Pointcut(args())
//    public void allCircle(){    }
}
