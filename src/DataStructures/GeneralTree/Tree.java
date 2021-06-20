package DataStructures.GeneralTree;

import java.util.LinkedList;
import java.util.Queue;

public class Tree<T> {
    private TreeNode<T> root;

    public Tree() {
    }

    public Tree(TreeNode<T> root) {
        this.root = root;
    }

    public TreeNode<T> getRoot() {
        return root;
    }

    public void setRoot(TreeNode<T> root) {
        this.root = root;
    }

    public void process(TreeNode<T> node){
        System.out.println(node.getElement());
    }

    public void processPreorder(){
        this.preorder(this.root);
    }

    public void processPostorder(){
        this.postorder(this.root);
    }

    public void processBF(){
        Queue<TreeNode<T>> queue = new LinkedList<>();
        queue.add(this.root);

        while (!queue.isEmpty()){
            TreeNode<T> node = queue.poll();
            this.process(node);

            for (TreeNode<T> child: node.getChildren()) {
                queue.add(child);
            }
        }
    }

    public void preorder(TreeNode<T> node){
        this.process(node);
        for (TreeNode<T> child: node.getChildren()) {
            this.preorder(child);
        }
    }

    public void postorder(TreeNode<T> node){
        for (TreeNode<T> child: node.getChildren()) {
            this.postorder(child);
        }
        this.process(node);
    }
}