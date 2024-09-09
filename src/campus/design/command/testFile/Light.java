package campus.design.command.testFile;

public class Light {
    private String name;
    private boolean status;

    public Light(String name) {
        this.name = name;
    }

    public void change() {
        this.status = !this.status;
    }

    public String getName() {
        return name;
    }

    public boolean isStatus() {
        return status;
    }

    public void setName(String name) {
        this.name = name;
    }
}
