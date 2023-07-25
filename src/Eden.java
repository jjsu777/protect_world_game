import java.util.ArrayList;

public class Eden {
    public int population;
    public int defense;
    public ArrayList<Turret> turret_factory;
    public boolean turretUpgrade;

    public Eden() {
        this.population = 1000;
        this.defense = 0;
        this.turret_factory = new ArrayList<>();
        Turret startTurret = new Turret();
        addturret(startTurret);
        turretUpgrade = false;
    }

    public void increasePopulation(int population){
    this.population += population;
    System.out.println("주민들에게서 신뢰를 얻습니다. 현재 주민들의 신뢰도 : " + this.population);
    }

    public void lostPopulation(int population){
        this.population -= population;
        System.out.println("주민들에게서 신뢰를 잃었습니다... 현재 주민들의 신뢰도 : " + this.population);
    }
    public void increaseDefense(int defense){
        this.defense += defense;
        System.out.println("에덴의 방어력이 증가하였습니다. 현재 에덴의 방어도: " + this.defense);
    }
    public void lostDefense(int defense){
        this.defense -= defense;
        System.out.println("에덴의 방어력이 약해졌습니다. 현재 에덴의 방어도 " + this.defense);
    }

    public void removeLastTurret() {
        if (!turret_factory.isEmpty()) {
            turret_factory.remove(turret_factory.size() - 1);
        }
    }
        public void removeFirstTurret() {
            if (!turret_factory.isEmpty()) {
                turret_factory.remove(0);
            }
    }
    public Turret getNextTurret() {
    if (turret_factory.isEmpty()) {
        return null; // 포탑이 없으면 null을 반환
    }
    Turret nextTurret = turret_factory.get(0); // 첫 번째 포탑을 가져옴
    turret_factory.remove(0); // 가져온 포탑을 리스트에서 삭제
    return nextTurret;
}

    public int getPopulation() {
        return this.population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getDefense() {
        return this.defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public ArrayList<Turret> getturret(){
        return turret_factory;
    }
    
    public int getNumberOfTurrets() {
        return turret_factory.size();
    }
    public void addturret(Turret turret) {
        turret_factory.add(turret);
    }
}