package campus.design.proxy.report;

public class RealImage implements Image{
    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    private void loadFromDisk(String fileName) {
        System.out.println("Loading: "+fileName);
    }

    public void display() {
        System.out.println("Displaying1: "+fileName);
    }
}
