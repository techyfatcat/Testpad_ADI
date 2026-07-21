/* class Node {
  int data; // data used as key value
  Node leftChild;
  Node rightChild;
  public Node()  {
    data=0;  }
  public Node(int d)  {
    data=d;  }
 } Above class is declared for use. */
class Result {
    static Node insert(Node root, int data) {
        if (root == null)
            return new Node(data);
        if (data < root.data)
            root.leftChild = insert(root.leftChild, data);
        else
            root.rightChild = insert(root.rightChild, data);
        return root;
    }
    static Node buildSearchTree(int arr[], int n) {
        Node root = null;
        for (int i = 0; i < n; i++) {
            root = insert(root, arr[i]);
        }
        return root;
    }
}
