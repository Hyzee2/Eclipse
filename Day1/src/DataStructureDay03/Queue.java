package DataStructureDay03;

public class Queue { // FIFO
	int[] queue = new int[5];
	int front = 0; // 첫번째 위치 인덱스
	int rear = 0; // 마지막 위치 인덱스
	int index = 0;

	int[] enqueue(int num) {
		//System.out.println("현재 index값은 " + index);
		queue[index] = num;
		rear = index + 1;
		index++;
		//System.out.println("변경된 index 값은 " + index);

		for (int n : queue) {
			System.out.print(n + "\t");
		}

		System.out.println();
		System.out.println("현재 front의 위치는: " + front);
		System.out.println("현재 rear의 위치는: " + rear);

		return queue;

	}

	int dequeue() {
		queue[front] = 0;
		front++;

		System.out.println("디큐하고 변경된 front의 위치는 " + front);
		for (int n : queue) {
			System.out.print(n + "\t");
		}
		System.out.println();

		return front;
	}

	void shift() {

		if (front != 0 && rear == 5) {

			// front값만큼 이동
			while (rear > 3) {

				for (int i = front; i < 5; i++) { // i는 front부터 시작해서 인덱스 4까지
					queue[i - front] = queue[i];
					queue[i] = 0;
					System.out.println("지금 queue[" + i + "]값이 이동했습니다. ");
				}
				break;

			}
		}

		for (int n : queue) {
			System.out.print(n + "\t");
		}

	}

	public static void main(String[] args) {
		Queue que = new Queue();
		que.enqueue(10);
		que.enqueue(20);
		que.enqueue(30);
		que.enqueue(40);
		que.enqueue(50);
		que.dequeue();
		que.dequeue();
		que.shift();
	}

}
