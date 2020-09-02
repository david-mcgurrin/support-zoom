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
        //                            "your-own-toy-compiler/all/1/");
        
        // ReadThis r5 = new ReadThis("https://gigaom.com/2015/02/10/samsung-" +
        //                            "tvs-start-inserting-ads-into-your-movies/");

        // Samples using more visual data. Easier to track the nodes
        ReadThis r1 = new ReadThis("one");

        ReadThis r2 = new ReadThis("two");
        
        ReadThis r3 = new ReadThis("three");

        ReadThis r4 = new ReadThis("four");

        ReadThis r5 = new ReadThis("five");

        
        
        ////
        // We can manually create a linked list
        // with two nodes like this:

        ListNode listHead = new ListNode(r3, new ListNode(r4));
        
        ListNode.printNumNodes(); // <- best way to call a static method
        listHead.printNumNodes(); // <- prints the same thing, but should avoid
        listHead.next.printNumNodes(); // <- prints the same thing, but should avoid
        
        listHead.printListFromHere();
        
        
        ////
        // Now we can add nodes to the beginning, end, and middle:
        
        listHead = listHead.addNodeToBeginning(new ListNode(r1));
        listHead.printListFromHere();
        
        listHead.addNodeToEnd(new ListNode(r5));
        listHead.printListFromHere();
        
        listHead.addNodeAfterNode(new ListNode(r2), listHead.next);
        listHead.printListFromHere();
        
        ListNode.printNumNodes();
        
        
        ////
        // Let's test removing nodes from the beginning, middle, and end:
        
        listHead = listHead.removeFirstNode();
        listHead.printListFromHere();
        
        listHead = listHead.removeLastNode();
        listHead.printListFromHere();
        
        // listHead = listHead.removeNode(listHead.next);
        listHead.printListFromHere();
        
        listHead = listHead.removeNode(listHead.next);
        listHead.printListFromHere();
        
        ///
        // Repopulate the linked list to demonstrate the additional functions
        
        listHead = listHead.addNodeToBeginning(new ListNode(r2));
        listHead.printListFromHere();

        listHead = listHead.addNodeToBeginning(new ListNode(r1));
        listHead.printListFromHere();

        listHead.addNodeToEnd(new ListNode(r5));
        listHead.printListFromHere();

        System.out.println("\nConcatenate Method");
        System.out.println(listHead.concatenate());

        System.out.println("\nReverse Method");
        listHead = listHead.reverse();

        listHead.printListFromHere();
    }
    
    
    
}