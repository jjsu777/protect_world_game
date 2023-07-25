import java.util.Random;

public class Turret_missile extends Turret {
    public String turret_missile_name;
    public int turret_missile_skill;

    public Turret_missile(){
        super();
        this.turret_missile_name = "미사일 포탑";
        this.turret_health = 200;
        this.turret_shield = 20;
        this.turret_damage = 20;
        this.turret_missile_skill = 40;
    }

    @Override
    public void doAttack_alien(Alien alien){
        System.out.println("미사일 포탑이 적을 공격합니다.");
        Random random = new Random();
        int skill = random.nextInt(2); // 0 또는 1 중에서 랜덤으로 선택
        
        if (skill ==0){
        if(alien.getAlien_shield() >= 0){
        alien.setAlien_shield(alien.getAlien_shield() - this.turret_damage);
        System.out.println(alien.getAlien_name() + "의 쉴드가" + alien.getAlien_shield());
        }else {
        alien.setAlien_health(alien.getAlien_health() - this.turret_damage);
        System.out.println(alien.getAlien_name() + "의 체력이" + alien.getAlien_health());
        }
    }else {
        turret_missile_skill(alien);
    }
    }

    public void turret_missile_skill(Alien alien){
        System.out.println("미사일 포탑이 스킬을 사용합니다.");
        System.out.println("미사일 포탑 : 미사일 시스텝 가동");
        if(alien.getAlien_shield() >= 0){
            alien.setAlien_shield(alien.getAlien_shield() - this.turret_missile_skill);
            System.out.println(alien.getAlien_name() + "의 쉴드가" + alien.getAlien_shield());
            }else {
            alien.setAlien_health(alien.getAlien_health() - this.turret_missile_skill);
            System.out.println(alien.getAlien_name() + "의 체력이" + alien.getAlien_health());
    }
}

    public void beAttack_alien(Alien alien){
        System.out.println("미사일 포탑이 적에게 공격 받습니다.");
        if(getTurret_shield() >= 0){
            setTurret_shield(getTurret_shield() - alien.getAlien_damage());
        } else {
            setTurret_health(getTurret_health() - alien.getAlien_damage());
        }
    }
    public String getTurret_missile_name() {
        return this.turret_missile_name;
    }

    public void setTurret_missile_name(String turret_missile_name) {
        this.turret_missile_name = turret_missile_name;
    }

    public int getTurret_missile_skill() {
        return this.turret_missile_skill;
    }

    public void setTurret_missile_skill(int turret_missile_skill) {
        this.turret_missile_skill = turret_missile_skill;
    }
    
}