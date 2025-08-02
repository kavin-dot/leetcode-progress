class MyLinkedList {
    class Node{
        int val;
        Node next;
        public Node(int data){
            this.val=data;
            next=null;
        }
    }
    static Node head=null;
    public MyLinkedList() {
        head=null;
    }
    
    public int get(int index) {
        Node temp= head;
        if(index<0) return -1;
		int i=0;
		while(temp!=null && i<index) {
			temp=temp.next;
			i++;
		}
        return (temp != null) ? temp.val : -1;
    }
    
    public void addAtHead(int val) {
        Node newNode=new Node(val);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    
    public void addAtTail(int val) {
        Node newNode=new Node(val);
        if(head==null){
            head=newNode;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }
    
    public void addAtIndex(int index, int val) {
        if(index<0) return;
        if(index==0) {
			addAtHead(val);
			return;
		}
        Node newNode=new Node(val);
        Node temp= head;
		int i=0;
		while(temp!=null && i<index-1) {
			temp=temp.next;
			i++;
		}
        if(temp==null) return;
		newNode.next=temp.next;
		temp.next=newNode;
    }
    
    public void deleteAtIndex(int index) {
        
        if(head==null){
            return;
        }
        if(index==0 ){
            head=head.next;
            return;
        }
        Node temp= head;
		int i=0;
		while(i<index-1 && temp.next!=null) {
			temp=temp.next;
			i++;
		}

        if (temp.next == null) return;

        temp.next=temp.next.next;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
