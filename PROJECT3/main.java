// MAIN. glass vs tempered glass. 
public class Main {
  public static void main(String[] args) {
    Player play = new Player(10);
    Ladder ladder = new Ladder(5);
    int[][] laddercreate = ladder.createLadder();
    ladder.printLadderBlank();
    System.out.println("Total Lives: " + play.getLives());
    while (ladder.selections.size() < ladder.panels) {
      System.out.println("---------LEGEND-----------");
      System.out.println("0: Glass ");
      System.out.println("1: Tempered Glass ");
      System.out.println("--------------------------");
      if (play.getLives() == 0) {
        System.out.println("Oh no, you died.");
        System.exit(0);
      } // get lives + death
      System.out.println("Current Place in Ladder: " + ladder.selections.size());
      if (!ladder.calcPanel(laddercreate, ladder.selections))
        play.death(); 
      System.out.println("Total Lives: " + play.getLives());
      System.out.println("-------------------------------------");
      ladder.printCurrentLadder();
    } //winning text
    System.out.println("You won.");
    ladder.printLadder();
  }
}
