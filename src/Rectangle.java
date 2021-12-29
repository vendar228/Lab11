public class Rectangle {
    private int a, b;
    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public void print() {
        System.out.println(a + " " + b);
    }
    public void perimetr() {
        System.out.println("Периметр: " + (a + b) * 2);
    }
    public void ploshad() {
        System.out.println("Площадь: " + a * b);
    }
}