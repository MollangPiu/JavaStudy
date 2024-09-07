package campus.design.singleton.pro;

public class SingleTonMain {
    private static SingleTonMain instance;
    private String data;

    public static SingleTonMain getInstance() {

        if(instance == null) {
            instance = new SingleTonMain();
        }

        return instance;
    }

    public static void setInstance(SingleTonMain instance) {
        SingleTonMain.instance = instance;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}

class SingleMain {
    public static void main(String[] args) {
        SingleTonMain s1 = SingleTonMain.getInstance();
        SingleTonMain s2 = SingleTonMain.getInstance();

        if(s1.equals(s2)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        s1.setData("슈퍼맨");
        System.out.println(s2.getData());

    }
}
