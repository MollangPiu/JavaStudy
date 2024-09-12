package campus.design.bridge.report02;
// 클라이언트 코드
public class Client {
    public static void main(String[] args) {
        Device tv = new TV();
        RemoteControl remote = new RemoteControl(tv);
        remote.togglePower();
        remote.volumeUp();
        remote.status();

        Device radio = new Radio();
        AdvancedRemoteControl advancedRemote = new AdvancedRemoteControl(radio);
        advancedRemote.togglePower();
        advancedRemote.status();
        advancedRemote.mute();
    }
}


// Implementor 인터페이스
interface Device {
    boolean isEnabled();
    void enable();
    void disable();
    int getVolume();
    void setVolume(int volume);
}

// Concrete Implementors
class TV implements Device {
    private boolean on = false;
    private int volume = 30;

    @Override
    public boolean isEnabled() {
        return on;
    }

    @Override
    public void enable() {
        on = true;
    }

    @Override
    public void disable() {
        on = false;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
    }

}

class Radio implements Device {
    private boolean on = false;
    private int volume = 20;

    @Override
    public boolean isEnabled() {
        return on;
    }

    @Override
    public void enable() {
        on = true;
    }

    @Override
    public void disable() {
        on = false;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
    }
}

// Abstraction
class RemoteControl {
    protected Device device;

    public RemoteControl(Device device) {
        this.device = device;
    }

    public void togglePower() {
        if (device.isEnabled()) {
            device.disable();
        } else {
            device.enable();
        }
    }

    public void volumeDown() {
        device.setVolume(device.getVolume() - 10);
    }

    public void volumeUp() {
        device.setVolume(device.getVolume() + 10);
    }

    public void status() {
        System.out.println("status: "+device.isEnabled());
        System.out.println("volume: "+device.getVolume());
    }
}

// Refined Abstraction
class AdvancedRemoteControl extends RemoteControl {
    public AdvancedRemoteControl(Device device) {
        super(device);
    }

    public void mute() {
        device.setVolume(0);
    }


}


