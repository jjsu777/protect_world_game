public class Commander extends Character {
    
    public String name;
    public int money;
    public int leadership;
    public int building_speed;

    public Commander(String name, int health, int money, int leadership, int building_speed){
        this.health = health;
        this.name = name;
        this.money = money;
        this.leadership = leadership;
        this.building_speed = building_speed;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return this.money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getLeadership() {
        return this.leadership;
    }

    public void setLeadership(int leadership) {
        this.leadership = leadership;
    }

    public int getBuilding_speed() {
        return this.building_speed;
    }

    public void setBuilding_speed(int building_speed) {
        this.building_speed = building_speed;
    }

    public void upMoney(int money){
        this.money += money;
        System.out.println("사례금을 획득하였습니다. 현재 현금 : " + this.money);
    }

    public void lostMoney(int money){
        this.money -= money;
        System.out.println("현금을 잃었습니다. 현재 현금 :" + this.money);
    }

    public void upHealth(int health){
        this.health += health;
        System.out.println("사령관님의 체력이 상승하였습니다. 현재 체력 : " + this.health);
    }

    public void upLeadership(int leadership){
        this.leadership += leadership;
        System.out.println("사령관님의 리더쉽이 상승하였습니다. 현재 리더쉽 : " + this.leadership);
    }
    public void upBuilding_speed(int building_speed){
        this.building_speed += building_speed;
        System.out.println("건설 능력치가 증가하였습니다." + this.building_speed);
    }
}