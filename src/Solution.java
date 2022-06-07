import java.util.ArrayList;
import java.util.HashMap;

public class Solution {
    HashMap<Integer, Integer> map = new HashMap<>();
    int[] po;

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        po = preorder;
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return generate(0, 0, inorder.length - 1);
    }

    private TreeNode generate(int pre_root, int in_left, int in_right) {
        if (in_left > in_right) {
            return null;
        }
        TreeNode root = new TreeNode(po[pre_root]);
        int i = map.get(po[pre_root]);
        root.left = generate(pre_root + 1, in_left, i - 1);
        root.right = generate(pre_root + 1, i + 1, in_right);
        return root;
    }


}