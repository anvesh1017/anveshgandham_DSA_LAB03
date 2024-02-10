package dsa.bst.pairfinder;

import java.util.Set;

import dsa.binarysearchtree.BinarySearchTree;
import dsa.binarysearchtree.Node;
import dsa.binarysearchtree.PreOrderTraversalOperation;

public class BinarySearchTreePairFinder implements NodeVisitationHandler{
	
	//tree
	//sumValue
	
	private BinarySearchTree tree;
	private Integer sumValue;
	private Result result;
	
	//constructor 
	public BinarySearchTreePairFinder(
			BinarySearchTree tree, Integer sumValue) {
		
		this.tree = tree;
		this.sumValue = sumValue;
		this.result = new Result();
	}
	
	
	//findPair() - core logic 
	public Result findPair() {
		
		
		 PreOrderTraversalOperation operation
         	= new PreOrderTraversalOperation(tree);
     
	     operation.setNodeVisitationHandler(this);
	     
	     operation.perform();
	         
	     return this.result;
			
	}


	@Override
	public void handle(Node currentNode, Set<Integer> previousVisitedNodes) {
		
        
        Integer currentNodeData = currentNode.getData();
        
        Integer difference = (sumValue - currentNodeData);
        
        if  (previousVisitedNodes.contains(difference)) {
        
            System.out.printf("Match Identified : Sum %d, Difference : %d", 
                sumValue, difference);
            System.out.println();
            
            this.result.setFound(Boolean.TRUE);
            
            Pair newPair = new Pair(currentNodeData, difference);			
            this.result.getPairs().add(newPair);
            
        }			

        
	}
	
	

}