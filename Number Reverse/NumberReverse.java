import java.util.Scanner;

public class NumberReverse{

	public static void main(String args[]){
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter integer");
		int number = scanner.nextInt();
		if(number<0){
                    number = number*-1;
                    System.out.print("-");
                }
		while(number!=0){
			
			System.out.print(number%10);
			number = number/10;	
		}		
	}
}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          