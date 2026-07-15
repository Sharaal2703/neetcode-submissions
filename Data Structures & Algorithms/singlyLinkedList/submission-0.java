class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
        next=null;
    }
}
class LinkedList {
    Node head;

    public LinkedList() {
        head=null;   
    }

    public int get(int index) {
        Node temp=head;
        for(int i=0;i<index;i++)
        {
            if(temp==null)
            {
                return -1;
            }
            temp=temp.next;
        }
        if(temp==null)
        {
            return -1;
        }
        return temp.data;
    }

    public void insertHead(int val) {
        
        Node temp=new Node(val);
        temp.next=head;
        head=temp;
        
    }

    public void insertTail(int val) {
        Node newNode = new Node(val);
        if(head==null)
        {
            head=newNode;
            return;
        }
        Node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=newNode;
        
    }

    public boolean remove(int index) {
        if(head==null)
        {
            return false;
        }
        if(index==0)
        {
            head=head.next;
            return true;
        }
        Node temp=head;
        for(int i=0;i<index-1;i++)
        {
            if(temp==null)
            {
                return false;
            }
            temp=temp.next;
        }
        if(temp==null || temp.next==null)
        {
            return false;
        }
        temp.next=temp.next.next;
        return true;
        
    }

    public ArrayList<Integer> getValues() {
        Node temp=head;
        
        ArrayList<Integer> li=new ArrayList<>();
        if(temp==null)
        {
            return li;
        }
        while(temp!=null)
        {
            li.add(temp.data);
            temp=temp.next;
        }
        return li;

    }
}
