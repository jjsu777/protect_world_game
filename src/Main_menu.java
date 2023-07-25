import java.util.Scanner;

public class Main_menu {
    public void show_menu(Commander commander, Game_day game_day, Eden eden, Turret turret){

        Scanner scanner = new Scanner(System.in);
        boolean menuexit = true;
        while(menuexit){
            System.out.println("");
            System.out.println(commander.getName() + "사령관님의 현재 위치는 에덴입니다.");
            System.out.println("=================================================");
            System.out.print("1. 사령실     2. 에덴 둘러보기     3. 연구소     4. 건설소     5. 휴식     6. 게임종료   ");
            System.out.println("");
            int menu_choice = scanner.nextInt();
        switch (menu_choice) {
            case 1:
            Commander_center commander_center = new Commander_center(commander, game_day); // 사령실로 이동 
            commander_center.Commander_center_show(commander, game_day); // 사령실로 이동 
                // 사령실 코드 추가
                break;
            case 2:
            Eden_around eden_arond = new Eden_around(eden); // 에덴 둘러보기
            eden_arond.Eden_arond_show(eden);// 에덴 둘러보기
            
                break;
            case 3:
            Commander_laboratory commander_laboratory = new Commander_laboratory(commander, eden); // 연구소로 이동
            commander_laboratory.Commander_laboratory_show(commander, eden);// 연구소로 이동
            
                break;
            case 4:
            Commander_construction_site commander_construction_site = new Commander_construction_site(commander, eden); // 연구소로 이동
            commander_construction_site.Commander_construction_site_show(commander, eden);// 연구소로 이동
           
                break;
            case 5:
            Commander_rest commander_rest = new Commander_rest(commander, eden, turret, game_day); // 휴식
            commander_rest.Commander_rest_show(commander, eden, turret, game_day);// 휴식
            
                break;
            case 6:
                System.out.println("게임을 종료합니다.");
                menuexit = false;
                scanner.close();
                break;
            default:
                System.out.println("잘못된 메뉴를 선택하셨습니다.");
                break;
        }
    }
}
}