
public class BTreeNode {
	private int key;
	private Place place;
	private BTreeNode left;
	private BTreeNode right;
	
	public BTreeNode(int key, Place place, BTreeNode left, BTreeNode right) {
		super();
		this.key = key;
		this.place = place;
		this.left = left;
		this.right = right;
	}

	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}

	public Place getPlace() {
		return place;
	}

	public void setPlace(Place place) {
		this.place = place;
	}

	public BTreeNode getLeft() {
		return left;
	}

	public void setLeft(BTreeNode left) {
		this.left = left;
	}

	public BTreeNode getRight() {
		return right;
	}

	public void setRight(BTreeNode right) {
		this.right = right;
	}
}
