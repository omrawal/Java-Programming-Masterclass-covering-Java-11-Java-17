public class Point {
    private int x;
    private int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    public double distance(){
        return Math.sqrt((this.x)*(this.x)+(this.y)*(this.y));
    }
    public  double distance(int px,int py){
        return Math.sqrt((this.x-px)*(this.x-px)+(this.y-py)*(this.y-py));
    }
    public double distance(Point obj){
        return Math.sqrt((this.x-obj.x)*(this.x-obj.x)+(this.y-obj.y)*(this.y-obj.y));
    }


}
