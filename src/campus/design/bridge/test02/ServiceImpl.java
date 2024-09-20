package campus.design.bridge.test02;

public class ServiceImpl implements Service{
    @Override
    public void use() {
        System.out.println("bridge Use");
    }

    @Override
    public void execute() {
        System.out.println("brige execute");
    }
}
