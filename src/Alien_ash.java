import java.util.Random;

public class Alien_ash extends Alien {
    public String alien_ash_name;
    public int alien_ash_skill;
    public int attack;

    public Alien_ash(){
        super();
        this.alien_name = "에쉬";
        this.alien_health = 250;
        this.alien_shield = 40;
        this.alien_ash_skill = 80;
        this.alien_damage = 40;
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
            ash_skill(turret);
        }
    }

    public void ash_skill(Turret turret){
        System.out.println(this.alien_name + "이 폭풍 화살을 가합니다.");
        System.out.println("에쉬 : 에덴은 이제 끝났다");
        if(turret.getTurret_shield() >= 0){
            turret.setTurret_shield(turret.getTurret_shield() - this.alien_ash_skill);
            System.out.println(turret.getTurret_name() + "의 쉴드가" + turret.getTurret_shield());
        }else{
            turret.setTurret_health(turret.getTurret_health() - this.alien_ash_skill);
            System.out.println(turret.getTurret_name() + "의 체력이" + turret.getTurret_health());
        }
    }

    public String getAlien_ash_name() {
		return this.alien_ash_name;
	}

	public void setAlien_ash_name(String alien_ash_name) {
		this.alien_ash_name = alien_ash_name;
	}

	public int getAlien_ash_skill() {
		return this.alien_ash_skill;
	}

	public void setAlien_ash_skill(int alien_ash_skill) {
		this.alien_ash_skill = alien_ash_skill;
	}

	public int getAttack() {
		return this.attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}
}
