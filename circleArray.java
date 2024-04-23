public class circle {
    int radius;
    public circle(int radius) {
        this.radius = radius;
    }
    public double getArea() {
        return 3.14*radius*radius;
    }
}

public class circleArray {
    public static void main(String[] args) {
        Circle[] c;
        c = new Circle(5);

        for(int i= 0; i < c.length; i++) {
            System.out.println((int)(c[i].getArea())+" ");
        }
    }
    
}