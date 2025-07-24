package chapter03.tv;

public class TV {
    private int channel; // 1 ~ 255
    private int volume; // 0 ~ 100
    private boolean power;

    public TV(int channel, int volume, boolean power) {
        this.channel = channel;
        this.volume = volume;
        this.power = power;
    }

    public void power(boolean on) {
        this.power = on;
    }

    public void volume(boolean up) {
        if (!power) return;
        if (up) volume++;
        else volume--;
    }

    public void channel(int ch) {
        if (!power) return;

        if (ch <= 0) {
            this.channel = 255;
        } else if (ch > 255) {
            this.channel = 0;
        } else {
            this.channel = ch;
        }
    }

    public void channel(boolean up) {
        if (!power) return;
        if (up) {
            channel++;
            if (channel > 255) channel = 0;
        } else {
            channel--;
            if (channel < 0) channel = 255;
        }
    }

    public void status() {
        System.out.println("TV[channel=" + channel + ", volume=" + volume + ", power=" + (power ? "on" : "off") + "]");
    }
}