import java.util.Random;

public class Turret_rager extends Turret {
    public String turret_rager_name;
    public int turret_rager_skill;

    public Turret_rager(){
        super();
        this.turret_rager_name = "레이져 포탑";
        this.turret_health = 300;
        this.turret_shield = 30;
        this.turret_damage = 30;
        this.turret_rager_skill = 50;
    }

    @Override
    public void doAttack_alien(Alien alien){
        System.out.println("레이져 포탑이 적을 공격합니다.");
        Random random = new Random();
        int skill = random.nextInt(2);

        if (skill == 0){
            if(alien.getAlien_shield() >= 0){
                alien.setAlien_shield(alien.getAlien_shield() - this.turret_damage);
                System.out.println(alien.getAlien_name() + "의 쉴드가" + alien.getAlien_shield());
                }else {
                alien.setAlien_health(alien.getAlien_health() - this.turret_damage);
                System.out.println(alien.getAlien_name() + "의 체력이" + alien.getAlien_health());
                }
            }else {
                turret_rager_skill(alien);
            }
            }
            public void turret_rager_skill (Alien alien){
                System.out.println("레이져 포탑이 스킬을 사용합니다.");
                System.out.println("레이져 포탑 : 레이져 포탑 시스텝 가동");
                if(alien.getAlien_shield() >= 0){
                    alien.setAlien_shield(alien.getAlien_shield() - this.turret_rager_skill);
                    System.out.println(alien.getAlien_name() + "의 쉴드가" + alien.getAlien_shield());
                    }else {
                    alien.setAlien_health(alien.getAlien_health() - this.turret_rager_skill);
                    System.out.println(alien.getAlien_name() + "의 체력이" + alien.getAlien_health());
            }
        }
        public void beAttack_alien(Alien alien){
            System.out.println("레이져 포탑이 적에게 공격 받습니다.");
            if(getTurret_shield() >= 0){
                setTurret_shield(getTurret_shield() - alien.getAlien_damage());
            } else {
                setTurret_health(getTurret_health() - alien.getAlien_damage());
            }
        }
        public String getTurret_rager_name() {
            return this.turret_rager_name;
        }
    
        public void setTurret_rager_name(String turret_rager_name) {
            this.turret_rager_name = turret_rager_name;
        }
    
        public int getTurret_rager_skill() {
            return this.turret_rager_skill;
        }
    
        public void setTurret_rager_skill(int turret_rager_skill) {
            this.turret_rager_skill = turret_rager_skill;
        }
    }
        
