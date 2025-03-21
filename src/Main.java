public class Main
{
    public static void main(String[] args)
    {
        QueueList a = new QueueList();

        //Testing addNode().
        a.addNode(1);
        a.addNode(2);
        a.addNode(3);
        a.addNode(4);

        a.printList();

        //Testing the queue functionality. FIFO.
        a.deleteNode(); //Deletes 1.
        a.deleteNode(); //Deletes 2.

        System.out.println("There are " + a.amountOfNodes() + " Nodes in the QueueList.");

        a.printList();

        //a.addNode("a"); //Does not take characters.

        a.addNode(1);
        a.addNode(2);

        System.out.println("There are " + a.amountOfNodes() + " Nodes in the QueueList.");

        a.printList();

        //Testing the queue functionality. FIFO.
        a.deleteNode();
        a.addNode(5);
        a.deleteNode();

        System.out.println("There are " + a.amountOfNodes() + " Nodes in the QueueList.");

        a.printList();

        //a.addNode(1.0); //Does not take decimals.

        //Testing deleteNode() on an empty list.
        a.deleteNode();
        a.deleteNode();
        a.deleteNode();
        a.deleteNode();
        a.deleteNode();

        a.printList();
        //System.out.println(a.getHead()); //Does not work, because there are no Nodes existing.

        a.addNode(100);
        System.out.println(a.getHead());
        System.out.println(a.getHeadData());

        System.out.println("There are " + a.amountOfNodes() + " Nodes in the QueueList.");

    }
}