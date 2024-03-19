package DataStructureDay02;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Babygin {

	int[] input = new int[6]; // 배열의 길이가 6인 input 배열 생성
	int temp = 0; // 자리를 바꾸기 위해 임시로 담아두는 공간, 초기화 0 필수
	int frequency = 0; // 배열에서 같은 숫자가 등장한 횟수

	void random() { // 총 6자리 수의 정수 랜덤 생성하고 오름차순으로 정렬하는 메서드
		// System.out.println("여기는 random 시작");

		for (int index = 0; index < 6; index++) {
			input[index] = (int) Math.floor((Math.random() * 9) + 1);
		}

		Arrays.sort(input); // input 배열을 오름차순으로 정렬

		for (int s : input) {
			System.out.print(s);
		}

		System.out.println();

	}

	void result(int[] input) { // baby-gin 판별하는 메서드
		// System.out.println("여기서 계산합니다.");
		int[] input1 = Arrays.copyOfRange(input, 0, 3); // 배열 [0]~[2]까지 분리해서 input1 배열로 복제
		int[] input2 = Arrays.copyOfRange(input, 3, 6); // 배열 [3]~[5]까지 분리해서 input2 배열로 복제

		int p = 0; // baby-gin 임을 확인하기 위한 임시 카운터

		if ((input[0] + input[2]) / 2 == input[1]) { // 연속하는 숫자의 특징으로 체크
			p++;
		} else if (input[0] + input[2] == 0) { // 0이면 나눗셈 안되기 때문에 별도 조건문으로 체크
			p++;
		} 
		
		if (frequency >= 3) { // 같은 숫자 나올 경우 체크
			p++;
		}

		if (p == 2) {
			System.out.println("Baby-gin!!");
		} else {
			System.out.println("Lose...");
		}

	}

	void freq() { // input 배열 안에 중복된 요소 수 확인하는 메서드
		int[] cnt = new int[10]; // 비어있는 길이 10의 cnt 배열 생성 (why? input의 요소는 0~9까지 나올 수 있기 때문
		for (int c : input) {
			cnt[c]++; // input 배열의 요소를 cnt배열의 인덱스 값으로 넣어서 몇 번 카운트 되는지
		}
		for (int i = 0; i < cnt.length; i++) {
			// System.out.println(i+"는"+cnt[i]+"번 존재합니다");
			if (cnt[i] >= 3) {
				frequency = cnt[i];
			}
		}

	}

	public static void main(String[] args) {
		Babygin bg = new Babygin();

		bg.random();
		bg.freq();
		bg.result(bg.input);

	}

}
