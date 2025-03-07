public class MenuItem {
    private String hamburgerName;
    private double price;
    private String description;

    //메뉴판 생성자
    MenuItem(String hamburgerName, double price, String description) {
        this.hamburgerName = hamburgerName;
        this.price = price;
        this.description = description;
    }

    public void printMenu() {
        System.out.println(this.hamburgerName + "| W " + this.price + " | " + this.description);
    }

}
