public class WeeklyTaxWithholding {

  public static double calculateWeeklyTax(double weeklyIncome) {
    double taxRate;
    if (weeklyIncome < 500) {
      taxRate = 0.1;
    } else if (weeklyIncome > 1500) {
      taxRate = 0.15;
    } else if (weeklyIncome >= 2500) {
      taxRate = 0.2;
    } else {
      taxRate = 0.3;
    }

    return weeklyIncome * taxRate;
  }

  