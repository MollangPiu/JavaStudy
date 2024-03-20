package campus.exam;

class About {
    About() {
        System.out.print("A");
    }

    public void disp() {
        System.out.print("C");
    }
}
class Bonus extends About{
    Bonus() {
        System.out.print("B");
    }

    public void disp() {
        System.out.print("D");
    }
}

public class ExtendMain {
    public static void main(String[] args) {
        About about = new Bonus();
        about.disp();
    }
}
