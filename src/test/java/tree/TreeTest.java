package tree;


import focus.zhishui.tree.AvlTreeInteger;

/**
 * Tree Test
 * Created by Nero on 2018/3/5.
 */
public class TreeTest {


    public static void main(String[] args) {
        AvlTreeInteger.AvlNodeInteger root = new  AvlTreeInteger.AvlNodeInteger(59);
        AvlTreeInteger avlTree = new AvlTreeInteger(root);
        int[] a = new int[]{23,75,55,22,77,33,46};

        for(int i = 0 ; i < a.length ; i++){
            try {
                avlTree.insert(a[i]);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

//        System.out.println(avlTree.findMax().getValue());
//        System.out.println(avlTree.findMin().getValue());
//        System.out.println(avlTree.getNodeSize());
//        System.out.println(avlTree.contains(77));

        avlTree.printGraph(4);
        avlTree.remove(33);
        System.out.println("==============================================================");
        avlTree.printGraph(4);
    }




}
