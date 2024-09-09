package campus.design.command.testFile;

public interface Command {

    //현재 light 상태
    void getLight();
    
    //Light상태 변경
    void setOnOff();
    
    //Light 이름 삽입 / 변경
    void setName(String name);
}
