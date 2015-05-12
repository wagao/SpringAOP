/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 *
 * @author Emma
 */
@Aspect
public class LoggingAspc {
    @Before("execution(public String getName())")
    public void loggingAdvi(){
        System.out.println("Log in Advice Log Aspect.Before method");
    }
}
