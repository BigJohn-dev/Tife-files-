import java.util.Scanner;

public class CryptographyII {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("Enter a four-digit number: ");
	int four = input.nextInt();

	int divi1 = (four / 1000) % 10;
	int rem11 = (four + 10 - 7) % 10;

	int divi2 = (four / 100) % 10;
	int rem22 = (four + 10 - 7) % 10;

	int divi3 = (four / 10) % 10;
	int rem33 = (four + 10 - 7) % 10;

	int divi4 = (four / 1) % 10;
	int rem44 = (four + 10 - 7) % 10;

	System.out.println(rem11 + " " + rem22 + " " + rem33 + " " + rem44);
}


}