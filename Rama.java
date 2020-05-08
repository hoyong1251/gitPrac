package gitPrac01;

public class Rama {
	public static int factorial(int n) {
		if(n==0) { return 1;}
		else {return n*factorial(n-1);}
	}

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		double pi=1.0;
		int n=0;
		double num=0.0;
		while(true) {
			num+= (factorial(4*n)*(1103+26390*n)) / (Math.pow(factorial(n), 4)*Math.pow(396, 4*n));
			n++;
			if(n==3) {break;}
		}
		pi*=num*Math.sqrt(8)/9801;
		System.out.print(1/pi);
	}

}
