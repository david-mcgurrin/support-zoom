public class LinkedList {

    // Set to private
    private ListNode listHead;

    // Constructor for the list head
    LinkedList() {
        this.listHead = null;
    }

    // Prints the list from list head node
    public void printListFromHere()
    {
        System.out.println("----------\nStart List\n----------");
        ListNode currNode = listHead;
        while (currNode != null) {
            System.out.println("\t" + currNode.getData());
            currNode = currNode.getNext();
        }
        System.out.println("----------\nEnd List\n----------");
    }

    // Get the data with the get method
    public void printNumNodes() {
        System.out.println(ListNode.getTotalNodes() + " node(s) created so far.");
    }

    // Get the length of the list, assuming listHead is 
    // the beginning
    public void getLength()
    {
        // To get the length, walk through the list one
        // node at a time, adding one for each node we
        // visit
        
        int length = 0;
        
        ListNode currNode = listHead;
        while (currNode != null)
        {
            length++;
            currNode = currNode.getNext();
        }
        
        System.out.println("The current linked list length is " + length);
    }
    

    // Add a node to the beginning of the list, assuming
    // "this" node is the beginning, and return the new
    // start of the list
    public void addNodeToBeginning(ReadThis data) {
        ListNode newNode = new ListNode(data);

        newNode.setNext(listHead);

        listHead = newNode;
    }

    // Add a node to the end of the list "this" belongs to
    public void addNodeToEnd(ReadThis data) {
        ListNode currNode = listHead;
        ListNode newNode = new ListNode(data);

        while (currNode.getNext() != null) {
            currNode = currNode.getNext();
        }
        
        currNode.setNext(newNode);
    }


    // Add a node after a given node, starting the search
    // at "this"
    public void addNodeAfterNode(ReadThis data, ReadThis data2)
    {
        ListNode currNode = listHead;
        ListNode newNode = new ListNode(data);
        ListNode addAfter = new ListNode(data2);
            
        // Use short-circuiting: if currNode ends up being
        // null, the first part of the and expression will be
        // false and the second part will never get evaluated
        // (this avoids a null pointer exception)
        while (currNode != null &&
                !currNode.getData().equals(addAfter.getData()))
        {
            currNode = currNode.getNext();
        }
        
        // currNode will either be null if we got to the
        // end of the list without finding the node,
        // or the node we want to add the new one after
        if (currNode != null)
        {
            // newNode.next = currNode.next;
            // currNode.next = newNode;
            newNode.setNext(currNode.getNext());
            currNode.setNext(newNode);
        }
    }

    // // Remove the first node in the list, and return
    // the new head
    public void removeFirstNode() {
        // We just need to cut out the head node,
        // making the second node in the list the head
        // (if there isn't one, that's ok, head will
        // just become null)
        listHead = listHead.getNext();
    }

    // Remove the last node from the list, and return
    // the head in case it changes because the list
    // is now empty
    public void removeLastNode() {
        // If there's only one item in the list,
        // the new list should be empty (i.e. head
        // is null)
        if (listHead.getNext() == null) {
            listHead = null;
        }
        
        // Otherwise, find the last node to remove
        else {
            // First we have to actually find the end of the list,
            // but we also have to hang onto the node right before the
            // last one so we can update its next reference
            ListNode prevNode = null;
            ListNode currNode = listHead;
            while (currNode.getNext() != null) {
                prevNode = currNode;
                currNode = currNode.getNext();
            }
            
            // currNode is the last one in the list; now we can cut it out
            // using the previous node
            //prevNode.next = null;
            prevNode.setNext(null);
            
        }
    }

    // Remove the given node from the list, and return
    // the head in case it changes
    public void removeNode(ReadThis data)
    { 
        ListNode toRemove = new ListNode(data);
        // Check if the head is the one to remove;
        // if so, link it out by returning a new head
        // (which can be null)
        if (listHead.getData().equals(toRemove.getData()))
        {
        listHead = listHead.getNext();
        }
        
        // Otherwise, we can search the list for the
        // node to remove and link it out
        else
        {
            
            ListNode currNode = listHead;
            
            // Stop when the next node's data equals the data
            // we want to remove
            while (currNode.getNext() != null &&
                    !currNode.getNext().getData().equals(toRemove.getData()))
            {
                currNode = currNode.getNext();
            }
            
            // If currNode's next is null, then we never found the
            // node to remove
            if (currNode.getNext() != null)
            {
                currNode.setNext(currNode.getNext().getNext());
            }
            
        }
    }
}