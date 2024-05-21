public class Main {
  public static void main(String[] args) {
    System.out.println("Question 1 FRQ");

    Feeder f1 = new Feeder(2400);

    System.out.println(f1.simulateManyDays(10, 4));
    int food = f1.getFood();
    System.out.println(food);

    Feeder f2 = new Feeder(0);

    System.out.println(f2.simulateManyDays(10, 4));
    int food2 = f2.getFood();
    System.out.println(food2);

    Feeder f3 = new Feeder(200);
    f3.simulateOneDay(5);
    System.out.println(f3.getFood());
  }
  
}
