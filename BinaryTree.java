
public class BinaryTree
{   static class Node
	{   int data;
         Node left;
		 Node right;
		Node(int data)
		{
			this.data=data;
			this.left=null;
			this.right=null;
		}
	}
	static class Binary
	{    static int idx=-1;
		public static Node builtNode(int arr[])
		{
			idx++;
			if(arr[idx]==-1)
			{
				return null;
			}
			Node newNode=new Node(arr[idx]);
			newNode.left=builtNode(arr);
			newNode.right=builtNode(arr);	
			return newNode;
		}
		public static void preorder(Node root)
		{ 
		     if(root==null)
			 {return;}
			System.out.println(root.data);
			preorder(root.left);
			preorder(root.right);
			
		}
		public static void postorder(Node root)
		{  if(root==null)
			{
				return ;
			}
			postorder(root.left);
			postorder(root.right);
			System.out.println(root.data);
		}
		public static void inorder(Node root)
		{ if(root==null){
		      return;
			  }
			inorder(root.left);
			System.out.println(root.data);
			inorder(root.right);
		}
	}
	
	
	public static void main(String ar[])
	{
		int arr[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
		Binary b=new Binary();
		Node root=b.builtNode(arr);
		System.out.println("Prioerder");
		b.preorder(root);
		System.out.println("Inorder");
		b.inorder(root);
		System.out.println("Postorder");
		b.postorder(root);
		
		
	}
}