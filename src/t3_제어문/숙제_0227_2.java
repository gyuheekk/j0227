package t3_제어문;

import java.util.Scanner;

// 두개의 수를 각각 입력받아서 두개의 수중, 큰수와 작은수를 각각 출력해 주시오.
public class 숙제_0227_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int su1;
		int su2;
		
		System.out.print("첫번째 수를 입력하세요? ");
		su1 = sc.nextInt();
		
		System.out.print("두번째 수를 입력하세요? ");
		su2 = sc.nextInt();
		
		if (su1 > su2) {
			System.out.println("큰수는 "+su1+"이고, 작은수는 "+su2+"입니다.");
		}
		else {
			System.out.println("큰수는 "+su2+"이고, 작은수는 "+su1+"입니다.");
		}
		
		sc.close();
	}
}
