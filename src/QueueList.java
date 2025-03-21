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
        //This is the new Node.
        Node temp = new Node(addData, tail);

        //If a "Head" did not exist– because there was no Node–
        //then the new Node becomes the Head.
        if (head == null)
        {
            head = temp;
        }
        else
        {
            //Creates an index.
            Node current = head;

            //Runs through the list until the tail.
            while (current.linkNext != null)
            {
                current = current.getNextLink();
            }

            //Once reaching the tail, it is linked next to the new Node.
            current.linkNext = temp;
            //The new Node is linked previously to the tail.
            temp.linkPrevious = current;
        }
    }

    public void deleteNode()
    {
        //If there is no Head, there is nothing to be deleted.
        if (head == null) {
            System.out.println("Whoops! You already deleted them all!");
        } else {
            System.out.println("A Node is deleted.");
            //The next Node in line becomes the new Head.
            //The first Node in line is deleted.
            head = head.getNextLink();
        }
    }

    public int amountOfNodes()
    {
        //Traverses through the list, starting with the Head.
        int count = 0;
        Node position = head;
        while (position != null)
        {
            count++;
            position = position.getNextLink();
        }
        return count;
    }

    public Node getHead()
    {
        return head;
    }

    public int getHeadData()
    {
        return head.data;
    }

    public void printList()
    {
        //Traverses the list, printing out the data.
        System.out.println("Printing current list...");
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
        private Node linkPrevious; //To figure out what the Head is, there needs to be two links.
        private Node linkNext; //Instance of Self-Referencing Class.

        //Constructors
        public Node (int data, Node linkNext)
        {
            this.data = data;
            this.linkPrevious = null;
            this.linkNext = null;
        }

        //Getters and Setters
        public int getData()
        {
            return data;
        }

        public Node getPreviousLink()
        {
            return linkPrevious;
        }

        public Node getNextLink()
        {
            return linkNext;
        }

        //toString
        @Override
        public String toString()
        {
            return "Node {" +
                    "Data = " + data +
                    ", Previous Link = " + linkPrevious +
                    ", Next Link = " + linkNext;
        }
    }//End Node Class.
}//End QueueList Class.