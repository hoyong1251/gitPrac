package gitPrac01;

public class calc_pi {

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		double pi=0.0;
		int n=1;
		while(true) {
			if(n%2==0) {
				pi-=(1.0/(2*n-1));
			}else {
				pi+=(1.0/(2*n-1));
			}
			n++;
			if(n==6000) {break;} //n�� �����ϸ� ��Ȯ�� ����
		}
		System.out.print(Math.round(pi*4*100)/100.0); //�Ҽ��� ��° �ڸ����� �ݿø�
	}

}
