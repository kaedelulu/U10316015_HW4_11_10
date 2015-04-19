/**
 * Name : 呂芝瑩
 * ID : U10316015
 * EX : 11.10
 */
import java.util.Scanner;

public class TestStack {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    MyStack stack = new MyStack();	//invoke stack
    
    for ( int i = 0 ; i < 5 ; i++ ){
		stack.push( input.nextLine() );
    }
	
    System.out.println(stack.getSize() + " strings are: ");
    while (!stack.isEmpty())
		System.out.println(stack.pop());
  }
}
