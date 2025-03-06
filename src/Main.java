public class Main
{
    public static void main(String[] args)
    {
        QueueList a = new QueueList();

        a.addNode(1);
        a.addNode(2);
        a.addNode(4);

        a.printList();

        a.deleteNode();

        System.out.println(a.amountOfNodes());

        a.printList();
    }
}