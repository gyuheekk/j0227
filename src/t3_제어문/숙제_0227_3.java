package t3_제어문;

import java.util.Scanner;

// 1개의 수를 입력받아서 그 수가 2의 배수인지, 3의 배수인지, 5의 배수인지를 각각 구분해서 출력하시오.
// (예시로, 10은 2의 배수이면서 5의 배수가 될수 있도록 출력처리합니다.)
public class 숙제_0227_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int su = 0;
		
		System.out.print("수를 입력하세요? ");
		su = sc.nextInt();
		
		if (su % 2 == 0) {
			System.out.println("수 "+su+"은 2의 배수입니다.");
		}
		else {
			System.out.println("수 "+su+"은 2의 배수가 아니며");
		}
		if (su % 3 == 0) {
			System.out.println("수 "+su+"은 3의 배수입니다.");
		}
		else {
			System.out.println("수 "+su+"은 3의 배수가 아니며");
		}
		if (su % 5 == 0) {
			System.out.println("수 "+su+"은 5의 배수입니다.");
		}
		else {
			System.out.println("수 "+su+"은 5의 배수가 아닙니다.");
		}
		
		sc.close();
	}
}
