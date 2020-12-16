/*
class Node {
    Node next;
    int val;

    Node(int val) {
        this.val = val;
        next = null;
    }
}
*/

public static Node deleteMiddleElement(Node head) {
		// return the head of the modified Linked List
        
        Node p = head;
        Node q = head.next;
        int size = getSize(head);
        if(size%2 == 0)
        {
                int pos = size/2;
               for(int i = 0;i < pos-1;i++){

                    p = q;

                    q = q.next;

                    }

        

                    p.next = q.next;

                    return head;
        }
        else {
            int pos = (size)/2;
             
               if(size == 1){

                head.val = -1;

                return head;

            }else{

                    for(int i = 0;i < pos-1;i++){

                    p = q;

                    q = q.next;

                    }

        

                    p.next = q.next;

                    return head;

            }
        }

    
    }

    static int getSize(Node head)
    {
        if(head == null){
            return 0;
        }

        int count = 0;
        Node currNode = head;
        while(currNode != null){
            count++;
            currNode = currNode.next;
        }

        return count;
    }