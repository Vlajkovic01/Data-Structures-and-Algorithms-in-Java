General Tree
=======================

## Description

-In the data structure, General tree is a tree in which each node can have either zero or many child nodes. It can not be empty. In general tree, there is no limitation on the degree of a node. The topmost node of a general tree is called the root node. There are many subtrees in a general tree. The subtree of a general tree is unordered because the nodes of the general tree can not be ordered according to specific criteria. In a general tree, each node has in-degree(number of parent nodes) one and maximum out-degree(number of child nodes) n.

**Difference between General Tree and [Binary Tree](../BinaryTree)**

<img src="https://github.com/Vlajkovic01/Data-Structures-and-Algorithms-in-Java/blob/main/others/GeneralTree-vs-BinaryTree.png" align=center>

## Results 📊

<img src="https://github.com/Vlajkovic01/Data-Structures-and-Algorithms-in-Java/blob/main/others/GeneralTree.png" align=center>

**Pseudocode**
```java
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
```
