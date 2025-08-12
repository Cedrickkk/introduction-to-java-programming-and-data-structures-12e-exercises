package main.chapter9;

public class TV {
    int channel = 1;
    int volumeLevel = 1;
    boolean on = false;

    public TV() {
    }

    public TV(int channel, int volumeLevel, boolean on) {
        this.channel = channel;
        this.volumeLevel = volumeLevel;
        this.on = on;
    }

    public void turnOn() {
        this.on = true;
    }

    public void turnOff() {
        this.on = false;
    }

    public void setChannel(int channel) {
        if (this.on && channel >= 1 && channel <= 120) {
            this.channel = channel;
        }
    }

    public void setVolume(int volumeLevel) {
        if (this.on && volumeLevel >= 1 && volumeLevel <= 7) {
            this.volumeLevel = volumeLevel;
        }
    }

    public void channelUp() {
        if (this.on && this.channel < 120) {
            this.channel++;
        }
    }

    public void channelDown() {
        if (this.on && this.channel > 1) {
            this.channel--;
        }
    }

    public void volumeUp() {
        if (this.on && this.volumeLevel < 7) {
            this.volumeLevel++;
        }
    }

    public void volumeDown() {
        if (this.on && this.volumeLevel > 1) {
            this.volumeLevel--;
        }
    }
}
