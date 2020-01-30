import java.util.ArrayList;
import java.util.List;

public class InOrder {
    List<Integer> list = new ArrayList<>();

    public List<Integer> inOrder(TreeNode root){
        if (root == null) return list;

        inOrder(root.left);
        list.add(root.val);
        inOrder(root.right);
        return list;
    }
}
