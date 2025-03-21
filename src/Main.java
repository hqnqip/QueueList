public class Main
{
    public static void main(String[] args)
    {
        QueueList a = new QueueList();

        a.addNode(1);
        a.addNode(2);
        a.addNode(3);
        a.addNode(4);

        a.printList();

        a.deleteNode(); //Deletes 1.
        a.deleteNode(); //Deletes 2.

        System.out.println("There are " + a.amountOfNodes() + " Nodes in the QueueList.");

        a.printList();

        //a.addNode("a"); //Results in an error.

        a.addNode(1);
        a.addNode(2);

        System.out.println("There are " + a.amountOfNodes() + " Nodes in the QueueList.");

        a.printList();

        a.deleteNode();
        a.addNode(5);
        a.deleteNode();

        System.out.println("There are " + a.amountOfNodes() + " Nodes in the QueueList.");

        a.printList();

        //a.addNode(1.0); //Does not take decimals.

        a.deleteNode();
        a.deleteNode();
        a.deleteNode();
        a.deleteNode();

    }
}