import java.util.ArrayList;
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
    }
}
