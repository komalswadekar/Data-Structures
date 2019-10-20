/*
 * Creating binary tree from a given array in level order fashion and then print level order(breadth first)
 * and preorder (depth first : root, left, right)
 */

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeLevelOrder {

	TreeNode root;
	
	class TreeNode{
		int data;
		TreeNode left;
		TreeNode right;
		
		public TreeNode(int data){
			this.data = data;
			this.left = null;
			this.right = null;
					
		}
	}
	
	public TreeNode createLevelOrder(int arr[],TreeNode root,int index){
		
		if(index < arr.length){
			TreeNode temp = new TreeNode(arr[index]);
			root = temp;
			
			root.left = createLevelOrder(arr, root.left, 2*index+1);
			
			root.right = createLevelOrder(arr, root.right, 2*index+2);
			
		}
		return root;
	}
	
	public void printLevelOrder(TreeNode root){
		Queue<TreeNode> q = new LinkedList<>();
		q.add(root);
		while(!q.isEmpty()){
			TreeNode node = q.poll();
			System.out.print(node.data+" ");
			if(node.left!=null)
				q.add(node.left);
			if(node.right!=null)
				q.add(node.right);
		}
	}
	
	public void printPreorder(TreeNode root){
		Queue<TreeNode> q = new LinkedList<>();
		q.add(root);
		if(!q.isEmpty()){
			TreeNode node = q.poll();
			System.out.print(node.data+" ");
			if(node.left!=null)
				printPreorder(node.left);
			if(node.right!=null)
				printPreorder(node.right);
		}
	}
	
	public static void main(String args[]){
		int arr[] = {1,2,3,4,5,6,7,8};
		BinaryTreeLevelOrder bt = new BinaryTreeLevelOrder();
		bt.root = bt.createLevelOrder(arr,bt.root,0);
		bt.printLevelOrder(bt.root);
		System.out.println();
		bt.printPreorder(bt.root);
		
	}
}
