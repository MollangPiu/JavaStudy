package campus.design.proxy.testAfter;

public class ProxyGoal implements Subject{
    private Goal goal;
    public ProxyGoal(Goal goal) {
        this.goal = goal;
    }


    @Override
    public void disp() {
        System.out.println("지하철을 탑승하다.");
        System.out.println("커피를 마시다.");


        goal.disp();
    }
}
