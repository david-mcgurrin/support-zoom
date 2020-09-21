public class BinaryTreeTest 
{
    public static void main(String[] args) 
    {
        BinaryTree  root1;
        BinaryTree  root2;
        
        root1 = new BinaryTree("A",
                              new BinaryTree("B",
                                             new BinaryTree("C",
                                                            new BinaryTree("D"),
                                                            new BinaryTree("E",
                                                                           new BinaryTree("F",
                                                                                          new BinaryTree("G"),
                                                                                          new BinaryTree("I")),
                                                                           new BinaryTree("H"))),
                                             new BinaryTree("J",
                                                            new BinaryTree("K",
                                                                           null,
                                                                           new BinaryTree("L",
                                                                                          null,
                                                                                          new BinaryTree("M"))),
                                                            new BinaryTree("N",
                                                                           null,
                                                                           new BinaryTree("O")))),
                              new BinaryTree("P",
                                             new BinaryTree("Q"),
                                             new BinaryTree("R",
                                                            new BinaryTree("S",
                                                                           new BinaryTree("T"),
                                                                           null),
                                                            new BinaryTree("U"))));

        root2 = new BinaryTree("A",
                              new BinaryTree("B",
                                             new BinaryTree("C",
                                                            new BinaryTree("D"),
                                                            new BinaryTree("E",
                                                                           new BinaryTree("F",
                                                                                          new BinaryTree("G"),
                                                                                          new BinaryTree("I")),
                                                                           new BinaryTree("H"))),
                                             new BinaryTree("J",
                                                            new BinaryTree("K",
                                                                           null,
                                                                           new BinaryTree("L",
                                                                                          null,
                                                                                          new BinaryTree("M"))),
                                                            new BinaryTree("N",
                                                                           null,
                                                                           new BinaryTree("O")))),
                              new BinaryTree("P",
                                             new BinaryTree("Q"),
                                             new BinaryTree("R",
                                                            new BinaryTree("S",
                                                                           new BinaryTree("T"),
                                                                           null),
                                                            new BinaryTree("U"))));
                                        

                              
        
        System.out.println("The tree's height is: " + root1.height());
        System.out.println("The tree's leaves are: " + root1.leafData());
        System.out.println("The tree's node count is: " + root1.numberOfNodes());
        System.out.println("The trees Root1 and Root2 have the same contents: " + root1.hasSameContentsAs(root2));
    }
}
