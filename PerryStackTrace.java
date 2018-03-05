/*PROGRAM: Lab2 Stack Trace
 * AUTHOR: Leah Perry
 * Class: CIS260 Algorithms and Data Structures
 * Due Date: March 27, 2016
 * SUMMARY: Demonstrates stack trace algorithm
 */
import java.io.IOException;
import java.util.Stack;

public class PerryStackTrace {
	public static void main(String[]args) throws IOException {
		Stack<Integer> S = new Stack<Integer>();
		Stack<Integer> T = new Stack<Integer>();
		
		for(int i = 0; i < 6; i++){
			System.out.println("Pushing " + i + " onto stack S.");
			S.push(i);
		}//for to fill S
		System.out.println("Top of S is: " + S.peek());
		while(!S.empty()){
			System.out.println("Pushing " + S.peek() + " onto stack T.");
			T.push(S.pop());
		}
		
		System.out.println("After transfering, the top of T is: " + T.peek());
		
		
	}//end main

}//end PerryStackTrace
