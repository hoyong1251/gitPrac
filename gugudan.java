package gitPrac01;

import java.util.Scanner;

public class gugudan {

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		Scanner scan=new Scanner(System.in);
		System.out.print("�� �� ���?: ");
		int dan=scan.nextInt();
		if(dan==0) {
			for(int i=2; i<10; i++) {
				for(int j=1; j<10; j++) {
					System.out.print(i+" X "+j+" = "+i*j+" ");
				}
				System.out.print("\n");
			}
		}
		else {
		for(int i=1; i<10; i++) {
			System.out.println(dan+" X "+i+" = "+dan*i);
			}
		}
		scan.close();
	}

}
