import java.util.Random;

public class Alien_janette extends Alien {
    public String alien_janette_name;
    public int alien_janette_skill;
    public int attack;

    public Alien_janette(){
        super();
        this.alien_name = "쟈넷";
        this.alien_health = 100;
        this.alien_shield = 20;
        this.alien_janette_skill = 40;
        this.alien_damage = 20;
    }
    
    @Override
    public void attack(Turret turret){
        System.out.println(this.alien_name + "이 공격합니다.");
        Random random = new Random();
        int skill = random.nextInt(2); // 0 또는 1 중에서 랜덤으로 선택

        if (skill == 0) {
            if (turret.getTurret_shield() >= 0){
                turret.setTurret_shield(turret.getTurret_shield() - this.alien_damage);
                System.out.println(turret.getTurret_name() + "의 쉴드가" + turret.getTurret_shield());
            }else{
                turret.setTurret_health(turret.getTurret_health() - this.alien_damage);
                System.out.println(turret.getTurret_name() + "의 체력이" + turret.getTurret_health());
            }
        } else {
            janette_skill(turret);
        }
    }

    public void janette_skill(Turret turret){
        System.out.println(this.alien_name + "이 집중 폭격을 가합니다");
        System.out.println("쟈넷 : 내 앞에 무릎 꿇어라!");
        if(turret.getTurret_shield() >= 0){
            turret.setTurret_shield(turret.getTurret_shield() - this.alien_janette_skill);
            System.out.println(turret.getTurret_name() + "의 쉴드가" + turret.getTurret_shield());
        }else{
            turret.setTurret_health(turret.getTurret_health() - this.alien_janette_skill);
            System.out.println(turret.getTurret_name() + "의 체력이" + turret.getTurret_health());
        }
    }
    public String getAlien_janette_name() {
        return this.alien_janette_name;
    }

    public void setAlien_janette_name(String alien_janette_name) {
        this.alien_janette_name = alien_janette_name;
    }

    public int getAlien_janette_skill() {
        return this.alien_janette_skill;
    }

    public void setAlien_janette_skill(int alien_janette_skill) {
        this.alien_janette_skill = alien_janette_skill;
    }

    public int getAttack() {
        return this.attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }
}
