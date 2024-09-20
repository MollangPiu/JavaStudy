package campus.design.proxy.test01;

public class RealProxy {

    private Goal goal;

    public RealProxy(Goal goal) {
        this.goal = goal;
    }

    public void work(String msg) {
        System.out.println("종로를 가기 위해서 택시를 탔다.");
        goal.jongno(msg);
    }

}
