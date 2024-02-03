import java.util.Scanner;

class Input {
  String a;

  public void takeInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a message: ");
        a = sc.nextLine();
    }
}

public class Practice2 {
  public static void main(String[] args) {
    Input i = new Input();
    i.takeInput();
    System.out.println("Your message is: " + i.a);
  }
}