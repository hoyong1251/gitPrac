package gitPrac01;

public class Euler {

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		double pi=0.0;
		int n=1;
		while(true) {
			pi+=1/Math.pow(n, 2);
			n++;
			if(n==6000) {break;} //n�� �����ϸ� ��Ȯ�� ����
		}
		System.out.print(Math.sqrt(pi*6));
	}

}
