import java.util.Scanner;

public class Commander_center {

    public Commander_center(Commander commander, Game_day game_day) {
       
    }

    public void Commander_center_show(Commander commander, Game_day game_day){
        boolean menuexit = true;
        while (menuexit) {
            System.out.println("");
            System.out.println("사령관님의 현재 위치는 사령실입니다.");
            System.out.println("=================================================");
            System.out.print("1. 상태점검     2. 개인정비     3. 독서     4. 건설공부     5. 도움말     6. 나가기 ");
            System.out.println("");
            Scanner scanner = new Scanner(System.in);
            int menu_choice = scanner.nextInt();
            switch (menu_choice) {
            case 1:
                System.out.println("상태점검 선택하셨습니다.");
                System.out.println(commander.getName()+ "사령관님의 현재 능력치는");
                System.out.println("현재 사령관님의 체력 : " + commander.getHealth());
                System.out.println("현재 사령관님이 소지한 현금 : " + commander.getMoney());
                System.out.println("현재 사령관님의 리더쉽 : " + commander.getLeadership());
                System.out.println("현재 사령관님의 건설능력 : " + commander.getBuilding_speed());
                System.out.println("입니다.");    
                break;
            case 2:
            if (game_day.repairDaysLeft == 0){
                System.out.println("개인정비 선택하셨습니다.");
                System.out.println(commander.getName() + "사령관님의 체력이 증가하였습니다.");
                commander.upHealth(+10);
                game_day.repairDaysLeft = 1;
            }else{
                System.out.println("아직 개인정비를 사용할 수 없습니다." + game_day.repairDaysLeft + "일 후에 사용 가능합니다.");
            }
                break;
            case 3:
            if (game_day.bookDaysLeft == 0){
                System.out.println("독서 선택하셨습니다.");
                System.out.println(commander.getName() + "사령관님의 리더쉽이 증가하였습니다.");
                commander.upLeadership(+10);
                 game_day.bookDaysLeft = 1;
            }else{
                System.out.println("아직 독서를 사용할 수 없습니다." + game_day.bookDaysLeft + "일 후에 사용 가능합니다.");
            }
                break;
            case 4:
            if (game_day.studyDaysLeft == 0){
                System.out.println("건설공부 선택하셨습니다.");
                System.out.println(commander.getName() + "사령관님의 건설능력이 증가하였습니다");
                commander.upBuilding_speed(+10);
                game_day.studyDaysLeft = 0;
                }else{
                System.out.println("아직 건설공부를 사용할 수 없습니다." + game_day.studyDaysLeft + "일 후에 사용 가능합니다.");
            }
                break;
            case 5:
                System.out.println("도움말 선택하셨습니다.");
                // 도움말 추가 
                break;
            case 6: 
            System.out.println("에덴으로 돌아가기");
            menuexit = false;
          //  scanner.close();
            break;

            default:
                System.out.println("잘못된 메뉴를 선택하셨습니다.");
                break;
         }
        }
    }    
}