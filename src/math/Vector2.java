package math;

public class Vector2 {

    public double x;
    public double y;

    public Vector2(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Vector2() {}

    public Vector2(Vector2 v) {
        this.set(v);
    }

    public void set(Vector2 v) {
        this.x = v.x;
        this.y = v.y;
    }

    public void set(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Vector2 add(Vector2 v) {
        this.x += v.x;
        this.y += v.y;
        return this;
    }

    public Vector2 sub(Vector2 v) {
        this.x -= v.x;
        this.y -= v.y;
        return this;
    }

    public Vector2 dot(Vector2 v) {
        this.x *= v.x;
        this.y *= v.y;
        return this;
    }

    public Vector2 scale(double s) {
        this.x *= s;
        this.y *= s;
        return this;
    }

    public double length() {
        return Math.hypot(x,y);
    }

    public Vector2 normalize() {
        if(this.length() != 0) {
            this.x /= this.length();
            this.y /= this.length();
        }
        return this;
    }

    public Vector2 clone() {
        return new Vector2(this);
    }

    public String toString() {
        return this.x + ", " + this.y;
    }

}
