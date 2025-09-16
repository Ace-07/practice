

class LL {
    Node head;
    private int size;
    LL(){
        this.size = 0;
    }

    //Create Node
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data = data;
            this.next = null;
            size++;
        }
    }

    //Add first
    public void addFirst(String data){
        Node newNode = new Node (data);
        if (head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;

    }

    //Add in last
    public void addLast(String data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    //Insert at desired Location
    public void insert(String data, int n){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            return;
        }
        Node check = head;
        int count = 0;
        while(check.next != null){
            check = check.next;
            count++;
        }
        if(n==0 || n== 1){
            newNode.next = head;
            head = newNode;

        }
        else if (n-2>count){
            System.out.println(data+" cant be inserted at "+n+" place");
            return;

        }
        else{


            Node currNode = head;
            Node remaining = head.next;
            for (int i = 0; i < n - 2; i++) {
                currNode = currNode.next;
                remaining = remaining.next;
            }
            currNode.next = newNode;
            newNode.next = remaining;
        }

    }

    //Print
    public void printList(){
        if (head == null){
            System.out.println("This LL is empty ");
            return;
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data +" -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    //Delete First
    public void deleteFirst(){
        if (head == null){
            System.out.print("This is empty");
            return;
        }
        head = head.next;
    }

    //Delete second
    public void deleteLast(){
        if (head == null){
            System.out.print("This is empty");
            return;
        }

        if(head.next == null){
            head = null;
            size--;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;
        while(lastNode.next != null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
        size--;
    }

    //size
    public int listSize(){
        return size;
    }

    public static void main(String[] args){
        LL list = new LL();
        list.addFirst("a");
        list.addFirst("is");
        list.addFirst("this");
        list.addLast("list");
        list.insert("Hi google",6);



        list.printList();
        System.out.println(list.listSize());
    }
}
/*
this -> is -> a -> list -> Hi google -> NULL
5
*/
