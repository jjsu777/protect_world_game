import java.util.Scanner;

public class Commander_rest {
    public Game_day gameDay = Game_day.getInstance();

    public Commander_rest(Commander commander, Eden eden, Turret turret, Game_day game_day){

    }

    public void  Commander_rest_show(Commander commander, Eden eden, Turret turret, Game_day game_day){
        boolean menuexit = true;
        while (menuexit){
        System.out.println("사령관님 편안한 휴식 되십시오.");
        System.out.println("=================================================");
        System.out.print("1. 휴식     2. 나가기   ");
        System.out.println("");
        Scanner scanner = new Scanner(System.in);
        int menu_choice = scanner.nextInt();

        switch (menu_choice) {
            case 1:
                System.out.println(commander.getName()+"사령관님 휴식하시겠습니까?");
                gameDay.pass_day(); // 하루 지나기
                System.out.println("현재 날짜는 " + gameDay.getDay() + "일 입니다.");
                game_day.setRepairDaysLeft(0);
                game_day.setBookDaysLeft(0);
                game_day.setStudyDaysLeft(0);
                menuexit = false; // 나중에 주석 해제

                if(gameDay.getDay() == 3){
                    Battle_ground_3day battle_ground_3day = new Battle_ground_3day(commander, eden, turret);
                  battle_ground_3day.Battle_ground_3day_show(commander, eden, turret);
                    
                }else if(gameDay.getDay() == 7){
                    Battle_ground_7day battle_ground_7day = new Battle_ground_7day(commander, eden, turret);
                    battle_ground_7day.Battle_ground_7day_show(commander, eden, turret);
                    //7일쨰 쟈넷과의 전투 구현
                }else if(gameDay.getDay() == 15){
                    Battle_ground_15day battle_ground_15day = new Battle_ground_15day(commander, eden, turret);
                    battle_ground_15day.Battle_ground_15day_show(commander, eden, turret);
                }
                    //전투시작 추가 
                break;
            case 2:
               System.out.println("나가기");
               menuexit = false;
            break;
            
            default:
                System.out.println("잘못된 메뉴를 선택하셨습니다.");
                break;
            }
        }
    }
}