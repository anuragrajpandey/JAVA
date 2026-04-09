import java.util.Scanner;
class CircularQueue
{
	int rear,front;
	final int MAXSIZE=3;
	int Q[] = new int[MAXSIZE];
	CircularQueue()
	{
		front=-1;
		rear=-1;
	}


	void CQ_Enque()
	{
// insert in queue
		System.out.print("\n Enqueu operation called");
		if(front == (rear+1)%MAXSIZE)
		{
			System.out.print("\n Queue Overflow : Can not insert");
			return;
		}
		else if (front ==-1)
		{
			front++;
			rear++;
		}
		else
		{
			rear = (rear+1)%MAXSIZE;
		}
		Scanner sc = new Scanner(System.in);
		int item;
		System.out.print("\n Enter item : ");
		item=sc.nextInt();
		Q[rear] = item;
		System.out.print("\n Item Enque successfully  " + item);


	}
	void CQ_Deque()
	{
		int item;
// Deque
		System.out.print("\n Deque operation is called");
		if(front == -1 && rear==-1)
		{
			System.out.print("\n Underflow : Queue is Empty, Can not delete");
			return;
		}
		else if(front==rear)
		{
// Is it the only element in queue
			item=Q[front];
			Q[front]=0;
			front=-1;
			rear=-1;
		}
		else
		{
			item=Q[front];
			Q[front]=0;
			front = (front+1)%MAXSIZE;
		}
		System.out.print("\n Item Deque successfully " + item);
	}
	void CQ_Display()
	{
		System.out.print("\n **** Circular Queue *****");
		System.out.print("\n Circular Queue is : ");
		if(front==-1)
		{
			System.out.print("Empty");
		}
		else
		{
			for(int i=0; i<MAXSIZE; i++)
			{
				System.out.print("\n Q[" + i + "]=" + Q[i]);
			}


		}
		System.out.print("\n\n Front = " + front);
		System.out.print("\n Rear = " + rear);
		System.out.print("\n *************************");
	}
	void display_menu()
	{
		int choice=-1;
		while(choice !=0)
		{
			System.out.print("\n ******* Circular Queue *******");
			System.out.print("\n 0. Exit");
			System.out.print("\n 1. Enque Circular Queue");
			System.out.print("\n 2. Deque Circular Queue");
			System.out.print("\n 3. Display Circular Queue");
			System.out.print("\n ******************************");
			Scanner sc = new Scanner(System.in);
			System.out.print("\n Enter your choice :");
			choice=sc.nextInt();
			System.out.print("\n ******************************");
			switch(choice)
			{

			case 0:
				System.out.print("\n Exit Called");
				System.out.print("\n Good Bye");
				break;
			case 1:
				this.CQ_Enque();
				break;
			case 2:
				this.CQ_Deque();
				break;
			case 3:
				this.CQ_Display();
				break;
			}
			System.out.print("\n\n\n\n");
			System.out.print("\n Press 1 to continue.....");
			int item = sc.nextInt();
		}
	}


}

public class CircularQueueDemo {

	public static void main(String[] args) {


		CircularQueue cirque = new CircularQueue();
		cirque.display_menu();
	}
}
