import java.util.Scanner;

public class Eden_around {
   
    public Eden_around(Eden eden){

    }

    public void Eden_arond_show(Eden eden){
        boolean menuexit = true;
        while (menuexit){
            System.out.println("사령관님 에덴을 둘러 보시겠습니까?");
            System.out.println("=================================================");
            System.out.print("1. 방어시설     2. 거리     3. 연설      4. 도움말     5. 나가기   ");
            System.out.println("");
            Scanner scanner = new Scanner(System.in);
            int menu_choice = scanner.nextInt();
            switch (menu_choice) {
            case 1:
            System.out.println("현재 방어시설에 포탑이" + eden.getNumberOfTurrets() + "개 있습니다.");
            System.out.println("포탑의 종류:");
            for (Turret turret : eden.getturret()) {
                System.out.println(turret.getClass().getSimpleName());
            }
                break;
            case 2:
                System.out.println("거리 선택하셨습니다.");
                // 연구실 코드 추가6
                break;
            case 3:
                System.out.println("연설 선택하셨습니다.");
                // 에덴 둘러보기 코드 추가
                break;
            case 4:
                System.out.println("도움말 선택하셨습니다.");
                // 건설소 코드 추가
                break;
            case 5:
            System.out.println("에덴으로 돌아가기");
            menuexit = false;
                break;
            default:
                System.out.println("잘못된 메뉴를 선택하셨습니다.");
                break;
        }
    }
}
}