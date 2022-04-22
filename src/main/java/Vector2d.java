public class Vector2d {

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    private double x;
    public double y;

    public double length(){
        return Math.sqrt(x * x + y * y);
    }

}
