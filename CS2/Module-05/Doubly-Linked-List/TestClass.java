public class TestClass
{
    public static void main(String[] args)
    {
        // Here are some objects we can store in our lists...
        
        // ReadThis r1 = new ReadThis("http://www.bustle.com/articles/" +
        //                            "63466-im-brianna-wu-and-im-risking-" +
        //                            "my-life-standing-up-to-gamergate");
        
        // ReadThis r2 = new ReadThis("http://i.imgur.com/4NjBQzn.jpg");
        
        // ReadThis r3 = new ReadThis("http://imgur.com/zhppgSx");
        
        // ReadThis r4 = new ReadThis("http://gnuu.org/2009/09/18/writing-" +
        //                            "your-own-toy-compiler/alinkedList/1/");
        
        // ReadThis r5 = new ReadThis("https://gigaom.com/2015/02/10/samsung-" +
        //                            "tvs-start-inserting-ads-into-your-movies/");

        // Samples using more visual data. Easier to track the nodes
        ReadThis r1 = new ReadThis("one");

        ReadThis r2 = new ReadThis("two");
        
        ReadThis r3 = new ReadThis("three");

        ReadThis r4 = new ReadThis("four");

        ReadThis r5 = new ReadThis("five");

        ReadThis r10 = new ReadThis("ten");

        // Create the new linked list
        LinkedList linkedList = new LinkedList();

        // Add nodes to beginning and end
        linkedList.addNodeToBeginning(r3);
        linkedList.addNodeToBeginning(r2);
        linkedList.addNodeToBeginning(r1);
        linkedList.addNodeToEnd(r4);
        linkedList.addNodeToEnd(r5);

        linkedList.printListFromHere();

        // Remove nodes from beginning and end
        linkedList.removeFirstNode();
        linkedList.removeLastNode();

        linkedList.printListFromHere();


        // Repopuplate for further examples
        linkedList.addNodeToBeginning(r1);
        linkedList.addNodeToEnd(r5);


        // Add node in middle of linked list
        linkedList.addNodeAfterNode(r10, r2);

        linkedList.printListFromHere();

        // Remove node from middle of linked list
        linkedList.removeNode(r10);

        linkedList.printListFromHere();


        // Print the number of nodes
        linkedList.printNumNodes();

        // Print the linked list length
        linkedList.getLength();
    }   
}