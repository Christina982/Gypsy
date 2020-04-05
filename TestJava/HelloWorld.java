import java.util.Scanner;

public class HelloWorld {
	
	public static void main(String [] args) {
	while(true) {
		Scanner input = new Scanner(System.in);
		String operation = input.nextLine();
		String[] stringArray = operation.split("x");
		int x = Integer.parseInt(stringArray[0]);
		int y = Integer.parseInt(stringArray[1]);
		System.out.println(x * y);
		}
	}
}
