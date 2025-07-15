package Interfaces;

class Phone {
    void call() {
        System.out.println("CALL");
    }
    void sms () {
        System.out.println("SMS");
    }
}

interface Camera {
    void click();
    void record();
}

interface MusicPlayer {
    void play();
    void pause();
    void stop();
}
class SmartPhone extends Phone implements Camera,MusicPlayer {

    @Override
    public void click() {
        System.out.println("Click");
    }
    @Override
    public void record() {
        System.out.println("Record");
    }
    @Override
    public void play() {
        System.out.println("Play");
    }
    @Override
    public void pause() {
        System.out.println("Pause");
    }
    @Override
    public void stop() {
        System.out.println("Stop");
    }
    public static void main(String[] args) {
        SmartPhone phone = new SmartPhone();

        //I can have the methods of phone only
        Phone p = phone;
        p.call();


        /*instead of
        Phone p = new SmartPhone();

        I can write
        SmartPhone phone = new SmartPhone();

        Phone p = phone;*/

    }
}
