package gitPrac01;

public class calc_pi {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		double pi=0.0;
		int n=1;
		while(true) {
			if(n%2==0) {
				pi-=(1.0/(2*n-1));
			}else {
				pi+=(1.0/(2*n-1));
			}
			n++;
			if(n==6000) {break;} //n값 증가하면 정확도 증가
		}
		System.out.print(Math.round(pi*4*100)/100.0); //소수점 셋째 자리에서 반올림
	}

}
