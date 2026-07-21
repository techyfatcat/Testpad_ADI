/* 
 *  class Node {
 *    int data;
 *    Node left; 
 *    Node right;
 *    public Node() {
 *      data = 0;
 *    }
 *    public Node(int d)  {
 *      data = d;
 *    }
 *  }
 *
 *  The above class defines a tree node.
 */
class Result {
    static int isBinarySearchTree(Node root) {
        return checkBST(root, Long.MIN_VALUE, Long.MAX_VALUE) ? 1 : 0;
    }
    static boolean checkBST(Node node, long min, long max) {
        if (node == null) return true;
        if (node.data <= min || node.data >= max) return false;
        return checkBST(node.left, min, node.data) &&
               checkBST(node.right, node.data, max);
    }
}
