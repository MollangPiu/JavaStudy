package campus.design.observer.pro02;

public class HightStudent implements Student{
    private String schoolName;
    private String name;

    public HightStudent(String schoolName, String name) {
        this.schoolName = schoolName;
        this.name = name;
    }

    @Override
    public void info() {
        System.out.println("학교명: "+schoolName);
        System.out.println("이름: "+name);
    }
}
