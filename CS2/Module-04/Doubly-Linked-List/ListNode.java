public class ListNode
{
    public ReadThis data;
    public ListNode prev;   //  Declare the node that the previous attribute will link to
    public ListNode next;
    
    public static int totalNodes = 0;
    
    public ListNode(ReadThis newData)
    {
        this(newData, null);
    }
    
    public ListNode(ReadThis newData, ListNode newNext)
    {
        data = newData;
        prev = null;    // Initialised as null since it doesn't link anywhere in the head
        next = newNext;
        totalNodes++;
    }
    
    
    public static void printNumNodes()
    {
        System.out.println(totalNodes + " have been created so far.");
    }
    
    
    // Prints the list from "this" node
    public void printListFromHere()
    {
        System.out.println("----------\nStart List\n----------");
        ListNode currNode = this;
        while (currNode != null)
        {
            System.out.println("\t" + currNode.data);
            currNode = currNode.next;
        }
        System.out.println("----------\nEnd List\n----------\n");
    }
    
    
    // Add a node to the beginning of the list, assuming
    // "this" node is the beginning, and return the new
    // start of the list
    public ListNode addNodeToBeginning(ListNode newNode)
    {
        newNode.prev = null;    // Since adding to the beginning there will be no previous node so initialise as null
        newNode.next = this;    // Link the new node to the current node which was the old beginning node
        this.prev = newNode;    // Link the current node back to the new node that has been added to the front of the linked list

        System.out.println("addNodeToBeginning()");
        // System.out.println("Current node: " + this.data);
        // System.out.println("Previous node: " + this.prev.data);
        // System.out.println("Next node: " + this.next.data);
        // System.out.println("-----");
        // System.out.println("New node: " + newNode.data);
        // System.out.println("Previous node: " + newNode.prev);
        // System.out.println("Next node: " + newNode.next.data);
        // System.out.println("");

        return newNode;
    }
    
    
    // Add a node to the end of the list "this" belongs to
    public void addNodeToEnd(ListNode newNode)
    {
        ListNode prevNode = null;   // Initialise the previous node as null
        ListNode currNode = this;
        while (currNode.next != null)
        {
            prevNode = currNode;        // Set the previous node equal to the current node before it gets updated
            currNode = currNode.next;   // Update the next node
            currNode.prev = prevNode;   // Set the previous node to the old current node
        }
        
        currNode.prev = prevNode;   // When we reach the end we add the previous node as the final node prev attribute
        currNode.next = newNode;    // The new node is then added on by setting the next attribute to the new node
        newNode.prev = currNode;    // Link the new node back to the old final node

        System.out.println("addNodeToEnd()");
        // System.out.println("Current node: " + currNode.data);
        // System.out.println("Previous node: " + currNode.prev.data);
        // System.out.println("Next node: " + currNode.next.data);
        // System.out.println("-----");
        // System.out.println("New node: " + newNode.data);
        // System.out.println("Previous node: " + newNode.prev.data);
        // System.out.println("Next node: " + newNode.next);
        // System.out.println("");
    }
    

    // Add a node after a given node, starting the search
    // at "this"
    public void addNodeAfterNode(ListNode newNode, ListNode addAfter)
    {
        ListNode currNode = this;
        ListNode prevNode = null;   // Initialise the previous node as null
            
        // Use short-circuiting: if currNode ends up being
        // null, the first part of the and expression will be
        // false and the second part will never get evaluated
        // (this avoids a null pointer exception)
        while (currNode != null &&
               !currNode.data.equals(addAfter.data))
        {
            prevNode = currNode;        // Set the previous node equal to the current node before it gets updated
            currNode = currNode.next;   // Update the current node to move through the list
            currNode.prev = prevNode;   // Link back to old current node
        }
        
        // currNode will either be null if we got to the
        // end of the list without finding the node,
        // or the node we want to add the new one after
        if (currNode != null)
        {
            //prevNode = currNode.prev;
            newNode.next = currNode.next;   // Insert the node between two older nodes by setting its next value to the current values next
            newNode.prev = currNode;        // Link back to the current node
            currNode.next = newNode;        // Link to the new node
        }
        currNode.prev = prevNode;           // Link the current node back to the previous node

        System.out.println("addNodeAfterNode()");
        // System.out.println("Current node: " + currNode.data);
        // System.out.println("Previous node: " + currNode.prev.data);
        // System.out.println("Next node: " + currNode.next.data);
        // System.out.println("-----");
        // System.out.println("New node: " + newNode.data);
        // System.out.println("Previous node: " + newNode.prev.data);
        // System.out.println("Next node: " + newNode.next.data);
        // System.out.println("");
    }
    
    
    // Remove the first node in the list, and return
    // the new head
    public ListNode removeFirstNode()
    {
        // We just need to cut out the head node,
        // making the second node in the list the head
        // (if there isn't one, that's ok, head will
        // just become null)
        next.prev = null;   // Set the previous attribute of the next node to null

        System.out.println("removeFirstNode()");
        // System.out.println("Current node: " + next.data);
        // System.out.println("Previous node: " + next.prev);
        // System.out.println("Next node: " + next.next.data);
        // System.out.println("");
        return next;
    }
    
    
    // Remove the last node from the list, and return
    // the head in case it changes because the list
    // is now empty
    public ListNode removeLastNode()
    {
        // If there's only one item in the list,
        // the new list should be empty (i.e. head
        // is null)
        if (next == null)
        {
            return null;
        }
        
        // Otherwise, find the last node to remove
        else
        {
            // First we have to actually find the end of the list,
            // but we also have to hang onto the node right before the
            // last one so we can update its next reference
            ListNode prevNode = null;
            ListNode currNode = this;
            while (currNode.next != null)
            {
                // Move through linked list and update the links
                prevNode = currNode;        
                currNode = currNode.next;
                currNode.prev = prevNode;
            }
            
            // currNode is the last one in the list; now we can cut it out
            // using the previous node
            prevNode.next = null;       // Cut off the last node by linking it to null
            currNode.prev = prevNode;   // Need to link the current/last node to the previous node
            
            System.out.println("removeLastNode()");
            // System.out.println("Remove node: " + currNode.data);
            // System.out.println("Current node: " + prevNode.data);
            // System.out.println("Previous node: " + prevNode.prev.data);
            // System.out.println("Next node: " + currNode.next);
            // System.out.println("");

            // The head isn't changing in this case, so
            // just return this
            return this;
        }
    }
    
    
    // Remove the given node from the list, and return
    // the head in case it changes
    public ListNode removeNode(ListNode toRemove)
    { 
        // Check if the head is the one to remove;
        // if so, link it out by returning a new head
        // (which can be null)
        if (data.equals(toRemove.data))
        {
            return next;
        }
        
        // Otherwise, we can search the list for the
        // node to remove and link it out
        else
        {
            ListNode prevNode = this.prev; // Initialise the previous node
            ListNode currNode = this;
            
            // Stop when the next node's data equals the data
            // we want to remove
            while (currNode.next != null &&
                   !currNode.next.data.equals(toRemove.data))
            {
                prevNode = currNode;    // Set the previous node equal to the current node before it gets updated
                currNode = currNode.next;
                currNode.prev = prevNode;
            }

            currNode.prev = prevNode;   // Link back to previous node

            // If currNode's next is null, then we never found the
            // node to remove
            if (currNode.next != null)
            {
                currNode.next = currNode.next.next; // To remove a node in the middle of the list we cut it off by looking to the next of its next value
                currNode.next.prev = currNode;      // We set the previous value of this node to the current node
            }

            System.out.println("removeNode()");
            // System.out.println("Current node: " + currNode.data);
            // System.out.println("Previous node: " + currNode.prev);
            // System.out.println("Next node: " + currNode.next.data);
            // System.out.println("-----");
            // System.out.println("Next node: " + currNode.next.data);
            // System.out.println("Previous node: " + currNode.next.prev.data);
            // System.out.println("Next node: " + currNode.next.next);
            // System.out.println("");
           
            // If we got this far, the head hasn't changed
            return this;
        }
    }
    
    
    // Get the length of the list, assuming "this" is 
    // the beginning
    public int getLength()
    {
        // To get the length, walk through the list one
        // node at a time, adding one for each node we
        // visit
        
        int length = 0;
        
        ListNode currNode = this;
        while (currNode != null)
        {
            length++;
            currNode = currNode.next;
        }
        
        return length;
    }

    public String concatenate() {

        // To concatenate the data, walk through the list one
        // node at a time, adding the node data to a String
        // variable on each visit

        String concatenatedNodes = "";  // Declare and initialise the variable
        
        ListNode currNode = this;
        while (currNode != null)
        {
            concatenatedNodes += currNode.data; // Update the variable
            currNode = currNode.next;
        }
        
        return concatenatedNodes;   // Return the concatenated node variable

    }

    public ListNode reverse() {

        // Set up nodes used for traversing through the linked list
        ListNode currNode = this;
        ListNode previousNode = null;   //  Used for swapping nodes
        ListNode nextNode = null;       //  Used for swapping nodes

        while (currNode != null)
        {
            nextNode = currNode.next;   // Store the value of the next node so that we can traverse through the linked list

            // Swap the values
            currNode.next = previousNode;   // Set the next value to point back towards the previous node
            currNode.prev = nextNode;       // Set the previous value to point towards the next node
            
            // Move through the linked list
            previousNode = currNode;        // Set the previous node to be the current node, i.e. making it the current node the previous one on the next iteration
            currNode = nextNode;            // Move to the next node and re-enter the loop
        }
        
        return previousNode;    // At the end fo the loop this will be the last non-null node so we return this as our new head
    }
}