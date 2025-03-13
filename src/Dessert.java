import java.util.List;

public class Dessert extends MenuItem {

    // Dessert 클래스 생성자 호출시 MenuItem 클래스 생성자 호출
    Dessert(String name, double price, String description) {
        super(name, price, description);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public double getPrice() {
        return super.getPrice();
    }

    @Override
    public String getDescription() {
        return super.getDescription();
    }

    public static void printDessertMenu(Menu dessertsMenu) {
        System.out.println("[ DESSERTS MENU ]");
        dessertsMenu.printMenuItems();
        System.out.println("0. 뒤로가기");
    }

    @Override
    public void selectMenu(int number2, List<MenuItem> menuItems) {
        super.selectMenu(number2, menuItems);
    }

}
