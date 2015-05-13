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
public class ShapeSrv {
    private Circle circle;
    private Triangle triangle;

    public Circle getCircle() {
   //     throw(new IndexOutOfBoundsException());
        System.out.println("getCircle");
        return circle;
    }

    public void setCircle(Circle circle) {
        this.circle = circle;
    }

    public Triangle getTriangle() {
        return triangle;
    }

    public void setTriangle(Triangle triangle) {
        this.triangle = triangle;
    }
    
    
}
