/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import model.Circle;
import model.Triangle;

/**
 *
 * @author Emma
 */
public class FactorySrv {
    public Object getBean(String beanType){
        if (beanType.equals("ShapeSrv") )
            return new ShapeSrvProxy(); //subclass will call parent class by super();
        if (beanType.equals("Circle") )
            return new Circle();
        if (beanType.equals("Triangle") )
            return new Triangle();
        return null;
    }
}
