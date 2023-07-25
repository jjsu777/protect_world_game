import java.util.Scanner;
public class Opening{
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("사령관님의 성함을 알려주세요: ");
    String commanderName = scanner.nextLine();
    System.out.println("사령관님의 성함은 " + commanderName + "입니다. 잘 부탁드립니다.");
    System.out.println("=================================================");
    System.out.println("먼 미래 지구에 정체불명의 외계인이 침공했습니다.");
    System.out.println("지구는 외계인들에게 당해 막대한 피해를 입었습니다.");
    System.out.println(commanderName + ", 당신은 지구를 지키는 마지막 사령관으로 선택 되었습니다.");
    System.out.println("지구는 마지막 도시를 건설해 에덴으로 이름 지었고 반드시 수호해야 합니다.");
    System.out.println("마지막 도시 에덴을 발전시키고 방어 시설을 건설해 지구를 지켜주세요.");
    System.out.println("=================================================");
    System.out.println("");

    Commander commander = new Commander(commanderName, 100, 200000, 30, 20);
     Game_day game_day = new Game_day();
     Eden eden = new Eden();
     Turret turret = new Turret();

    Main_menu main_menu = new Main_menu();
        main_menu.show_menu(commander, game_day, eden, turret);
        scanner.close();
    }
}