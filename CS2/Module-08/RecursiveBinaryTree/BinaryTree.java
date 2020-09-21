import java.util.ArrayList;

public class BinaryTree 
{
    private String     data;
    private BinaryTree leftChild;
    private BinaryTree rightChild;
    
    // A constructor that takes root data only and
    // makes a tree with no children (i.e., a leaf)
    public BinaryTree(String d) 
    {
        data = d;
        leftChild = null;
        rightChild = null;
    }
    
    // A constructor that takes root data as well as two subtrees
    // which then become children to this new larger tree.
    public BinaryTree(String d, BinaryTree left, BinaryTree right)
    {
        data = d;
        leftChild = left;
        rightChild = right;
    }
    
    // Get methods
    public String getData() { return data; }
    public BinaryTree getLeftChild() { return leftChild; }
    public BinaryTree getRightChild() { return rightChild; }
    
    // Set methods
    public void setData(String d) { data = d; }
    public void setLeftChild(BinaryTree left) { leftChild = left; }
    public void setRightChild(BinaryTree right) { rightChild = right; }
    
    
    // Return the height of the tree
    public int height()  
    {
        // Base case: if there are no more children, return 1
        if (leftChild == null && rightChild == null)
        {
            return 1;
        }
        
        // Recursive case: one or neither child is null
        if (leftChild == null)
        {
            return 1 + rightChild.height();
        }
        else if (rightChild == null)
        {
            return 1 + leftChild.height();
        }
        else
        {
            return 1 + Math.max(leftChild.height(),
                                rightChild.height());
        }
    }
    
    
    // Return all the leaves of the tree
    public ArrayList<String> leafData()  
    {
        ArrayList<String> result = new ArrayList<String>();
        
        if (data != null) 
        {
            // Base case: check if the current tree is a leaf, and if so,
            // add the data
            if ((leftChild == null) && (rightChild == null))
            {
                result.add(data);
            }
        }
        
        // Recursive case: collect the leaves of the children and add them
        if (leftChild != null)
        {
            result.addAll(leftChild.leafData());
        }
        if (rightChild != null)
        {
            result.addAll(rightChild.leafData());
        }
        
        // Return all the leaves part of this tree
        return result;
    }
    
    // Return true/false depending on whether the trees match
    public boolean hasSameContentsAs(BinaryTree tree)
    {
        // Base case: if neither the original tree nor the parameter tree have children we check to see if the data matches
        if (leftChild == null && rightChild == null
             && tree.leftChild == null && tree.rightChild == null)
        {
            // Return true if the root tree data matches the parameter tree
            if (data == tree.data)
            {
                return true;
            }
        }

        // Conditions to check against null nodes
        // If the right child of the original tree is null and the corresponding parameter tree child is not null return false
        if (leftChild != null && rightChild == null
            && tree.leftChild != null && tree.rightChild != null)
        {
            return false;
        }

        // If the left child of the original tree is null and the corresponding parameter tree child is not null return false
        if (leftChild == null && rightChild != null
            && tree.leftChild != null && tree.rightChild != null)
        {
            return false;
        }

        // If the right child of the parameter tree is null and the corresponding original tree child is not null return false
        if (leftChild != null &&  rightChild != null
            && tree.leftChild != null && tree.rightChild == null)
        {
            return false;
        }

        // If the left child of the original tree is null and the corresponding original tree child is not null return false
        if (leftChild != null &&  rightChild != null
            && tree.leftChild == null && tree.rightChild != null)
        {
            return false;
        }

        // Recursive cases
        // If the node has children return whether the parameter tree data matches as well as checking the recursive function against the tree's left and right children
        if (leftChild != null && rightChild != null) {
            return data == tree.data && leftChild.hasSameContentsAs(tree.leftChild)
            && rightChild.hasSameContentsAs(tree.rightChild);
        }

        // If no right child call the method on only the tree's left child
        if (leftChild != null && rightChild == null) {
            return data == tree.data && leftChild.hasSameContentsAs(tree.leftChild);
        }

        // If no left child call the method on only the tree's right child
        if (rightChild != null && leftChild == null) {
            return data == tree.data && rightChild.hasSameContentsAs(tree.rightChild);
        }

        return false;
    }

    // Returns the count of all the nodes
    public int numberOfNodes()
    {
        // Variables to track the count
        int leftCount = 0;
        int rightCount = 0;

        // Base case: if there are no children then return 1
        if (leftChild == null && rightChild == null)
        {
            return 1;
        }

        // Recursive case
        // Count the left child nodes
        if (leftChild != null)
        {
            leftCount = leftChild.numberOfNodes();
        }

        // Count the right child nodes
        if (rightChild != null)
        {
            rightCount = rightChild.numberOfNodes();
        }
        
        // Return the count of the left nodes and right nodes along with adding 1 for the root node
        return leftCount + rightCount + 1;
    }

}
