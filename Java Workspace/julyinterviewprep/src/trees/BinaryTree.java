package trees;
class Node
{
	int data;
	Node left;
	Node right;
	Node(int data)
	{
		this.data=data;
	}
}
public class BinaryTree {
	Node root;//Root for the Binary Tree
	BinaryTree()
	{
		root=null;
	}
	BinaryTree(int data)
	{
		this.root = new Node(data);
	}
	//Find the sum of all Nodes in the tree
	int TreeSum(Node root)
	{
		if(root==null) return 0;
		return root.data+TreeSum(root.left)+TreeSum(root.right);
	}
	//Count total nodes in the tree
	int CountNodes(Node root)
	{
		if(root==null) return 0;
		return 1 + CountNodes(root.left)+CountNodes(root.right);
	}
	//Count Total Leaf Nodes in the tree
	int leafNodes(Node root)
	{
		if(root==null) return 0;
		if(root.left==null && root.right==null) return 1;
		return leafNodes(root.left) + leafNodes(root.right);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree bt = new BinaryTree(2);//Create a tree with 2 as the root.
		bt.root.left=new Node(3);
		bt.root.right=new Node(5);
		bt.root.left.right=new Node(9);
		bt.root.right.left = new Node(7);
		System.out.println(bt.TreeSum(bt.root));
		System.out.println(bt.CountNodes(bt.root));
		System.out.println(bt.leafNodes(bt.root));
	}

}
