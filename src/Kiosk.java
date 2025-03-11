import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Kiosk {
    private List<MenuItem> menuItems = new ArrayList<>();

    Kiosk(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public void start() {

        Scanner scanner = new Scanner(System.in);
        int number = -1;

        while (number != 0) {
            int num = 1;

            System.out.println("[ SHAKESHACK MENU ]");
            for (MenuItem menu : menuItems) {
                System.out.println(num++ + ". " + menu.getName() + "| W " + menu.getPrice() + " | " + menu.getDescription());
            }
            System.out.println("0. 종료      | 종료");

            // 번호 입력 처리 및 예외 처리
            try {
                number = scanner.nextInt();
                switch (number) {
                    case 1:
                        System.out.println("ShackBurger 선택");
                        break;
                    case 2:
                        System.out.println("SmokeShack 선택");
                        break;
                    case 3:
                        System.out.println("Cheeseburger 선택");
                        break;
                    case 4:
                        System.out.println("Hamburger 선택");
                        break;
                    case 0:
                        System.out.println("프로그램을 종료합니다.");
                        break;
                    default:
                        System.out.println("0부터 4까지의 숫자만 입력해주세요.");

                }
            }
            // 잘못된 자료형의 값을 입력받을 경우 예외 처리
            catch (InputMismatchException e) {
                System.out.println("🚨 유효한 숫자만 입력 가능합니다. 다시 시도해주세요.");
                // 잘못된 입력(ex: 문자열 등)을 입력 버퍼에서 제거
                scanner.next();
            }
        }
    }
}