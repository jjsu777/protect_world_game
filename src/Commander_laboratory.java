import java.util.Scanner;

public class Commander_laboratory {
    public boolean turretUpgrade;
    public boolean missileTurretUpgraded;
    public boolean raserTurretUpgraded;
    public boolean nuclearTurretUpgraded;

    public Commander_laboratory(Commander commander, Eden eden){
        turretUpgrade = false;
        missileTurretUpgraded = false;
        raserTurretUpgraded = false;
        nuclearTurretUpgraded = false;
    }

    public void  Commander_laboratory_show(Commander commander, Eden eden){

        boolean menuexit = true;
        while (menuexit) {
        System.out.println("사령관님의 현재 위치는 연구소 입니다.");
        System.out.println("=================================================");
        System.out.print("1. 포탑->미사일 포탑 업그레이드     2. 미사일 포탑->레이져 포탑 업그레이드     3. 레이져 포탑 -> 핵폭탄 포탑 업그레이드      4. 도움말     5. 나가기   ");
        System.out.println("");
    
        Scanner scanner = new Scanner(System.in);
        int menu_choice = scanner.nextInt();

        switch (menu_choice) {
            case 1:
            if (!missileTurretUpgraded) {
                System.out.println("포탑 업그레이드 선택하였습니다..");
                System.out.println("포탑 업그레이드 필요한 비용은 1500원 입니다.");
                if (commander.getMoney() > 1500){
                    turretUpgrade = true;
                    eden.turretUpgrade = turretUpgrade;
                    Turret addTurret = new Turret_missile(); // 미사일 포탑으로 생성
                    eden.addturret(addTurret);
                    commander.setMoney(commander.getMoney() -1500);
                    System.out.println("포탑 업그레이드가 완료 되었습니다.");
                    missileTurretUpgraded = true;
                }else{
                    System.out.println("자금이 부족합니다.");
                }
                } else {
                    System.out.println("이미 미사일 포탑으로 업그레이드되었습니다.");
                }
                // 사령실 코드 추가
                break;
            case 2:
            if (!raserTurretUpgraded) {
                System.out.println("미사일 포탑 업그레이드를 선택하였습니다..");
                System.out.println("미사일 포탑 업그레이드 필요한 비용은 3500원 입니다.");
                if (commander.getMoney() > 3500){
                    turretUpgrade = true;
                    eden.turretUpgrade = turretUpgrade;
                    Turret addTurret = new Turret_rager(); // 레이져 포탑으로 생성
                    eden.addturret(addTurret);
                    commander.setMoney(commander.getMoney() -3500);
                    System.out.println("포탑 업그레이드가 완료 되었습니다.");
                    raserTurretUpgraded = true;
                }else{
                    System.out.println("자금이 부족합니다.");
                }
            } else {
                System.out.println("이미 레이져 포탑으로 업그레이드되었습니다.");
            }
                break;
            case 3:
            if (!nuclearTurretUpgraded) {
                System.out.println("레이져 포탑 업그레이드를 선택하였습니다..");
                System.out.println("레이져 포탑 업그레이드 필요한 비용은 5500원 입니다.");
                if (commander.getMoney() > 5500){
                    turretUpgrade = true;
                    eden.turretUpgrade = turretUpgrade;
                    Turret addTurret = new Turret_newclear(); // 핵핵 포탑으로 생성
                    eden.addturret(addTurret);
                    commander.setMoney(commander.getMoney() -5500);
                    System.out.println("포탑 업그레이드가 완료 되었습니다.");
                    nuclearTurretUpgraded = true;
                }else{
                    System.out.println("자금이 부족합니다.");
                }
            } else {
                System.out.println("이미 핵폭탄 포탑으로 업그레이드되었습니다.");
            }
                break;
            case 4:
                System.out.println("도움말 .");
                // 건설소 코드 추가
                break;
            case 5:
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