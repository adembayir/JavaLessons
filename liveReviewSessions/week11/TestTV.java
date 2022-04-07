package week11;

public class TestTV {

    public static void main(String[] args) {

        TV samsung = new TV();
        System.out.println(samsung);

        samsung.turnOn();
        samsung.setChannel(7);
        samsung.setVolume(3);

        System.out.println(samsung);

        TV lg = new TV();
        lg.setVolume(5);
        lg.setVolume(10);
        System.out.println(lg); // nothing will change because tv isn't turned on
        lg.turnOn();
        lg.setVolume(5);
        lg.setVolume(10);
        System.out.println(lg);

    }
}
