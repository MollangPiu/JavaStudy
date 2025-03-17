package campus.solid원칙.isp;

class 올바른예제 {
    public static void main(String[] args) {
        Robot2 robot = new Robot2();
        robot.work();

        Human2 human = new Human2();
        human.work();
        human.eat();
    }
}

interface Workble {
    void work();
}

interface Eatble {
    void eat();
}

class Robot2 implements Workble {
    @Override
    public void work() {
        System.out.println("로봇은 일 하는 중");
    }
}

class Human2 implements Workble, Eatble {
    @Override
    public void eat() {
        System.out.println("사람은 식사 중");
    }

    @Override
    public void work() {
        System.out.println("사람은 일 하는 중");
    }
}
