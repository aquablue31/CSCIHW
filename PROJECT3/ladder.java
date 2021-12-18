import java.util.ArrayList;
import java.util.Scanner;

public class Ladder {
  public int panels;
  
  public int[][] ladder;
  
  public int round = 1;
  
  public ArrayList<Integer> selections;
  
  public Ladder() {
    this.selections = new ArrayList<>();
    this.panels = 5;
  }
  
  public Ladder(int panel) {
    this.selections = new ArrayList<>();
    this.panels = panel;
  }
  // L AND R 
  public int getSelection() {
    int convertedSelection = 0;
    Scanner keyboard = new Scanner(System.in);
    boolean runner = false;
    while (!runner) {
      System.out.println("Enter Either L or R");
      String selection = keyboard.nextLine();
      if (selection.equals("L") || selection.equals("l")) {
        System.out.println("L Selected");
        convertedSelection = 0;
        return convertedSelection;
      } 
      if (selection.equals("R") || selection.equals("r")) {
        convertedSelection = 1;
        System.out.println("R Selected");
        return convertedSelection;
      } 
      System.out.println("Invalid Selection. You must selection again.");
    } 
    return convertedSelection;
  }
  
  public int[][] createLadder() {
    this.ladder = new int[this.panels][2];
    for (int i = 0; i < this.ladder.length; i++) {
      for (int j = 0; j < (this.ladder[i]).length; j++)
        this.ladder[i][j] = (int)(2.0D * Math.random()); 
      if (this.ladder[i][0] == this.ladder[i][1])
        if (this.ladder[i][0] == 0) {
          this.ladder[i][0] = 1;
        } else {
          this.ladder[i][0] = 0;
        }  
    } 
    return this.ladder;
  }
  
  public boolean calcPanel(int[][] ladder, ArrayList<Integer> selections) {
    int size = selections.size();
    int printSize = size + 1;
    System.out.println("Round: " + this.round);
    int[] temp = new int[2];
    for (int i = 0; i < (ladder[0]).length; i++)
      temp[i] = ladder[size][i]; 
    System.out.println();
    int currentSelection = getSelection();
    selections.add(Integer.valueOf(currentSelection));
    int choice = ((Integer)selections.get(selections.size() - 1)).intValue();
    if (temp[choice] == 1) {
      System.out.println("Next round starting soon");
      this.round++;
      return true;
    } 
    selections.remove(selections.size() - 1);
    this.round++;
    System.out.println("Oh no, you lost one life.");
    return false;
  }
  // ladder
  public void printLadder() {
    try {
      System.out.println("|||||| ---- Start");
      for (int i = 0; i < this.ladder.length; i++) {
        for (int j = 0; j < (this.ladder[i]).length; j++)
          System.out.print("|" + this.ladder[i][j] + "|"); 
        System.out.println();
      } 
      System.out.println("|||||| ---- Finish");
    } catch (Exception e) {
      System.out.println("ERROR???");
    } 
  }
  // current ladder
  public void printCurrentLadder() {
    System.out.println("|||||| ---- Start");
    for (int i = 0; i < this.selections.size(); i++) {
      for (int j = 0; j < (this.ladder[i]).length; j++)
        System.out.print("|" + this.ladder[i][j] + "|"); 
      System.out.println();
    } 
    System.out.println("|?||?|");
  }
  
  public void printLadderBlank() {
    try {
      System.out.println("|||||| ---- Start");
      for (int i = 0; i < this.ladder.length; i++) {
        System.out.print("| || |");
        System.out.println();
      } 
      System.out.println("|||||| ---- Finish");
    } catch (Exception e) {
      System.out.println("ERROR!");
    } 
  }
}
// methods...
