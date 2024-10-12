package LinkedList;

import java.util.Stack;

public  class newList {

   static class LinkedList {
        // Node class represents each element in the LinkedList
        class Node {
            int data;
            Node next;
    
            Node(int data) {
                this.data = data;
                this.next = null;
            }
        }
    
        private Node head;
    
        public LinkedList() {
            this.head = null;
        }
    
        public void insert(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
            } else {
                Node current = head;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = newNode;
            }
            System.out.println(data + " inserted.");
        }

        public void insertAtpos(int pos , int data){
            Node newNode = new Node(data);
            if(head == null){
                System.out.println("Underflow Condition !");
            }
            else{
                Node temp = head;
                int i = 0;
                while(  i < pos){
                    temp = temp.next;
                    ++i;
                }

                newNode.next = temp.next;
                temp.next = newNode;
                System.out.println("ELement inserted at given position successfully.");

            }
        }
    
        public void delete(int data) {
            if (head == null) {
                System.out.println("List is empty.");
                return;
            }
    
            if (head.data == data) {
                head = head.next;
                System.out.println(data + " deleted.");
                return;
            }
    
            Node current = head;
            while (current.next != null && current.next.data != data) {
                current = current.next;
            }
    
            if (current.next == null) {
                System.out.println(data + " not found.");
            } else {
                current.next = current.next.next;
                System.out.println(data + " deleted.");
            }
        }
    
       
        public boolean search(int data) {
            Node current = head;
            while (current != null) {
                if (current.data == data) {
                    return true;
                }
                current = current.next;
            }
            return false;
        }

        public void removeDuplicates(){
            Node  current = head;
            while(current!=null)
            {
                Node runner = current;
                while(runner.next!=null){
                    if(runner.next.data == current.data){
                        runner.next = runner.next.next;
                    }
                    else{
                        runner = runner.next;
                    }
                }

                current = current.next;
            }

            System.out.println("Removed the duplicates succesfully from the linkedlist.");
        }

        public boolean palindromeCheck()
        {
            if(head == null || head.next == null){
                return true;
            }

            Node slow = head , fast = head;
            while(fast != null && fast.next!=null){
                slow = slow.next;
                fast = fast.next.next;

            }

            Node secondhalf = reverse(slow);
            Node firsthalf = head;
            Node temp = secondhalf;
            boolean palindromeCheck = true;
            while(secondhalf!= null)
{
    if (firsthalf.data != secondhalf.data) {
        palindromeCheck = false;
        break;
}  

    firsthalf = firsthalf.next;
    secondhalf = secondhalf.next;

}
        reverse(temp);
        return palindromeCheck;




        }

        private Node reverse(Node head){
            Node prev = null;
            while(head!=null){
                Node next = head.next;
                head.next = prev;
                prev = head;
                head = next;
            }

            return prev;
        }
    
       
        public void display() {
            if (head == null) {
                System.out.println("List is empty.");
                return;
            }
    
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " -> ");
                current = current.next;
            }
            System.out.println("null");
        }
    public static void main(String[] args) {
        
        LinkedList list = new LinkedList();
       list.insert(75);
        list.insert(19);
        list.insert(75);
        list.insert(19);
        list.insert(7);
        list.insert(8);
        list.insert(8);
        list.insert(1);
        list.insertAtpos(3, 101);

        list.display();
        System.out.println("Applying the dupliacte removal method.");
        list.removeDuplicates();
        list.display();
      

        list.palindromeCheck();

    }
}
}

