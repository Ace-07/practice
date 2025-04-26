import java.lang.reflect.Array;
import java.util.*;
import java.lang.Math;
import java.util.Arrays;
import java.util.Collections;



public class Main {
    public static void main(String[] args) {
        Point[] vertices = new Point[3];
        vertices[0] = new Point(0, 0);
        vertices[1] = new Point(4, 0);
        vertices[2] = new Point(4, 3);

        double area = area(vertices, 3); 
        System.out.println("Area of polygon: " + area);





    }
    public static class Point{//i m using constructor because i dont know if we can use struct on java or not
        double x;
        double y;
        public Point(int a , int b){
            this.x =a;
            this.y =b;
        }
    }
    public static double cross_product(Point a, Point b){
        return a.x * b.y - a.y * b.x;
    }
    public static double area(Point[] vertices ,int n ){
        double sum = 0;
        for(int i = 0 ; i <n ;i ++){
            sum += cross_product(vertices[i],vertices[(i+1) %n]);
        }
        return Math.abs(sum)/2.0;
    }
}








