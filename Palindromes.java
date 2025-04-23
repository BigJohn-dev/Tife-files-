import java.util.Scanner;

public class Palindromes {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.println(" _- PALINDROMS OF 5-DIGITS NUMBERS -_ ");

	int num;
	int temp = num; 
	int reverse = 0;

	System.out.print("Enter digit numbers: ");
	num = input.nextInt();

	while (temp > 0) {
	int remainder = temp % 10;
	reverse = reverse * 10 + remainder;
	temp = temp / 10;
}
	if (num == reverse) {
	System.out.println(temp + " is a parlindrome");

}	else {
	System.out.println(temp + " is not a parlindrome");
}


}
}