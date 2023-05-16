
class  linkedlist
{
Node head;
class Node
{
int data;
Node prev;
Node next;
Node (int v)
{
data=v;
prev=null;
next=null;
}
}
void push(int v )
{
    Node n=new Node(v);
    if(head==null)
    head=n;
    else
    {
        n.next=head;
        head.prev=n;
        head=n;
    }
}
void append(int v)
{
if(head==null)
{
push(v);
return;
}
Node s=head;
while(s.next!=null)
s=s.next;
Node n=new Node(v);
s.next=n;
n.prev=s;
}
void print()
{
Node s=head;
System.out.println("Forwards-->");
while(s.next!=null)
{
System.out.println(s.data+" ");
s=s.next;
}
System.out.println(s.data);
System.out.println("backwards<--");
while(s!=null)
{
System.out.println(s.data+" ");
s=s.prev;
}
}
}

public class linkedlistmain{
public static void main(String [] args)
{
linkedlist o=new linkedlist();
o.push(3);
o.push(2);
o.push(1);
o.append(4);
o.append(5);
o.print();
}
}


