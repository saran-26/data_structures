package link;
import java.util.*;
class Node{
  int data;
  Node next;
}
class length
{
    public static void insert(Node head)
    {
        Scanner sc=new Scanner(System.in);
        int pos=sc.nextInt();
        int c=0;
        Node p=head;
        while(c<(pos-1) && p.next!=null)
        {
            p=p.next;
            c++;
        }
        if(c==(pos-1))
        {
            Node ob=new Node();
            ob.data=sc.nextInt();
            ob.next=p.next;
            p.next=ob;
        }
        else{
            System.out.println("Pos excxeeds length");
        }
    }
    public static void display(Node head)
    {
        Node t=head.next;
        while(t!=null)
        {
            System.out.print(t.data+" ");
            t=t.next;
        }
    }
    public static void delete(Node head)
    {
        Scanner sc=new Scanner(System.in);
        int e=sc.nextInt();
        Node p=head;
        while(p.next!=null && p.next.data!=e)
        {
            p=p.next;
        }
        if(p.next==null)
        {
            System.out.println("Element not found");
        }
        else
        {
            p.next=p.next.next;
        }
    }
   public static void length(Node head)
{
Node t=head.next;
int c=0;
while(t!=null)
{
c++;
t=t.next;
}
System.out.println("length="+c);
}
   public static void search(Node head){
	   Node t=head.next;
	   int e;
	   Scanner sc =new Scanner(System.in);
	   e=sc.nextInt();
	   int c=0;
	   while(t!=null&&t.data!=e) {
		   c++;
		   t=t.next;
		   
	   }
	   if(t==null) {
		   System.out.println("not found");
	   }
	   else if(t.data==e) {
		   System.out.println("element found at the position"+(c+1));
		   
		   
	   }
	   
   }
    public static void main (String[] args) 
    {
        Node head=new Node();
        head.next=null;
        Scanner sc=new  Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            insert(head);
        }
        display(head);
        System.out.println();
        delete(head);
        length(head);
        display(head);
        search(head);
    }
}



