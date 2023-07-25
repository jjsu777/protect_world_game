public class Alien extends Character {
    public String alien_name;
    public int alien_power;
    public int alien_damage;
    public int alien_shield;
    public int alien_health;

    public Alien() {
        this.alien_name = "하급 외계인";
        this.alien_health = 50;
        this.alien_power = 5;
        this.alien_damage = 10;
        this.alien_shield = 15;
    }

    public void attack(Turret turret){
        System.out.println("외계인이 공격합니다.");
        if(turret.getTurret_shield() >= 0){
            turret.setTurret_shield(turret.getTurret_shield() - this.alien_damage);
            System.out.println(turret.getTurret_name() + "의 쉴드가" + turret.getTurret_shield());
        }else{
            turret.setTurret_health(turret.getTurret_health() - this.alien_damage);
            System.out.println(turret.getTurret_name() + "의 체력이" + turret.getTurret_health());
        }
    }

    public String getAlien_name() {
        return this.alien_name;
    }

    public void setAlien_name(String alien_name) {
        this.alien_name = alien_name;
    }

    public int getAlien_power() {
        return this.alien_power;
    }

    public void setAlien_power(int alien_power) {
        this.alien_power = alien_power;
    }

    public int getAlien_damage() {
        return this.alien_damage;
    }

    public void setAlien_damage(int alien_damage) {
        this.alien_damage = alien_damage;
    }

    public int getAlien_shield() {
        return this.alien_shield;
    }

    public void setAlien_shield(int alien_shield) {
        this.alien_shield = alien_shield;
    }

    public int getAlien_health() {
        return this.alien_health;
    }

    public void setAlien_health(int alien_health) {
        this.alien_health = alien_health;
    }
}