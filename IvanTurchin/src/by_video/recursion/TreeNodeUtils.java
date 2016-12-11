package by_video.recursion;

import java.util.List;

public class TreeNodeUtils {

    public static int count(TreeNode root) {

        int amount = root.amount;

        List<TreeNode> children = root.slaves;

        if (children == null) {
            return amount;
        }

        for (TreeNode child : children) {
            int returnRes = count(child);
            amount += returnRes;
        }

        return amount;
    }
}
