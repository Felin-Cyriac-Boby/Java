
import java.awt.*;
import java.awt.event.InputEvent;

public class AutoClicker {
    public static void main(String[] args) {
        try {
            while(true) {
            Robot r = new Robot();
            int button = InputEvent.BUTTON1_DOWN_MASK;
            System.out.println("click");
            r.mousePress(button);
            r.mouseRelease(button);
            Thread.sleep(30);
            r.mousePress(button);
            r.mouseRelease(button);
            Thread.sleep(1000*5);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}