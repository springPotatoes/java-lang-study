class Tv {

    boolean power;  //전원상태
    int channel;    //채널

    void power() {
        power = !power;
    }

    void channelUp() {
        ++channel;
    }

    void channelDown() {
        --channel;
    }
}

class smartTv extends Tv {//smartTv는 Tv에 캡션(자막)을 보여주는 기능을 추가
    boolean caption;    //캡션상태(on/off)

    void displayCaption(String text) {
        if (caption) {
            System.out.println(text);
        }
    }
}

public class Ex7_01 {

    public static void main(String[] args) {
        smartTv stv = new smartTv();    //자손 클래스의 인스턴스를 생성하면 조상 클래스의 멤버도 함께 생성됨.
        stv.channel = 10;
        stv.channelUp();
        System.out.println(stv.channel);
        stv.displayCaption("Hello, world");
        stv.caption = false;
        stv.displayCaption("Hello world");
        stv.caption = true; //캡션 기능을 킴
        stv.displayCaption("Hello world");
    }
}
