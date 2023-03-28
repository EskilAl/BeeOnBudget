package no.ntnu.idatg1002.budgetapplication.backend;

/**
 * Represents a savings plan. Each savings plan holds some information about that plan.
 *
 * @author Igor Dzugaj, Erik Bjørnsen
 * @version 2.0
 */
public class SavingsPlan {
  private String goalName;
  private int totalGoalAmount;
  private int totalSaved;
  private int wantedSavingTime;
  private int wantedMonthlySavingAmount;

  /**
   * Instantiates a new Savings plan.
   *
   * @param goalName the goal name
   * @param totalGoalAmount the total goal amount
   * @param totalSaved the total saved
   * @throws IllegalArgumentException the illegal argument exception
   */
  public SavingsPlan(String goalName, int totalGoalAmount, int totalSaved)
      throws IllegalArgumentException {

    if (goalName == null || goalName.trim().isEmpty()) {
      throw new IllegalArgumentException("Goal name must not be empty or blank");
    }
    if (totalGoalAmount < 0) {
      throw new IllegalArgumentException("Total goal amount must be non-negative");
    }

    this.goalName = goalName;
    this.totalGoalAmount = totalGoalAmount;
    this.totalSaved = totalSaved;
  }

  /**
   * Gets goal name.
   *
   * @return the goal name
   */
  public String getGoalName() {
    return goalName;
  }

  /**
   * Sets goal name.
   *
   * @param goalName the goal name
   * @throws IllegalArgumentException the illegal argument exception
   */
  public void setGoalName(String goalName) throws IllegalArgumentException {
    if (goalName == null || goalName.trim().isEmpty()) {
      throw new IllegalArgumentException("Goal name must not be empty or blank");
    }

    this.goalName = goalName;
  }

  /**
   * Gets total goal amount.
   *
   * @return the total goal amount
   */
  public int getTotalGoalAmount() {
    return totalGoalAmount;
  }

  /**
   * Sets total goal amount.
   *
   * @param totalGoalAmount the total goal amount
   * @throws IllegalArgumentException the illegal argument exception
   */
  public void setTotalGoalAmount(int totalGoalAmount) throws IllegalArgumentException {
    if (totalGoalAmount < 0) {
      throw new IllegalArgumentException("Total goal amount must be non-negative");
    }

    this.totalGoalAmount = totalGoalAmount;
  }

  /**
   * Gets total saved.
   *
   * @return the total saved
   */
  public int getTotalSaved() {
    return totalSaved;
  }

  /**
   * Sets total saved.
   *
   * @param totalSaved the total saved
   */
  public void setTotalSaved(int totalSaved) {

    this.totalSaved = totalSaved;
  }

  /**
   * Gets wanted saving time.
   *
   * @return the wanted saving time
   */
  public int getWantedSavingTime() {
    return wantedSavingTime;
  }

  /**
   * Sets wanted saving time.
   *
   * @param wantedSavingTime the wanted saving time
   * @throws IllegalArgumentException the illegal argument exception
   */
  public void setWantedSavingTime(int wantedSavingTime) throws IllegalArgumentException {
    if (wantedSavingTime < 0) {
      throw new IllegalArgumentException("Wanted saving time amount must be non-negative");
    }
    this.wantedSavingTime = wantedSavingTime;
  }

  /**
   * Gets wanted monthly saving amount.
   *
   * @return the wanted monthly saving amount
   */
  public int getWantedMonthlySavingAmount() {
    return wantedMonthlySavingAmount;
  }

  /**
   * Sets wanted monthly saving amount.
   *
   * @param wantedMonthlySavingAmount the wanted monthly saving amount
   * @throws IllegalArgumentException the illegal argument exception
   */
  public void setWantedMonthlySavingAmount(int wantedMonthlySavingAmount)
      throws IllegalArgumentException {
    if (wantedMonthlySavingAmount < 0) {
      throw new IllegalArgumentException("Wanted monthly saving amount must be non-negative");
    }
    this.wantedMonthlySavingAmount = wantedMonthlySavingAmount;
  }

  /**
   * Estimate saving time int.
   *
   * @return the int
   */
  public int estimateSavingTime() {
    int estimatedSavTime = totalGoalAmount / wantedMonthlySavingAmount;
    return estimatedSavTime;
  }

  /**
   * Estimate monthly saving amount int.
   *
   * @return the int
   */
  public int estimateMonthlySavingAmount() {
    int estimatedMonthlySaveAmount = totalGoalAmount / wantedSavingTime;
    return estimatedMonthlySaveAmount;
  }
}