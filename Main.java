import java.util.Scanner;
class Main {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    System.out.println("Podaj liczbe:");
    int liczba = scan.nextInt();
    if (liczba%2==0) 
      System.out.println("Liczba jest parzysta");
    else
    System.out.println("Liczba jest nieparzysta");
  }
}