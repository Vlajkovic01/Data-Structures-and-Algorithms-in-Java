package DataStructures.Tree;

import DataStructures.ArrayList.ArrayList; //My Array, use your or Java Array

public class TreeNode<T> {
    private TreeNode<T> parent;
    private ArrayList<TreeNode<T>> children;
    private T element;

    public TreeNode(){
        this.children = new ArrayList<>();
    }

    public TreeNode(T element) {
        this();
        this.element = element;
    }

    public TreeNode(T element, TreeNode<T> parent) {
        this();
        this.parent = parent;
        this.parent.addChild(this);
        this.element = element;
    }

    public boolean isRoot(){
        return this.parent == null;
    }

    public boolean isLeaf(){
        return this.children.isEmpty();
    }

    public void addChild(TreeNode<T> child){
        this.children.add(child);
        child.parent = this;
    }

    public TreeNode<T> getParent() {
        return parent;
    }

    public void setParent(TreeNode<T> parent) {
        this.parent = parent;
    }

    public ArrayList<TreeNode<T>> getChildren() {
        return children;
    }

    public void setChildren(ArrayList<TreeNode<T>> children) {
        this.children = children;
    }

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }
}
