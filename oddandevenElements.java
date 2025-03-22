package link;

import java.util.*;

class Node{
	int data;
	Node next;
}

public class OddandEvenelements {

	public static void insert(Node head) {
		Node ob=new Node();
		Scanner sc=new Scanner(System.in);
		ob.data=sc.nextInt();
		ob.next=head.next;
		head.next=ob;
	}
	
	public static void sumEven(Node head) {
		Node t=head.next;
		int s1=0;
		while(t!=null) {
			if(t.data%2==0) {
				s1=s1+t.data;
			}
			t=t.next;
		}
		System.out.println("The Sum of the Even Elements is "+s1);
	}
	
	public static void sumOdd(Node head) {
		Node t=head.next;
		System.out.println("The Elements in the Node are...");
		int s2=0;
		while(t!=null) {
			System.out.println(t.data);
			if(t.data%2!=0) {
				s2=s2+t.data;
			}
			t=t.next;
		}
		System.out.println("The Sum of the Odd Elements is "+s2);
	}
	
	
	
	
	
	public static void main(String[] args) {
        Node head=new Node();
        head.next=null;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++) {
        	insert(head);
        }
        sumOdd(head);
        sumEven(head);
	}

}
public class OddandEvenelements {

}
