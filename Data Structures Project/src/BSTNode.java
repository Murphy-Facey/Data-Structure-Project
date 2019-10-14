
public class BSTNode {
	private float key;
	private Place data;
	private BSTNode right, left;
	
	public BSTNode(float key, Place data) {
		this(key, data, null, null);
	}
	
	public BSTNode(float key, Place data, BSTNode right, BSTNode left) {
		super();
		this.key = key;
		this.data = data;
		this.right = right;
		this.left = left;
	}

	public float getKey() {
		return key;
	}

	public void setKey(float key) {
		this.key = key;
	}

	public Place getData() {
		return data;
	}

	public void setData(Place data) {
		this.data = data;
	}

	public BSTNode getRight() {
		return right;
	}

	public void setRight(BSTNode right) {
		this.right = right;
	}

	public BSTNode getLeft() {
		return left;
	}

	public void setLeft(BSTNode left) {
		this.left = left;
	}
}
