import java.util.Scanner;
/**
 * Method example file
 * @author Aidan Cheesmond
 */
public class Main {

  // calculates the area of a rectangle given the length and width
  public static double areaOfRect( double width, double length){
    // calculating the area of a rectangle
    double area = width * length;
    // returning the answer
    return area;
  }

  public static void sayHello(){
    System.out.println("Hello World");
  }

  public static void sayHello(String name){
    System.out.println("Hello " + name);
  }


  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a scanner for user input
    Scanner input = new Scanner(System.in);
    double l = input.nextDouble();
    double w = input.nextDouble();
    double area = areaOfRect(l,w);
    System.out.println(area);
    String name = "Steve";
    sayHello();
    sayHello(name);
    sayHello("Aidan");
  }
}
