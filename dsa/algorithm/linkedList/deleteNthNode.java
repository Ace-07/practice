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

    //reverse
//    public void reverse(){
//        if (head == null){
//            System.out.println("Nothing inside");
//            return;
//        }
//        Node check = head;
//
//        int count = 0;
//        while(check.next != null){
//            check = check.next;
//            count++;
//        }
//
//        Node first = head;
//        Node store =head;
//        Node currNode = head;
//        for (int i = 0; i <  2; i++) {
//            currNode = currNode.next;
//
//        }
//        head = currNode;
//    }
    //delete nth node
    public void delete (int n){

        if (head == null){
            System.out.println("Its completely empty");
            return;
        }
        Node check = head;

        int count = 0;
        while(check.next != null){
            check = check.next;
            count++;
        }

        if(n==1){
            head = head.next;
        }

        else if(n>count+1||n<=0){
            System.out.println("out of bound");
            return;
        }

        else {
            Node currNode = head;
            Node remaining = head.next;

            for (int i = 0; i < n - 2; i++) {
                currNode = currNode.next;
                remaining = remaining.next;
            }

            currNode.next = null;
            currNode.next = remaining.next;
        }
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

    //Delete Last
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
        list.insert("1",1);
        list.insert("2",2);
        list.insert("3",3);
        list.insert("4",4);
        list.insert("5",5);
        list.insert("6",6);
        list.printList();
        list.delete(0);
        list.printList();
        System.out.println(list.listSize());
    }
}
/*
1 -> 2 -> 3 -> 4 -> 5 -> 6 -> NULL
1 -> 2 -> 4 -> 5 -> 6 -> NULL
6
*/
