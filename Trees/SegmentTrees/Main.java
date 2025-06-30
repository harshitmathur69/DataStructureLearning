package Trees.SegmentTrees;

public class Main {
    public static void main(String[] args){
        int[] arr = {3,8,6,7,-2,-8,4,9};
        SegmentTree Tree = new SegmentTree(arr);
//        Tree.display();
        System.out.println(Tree.query(1,6));
    }
}
