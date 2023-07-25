import java.util.Random;

    public class Turret_newclear extends Turret {
        public String Turret_newclear_name;
        public int Turret_newclear_skill;

        public Turret_newclear(){
            super();
            this.Turret_newclear_name = "핵폭탄 포탑";
            this.turret_health = 500;
            this.turret_shield = 60;
            this.turret_damage = 100;
            this.Turret_newclear_skill = 500;
        }
    
        @Override
        public void doAttack_alien(Alien alien){
            System.out.println("핵폭탄 포탑이 적을 공격합니다.");
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
                    turret_newclear_skill(alien);
                }
                }
                public void turret_newclear_skill (Alien alien){
                    System.out.println("핵폭탄 포탑이 스킬을 사용합니다.");
                    System.out.println("핵폭탄 포탑 : 청소 시스텝 가동");
                    if(alien.getAlien_shield() >= 0){
                        alien.setAlien_shield(alien.getAlien_shield() - this.turret_damage);
                        System.out.println(alien.getAlien_name() + "의 쉴드가" + alien.getAlien_shield());
                        }else {
                        alien.setAlien_health(alien.getAlien_health() - this.turret_damage);
                        System.out.println(alien.getAlien_name() + "의 체력이" + alien.getAlien_health());
                }
            }
            public void beAttack_alien(Alien alien){
                System.out.println("핵폭탄 포탑이 적에게 공격 받습니다.");
                if(getTurret_shield() >= 0){
                    setTurret_shield(getTurret_shield() - alien.getAlien_damage());
                } else {
                    setTurret_health(getTurret_health() - alien.getAlien_damage());
                }
            }
            public String getTurret_newclear_name() {
                return this.Turret_newclear_name;
            }
        
            public void setTurret_newclear_name(String Turret_newclear_name) {
                this.Turret_newclear_name = Turret_newclear_name;
            }
        
            public int getTurret_newclear_skill() {
                return this.Turret_newclear_skill;
            }
        
            public void setTurret_newclear_skill(int Turret_newclear_skill) {
                this.Turret_newclear_skill = Turret_newclear_skill;
            }
        }
        
