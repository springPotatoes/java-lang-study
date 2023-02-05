public class Ex7_04 {

    public static void main(String[] args) {
        Point3D p = new Point3D(1, 2, 3);
        System.out.println("x = " + p.x + ", y = " + p.y + ", z = " + p.z);
    }
}

class Point {

    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Point3D extends Point {

    int z;

    Point3D(int x, int y, int z) {
        super(x, y); //Point(int x, int y)를 호출
        this.z = z;
    }

}