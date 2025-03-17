package campus.solid원칙.srp;

class 잘못된예제 {

    public static void main(String[] args) {
        회원정보 member = new 회원정보();
        member.회원정보등록();
        member.데이터베이스등록();
    }
}

class 회원정보 {

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
    
    public void 데이터베이스등록() {
        //데이터베이스 등록하기
        System.out.println("회원정보.데이터베이스등록");
    }
}
