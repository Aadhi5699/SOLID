public class Square implements Shape {
    private int side;

    public Square(int s) {
        this.side = s;
    }

    public int area() {
        return side * side;
    }
}
