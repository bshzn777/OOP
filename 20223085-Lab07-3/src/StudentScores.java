public class StudentScores {
	
	public static void main(String[] args) {
		final int MAX_STUDENTS = 100;
		int numStudents;
		
		numStudents = 3;
		Students[] students = new Students[numStudents];
		
		for(int i=0; i<numStudents; i++) {
			students[i] = new Students("name", 10);
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
