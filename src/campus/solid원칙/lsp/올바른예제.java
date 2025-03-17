package campus.solid원칙.lsp;

class 올바른예제 {
    public static void main(String[] args) {
        Rectangle2 rect = new Rectangle2();
        rect.setWidth(20);
        rect.setHeight(40);
        System.out.println("직각사각형: " + rect.getArea()); // 200 ✅

        Square2 square = new Square2();
        square.setSide(10);
        System.out.println("정사각형: " + square.getArea()); // 100 ✅
    }
}

abstract class Shape {
    abstract int getArea();
}

// ✅ 직사각형 (Rectangle)
class Rectangle2 extends Shape {
    protected int width, height;

    public void setWidth(int width) { this.width = width; }
    public void setHeight(int height) { this.height = height; }

    @Override
    public int getArea() { return width * height; }
}

// ✅ 정사각형 (Square) - 별도 분리
class Square2 extends Shape {
    private int side;

    public void setSide(int side) { this.side = side; }

    @Override
    public int getArea() { return side * side; }
}


