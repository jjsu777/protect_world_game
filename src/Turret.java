public class Turret extends Character {
    public String turret_name;
    public int turret_health;
    public int turret_shield;
    public int turret_power;
    public int turret_damage;

    public Turret(){
        this.turret_name = "포탑";
        this.turret_health = 100;
        this.turret_shield = 10;
        this.turret_power = 10; 
        this.turret_damage = 10;
    }

    public void doAttack_alien(Alien alien){
        System.out.println("포탑이 적을 공격합니다.");
        if(alien.getAlien_shield() >= 0){
        alien.setAlien_shield(alien.getAlien_shield() - this.turret_damage);
        System.out.println(alien.getAlien_name() + "의 쉴드가" + alien.getAlien_shield());
        }else {
        alien.setAlien_health(alien.getAlien_health() - this.turret_damage);
        System.out.println(alien.getAlien_name() + "의 체력이" + alien.getAlien_health());
        }
    }

    public void beAttack_alien(Alien alien){
        System.out.println("포탑이 적에게 공격 받습니다.");
        if(getTurret_shield() >= 0){
            setTurret_shield(getTurret_shield() - alien.getAlien_damage());
        } else {
            setTurret_health(getTurret_health() - alien.getAlien_damage());
        }
    }
    
    public String getTurret_name() {
        return this.turret_name;
    }

    public void setTurret_name(String turret_name) {
        this.turret_name = turret_name;
    }

    public int getTurret_health() {
        return this.turret_health;
    }

    public void setTurret_health(int turret_health) {
        this.turret_health = turret_health;
    }

    public int getTurret_shield() {
        return this.turret_shield;
    }

    public void setTurret_shield(int turret_shield) {
        this.turret_shield = turret_shield;
    }

    public int getTurret_power() {
        return this.turret_power;
    }

    public void setTurret_power(int turret_power) {
        this.turret_power = turret_power;
    }

    public int getTurret_damage() {
        return this.turret_damage;
    }

    public void setTurret_damage(int turret_damage) {
        this.turret_damage = turret_damage;
    }
}
