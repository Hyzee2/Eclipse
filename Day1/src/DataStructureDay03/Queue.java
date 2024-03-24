package DataStructureDay03;

public class Queue { // FIFO
	int[] queue = new int[5];
	int front = 0; // 첫번째 위치 인덱스
	int rear = 0; // 마지막 위치 인덱스
	int index = 0;

	int enqueue(int num) {
		
		queue[index] = num;
		rear = index + 1;
		index++;
	
		for (int n : queue) {
			System.out.print(n + "\t");
		}

//		System.out.println("현재 front의 위치는: " + front);
//		System.out.println("현재 rear의 위치는: " + rear);
		System.out.println();
		System.out.println("enqueue 성공!");
		System.out.println();

		return rear;

	}

	int dequeue() {
		queue[front] = 0;
		front++;

//		System.out.println("디큐하고 변경된 front의 위치는 " + front);
//		System.out.println("디큐하고 변경된 rear의 위치는 " + rear);
		for (int n : queue) {
			System.out.print(n + "\t");
		}
		
		System.out.println();
		System.out.println("dequeue 성공!");
		System.out.println();

		return front;
	}

	int shift(int[] queue) {

		if (front != 0 && rear == queue.length) { // front가 0이 아니고 rear가 배열의 끝까지 차있을 때 
		

			// front값만큼 이동
			while (front != 0) { // front가 0일때 반복문은 종료된다. 
				
				for (int i = front; i < queue.length; i++) { // i는 front부터 시작해서 배열 끝까지  
					queue[i - front] = queue[i]; // front가 벌어져있는 만큼 이동시켜준다. 
					queue[i] = 0; // 바뀐 자리는 0으로 채워준다. 
					//System.out.println("지금 queue[" + i + "]값이 이동했습니다. ");
				}
				break; // 무한루프에 빠지지 않도록 i가 배열끝까지 다 갔을 때는 break 로 반복문을 빠져나온다. 

			}
			
			rear = rear - front; // rear은 front값만큼 앞으로 갔을 것이므로 새로운 rear를 갱신해준다. 
			
		}

		for (int n : queue) {
			System.out.print(n + "\t");
		}
		
		System.out.println("\n현재 rear의 위치는 " + rear);
		System.out.println("shitf 성공!");
		return rear;

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
		que.shift(que.queue);
	}

}
