import java.lang.*;
import java.util.*;
class Node
{
    int data;
    Node next;
    Node(int d)
    {
        data=d;
        next=null;
    }
}

public class LinkedList{
    Node head;
     public void insert(int item)
     {
        Node nd=new Node(item);
        Node temp=head;
        if(head==null)
        {
            head=nd;
        }
        else{
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=nd;
        }
        
     }
     public void display()
     {
         Node temp=head;
         while(temp!=null)
         {
             System.out.print(temp.data+" ");
             temp=temp.next;
         }
         System.out.println();
     }
    
    public void add2Num(Node head1, Node head2)
    {
        Node temp1=head1;
        Node temp2=head2;
        int sum,c=0;
        LinkedList res=new LinkedList();
        while(temp1!=null || temp2!=null)
        {
            sum=c+(temp1==null?0:temp1.data)+(temp2==null?0:temp2.data);
            c=sum/10;
            res.insert(sum%10);
            sum=0;
            if(temp1!=null)
            
            {temp1=temp1.next;
            }
            if(temp2!=null)
            {
            temp2=temp2.next;
            }
            
        }
        if(c!=0)
        {
            res.insert(c);
        }
        res.display();
        
    }

     public static void main(String []args){
        
        Scanner s=new Scanner(System.in);
        int n1=s.nextInt();
        int n2=s.nextInt();
        LinkedList ll=new LinkedList();
        LinkedList ll2=new LinkedList();
        LinkedList mn=new LinkedList();
        
        while(n1!=0)
        {
            int dig=n1%10;
            ll.insert(dig);
            n1=n1/10;
        }
        ll.display();
        while(n2!=0)
        {
            int dig=n2%10;
            ll2.insert(dig);
            n2=n2/10;
        }
        ll2.display();
        mn.add2Num(ll.head,ll2.head);
        
     }
}