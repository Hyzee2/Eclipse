/* array는 동일한 datatype을 메모리 상에 순차적으로 확보한 것.
 * int [] arr; << int배열을 접근할 수 있는 arr을 만든 것.
 * arr = new int[5];  << 실제 arr에 int 5개 배열을 생성한 것. 
 * 
 * ex. 한 사람의 성적처리프로그램
 * 입력: 이름, 국, 영, 수
 * 연산: 총점, 평균
 * 출력: 이름, 국, 영, 수, 총점, 평균
 */

package Day2;

import java.util.Iterator;
import java.util.Scanner;

public class ArrayExam {

	public static void main(String[] args) {
		String name;
		int score[] = new int[4]; // 국, 영, 수, 총
		float avg;

		Scanner sc = new Scanner(System.in);

		int size = score.length;
		int sum = 0;

		// 입력
		System.out.println("이름을 입력하세요.");
		name = sc.next();
		System.out.println("국,영,수 점수를 차례로 입력하세요.");
		for (int i = 0; i < size - 1; i++) {
			score[i] = sc.nextInt();
		}

		// 총점

		for (int i = 0; i < size - 1; i++) {
			score[size - 1] += score[i];
		}

		// 평균

		avg = (float)score[size - 1] / (size - 1);

		// 출력
		System.out.print(name+"\t");

		for (int i : score) {
			System.out.print(i+"\t");
		}
		
		System.out.println(avg);
		
	}
}
