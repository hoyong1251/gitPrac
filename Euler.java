package gitPrac01;

public class Euler {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		double pi=0.0;
		int n=1;
		while(true) {
			pi+=1/Math.pow(n, 2);
			n++;
			if(n==6000) {break;} //n값 증가하면 정확도 증가
		}
		System.out.print(Math.sqrt(pi*6));
	}

}
