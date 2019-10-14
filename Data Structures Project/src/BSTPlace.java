
public class BSTPlace {
	private BSTNode root;
	
	public BSTPlace() {
		root = null;
	}
	
	public Place get(float key) {
		BSTNode node = root;
		while(node != null) {
			if(node.getKey() == key)
				return node.getData();
			else if(node.getKey() > key)
				node = node.getRight();
			else if(node.getKey() < key)
				node = node.getLeft();
		}
		return null;
	}
	
	public void put(float key, Place data) {
		root = put(root, key, data);
	}
	
	private BSTNode put(BSTNode root, float key, Place data) {
		if(root == null)
			return new BSTNode(key, data);
		
		if(root.getKey() == key) 
			root.setData(data);
		else if(root.getKey() > key)
			root.setRight(put(root.getRight(), key, data));
		else if(root.getKey() < key)
			root.setLeft(put(root.getLeft(), key, data));
		return null;
	}
}
