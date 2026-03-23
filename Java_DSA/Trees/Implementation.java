class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;

    TreeNode(int value, TreeNode left, TreeNode right){
        this.data = value;
        this.left = left;
        this.right = right;
    }
}
public class Implementation {
    static int index = -1;
    static TreeNode buildTree(int[] preOrder){
        index++;
        if(index > preOrder.length || preOrder[index] == -1){
            return null;
        }
        TreeNode root = new TreeNode(preOrder[index], null, null);
        root.left = buildTree(preOrder);
        root.right = buildTree(preOrder);
        return root;
    }

    void inOrder(TreeNode root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data);
        inOrder(root.right);
    }

    void preOrder(TreeNode root){
        if(root == null){
            return;
        }
        System.out.print(root.data);
        preOrder(root.left);
        preOrder(root.right);
    }

    void postOrder(TreeNode root){
        if(root == null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data);
    }

    int height(TreeNode root){
        if(root == null){
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }

    int countNodes(TreeNode root){
        if(root == null){
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return (leftHeight + rightHeight) + 1;
    }

    public static void main(String[] args) {
        int[] preOrder = {1,2,-1,-1,3,4,-1,-1,5,-1,-1};
        Implementation tree = new Implementation();
        TreeNode root = buildTree(preOrder);
        System.out.println(root.data);

        tree.inOrder(root);
        System.out.println("");
        tree.preOrder(root);
        System.out.println("");
        tree.postOrder(root);
        System.out.println("");
        System.out.println(tree.height(root));
        System.out.println(tree.countNodes(root));
    }
}
