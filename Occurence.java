import java.util.Scanner;

public class Occurence {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	int number; occur = 0; largest = 0; smallest = 0; 
	
	do {
	int count = -1;
	System.out.print("Enter number: ");
	number = input.nextInt();

	if (number >= largest) {
	largest = number;
	occur = occur + 1;

}	else if (number >= smallest) {
	smallest = number;
}
	System.out.println("The largest number is: " + largest);
	System.out.println("The occurrence of the number is: " + occur);
}
	while(number != count);
	

}
}