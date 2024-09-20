package campus.design.factory.test04;

public class PrintFactory {
    
    public Samsung create() {

        System.out.println("print 기능");
        return new Samsung();
    }
}
