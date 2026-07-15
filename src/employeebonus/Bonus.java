package employeebonus;

import employeebonus.interfaces.BonusCalculator;

public class Bonus {
    public BonusCalculator bonusCalculator() {
        return salary -> salary * 0.15;
    }

    public static void implementation() {
        Bonus bonus = new Bonus();
        System.out.println("Bonus: " + bonus.bonusCalculator().calculateBonus(50000));
    }
}
