package campus.study;

class Paren{
    private String name;
    private String lag;
    private int run;

    public Paren() {
        System.out.println("Paren");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLag() {
        return lag;
    }

    public void setLag(String lag) {
        this.lag = lag;
    }

    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }

    public int lagCnt() {
        return 0;
    }
}
class animal extends Paren{

    public animal() {
        System.out.println("animal 호출");

    }

    @Override
    public int lagCnt() {
        return 4;
    }


    private String car;

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }
}

class human extends Paren{

    private String book;

    public human() {
        super();
        System.out.println("human");
    }

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }
}

public class AbsMain {
    public static void main(String[] args) {

        animal animal = new animal();
        human human = new human();
        
        animal.setName("토끼");
        animal.setLag("4");

        human.setName("사람");
        human.setLag("2");

        System.out.println("anmal: "+animal.lagCnt());
        System.out.println("human: "+human.lagCnt());
    }
}
