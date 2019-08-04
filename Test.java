package lianxi0804;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;



class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
}

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> list = new ArrayList<>();
        if(root == null){
            return list;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> one = new ArrayList<>();
            for(int i = 0;i<size;i++){
                Node node = queue.poll();
                one.add(node.val);
                List<Node> children = node.children;
                if(children!= null && children.size() > 0){
                    for( Node n :children ){
                        queue.add(n);
                    }
                }
            }
            list.add(one);
        }

        return list;
    }
}

public class Test {

}