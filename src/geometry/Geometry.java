/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometry;

import version1.MyPoint;

/**
 *
 * @author User
 */

public class Geometry {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        MyPoint p1 = new MyPoint(5,2);
        MyPoint p2 = new MyPoint(2,3);
        MyPoint p3 = new MyPoint(4,9);
        p1.displayPoint();
        double d1 = p1.getDistance(3,1);
        double d2 = p2.getDistance(p1.getX(), p1.getY());
        double d3 = p3.getDistance();
        double angle1 = p1.getAngle();
        
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(angle1);
    }
    
}
