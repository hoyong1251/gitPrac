package gitPrac01;

public class John {

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		double pi=1.0;
		int n=1;
		while(true) {
			double num= 1-(1/(4*Math.pow(n, 2)));
			pi*=num;
			n++;
			if(n==6000) {break;}
		}
		System.out.print(1/pi*2);
	}

}
