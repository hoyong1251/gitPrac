package gitPrac01;

import java.util.Scanner;

public class gugudan {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Scanner scan=new Scanner(System.in);
		System.out.print("몇 단 출력?: ");
		int dan=scan.nextInt();
		for(int i=1; i<10; i++) {
			System.out.println(dan+" X "+i+" = "+dan*i);
		}
		scan.close();
	}

}
