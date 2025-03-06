public class QueueList
{
    private Node head; //Front of Line.
    private Node tail; //Back of Line.

    public QueueList ()
    {
        //When creating QueueList, nothing is there.
        //So there's no head or tail.
        head = null;
        tail = null;
    }

    public void addNode(int addData)
    {
        //Populating the list.
        Node temp = new Node(addData, tail);

        if (head == null) {
            head = temp;
        }
        else {
            Node current = head;

            while (current.linkNext != null)
            {
                current = current.getNextLink();
            }

            current.linkNext = temp;
            temp.linkPrevious = current;
        }
    }

    public void deleteNode()
    {
        if (head == null)
        {
            System.out.println(" ");
        }
        else
        {
            head = head.getNextLink();
        }
    }

    public int amountOfNodes()
    {
        int count = 0;
        Node position = head;
        while (position != null)
        {
            count++;
            position = position.getNextLink();
        }
        return count;
    }

    public void printList()
    {
        Node current = head;

        while (current != null)
        {
            System.out.println(current.getData());
            current = current.getNextLink();
        }
    }

    //NODE CLASS//
    private class Node
    {
        //Instance Variables
        private int data; //What is Stored.
        private Node linkPrevious;
        private Node linkNext; //Instance of Self-Referencing Class.

        //Constructors
        public Node (int data, Node linkNext)
        {
            this.data = data;
            this.linkPrevious = null;
            this.linkNext = null;
        }

        //Getters and Setters
        public int getData() {
            return data;
        }

        public Node getPreviousLink() {
            return linkPrevious;
        }

        public Node getNextLink() {
            return linkNext;
        }

        //toString
        @Override
        public String toString() {
            return "Node {" +
                    "Data = " + data +
                    ", Previous Link = " + linkPrevious +
                    ", Next Link = " + linkNext;
        }
    }//End Node Class.
}//End QueueList Class.