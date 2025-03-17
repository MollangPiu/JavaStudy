package campus.solid원칙.lsp;

class 잘못된예제 {

    public static void main(String[] args) {
        Rectangle1 shape = new Rectangle1();
        shape.setWidth(10);
        shape.setHeight(20);
        System.out.println("직각사각형: "+shape.getArea());

        shape = new Square1();
        shape.setWidth(10);
        System.out.println("정사각형: "+shape.getArea());
    }
}

//직사각형
class Rectangle1 {
    protected int width, height;

    public void setWidth(int width) {
        this.width = width;
    }
    public void setHeight(int height) {
        this.height = height;
    }

    public int getArea() {
        return width * height;
    }
}

//정사각형
class Square1 extends Rectangle1 {
    @Override
    public void setWidth(int width) {
        this.width = this.height = width;
    }
    @Override
    public void setHeight(int height) {
        this.height = this.width = height;
    }
}
