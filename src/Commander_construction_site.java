import java.util.Scanner;

public class Commander_construction_site {

    public Commander_construction_site(Commander commander, Eden eden){
    }

    public void  Commander_construction_site_show(Commander commander, Eden eden){
        boolean menuexit = true;
        while (menuexit){
            System.out.println("사령관님의 현재 위치는 건설소 입니다.");
            System.out.println("=================================================");
            System.out.print("1. 포탑 건설     2. 미사일 포탑 건설     3. 레이져 포탑 건설    4. 핵폭탄 포탑 건설     5. 도움말    6. 나가기   ");
            System.out.println("");
            Scanner scanner = new Scanner(System.in);
        int menu_choice = scanner.nextInt();
        switch (menu_choice) {
            case 1:
            System.out.println("포탑 건설 선택하였습니다..");
            System.out.println("포탑 건설에 필요한 비용은 1000원 입니다.");
            if (commander.getMoney() >= 1000){
                Turret addTurret = new Turret();
                eden.addturret(addTurret);
                commander.setMoney(commander.getMoney() -1000);
                System.out.println("포탑 건설이 완료 되었습니다.");
            }else{
                System.out.println("자금이 부족합니다.");
            }
            break;
            case 2:
                System.out.println("미사일 포탑 건설을 선택하였습니다..");
                System.out.println("미사일 포탑 건설에 필요한 비용은 2000원 입니다.");
            if (eden.turretUpgrade) { // eden 에서 turretupgrade boolean이 true라면 미사일 포탑 건설 가능 
                if (commander.getMoney() >= 2000){
                    Turret_missile addTurret = new Turret_missile();
                    eden.addturret(addTurret);
                    commander.setMoney(commander.getMoney() -2000);
                    System.out.println("미사일 포탑 건설이 완료 되었습니다.");
                }else{
                System.out.println("자금이 부족합니다.");
            }
            }else{
                System.out.println("포탑 업그레이드가 필요합니다."); //false라면 불가능 
            }
                break;
            case 3:
                System.out.println("레이져 포탑 건설을 선택하였습니다..");
                System.out.println("레이져 포탑에 필요한 비용은 3000원 입니다.");
                if (eden.turretUpgrade) { // eden 에서 turretupgrade boolean이 true라면 미사일 포탑 건설 가능 
                    if (commander.getMoney() >= 3000){
                        Turret_rager addTurret = new Turret_rager();
                        eden.addturret(addTurret);
                        commander.setMoney(commander.getMoney() -3000);
                        System.out.println("레이져 포탑 건설이 완료 되었습니다.");
                    }else{
                    System.out.println("자금이 부족합니다.");
                }
                }else{
                    System.out.println("포탑 업그레이드가 필요합니다."); //false라면 불가능 
                }
                    break;
                
            case 4:
                System.out.println("핵폭탄 포탑 건설을 선택하였습니다. ");
                System.out.println("핵폭탄 포탑에 필요한 비용은 5000원 입니다.");
                if (eden.turretUpgrade) { // eden 에서 turretupgrade boolean이 true라면 미사일 포탑 건설 가능 
                    if (commander.getMoney() >= 5000){
                        Turret_newclear addTurret = new Turret_newclear();
                        eden.addturret(addTurret);
                        commander.setMoney(commander.getMoney() -5000);
                        System.out.println("미사일 포탑 건설이 완료 되었습니다.");
                    }else{
                    System.out.println("자금이 부족합니다.");
                }
                }else{
                    System.out.println("포탑 업그레이드가 필요합니다."); //false라면 불가능 
                }
                    break;
                
            case 5:
            System.out.println("도움말");
                break;    

            case 6:
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