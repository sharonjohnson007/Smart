
public class TestCircle {
    public static void main(String[] args) {

        Circle c = new Circle();
        System.out.println("the radius of circle" + c.getRadius() + "the area of circle" + c.getArea());
        Circle c1 = new Circle(2.0);
        System.out.println("the radius of circle" + c1.getRadius() + "the area of circle" + c1.getArea());
        Circle c4 =new Circle();
        c4.setRadius(5.5);
        System.out.println("the radius is " +c4.getRadius());
        c4.setColor("green");
        System.out.println("the color is" +c4.getColour());
        Circle c5 = new Circle(5.5);
        System.out.println(c5);
        Circle c6 = new Circle(6.6);
        System.out.println(c6);
        System.out.println(c6);
        System.out.println("Operator '+' invokes toString() too: " + c6);


    }
}
