package lecture3;

import java.util.Scanner;

public class calculator {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		double ans=0;

		while (true) {
			System.out.println("Enter Number 1");
			double n1 = scn.nextInt();

			System.out.println("Enter Number 2");
			double n2 = scn.nextInt();

			System.out.println("Choose your operator (+, -, x, /, %) \n or Press Q to Quit");
			char op = scn.next().charAt(0);

//			scn.close();

			if (op == '+' || op == '-' || op == 'x' || op == 'X' || op == '*' || op == '/' || op == '%') {

				if (op == '+') {

					ans = n1 + n2;

				} else if (op == '-') {

					ans = n1 - n2;

				} else if (op == '*' || op == 'x' || op == 'X') {

					ans = n1 * n2;

				} else if (op == '/') {

					ans = n1 / n2;

				} else if (op == '%') {

					ans = n1 % n2;

				}else {
					System.out.println("Invalid Operation");
				}

			}

			else if (op == 'Q' || op == 'q') {
				break;
			} else {
				System.out.println("Invalid Operation");
			}
			System.out.println(ans);
		}

	}
}