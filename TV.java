public class TV {
    int channel = 1;
    int volumeLevel = 1;
    boolean on = false;

    public TV(){
    }

    public void turnOn(){
        on = true;
    }

    public void turnOff(){
        on = false;
    }

    public void setChannel(int newChannel){
        if (on == true && 0 < newChannel && newChannel < 121)
            channel = newChannel;
    }

    public void setVolumeLevel(int newVolumeLevel){
        if (on == true && 0 < newVolumeLevel && newVolumeLevel < 8)
            volumeLevel = newVolumeLevel;
    }

    public void channelUp(){
        if (on == true && channel < 120)
            channel++;
    }

    public void channelDown(){
        if (on == true && 1 < channel)
            channel--;
    }

    public void volumeUp(){
        if (on == true && volumeLevel < 7)
            volumeLevel++;
    }

    public void volumeDown(){
        if (on == true && 1 < volumeLevel)
            volumeLevel--;
    }
}

