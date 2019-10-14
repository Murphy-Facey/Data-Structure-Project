
public class RequestNode {
	private RequestNode link;
	private Request data;
	
	public RequestNode() {
		this(null, null);
	}
	
	public RequestNode(RequestNode link, Request data) {
		super();
		this.link = link;
		this.data = data;
	}

	public RequestNode getLink() {
		return link;
	}

	public void setLink(RequestNode link) {
		this.link = link;
	}

	public Request getData() {
		return data;
	}

	public void setData(Request data) {
		this.data = data;
	}
}
