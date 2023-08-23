package exercise;

import java.util.Scanner;

public class SnackMenu {
    private Scanner sc;
    private SnackController snackController;

    public void menu() {
        sc = new Scanner(System.in);
        snackController = new SnackController();

        System.out.println("스낵류를 입력하세요.");
        System.out.print("종류: ");
        String kind = sc.nextLine();

        System.out.print("이름: ");
        String name = sc.nextLine();

        System.out.print("맛: ");
        String flavor = sc.nextLine();

        System.out.print("개수: ");
        int numOf = sc.nextInt();

        System.out.print("가격: ");
        int price = sc.nextInt();

        snackController.saveData(kind, name, flavor, numOf, price);
        System.out.println("저장 완료되었습니다.");
        System.out.println(kind + "(" + name + " - " + flavor + ") " + numOf + "개 " + numOf*price + "원");
    }
}

