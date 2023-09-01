/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package version1;

/**
 *
 * @author User
 */
public class MyPoint {

    private double y;
    private double x;

    public MyPoint(double y, double x) {
        this.y = y;
        this.x = x;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getDistance(double x, double y) {
        return Math.hypot(this.x - x, this.y - y);
    }
    
    public double getDistance(MyPoint p){
        return getDistance(p.x, p.y);
    }
    
    public double getDistance(){
        return getDistance(0,0);
    }
    
    public void displayPoint(){
        System.out.printf("(%.0f, %.0f)\n", x, y);
    }
    
    public int getQuadrant(){
        if(x > 0 && y > 0){
            return 1;
        }else if(x < 0 && y > 0){
            return 2;
        }else if(x < 0 && y < 0){
            return 3;
        }else if(x > 0 && y < 0){
            return 4;
        }else if(x != 0 && y == 0){
            return 5;
        }else if(x == 0 && y != 0){
            return 6;
        }else if(x == 0 && y == 0){
        }
        return 0;
    }
    public double getAngle(){
        return Math.toDegrees(Math.atan2(x, y));
    }

    @Override
    public String toString() {
        return "MyPoint{" + "y = " + y + ", x= " + x + '}';
    }
    
    
}
