import jdk.nashorn.api.tree.Tree;

import java.util.ArrayList;
import java.util.List;

public class LevelOrder {
    List<List<Integer>> lists = new ArrayList<>();

    public List<List<Integer>> levelOrder(TreeNode root){
        if (root == null) return lists;

        helper(root, 0);
        return lists;
    }

    public void helper(TreeNode node, int level){
        if (lists.size() == level)
            lists.add(new ArrayList<>());

        // preorder
        lists.get(level).add(node.val);
        if (node.left != null)
            helper(node.left, level + 1);
        if (node.right != null)
            helper(node.right, level + 1);
    }
}
