package link;
import java.util.*;
class Node1{
	int data;
	Node1 next;
}

public class sumOfElements {

public static void sum(Node1 head) {
	  Node1 ob=new Node1();
	  Scanner sc=new Scanner(System.in);
		ob.data=sc.nextInt();
		ob.next=head.next;
		head.next=ob;

}



public static void display(Node1 head) {
	Node1 t=head.next;
	int s=0;
	System.out.println("The Elements in the Node1 are..");
	while(t!=null) {
		System.out.print(t.data+" ");
		s=s+t.data;
		t=t.next;
	}
	System.out.println();
	
	System.out.println("The Sum of the Elements is " + s);
}
	
	
	
	
	
	public static void main(String[] args) {
          Node1 head=new Node1();
          head.next=null;
          Scanner sc=new Scanner(System.in);
          int n=sc.nextInt();
          for (int i=0;i<n;i++) {
        	sum(head);
        	  
          }
          display(head);
          
        
          
	}

}
public class sumofElements {

}
