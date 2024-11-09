package mathsSolver;

import java.util.Scanner;

public class DEMO_NOVEMBER { // quick java class to see how feasable one of the ideas are

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		//lets say theres an integral
		// so like [ x^2 +5 dx
		// now solve
		String question = "x^2+5";
		System.out.println("[ "+question+"  dx");
		System.out.println("Whats the answer to this question");
		
		String input = sc.nextLine();
		
		String answer = findAnswer(question);
		if(input.equals(answer)) {
			System.out.println("correct, the answer is " + answer);
		}else {
			System.out.println("wrong, the answer is "  + answer);
		}
		
	}

	private static String findAnswer(String question) { // 1/3 x^3 + 5x
		//so, the input can be made up of many values
		// we presume for this case that we are going to differentiate according to x
		
	}
}
