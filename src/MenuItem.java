import java.util.List;

public abstract class MenuItem {
    // 멤버 변수 선언
    private String name;
    private double price;
    private String description;
    
    // 매개변수 생성자 생성
    MenuItem(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    public String getDescription() {
        return this.description;
    }

//    public void printMenu(Menu menu) {
//        System.out.println("[ "+ menu.printCategoryName() + "MENU ]");
//        menu.printMenuItems();
//        System.out.println("0. 뒤로가기");
//    }

    public void selectMenu(int number2, List<MenuItem> menuItems) {
        if (number2 == 0) {
            System.out.println();
            return;
        }
        if (number2 >= 1 && number2 <= 4) {
            System.out.println("선택한 메뉴: " + menuItems.get(number2 - 1).getName() + " | W " + menuItems.get(number2 - 1).getPrice() + " | " + menuItems.get(number2 - 1).getDescription());
            System.out.println();
            // number2에 0-4 이외에 다른 숫자가 입력될 경우 예외 처리
        } else {
            System.out.println("🚨 0번부터 4번까지만 입력 가능합니다.");
            System.out.println();
        }
    }



}
