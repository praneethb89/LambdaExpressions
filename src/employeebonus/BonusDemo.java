package employeebonus;


public class BonusDemo {
    public static void main(String[] args) {
        Bonus bonus = new Bonus();
        System.out.println(bonus.bonusCalculator().calculateBonus(50000));
    }
}
