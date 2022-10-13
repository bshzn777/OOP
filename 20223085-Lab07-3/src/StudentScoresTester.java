import java.util.Scanner;

public class StudentScoresTester {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		boolean done = false;

		// Read the students names and scores, and add them to studSc
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

		// Find the students with highest and lowest scores and print
		// their names and scores
		final int MAX_STUDENTS = 100;
		int numStudents;
		
		numStudents = 3;
		Students[] students = new Students[numStudents];
		
		for(int i=0; i<numStudents; i++) {
			students[i] = new Students(names[i], scores[i]);
		}
		if (numStudents == 0)
			System.out.println("null");

		int highest = 0;

		for (int i = 1; i < numStudents; i++)
			if (students[i].score > students[highest].score)
				highest = i;

		System.out.println("highest: " + students[highest].name);
		
		if (numStudents == 0)
			System.out.println("null");

		int lowest = 0;

		for (int i = 1; i < numStudents; i++)
			if (students[i].score < students[lowest].score)
				lowest = i;

		System.out.println("lowest: " + students[lowest].name);
	}
}
