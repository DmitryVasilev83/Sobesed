package les3;

public class MainApp {

    public static void main(String[] args) {

        PingPong pingPong = new PingPong();
        new Thread(() -> pingPong.print("Ping", "PONG")).start();
        new Thread(() -> pingPong.print("PONG", "Ping")).start();

    }


}
