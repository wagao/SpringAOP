/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springaop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.FactorySrv;
import service.ShapeSrv;

/**
 *
 * @author Emma
 */
public class SpringAOP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FactorySrv facSrv = new FactorySrv();
        ShapeSrv shapeSrv = (ShapeSrv) facSrv.getBean("ShapeSrv");
        shapeSrv.getCircle();//.setName("Dummy");
    }
    
}
