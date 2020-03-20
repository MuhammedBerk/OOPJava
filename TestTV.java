public class TestTV {
    public static void main(String[] args) {
        TV tv1 = new TV();
        tv1.turnOn();
        tv1.setChannel(30);
        tv1.setVolumeLevel(3);

        TV tv2 = new TV();
        tv2.turnOn();
        tv2.channelUp();
        tv2.channelUp();
        tv2.volumeUp();

        System.out.println("\t  Channel\tVolume\ntv1:\t"
                + tv1.channel + "\t\t  " + tv1.volumeLevel
                + "\ntv2:\t" + tv2.channel + "\t\t  " + tv2.volumeLevel );
    }
}
