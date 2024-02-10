package dsa.bst.pairfinder;
import dsa.binarysearchtree.BinarySearchTree;
import java.util.Scanner;

public class PairFinderMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinarySearchTree bst_tree = new BinarySearchTree();
		
		System.out.println("Total Number of nodes required for Binary Search Tree:");
		
		Scanner input = new Scanner(System.in);
		
		int totalNodes = input.nextInt();
		
		System.out.println("Enter the node values for the tree:");
		
		for (int i = 0; i < totalNodes; i += 1) {
			int val = input.nextInt();
			bst_tree.insert(val);
		}
		
		
		System.out.println("Enter the sum value to get the pairs:");
		
		int totalSum = input.nextInt();
		
		BinarySearchTreePairFinder finder = new BinarySearchTreePairFinder(bst_tree, totalSum);
		
		Result result = finder.findPair();
		
		if (result.getFound()) {
			System.out.println(result);
		} else {
			System.out.println("Nodes are not found");
		}

	}

}
