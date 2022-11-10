 public class Circle
{
    public double radius;

    public String colour;
    private Object circumference;

    public Circle(){
        radius=1.0;
        colour="red";
    }
    public Circle(double r){
        radius=r;
        colour="red";
    }
    public Circle(double r,String c){
        radius=r;
        colour=c;
    }

    public double getRadius() {
        return radius;
    }
    public double getArea(){
        return radius*radius*Math.PI;

    }
    public void setRadius(double newRadius) {
        radius = newRadius;
    }
    public void setColor(String newColor){
        colour= newColor;
    }

    public String getColour() {
        return colour;
    }
    public String toString() {
        return "Circle[radius=" + radius + " color=" + colour + "]";
    }

    public Object getCircumference() {
        return circumference;
    }

    public void setCircumference(double circumference) {
        this.circumference = 2*Math.PI*radius;
    }
}
