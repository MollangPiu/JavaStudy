package campus.design.factory.pro02;

public class CreateService implements Create{
    private String name;

    CreateService(String name) {
        this.name = name;
    }
    @Override
    public void createUser() {
        System.out.println(this.name+ "님의 회원가입");
    }
}
