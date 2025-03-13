import java.util.ArrayList;
import java.util.List;

public class Menu {
    // 멤버 변수 선언
    private String categoryName;
    private List<MenuItem> menuItems = new ArrayList<>();
    
    // 매개변수 생성자 생성
    Menu(String categoryName, List<MenuItem> menuItems) {
        this.categoryName = categoryName;
        this.menuItems = menuItems;
    }
    
    //메뉴 아이템 출력
    public void printMenuItems() {
        // 각 메뉴에 번호 부여
        int num = 1;
        // 향상된 반복문을 통한 메뉴 출력
        for (MenuItem menu : menuItems) {
            System.out.println(num++ + ". " + menu.getName() + "| W " + menu.getPrice() + " | " + menu.getDescription());
        }
    }

    // 상위 카테고리 이름 출력
    public void printCategoryName(int index) {
        System.out.println(index + ". " + categoryName);
    }
    
    //getter, setter 메서드
    
//    public void setCategoryName(String categoryName) {
//        this.categoryName = categoryName;
//    }
//
//    public String getCategoryName() {
//        return categoryName;
//    }

}
