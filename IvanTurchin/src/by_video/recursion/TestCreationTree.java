package by_video.recursion;

import java.util.Arrays;

public class TestCreationTree {

    public static void main(String[] args) {
        TreeNode employee = new TreeNode(1000);
        TreeNode employee1 = new TreeNode(1000);
        TreeNode employee2 = new TreeNode(1000);
        TreeNode employee3 = new TreeNode(1000);

        TreeNode manager = new TreeNode(2000, Arrays.asList(employee, employee1));
        TreeNode manager1 = new TreeNode(2000, Arrays.asList(employee2, employee3));

        TreeNode director = new TreeNode(10000, Arrays.asList(manager, manager1));

        int res = TreeNodeUtils.count(director);

        System.out.println(res);


    }
}
