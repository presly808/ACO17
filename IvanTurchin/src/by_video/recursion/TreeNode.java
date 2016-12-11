package by_video.recursion;

import java.util.List;

public class TreeNode {

    public int amount;
    public List<TreeNode> slaves;

    public TreeNode() {
    }

    public TreeNode(int amount) {
        this.amount = amount;
    }

    public TreeNode(int amount, List<TreeNode> slaves) {
        this.amount = amount;
        this.slaves = slaves;
    }
}
