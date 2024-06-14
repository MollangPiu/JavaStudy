package campus.ch11.question;

public class Extends01 {

    public static void main(String[] args) {

        MyName myName = new MyName();
        myName.setName("명희승");
        System.out.println(myName.getName());
        System.out.println(myName.getGoodColor());

    }
}

class Myprofile {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class MyName extends Myprofile{

    public String getGoodColor() {
        return "파랑";
    }
}
