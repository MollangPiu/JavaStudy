package campus.solid원칙.dip;

class 잘못된예제 {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.click();
    }
}

class Keyboard {
    public void click() {
        System.out.println("키보드가 눌렸다.");
    }
}

class Computer {
    private Keyboard keyboard;

    public Computer() {
        this.keyboard = new Keyboard(); //강한 결합
    }

    public void click() {
        keyboard.click();
    }
}