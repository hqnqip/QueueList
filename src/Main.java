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

        a.deleteNode();
        a.deleteNode();

        System.out.println("There are " + a.amountOfNodes() + " Nodes in the QueueList.");

        a.printList();
    }
}