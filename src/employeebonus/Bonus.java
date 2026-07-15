package employeebonus;

import employeebonus.interfaces.BonusCalculator;

public class Bonus {
    public BonusCalculator bonusCalculator() {
        return salary -> salary * 0.15;
    }
}
