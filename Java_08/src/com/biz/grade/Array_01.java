package com.biz.grade;

import java.util.Random;

/*
 * 1. 20명 학생의 국어, 영어, 수학, 음악 점수를 저장하기 위한 배열선언
 * 2. 각 배열에 51~100점의 점수를 생성하여 저장
 * 3. 각 학생의 점수총점, 평균을 계산하고
 * 4. 과목별 점수총점, 평균을 계산하여
 * 5. 성적 리스트를 Console에 표시하시오.
 */

public class Array_01 {
	public static void main(String[] args) {
		
		// 20개의 저장공간을 가진 변수를 선언
		// integer형 배열 20개씩을 선언: 20개의 저장공간을 가진 변수
		// intKor라는 배열을 20개의 저장공간을 갖는 integer형 배열을 생성
		int[] intKors = new int[20];
		int[] intEngs = new int[20];
		int[] intMaths = new int[20];
		int[] intMusics = new int[20];

		
		// 임의 숫자를 생성하기 위한 도구를 선언하기
		// Random클래스를 이용해서 rnd라는 변수(도구)를 선언하고
		// new Random() 초기화 코드를 사용해서 사용 준비
		Random random = new Random();
		
		// 이 명령코드가 실행될 때마다 임의 정수를 만들어 낸다.
		random.nextInt();
		// 이 명령코드가 실행될 때마다 0~99까지의 임의 정수를 만들어 낸다.
		random.nextInt(100);
		
		/*
		 * 위에서 생성한 4개의 배열에 각각 20개의 점수를 할당하기 위해
		 * 배열의 개수만큼 반복문을 실행하고, 
		 * 반복문이 실행되면서 만들어지는 i변수의 값을 각 배열의 index로 주입하여
		 * 배열[0]~배열[19]까지의 저장 공간에 값을 할당하기 위해 시작하는 반복문 코드.
		 * intKor[0]~intKor[19], intEng[0]~intEng[19], ... 
		 * 이러한 위치가 지정된 변수에 임의 정수값을 생성하여 할당한다.
		 *  성적처리르 테스트하기 위한 임의 점수를 만들어서 배열에 저장하는 코드.
		 */
		for (int i = 0; i < 20; i++) { // 과목별 랜덤 값 입력
			intKors[i] = random.nextInt(50) + 51;
			intEngs[i] = random.nextInt(50) + 51;
			intMaths[i] = random.nextInt(50) + 51;
			intMusics[i] = random.nextInt(50) + 51;
		}

		System.out.println("====================================================");
		System.out.println("\t    ★★★★★★★★  학생 성적  ★★★★★★★");
		System.out.println("----------------------------------------------------");
		System.out.println("학번\t국어\t영어\t수학\t음악\t총점\t평균");
		System.out.println("----------------------------------------------------");

		// 과목별로 총점을 계산하여 보관할 변수를 선언
		int intKorSum = 0;
		int intEngSum = 0;
		int intMathSum = 0;
		int intMusicSum = 0;
		
		for (int i = 0; i < 20; i++) { // 모든 학생들의 과목별 점수 총점
			intKorSum += intKors[i];
			intEngSum += intEngs[i];
			intMathSum += intMaths[i];
			intMusicSum += intMusics[i];
		}
		
		/*
		 * =================================================================
		 * 국어			영어		수학		음악 			총점
		 * -----------------------------------------------------------------
		 * intKor[0] +  intEng[0] + intMath[0] +intMusic[0]	 =  intStSum[0]
		 * intKor[1] 	intEng[1]	intMath[1]	intMusic[1]		intStSum[1]
		 * intKor[2] 	intEng[2]	intMath[2]	intMusic[2]		intStSum[2]
		 * 		...			...			...			...				...
		 * -----------------------------------------------------------------
		 */

		// 학생들의 과목별 총점을 계산하여 저장할 배열을 또 20개 선언
		int[] intStudentSum = new int[20];
		
		for (int i = 0; i < 20; i++) { // 총점배열에 학생들의 성적총점을 계산하여 저장
			intStudentSum[i] = intKors[i] + intEngs[i] + intMaths[i] + intMusics[i];
		}
		
		

		for (int i = 0; i < 20; i++) { // 학생별 점수,총합,평균 출력
			System.out.printf("%d\t%d\t%d\t%d\t%d\t%d\t%d\n", (i + 1), intKors[i], intEngs[i], intMaths[i],intMaths[i],
					intStudentSum[i],(intStudentSum[i]/4));
		}

		System.out.println("----------------------------------------------------");
		System.out.printf("\t%d\t%d\t%d\t%d\n", intKorSum, intEngSum, intMathSum,intMusicSum); // 과목별 총합 출력
		System.out.printf("\t%d\t%d\t%d\t%d\n", (intKorSum / 20), (intEngSum / 20), (intMathSum / 20),(intMusicSum / 20)); // 과목별 평균 출력
		System.out.println("====================================================");
	}
}
