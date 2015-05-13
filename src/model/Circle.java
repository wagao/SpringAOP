/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.IOException;
import java.util.concurrent.TimeoutException;
import javax.xml.crypto.dsig.TransformException;
import org.omg.CORBA.UserException;
import org.omg.CORBA.portable.ApplicationException;

/**
 *
 * @author Emma
 */
public class Circle {
    
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("Set Name:"+name);
//        throw(new IndexOutOfBoundsException());
//        throw(new RuntimeException()); // for different type of Ex, can have different throw Method in AspectLogging
    }
//    public String setNameReturn(String name) {
//        this.name = name;
//        System.out.println("Set Name:"+name);
////        throw(new RuntimeException());
//        return this.name;
//    }
}
