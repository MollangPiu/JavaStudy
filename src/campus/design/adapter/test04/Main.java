package campus.design.adapter.test04;

public class Main {

    public static void main(String[] args) {
        Service service = new ServiceImpl();

        //추가 기능 구현
        PluseClass pluseClass = new PluseClass();
        pluseClass.setMsg("Hello World");
        service.setPluseClass(pluseClass);

        service.use();
        service.execute();
    }
}
