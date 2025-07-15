package Interfaces;

class Phone {
    void call() {
        System.out.println("Phone making call");
    }
    void sms () {
        System.out.println("Phone sending sms");
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

    public void videoCall() {
        System.out.println("Smart Phone Video Calling");
    }

    @Override
    public void click() {
        System.out.println("Smart Phone is clicking");
    }
    @Override
    public void record() {
        System.out.println("Smart Phone is Record");
    }
    @Override
    public void play() {
        System.out.println("Smart Phone is Play");
    }
    @Override
    public void pause() {
        System.out.println("Smart Phone is Pause");
    }
    @Override
    public void stop() {
        System.out.println("Smart Phone is Stop");
    }

}
public class InterfacesExample {
    public static void main(String[] args) {
        SmartPhone obj = new SmartPhone();
        obj.sms();
        obj.call();
        obj.videoCall();
        obj.click();

        //I will take a smartPhone can and I can refer it
        // only as a camera it will work
        //I am only using the camera
        Camera cam = new SmartPhone();
        cam.click();
        cam.record();

        /*instead of
        SmartPhone phone = new SmartPhone();

        I can write
        Phone p = new SmartPhone();

        I can have the methods of phone only
        Phone p = phone;*/

    }
}
