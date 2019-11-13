package MainFrame;

public class StartingPoint {

    public static void main(String[] args) {
        new Thread(MainFrame::setup).start();
    }
}
