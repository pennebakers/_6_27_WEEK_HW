public class Point {

    private int x;
    private int y;

    public Point(){
        this.x = 0;
        this.y = 0;
    }

    public Point(int xVal, int yVal){
        this.x = xVal;
        this.y = yVal;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public void setPoint(int newX, int newY){
        this.x = newX;
        this.y = newY;
    }

    public String toString(){
        String string = "(" + this.x + ", " + this.y + ")";
        return string;
    }

    public double distance(Point p){

        double equation = Math.sqrt(Math.pow(this.x - p.x, 2) + Math.pow(this.y - p.y, 2));
        return equation;
    }
}
