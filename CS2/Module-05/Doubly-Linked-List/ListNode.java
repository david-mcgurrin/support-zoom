public class ListNode
{
    // Set to private
    private ReadThis data;    
    private ListNode next;
    
    // Static attribute that is updated with each new node creation
    private static int totalNodes = 0;
    
    // Constructor
    public ListNode(ReadThis newData)
    {
        data = newData;
        next = null;
        totalNodes++;
    }

    // Get Methods
    public ListNode getNext() {
        return next;
    }

    public ReadThis getData() {
        return data;
    }

    public static int getTotalNodes() {
        return totalNodes;
    }

    // Set Method
    public void setNext(ListNode nextNode) {
        next = nextNode;
    }
}