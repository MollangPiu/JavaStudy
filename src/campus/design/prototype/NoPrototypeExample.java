package campus.design.prototype;

public class NoPrototypeExample {
    private String name;

    public NoPrototypeExample(String name) {
        this.name = name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }

    public NoPrototypeExample clone() {
        return this;
    }

    public static void main(String[] args) {
        NoPrototypeExample original = new NoPrototypeExample("Superman");
        NoPrototypeExample clone = original.clone();

        System.out.println("original: "+original.getName());
        System.out.println("clone: "+clone.getName());

        original.setName("BatMan");
        System.out.println("original: "+original.getName());
        System.out.println("clone: "+clone.getName());
    }
}
