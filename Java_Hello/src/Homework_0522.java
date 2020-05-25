
public class Homework_0522 {
	public static void main(String[] args) {
		double x = 0.0;
		
		for(x = 0.0;x<100;x+=0.1) {
		if((x+(x*0.1))==375) {
			System.out.println("x 값: "+x);
		}else {
			System.out.println("해 없음");
		}
		}
	}
}
