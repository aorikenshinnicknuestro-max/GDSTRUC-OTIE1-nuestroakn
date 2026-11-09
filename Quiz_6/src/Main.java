public class Main {
    public static void main(String[] args){
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.insert(25);
        binaryTree.insert(20);
        binaryTree.insert(15);
        binaryTree.insert(27);
        binaryTree.insert(30);
        binaryTree.insert(29);
        binaryTree.insert(26);
        binaryTree.insert(22);
        binaryTree.insert(32);

        System.out.println("\n--- Ascending Traversal ---");
        binaryTree.traverseInOrder();

        System.out.println("\n--- Descending Traversal ---");
        binaryTree.traverseInOrderDescending();

        System.out.println("\nMinimum Node + " + binaryTree.getMin());

        System.out.println("\nMaximum Node + " + binaryTree.getMax());

        int findIndex = 15;
        System.out.println("\nNode with value " + findIndex + " = " + binaryTree.get(findIndex));
    }
}
