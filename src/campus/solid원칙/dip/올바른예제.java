package campus.solid원칙.dip;

class 올바른예제 {

    public static void main(String[] args) {
        Keyboard2 keyboard = new 기계식();
        Computer2 computer2 = new Computer2(keyboard);
        computer2.click();

        keyboard = new 게이밍();
        computer2 = new Computer2(keyboard);
        computer2.click();
    }
}

interface Keyboard2 {
    void click();
}

class 기계식 implements Keyboard2 {
    @Override
    public void click() {
        System.out.println("탁-");
    }
}

class 게이밍 implements Keyboard2 {
    @Override
    public void click() {
        System.out.println("탁");
    }
}

class Computer2 {
    private Keyboard2 keyboard;

    public Computer2(Keyboard2 keyboard) {
        this.keyboard = keyboard;
    }

    public void click() {
        keyboard.click();
    }
}