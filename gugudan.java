package gitPrac01;

import java.util.Scanner;

public class gugudan {

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		Scanner scan=new Scanner(System.in);
		System.out.print("�� �� ���?: ");
		int dan=scan.nextInt();
		for(int i=1; i<10; i++) {
			System.out.println(dan+" X "+i+" = "+dan*i);
		}
		scan.close();
	}

}
