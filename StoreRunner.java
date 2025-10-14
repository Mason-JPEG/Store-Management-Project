import java.util.Scanner;

public class StoreRunner {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

//Creates objects
    Photos image = new Photos("Mountains, ", "Mason, ", false, 650);
    Digital online = new Digital("Mountains, ", "Mason, ", false, 650, 24, 200);
    Printed picture = new Printed("Mountains, ", "Mason, ", false, 650, "Glossy, ", 6, 7);

    //Print Information
    System.out.println("Photos: " + image);
    System.out.println("Digital Photo: " + online);
    System.out.println("Printed picture: " + picture);
    
    input.close();
  }
}