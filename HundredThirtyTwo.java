//Check given sub tree is a part of B-tree or not.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class HundredThirtyTwo {

    public boolean isIdentical(TreeNode root, TreeNode subRoot) {
        if (root == null && subRoot == null) {
            return true;
        }
        if (root == null || subRoot == null) {
            return false;
        }
        if (root.val == subRoot.val) {
            return isIdentical(root.left, subRoot.left)
                    && isIdentical(root.right, subRoot.right);
        }
        return false;
    }

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (subRoot == null) {
            return true;
        }
        if (root == null) {
            return false;
        }
        if (root.val == subRoot.val) {
            if (isIdentical(root, subRoot)) {
                return true;
            }
        }
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    // ---- main method for testing ----
    public static void main(String[] args) {
        HundredThirtyTwo obj = new HundredThirtyTwo();

        // Main Tree
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(4);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(2);

        // Sub Tree
        TreeNode subRoot = new TreeNode(4);
        subRoot.left = new TreeNode(1);
        subRoot.right = new TreeNode(2);

        System.out.println(obj.isSubtree(root, subRoot)); // true
    }
}
