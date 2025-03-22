#Stack

package link;
import java.util.*;

class Node{
	int data;
	Node next;
	
}
public class stack {
	
	public static void push(Node head)
	{
		Node ob=new Node();
		Scanner sc =new Scanner(System.in);
		ob.data=sc.nextInt();
		ob.next=head.next;
		head.next=ob;		
	}
	public static void pop(Node head)
	{
		if(head.next!=null) {
			head.next=head.next.next;
			
		}		
	}
	public static void dsiplay(Node head) {
		Node t=new Node();
		t=head.next;
		while(t.next!=null) {
			System.out.println(t.data);
			
			
		}
		
	}
	public static void peek(Node head) {
		if(head.next!=null) {
			System.out.println(head.next.data);
			
		}
	}
	public static void isEmpty (Node head) {
		if(head.next==null) {
			System.out.println("the stack is empty");
			
		}
		
	}
	public static void size(Node head) {
		int c=0;
		Node t=head.next;
		while(t!=null) {
			c++;
			t=t.next;
		}
		System.out.println("the size of the stack is"+c);
		
	}
	public static void isfull(Node head) {
		Scanner sc = new Scanner(System.in);
		int size= sc.nextInt();
		
	}
	
	
	
	
	
	
	public static void main(String[]args) {
		Node head=new Node();
        head.next=null;
        Scanner sc=new  Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++) {
        	push(head);
        }
        pop(head);
        
		
	}


}
