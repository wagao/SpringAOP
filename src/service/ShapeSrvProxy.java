/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import aspect.LoggingAspc;
import model.Circle;

/**
 *
 * @author Emma
 */
public class ShapeSrvProxy extends ShapeSrv{
    
    public Circle getCircle() {
        System.out.println("proxy getCircle");
        new LoggingAspc().logAdv();
        return super.getCircle();
    }
}
