package campus.design.proxy.test01;

public class Proxy {

    private Goal goal;

    public Proxy() {
        this.goal = new Goal();
    }

    public void move() {
        System.out.println("강남을 가기 위해서 지하철을 탑승했다.");
        System.out.println("도착하고 나서, 커피를 마셨다.");
        goal.gangnam();
    }
}
