public class Feeder {
  private int currentFood;

  public Feeder(int food) {
    currentFood = food;
  }

  public int getFood() {
    return currentFood;
  }

  public void simulateOneDay(int numBirds) {
    if (Math.random() < 0.95) {
      int numFood = (int) ((Math.random() * 40) + 1);
      currentFood -= numBirds * numFood;
      if (currentFood < 1) {
        currentFood = 0;
      }
    } else {
      currentFood = 0;
    }
  }

  public int simulateManyDays(int numBirds, int numDays) {
    int count = 0;
    for (int i = 0; i < numDays; i++) {
      if (currentFood < 1) {
        return count;
      }
      simulateOneDay(numBirds);
      count++;
    }
    return count;
  }

}
