import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Kiosk {
    public void start() {
        // 스캐너 선언
        Scanner scanner = new Scanner(System.in);

        // 리스트 CategoryName 생성후 상위 카테고리들 추가
        List<String> CategoryName = new ArrayList<>();

        // 상위 카테고리별 메뉴 아이템 리스트 생성
        List<MenuItem> burgerItems = new ArrayList<>(List.of(
                new Burger("더블 치즈버거", 5.9, "두 장의 치즈와 버터가 녹아내리는 부드러운 패티."),
                new Burger("불고기 버거", 8.9, "달콤한 불고기 소스와 부드러운 패티, 양상추가 어우러진 맛."),
                new Burger("매운 치킨 버거", 5.4, "매콤하고 바삭한 치킨 패티와 양념이 어우러진 매운 맛."),
                new Burger("베이컨 치즈버거", 7.5, "바삭한 베이컨과 치즈가 풍미를 더한 클래식한 햄버거.")
        ));

        List<MenuItem> drinksItems = new ArrayList<>(List.of(
                new Drinks("콜라", 2.9, "상쾌하고 달콤한 탄산 음료."),
                new Drinks("레모네이드", 8.9, "상큼하고 시원한 레몬의 맛"),
                new Drinks("바닐라 밀크셰이크", 5.9, "달콤하고 부드러운 맛"),
                new Drinks("아이스 카페라떼", 5.4, "커피와 차가운 우유가 어우러져, 커피 애호가들에게 추천하는 음료.")
        ));

        List<MenuItem> dessertsItems = new ArrayList<>(List.of(
                new Dessert("초코 브라우니", 7.9, "진한 초콜릿의 풍미가 가득한 디저트"),
                new Dessert("치즈케이크", 8.9, "부드럽고 고소한 치즈의 맛이 진하게 느껴지는 디저트"),
                new Dessert("소프트 아이스크림", 5.9, "부드럽고 달콤한 아이스크림"),
                new Dessert("애플 파이", 5.4, "바삭한 페이스트리와 달콤한 사과가 조화를 이루는 클래식한 디저트.")
        ));

        // Burgers 카테고리 생성
        Menu burgersMenu = new Menu("Burgers", burgerItems);
        // burger 객체 생성 (selectMenu를 호출하기 위해 만드는 객체)
        Burger burger = new Burger("name", 15, "description");

        // Drinks 카테고리 생성
        Menu drinksMenu = new Menu("Drinks", drinksItems);
        // drink 객체 생성 (selectMenu를 호출하기 위해 만드는 객체)
        Drinks drink = new Drinks("name", 15, "description");

        // Desserts 카테고리 생성
        Menu dessertsMenu = new Menu("Desserts", dessertsItems);
        // dessert 객체 생성 (selectMenu를 호출하기 위해 만드는 객체)
        Dessert dessert = new Dessert("name", 15, "description");


        // 메인 메뉴 선택 및 세부 메뉴 선택시 사용할 번호 변수 초기화 및 선언
        int number1 = -1;
        int number2;

        //반복문 시작 (number1에 0이 입력되면 종료)
        while (number1 != 0) {

            // 번호 입력 처리 및 예외 처리
            try {
                // 메인 메뉴 출력
                System.out.println("[ MAIN MENU] ");
                burgersMenu.printCategoryName(1);
                drinksMenu.printCategoryName(2);
                dessertsMenu.printCategoryName(3);
                System.out.println("0. 종료      | 종료");

                // 메인 메뉴 번호 선택
                number1 = scanner.nextInt();
                System.out.println();

                // 메인 메뉴에서 number1에 0이 입력될 경우 반복문 종료
                if (number1 == 0) {
                    System.out.println("프로그램을 종료합니다. ");
                    break;
                }

                // 버거 메뉴 선택
                else if (number1 == 1) {

                    // 버거 메뉴 출력 (Burger 클래스 메서드 호출)
                    Burger.printBugersMenu(burgersMenu);

                    // 버거 메뉴 번호 선택
                    number2 = scanner.nextInt();

                    // 버거 메뉴 선택에 따라 처리 (Burger 클래스 메서드 호출)
                    burger.selectMenu(number2, burgerItems);
                }

                // 음료 메뉴 선택
                else if (number1 == 2) {

                    // 음료 메뉴 출력 (Drinks 클래스 메서드 호출)
                    Drinks.printDrinksMenu(drinksMenu);

                    // 음료 메뉴 번호 선택
                    number2 = scanner.nextInt();

                    // 음료 메뉴 선택에 따라 처리 (Drinks 클래스 메서드 호출)
                    drink.selectMenu(number2, drinksItems);
                }

                // 디저트 메뉴 선택
                else if (number1 == 3) {

                    // 디저트 메뉴 출력 (Dessert 클래스 메서드 호출)
                    Dessert.printDessertMenu(dessertsMenu);

                    // 디저트 메뉴 번호 선택
                    number2 = scanner.nextInt();

                    // 디저트 메뉴 선택에 따라 처리 (Dessert 클래스 메서드 호출)
                    dessert.selectMenu(number2, dessertsItems);

                    // number1에 0-3 숫자가 아닌 다른 숫자가 입력될 경우 예외 처리
                } else {
                    System.out.println("🚨 0번부터 3번까지만 입력 가능합니다.");
                    System.out.println();
                }

            }
            // 잘못된 자료형의 값을 입력받을 경우 예외 처리
            catch (InputMismatchException e) {
                System.out.println("🚨 유효한 숫자만 입력 가능합니다. 다시 시도해주세요.");
                System.out.println();
                // 잘못된 입력(ex: 문자열 등)을 입력 버퍼에서 제거
                scanner.next();
            }
        }
    }
}