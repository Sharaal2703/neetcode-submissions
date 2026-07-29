class LRUCache {
    class Node
    {
        Node prev;
        int key;
        int value;
        Node next;
        Node(int key,int value)
        {
            this.key=key;
            this.value=value;
        }
    }
    HashMap<Integer,Node> map=new HashMap<>();
    int cap=0;
    Node head=new Node(-1,-1);
    Node tail=new Node(-1,-1);

    public LRUCache(int capacity) {
        cap=capacity;
        head.next=tail;
        tail.prev=head;
        
    }
    public void addNode(Node nd)
    {
        Node temp=head.next;
        head.next=nd;
        nd.prev=head;
        nd.next=temp;
        temp.prev=nd;
        return;
    }
    public void delNode(Node nd)
    {
        Node p=nd.prev;
        Node n=nd.next;
        p.next=n;
        n.prev=p;
    }
    public int get(int key) {
        if(map.containsKey(key))
        {
            Node nd=map.get(key);
            int ans=nd.value;
            map.remove(key);
            delNode(nd);
            addNode(nd);
            map.put(key,nd);
            return ans;
        }
        return -1;
        
        
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key))
        {
            Node n=map.get(key);
            map.remove(key);
            delNode(n);
        }
        if(cap==map.size())
        {
            Node n=tail.prev;
            delNode(n);
            map.remove(n.key);

        }
        Node nd=new Node(key,value);
        addNode(nd);
        map.put(key,nd);
        
    }
}
