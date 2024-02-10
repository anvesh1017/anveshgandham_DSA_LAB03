package dsa.bst.pairfinder;

import dsa.binarysearchtree.BinarySearchTree;
import dsa.binarysearchtree.SampleBinaryTrees;

public class BinarySearchTreePairFinderTest {
	
	public static void main(String[] args) {

		test01();
	}

	static void test01() {
		
//		Result result = testFindPair(120);
		String result = testFindPair(190);
		System.out.println(result);
	}

	static String testFindPair(int sum) {				
		
		BinarySearchTree tree = 
			SampleBinaryTrees.sampleBST_01();

		BinarySearchTreePairFinder finder 
			= new BinarySearchTreePairFinder(tree, sum);
		
		Result result = finder.findPair();
		
		if(result.getFound()) {
			System.out.println();
			return result.toString();	
		}
		return "Nodes are not Found";
		
			
	}


}