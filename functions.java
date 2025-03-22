package link;
import java.util.*;
class Node{
    int data;
    Node next;
}
class ds{
    public static void insert(Node head){
        Scanner sc=new Scanner(System.in);
        int c=0;
        Node p=head;
        int pos=sc.nextInt();
        while(c<pos-1 && p.next!=null){
            c++;
            p=p.next;
        }
        if(c==pos-1){
            Node ob=new Node();
            ob.data=sc.nextInt();
            ob.next=p.next;
            p.next=ob;
        }
        else{
            System.out.println("Position exceeds Length");
        }
        
    }
    
    public static void display(Node head){
        Node t=head.next;
        while(t!=null){
            System.out.println(t.data+" ");
            t=t.next;
        }
    }
    
    public static void delete(Node head){
        int c=0;
        Scanner sc=new Scanner(System.in);
        int pos=sc.nextInt();
        Node p=head;
        while(c<pos-1 && p!=null){
            c++;
            p=p.next;
        }
        if(c==pos-1){
            p.next=p.next.next;
        }
    }
    
    
    
    public static void main(String[] args){
        Node head=new Node();
        head.next=null;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            insert(head);
        }
        display(head);
        delete(head);
        display(head);
    }
}

