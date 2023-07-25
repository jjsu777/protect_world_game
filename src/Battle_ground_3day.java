import java.util.Scanner;

public class Battle_ground_3day {

    public Battle_ground_3day(Commander commander, Eden eden, Turret turret) {
        
    }

    public void Battle_ground_3day_show(Commander commander, Eden eden, Turret turret) {
        BackgroundMusicThread backgroundMusicThread = new BackgroundMusicThread("/Users/jungjaewook/Protected_world_game/src/AnyConv.com__stranger-things-124008.wav");
        backgroundMusicThread.start();
        System.out.println("");
        System.out.println("=================================================");
        System.out.println("외계인이 에덴을 침공하였습니다.");
        System.out.println("=================================================");
        System.out.println("");

        if (eden.getNumberOfTurrets() == 0) {
            System.out.println("남아있는 방어시설이 없습니다...");
            System.out.println("GAME OVER");
            System.out.println("에덴은 파괴되었습니다.");

            System.exit(0);
        }

        Alien alien = new Alien();
        alien.getAlien_name();
        alien.getAlien_health();
        alien.getAlien_shield();
        alien.getAlien_damage();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            while (turret.getTurret_health() > 0 && alien.getAlien_health() > 0) {
                System.out.println("1: 공격     2: 수리");
                int userInput = scanner.nextInt();

                if (userInput == 1) {
                    turret.doAttack_alien(alien);
                    if (alien.getAlien_health() > 0) {
                        alien.attack(turret);
                    }
                } else if (userInput == 2) {
                    System.out.println("수리 중...");
                    turret.setTurret_health(turret.getTurret_health() + 10); // 포탑 체력 10 증가
                    System.out.println("포탑의 체력이 " + turret.getTurret_health() + "로 증가하였습니다.");
                } else {
                    System.out.println("잘못된 입력입니다. 1번 또는 2번을 입력해주세요.");
                }
            }

            if (turret.getTurret_health() <= 0) {
                eden.removeLastTurret();
            }

            if (alien.getAlien_health() > 0 && eden.getNumberOfTurrets() <= 0) {
                System.out.println("남아있는 포탑이 없습니다.");
                System.out.println("외계인이 승리했습니다!");
                System.out.println("에덴은 파괴되었습니다...!");
                backgroundMusicThread.stopMusic();
                System.out.println("GAME OVER");
                System.exit(0);
            } else if (alien.getAlien_health() > 0 && eden.getNumberOfTurrets() >= 1) {
                System.out.println("남아있는 포탑이 이어서 외계인을 공격합니다.");
                turret = eden.getNextTurret(); // 다음 포탑을 가져옵니다.
            } else {
                System.out.println("포탑이 승리했습니다!");
                System.out.println(commander.getName() + "사령관님이 1000원을 획득하였습니다.");
                commander.upMoney(1000);
                System.out.println(commander.getName() + "사령관님의 현재 잔액은" + commander.getMoney() + "입니다.");
                System.out.println(commander.getName() + "사령관님의 리더쉽 능력치가 10 올랐습니다.");
                commander.upLeadership(10);
                System.out.println(commander.getName() + "사령관님의 현재 리더쉽 능력치는" + commander.getLeadership() + "입니다.");
                backgroundMusicThread.stopMusic();
                break; 
                // 전투가 끝나면 while (true) 루프를 빠져나감
            }
        }
    }
}
        // } else{ 
        //     System.out.println("포탑이 승리했습니다!");
    //         System.out.println(commander.getName() + "사령관님이 1000원을 획득하였습니다.");
    //         commander.upMoney(1000);
    //         System.out.println(commander.getName() + "사령관님의 현재 잔액은" + commander.getMoney() + "입니다.");
    //         System.out.println(commander.getName() + "사령관님의 리더쉽 능력치가 10 올랐습니다.");
    //         commander.upLeadership(10);
    //         System.out.println(commander.getName() + "사령관님의 현재 리더쉽 능력치는" + commander.getLeadership() + "입니다.");
    //         backgroundMusicThread.stopMusic();
    //         //전투종료
        

    //     if(alien.getAlien_health() > 0 && eden.getNumberOfTurrets() > 1 && turret.getTurret_health() <=0){
    //         eden.removeLastTurret();
    //     System.out.println("남아있는 포탑이 이어서 외계인을 공격합니다.");
    //     System.out.println("1: 공격     2: 수리");

    //     }else if(alien.getAlien_health() > 0 && eden.getNumberOfTurrets() == 0){
    //     System.out.println("외계인이 승리했습니다!");
    //     System.out.println("에덴은 파괴되었습니다...!");
    //      backgroundMusicThread.stopMusic();            
    //      System.out.println("GAME OVER");
    //      System.exit(0);

    //     }else if(alien.getAlien_health() <= 0 && eden.getNumberOfTurrets() >= 0){
    //         System.out.println("포탑이 승리했습니다!");
    //         System.out.println(commander.getName() + "사령관님이 1000원을 획득하였습니다.");
    //         commander.upMoney(1000);
    //         System.out.println(commander.getName() + "사령관님의 현재 잔액은" + commander.getMoney() + "입니다.");
    //         System.out.println(commander.getName() + "사령관님의 리더쉽 능력치가 10 올랐습니다.");
    //         commander.upLeadership(10);
    //         System.out.println(commander.getName() + "사령관님의 현재 리더쉽 능력치는" + commander.getLeadership() + "입니다.");
    //         backgroundMusicThread.stopMusic();
    //         //전투종료
        
    //     }
    // }

