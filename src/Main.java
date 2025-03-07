import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // List 선언
        List<MenuItem> menuItems = new ArrayList<>();
        // Kiosk 객체 생성
        Kiosk kiosk = new Kiosk(menuItems);
        // start() 호출
        kiosk.start();
    }
}
