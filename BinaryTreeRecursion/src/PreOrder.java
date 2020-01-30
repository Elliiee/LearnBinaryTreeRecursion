import java.util.ArrayList;
import java.util.List;

public class PreOrder {
    List<Integer> list = new ArrayList<>();

    public List<Integer> preOrderTraversal(TreeNode root) {
        if (root == null) return list;

        list.add(root.val);
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
        return list;
    }
}
