package campus.solid원칙.isp;

class 잘못된예제 {
    public static void main(String[] args) {
        Robot robot = new Robot();
        robot.work();
        robot.eat();

        Human human = new Human();
        human.work();
        human.eat();
    }
}

interface Worker {
    void work();
    void eat();
}

class Robot implements Worker {
    @Override
    public void work() {
        System.out.println("로봇은 일 하는 중");
    }

    @Override
    public void eat() {
        //로봇은 먹지 못 함, 기능 없음
    }
}

class Human implements Worker {
    @Override
    public void work() {
        System.out.println("사람은 일 하는 중");
    }
    
    @Override
    public void eat() {
        System.out.println("사람은 식사 중");
    }
}