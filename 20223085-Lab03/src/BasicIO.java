import java.util.Scanner;

// An exploration of basic input and output.
class BasicIO {

  // Reads and processes string input.
  public static void main(String[] args) {

    Scanner stdin = new Scanner(System.in);

    // get first input
    System.out.print("Enter your name: ");
    String name = stdin.nextLine();

    System.out.print("Enter your age: ");
    int years = stdin.nextInt();

    System.out.print("Enter your height: ");
    int height = stdin.nextInt();

    // display output on console
    System.out.println("your name is " + name);
    System.out.println("your age is " + years);
    System.out.println(years * 365);
    System.out.printf("2005년 09월 06일 현재 %s(%s)의 키는 %s cm 입니다.", name, years, height);
    // 2005년 09월 06일 현재 홍길동(20)의 키는 160 cm 입니다

  } // method main

} // class BASIC_IO
