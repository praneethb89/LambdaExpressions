package employeebonus.interfaces;

@FunctionalInterface
public interface BonusCalculator {
    double calculateBonus(double salary);
}
