package campus.solid원칙.srp;

public class 올바른예제 {

    public static void main(String[] args) {
        회원정보2 emp = new 회원정보2();
        emp.회원정보등록();

        회원데이터베이스 empDb = new 회원데이터베이스();
        empDb.데이터베이스등록(emp);
    }
}

class 회원정보2 {
    private String name;        //이름
    private int age;            //나이
    private long salary;        //월급
    private int  career;        //경력

    public void 회원정보등록() {
        this.name = "홍길동";
        this.age = 20;
        this.salary = 1000000;
        this.career = 0;
        System.out.println("회원정보.회원정보등록");
    }

    public String getName() {
        return name;
    }
}

class 회원데이터베이스 {

    public void 데이터베이스등록(회원정보2 emp) {
        System.out.println(emp.getName());
        System.out.println("회원데이터베이스.데이터베이스등록");
    }
}
