class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    TreeNode(int value, TreeNode left, TreeNode right) {
        this.data = value;
        this.left = left;
        this.right = right;
    }
}

public class BinarySearch {
    // for inserting the new node
    TreeNode insertNode(TreeNode root, int value) {
        if (root == null) {
            root = new TreeNode(value, null, null);
            return root;
        }
        else if (root.data > value) {
            root.left = insertNode(root.left, value);
        }
        else {
            root.right = insertNode(root.right, value);
        }
        return root;
    }

    // for searching the node
    boolean searchNode(TreeNode root, int value) {
        if (root == null) return false;
        if (root.data == value) return true;
        return (root.data > value) ? searchNode(root.left, value) : searchNode(root.right, value);
    }

    //Deleting the node
    TreeNode deletingNode(TreeNode root, int value){
        if(root == null) return null;
        if(value < root.data){
            root.left = deletingNode(root.left, value);
        }
        else if(value > root.data){
            root.right = deletingNode(root.right, value);
        }
        else{
            if(root.left == null && root.right == null){
                root = null;
            }
            else if(root.right == null){
                root.data = successor(root.right);
                root.right = deletingNode(root.right, value);
            }
            else{
                root.data = predeccessor(root.left);
                root.left = deletingNode(root.left, value);
            }
        }
        return root;
    }

    private int successor(TreeNode root){
        root = root.right;
        while (root.left != null) {
            root = root.left;
        }
        return root.data;
    }
    
    private int predeccessor(TreeNode root){
        root = root.left;
        while (root.right != null) {
            root = root.right;
        }
        return root.data;
    }

    //printing the tree
    void printTree(TreeNode root) {
    if (root == null) {
        return;
    }
    printTree(root.left);
    System.out.print(root.data + " ");
    printTree(root.right);
}

    TreeNode buildTree(int[] binaryTree) {
        TreeNode root = null;
        for (int i : binaryTree) {
            root = insertNode(root, i);
        }
        return root;
    }

    public static void main(String[] args) {
        int[] binaryTree = { 40, 20, 60, 10, 30, 50, 70 };
        BinarySearch bst = new BinarySearch();
        // TreeNode root = bst.insertNode(null, 100);
        // bst.insertNode(root, 110);
        // bst.insertNode(root, 120);
        TreeNode root = bst.buildTree(binaryTree);
        System.out.println(root.data);
        System.out.println(bst.searchNode(root, 30));
        bst.printTree(root);
        System.out.println(bst.deletingNode(root, 60));
        bst.printTree(root);
    }
}