// Question: How does passing a mutable Point object to a method change it?
package Methods;

import java.awt.*;

public class PointClass {
    public static void main(String[] args) {
        Point p1 = new Point();
        p1.x = 8;
        p1.y = 2;
        System.out.println(p1.x +","+ p1.y );

        //passing arguement by reference
        change(p1);
        System.out.println(p1.x + "," + p1.y);

        
    }
    private static void change(Point w){
        w.x = 3;
        w.y = 9;
    }
 }



