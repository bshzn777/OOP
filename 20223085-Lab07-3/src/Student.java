import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter size...");
		int size = in.nextInt();
		
		String[] names = new String[size];
		int[] scores = new int[size];
		
		for (int i=0; i<size; i++) {
			System.out.println("Enter name...");
			names[i] = in.next();
		}
		for (int i=0; i<size; i++) {
			System.out.println("Enter score...");
			scores[i] = in.nextInt();
		}
	}

}
