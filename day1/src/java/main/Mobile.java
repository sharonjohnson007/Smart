package java.main;

public class Mobile {
    String mobilename;
    String colour;
    float length;
    float breath;

void display()
{
    System.out.println("Shows the information in image,video or text format ");
}
void camera()
{
    System.out.println("captures the targeted image");
}
void speaker()
{
    System.out.println("produce sounds");
}
void processor()
{
  System.out.println("process the users task");
}
void battery()
{
    System.out.println("Stores and supply electric power");
}
public static void main(String args[])
{
    Mobile m=new Mobile();
    m.camera();
}
}
