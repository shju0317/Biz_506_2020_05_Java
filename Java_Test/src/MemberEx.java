

/*
 * Java에서는 모든 기본파일을 클래스라고 한다.
 * Java에서 코딩을 시작하면 제일 먼저 클래스를 생성하고
 * 클래스에 진입점 method를 생성하여야 코드를 실행할 수 있다.
 * 클래스만 작성된 상태에서 진입 method가 없으면 스스로 아무런 코드도 실행할 수 없다.
 * 
 */
public class MemberEx {
	
	/*
	 * 진입점 method는 클래스를 컴파일하고 run했을 때 java의 가상머신이
	 * 제일 먼저 호출하는 method이고 그 문법이 정해져 있다.
	 */
	public static void main(String[] args) {
		System.out.println(args[0]);
	}
}
