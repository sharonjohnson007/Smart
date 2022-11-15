public class MyPoint {

    private int x = 0;
    private int y = 0;

    public MyPoint() {
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int[] getXY() {
        int a[] = {x,y};
        return a;

    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "(x,y)" +"("+ x + "," + y +")";
    }

    public double distance(int x, int y) {

        int xDiff = this.x - x;
        int yDiff = this.y - y;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);


    }

    public double distance1() {
        int x = 0;
        int y = 0;

        int xDiff = this.x - x;
        int yDiff = this.y - y;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    public double distance(MyPoint another) {

        int xDiff=this.x- another.x;
        int yDiff=this.y-another.y;
        return (xDiff*xDiff+yDiff*yDiff);


    }
    public double distance(){
            int xx=this.x-x;
            int yy=this.y-y;
        return (xx*xx+yy*yy);
    }
}



