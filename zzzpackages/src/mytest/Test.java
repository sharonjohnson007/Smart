package mytest;

import com.zzz.geometry.Circle;
import com.zzz.geometry.Cylinder;
import com.yyy.animal.Cat;

/**
 * To access the class of one package from another package.
 */

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);
        Cat cat = new Cat();
        System.out.println(cat);
    }
}
