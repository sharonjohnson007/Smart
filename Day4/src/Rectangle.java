public class Rectangle {

    private float length;
    private float width;

    public Rectangle()
    {
        length=1.0f;
        width=1.0f;

    }
    public Rectangle(float l,float w) {
        length=l;
        width=w;
    }
    public float getLength() {
        return length;
    }
    public void setLength( float length){

    }
    public float getWidth(){
        return width;
    }

    public void setWidth(float width) {
    }
    public double getArea() {
        return length*width;
    }
    public double getPerimeter() {
        return 2*length+2*width;
    }
    public String toString() {
        return "Rectangle[length=" + length + " width=" + width + "]";
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(1.2f, 3.4f);
        System.out.println(r1);
        Rectangle r2 = new Rectangle();
        System.out.println(r2);

        r1.setLength(5.6f);
        r1.setWidth(7.8f);
        System.out.println(r1);
        System.out.println("length is: " + r1.getLength());
        System.out.println("width is: " + r1.getWidth());

        System.out.printf("area is: %.2f%n", r1.getArea());
        System.out.printf("perimeter is: %.2f%n", r1.getPerimeter());

    }
}
