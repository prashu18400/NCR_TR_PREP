package Tree;
import java.util.*;
class Node{
	public int data;
	public Node left;
	public Node right;
}
public class BTree {
	public static Node create() {
		{
		System.out.println("If no child enter -1");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n == -1)
			return null;
		Node newNode = new Node();
		newNode.data = n;
		System.out.println("Enter left child of "+newNode.data);
		newNode.left = create();
		System.out.println("Enter right child of "+newNode.data);
		newNode.right = create();
		return newNode;
		}
	}
	public static void inorder(Node root) {
		if(root!=null) {
			inorder(root.left);
			System.out.print(root.data + " ");
			inorder(root.right);
		}
	}
	public static void preorder(Node root) {
		if(root!=null) {
			System.out.print(root.data+ " ");
			preorder(root.left);
			preorder(root.right);
		}
	}
	public static void postorder(Node root) {
		if(root!=null) {
			postorder(root.left);
			postorder(root.right);
			System.out.print(root.data +" ");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Node root = create();
		inorder(root);
		preorder(root);
		postorder(root);
		sc.close();
	}
}
