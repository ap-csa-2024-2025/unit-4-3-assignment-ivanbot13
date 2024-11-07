import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    // prob1:
    for (int i = 0; i <= 25; i += 1){
      if (i % 2 == 1){
        System.out.println(i);
      }
    }
    
    //prob2:
    for (int i = 17; i <= 73; i++){
      if (i % 10 == 6){
        System.out.println(i);
      }
      else {
        System.out.print(i + " ");
      }
    }

    //prob3:
    Scanner sc = new Scanner(System.in);
    System.out.println("\nEnter a number between 0 and 50: ");
    int start = sc.nextInt();
    if ((start <= 0) || (start >= 50)){
      System.out.println("error");
    }
    else {
      for (int i = start; i <= 50; i++){
        if ((start - i -1) % 5 == 0){
          System.out.println(i);
        }
        else {
          System.out.print(i + " ");
        }
      }
    }
    
    //prob4:
    System.out.println("\nEnter a positive integer: ");
    int num = sc.nextInt();
    if (num < 0){
      System.out.println("error");
    }
    else {
      num -= (num % 3);
      for (int i = num; i >= 0; i -= 3){
        System.out.print(i + " ");
      }
    }

    //done
  }
}
