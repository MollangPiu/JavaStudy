package campus.design.template.pro;

public class Main {
    public static void main(String[] args) {
        Student best = new BestStudent("슈퍼맨");
        Student good = new GoodStudent("배트맨");

        best.give(good);
        good.give(best);
    }
}
