package campus.design.adapter.test04;

public class ServiceImpl implements Service{

    private PluseClass pluseClass;

    @Override
    public void setPluseClass(PluseClass pluseClass) {
        this.pluseClass = pluseClass;
    }

    @Override
    public void use() {
        System.out.println("use");
        System.out.println(pluseClass.message());
    }

    @Override
    public void execute() {
        System.out.println("execute");
        System.out.println(pluseClass.sum(5, 15));
    }
}
