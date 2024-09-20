package campus.design.proxy.testAfter;

public class Main {

    public static void main(String[] args) {
        Goal goal = new Goal("서울숲");
        goal.disp();

        System.out.println("===================");
        ProxyGoal proxyGoal = new ProxyGoal(goal);

        proxyGoal.disp();
    }
}
