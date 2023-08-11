class Node{
	int data;
	Node left;
	Node right;
	Node(int data){
		this.data=data;
	}
	public Node() {
		// TODO Auto-generated constructor stub
	}
	void display() {
		System.out.println(data+" ");
	}
}
class Tree{
	Node root;
	Tree(){
		root=null;
	}
	public Node search(int data) {
		Node current=root;
		while(current.data!=data) {
			if(current!=null) {
				System.out.println(current.data+" ");
			}
			if(data<current.data) {
				current=current.left;
			}
			else {
				current=current.right;
			}
			if(current==null) {
				return null;
			}
		}
		return current;
	}
	public void insert(int data) {
		Node temp=new Node();
		temp.data=data;
		if(root==null) {
			root=temp;
		}
		else {
			Node current=root;
			Node parent=null;
		
		while(true) {
			parent=current;
			if(parent.data>data) {
				current=current.left;
				if(current==null) {
					parent.left=temp;
					return;
				}
			}
			else {
				current=current.right;
				if(current==null) {
					parent.right=temp;
					return;
				}
			}
		
		}
		}
	}
	public void traverse(int type) {
		switch(type) {
		case 1:
			System.out.println("PreOrder Traversal:");
			Preorder(root);
			break;
		case 2:
			System.out.println("InOrder Traversal:");
			Inorder(root);
			break;
		case 3:
			System.out.println("PostOrder Traversal:");
			Postorder(root);
			break;	
		}
	}
	public void Preorder(Node root) {
		if(root!=null) {
			System.out.println(root.data+" ");
			Preorder(root.left);
			Preorder(root.right);
		}
	}
	public void Inorder(Node root) {
		if(root!=null) {
			Inorder(root.left);
			System.out.println(root.data+" ");
			Inorder(root.right);
		}
	}
	public void Postorder(Node root) {
		if(root!=null) {
			Postorder(root.left);
			Postorder(root.right);
			System.out.println(root.data+" ");
		}
	}
}
public class BinarySearchTree {
public static void main(String[] args) {
	//Node nd=new Node();
	Tree t=new Tree();
	t.insert(11);
	t.insert(20);
	t.insert(3);
	t.insert(42);
	t.insert(54);
	t.insert(16);
	t.insert(32);
	t.insert(9);
	t.insert(4);
	t.insert(10);
	Node n=t.search(32);
	if(n!=null) {
		System.out.println("Match");
		n.display();
	}
	t.traverse(1);
	t.traverse(2);
	t.traverse(3);
}
}
