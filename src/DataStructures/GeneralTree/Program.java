package DataStructures.GeneralTree;

public class Program {
    public static void main(String[] args) {
        Tree<String> tree = new Tree<>();

        TreeNode<String> treeNode1 = new TreeNode<>("A");
        TreeNode<String> treeNode2 = new TreeNode<>("B", treeNode1);
        TreeNode<String> treeNode3 = new TreeNode<>("C", treeNode1);
        TreeNode<String> treeNode4 = new TreeNode<>("D", treeNode1);
        TreeNode<String> treeNode5 = new TreeNode<>("E", treeNode2);
        TreeNode<String> treeNode6 = new TreeNode<>("F", treeNode2);
        TreeNode<String> treeNode7 = new TreeNode<>("G", treeNode3);
        TreeNode<String> treeNode8 = new TreeNode<>("H", treeNode3);

        tree.setRoot(treeNode1);

        tree.processPreorder();
        System.out.println("-----------------------");
        tree.processPostorder();
        System.out.println("-----------------------");
        tree.processBF();

    }
}