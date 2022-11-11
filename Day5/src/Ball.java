public class Ball {

    public float x;
    public float y;
    public int radius;
    public float xDelta;
    public float yDelta;

    public Ball(float x, float y, int radius, float xDelta, float yDelta) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.xDelta = xDelta;
        this.yDelta = yDelta;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {

    }
    public void setXDelta(float xDelta){

    }
    public float getXDelta(){
        return xDelta;
    }
    public void setYDelta(float yDelta){

    }
    public float getYDelta(){
        return yDelta;
    }



    public void move(){
        x +=xDelta; y+=yDelta;
    }
    public void reflectHorizontal(){
        xDelta=-xDelta;
    }
    public void reflectVertical(){
        yDelta=-yDelta;
    }
    public String toString(String speed) {
        return "Ball= [ (" + x +"," + y + ")  speed =(" + xDelta + "," + yDelta + ")]";
    }








    }


