public class Game_day {
    
    private static Game_day instance; // 클래스의 유일한 인스턴스를 저장하는 private static 멤버 변수
    private int day = 1; // 게임의 현재 일(day)을 저장하는 private 멤버 변수
    public int repairDaysLeft; // 개인정비 사용에 필요한 남은 일수
    public int bookDaysLeft; // 독서 사용에 필요한 남은 일수
    public int studyDaysLeft; // 건설공부 사용에 필요한 남은 일수

    Game_day() { // private 생성자, Singleton 패턴을 적용하기 위해 외부에서 인스턴스 생성을 막음
        
    }

    public static Game_day getInstance() { // 인스턴스를 가져오는 public static 메서드, Singleton 패턴의 핵심
        if (instance == null) {
            instance = new Game_day();
        }
        return instance;
    }

    public int getDay() { // 게임의 현재 일(day)을 반환하는 public 메서드
        return day;
    }

    public void pass_day() { // 게임의 일(day)을 증가시키는 public 메서드
        day++;
    }
    public int getRepairDaysLeft() {
        return this.repairDaysLeft;
    }

    public void setRepairDaysLeft(int repairDaysLeft) {
        this.repairDaysLeft = repairDaysLeft;
    }

    public int getBookDaysLeft() {
        return this.bookDaysLeft;
    }

    public void setBookDaysLeft(int bookDaysLeft) {
        this.bookDaysLeft = bookDaysLeft;
    }

    public int getStudyDaysLeft() {
        return this.studyDaysLeft;
    }

    public void setStudyDaysLeft(int studyDaysLeft) {
        this.studyDaysLeft = studyDaysLeft;
    }
}