package campus.design.prototype;

public class PrototypeExample implements Cloneable{
    private String data;

    public PrototypeExample(String data) {
        this.data = data;
    }

    public void setData(String data) {
        this.data = data;
    }
    public String getData() {
        return this.data;
    }

    @Override
    protected  Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        try {
            PrototypeExample original = new PrototypeExample("Superman");
            PrototypeExample clone = (PrototypeExample) original.clone();


            System.out.println("Original: "+original.getData());
            System.out.println("clone: "+clone.getData());

            original.setData("Batman");
            System.out.println("Original: "+original.getData());
            System.out.println("clone: "+clone.getData());
        }
        catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
