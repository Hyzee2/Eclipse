package DataStructureDay04;

import java.util.Scanner;

public class LinkedExam {

	static LinkNode head; // static을 쓴 이유는 딱 1개만 존재해야 되기 때문에
	static LinkNode cur; // 검색은 맨 처음부터 해야 되므로 head에 cur을 준다.
	static LinkNode newNode;
	static LinkNode del;

	public static void main(String[] args) {

		head = cur = newNode = new LinkNode();
		newNode.next = null;

		newNode.setData(1);
		// newNode.next = null;

		// newNode = new LinkNode();
		newNode.next = new LinkNode();
		newNode.next.setData(2);
		newNode.next.next = null;

		newNode.next.next = new LinkNode();
		newNode.next.next.setData(3);
		newNode.next.next.next = null;

		newNode.next.next.next = new LinkNode();
		newNode.next.next.next.setData(4);
		newNode.next.next.next.next = null;

		newNode = new LinkNode();
		newNode.next = head;
		head = newNode;

		newNode.setData(5);

		cur = head;
		// 출력
		while (cur != null) {
			System.out.print(cur.getData() + "\t");
			cur = cur.next;
		}

		Scanner sc = new Scanner(System.in);

		System.out.println();
		System.out.println("몇 번째로 데이터를 추가할까요?");
		int num = sc.nextInt(); // num번째로 데이터 추가

		newNode = new LinkNode(); // 새로운 노드 생성
		newNode.setData(6);

		if (num == 1) {
			newNode.next = head; // cur 가 head에 위치
			head = newNode;

		} else {
			cur = head; // cur은 head로 초기화
			for (int i = 1; i < num - 1; i++) {
				cur = cur.next; // 반복을 수행해야 되는 부분은 커서의 이동 부분
			}
			newNode.next = cur.next;
			cur.next = newNode;
		}

		cur = head;
		while (cur != null) {
			System.out.print(cur.getData() + "\t");
			cur = cur.next;
		}

		///////////////////////////////////////////////////////////////////

		System.out.println();
		System.out.println("몇 번째로 데이터를 삭제할까요?");
		int num2 = sc.nextInt(); // num번째로 데이터 삭제

		del = new LinkNode(); // 삭제할 노드 생성

		cur = head;

		if (num2 == 1) {
			head = cur.next;

		} else {
			cur = head;
			for (int i = 1; i < num2 - 1; i++) {
				cur = cur.next; // 반복을 수행해야 되는 부분은 커서의 이동 부분
			}
			del = cur.next;
			cur.next = del.next;
			del.next = null;
			del = null;

		}

		cur = head;
		while (cur != null) {
			System.out.print(cur.getData() + "\t");
			cur = cur.next;
		}

	}

}
