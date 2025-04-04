package examOne;

public class DoublyLinkedNode {
	private int data;
	private DoublyLinkedNode prev; 
	private DoublyLinkedNode link; 
	private int count;
	
	public DoublyLinkedNode(int data, DoublyLinkedNode prev, DoublyLinkedNode link) {
		this.data = data;
		this.prev = prev;
		this.link = link;
	}
	
	public int getData() {
		return this.data;
	}
	
	public void setData(int data) {
		this.data = data;
	}
	
	public DoublyLinkedNode getPrev() {
		return this.prev;
	}
	
	public void setPrev(DoublyLinkedNode prev) {
		this.prev = prev;
	}
	
	public DoublyLinkedNode getLink() {
		return this.link;
	}
	
	public void setLink(DoublyLinkedNode link) {
		this.link = link;
	}
	
	public void addBefore(int data) {
		if(this.getPrev() == null) {
			this.prev = new DoublyLinkedNode(data, this.getPrev(), this);
		}
		else{
			DoublyLinkedNode node = new DoublyLinkedNode(data, this.getPrev(), this);
			DoublyLinkedNode previous = this.getPrev();
			previous.setLink(node);
			this.setPrev(node);
		}
	}
	
	public void addAfter(int data) {
		DoublyLinkedNode node = new DoublyLinkedNode(data, this, this.link);
		if(this.link != null) {
			this.link.setPrev(node);	
		}
		else {
			this.link = new DoublyLinkedNode(data, this, null);
		}
		this.setLink(node);
	}
	
	public void remove() {
		if(this.link == null && this.prev != null){
			this.prev.link = null;
		}
		else if(this.prev == null && this.link != null) {
			this.data = this.link.data;
			this.link = this.link.link;
		}
		else if(this.prev != null && this.link != null) {
			this.prev.link = this.link;
			this.link.prev = this.prev;
		}
		else {
			this.data = -1;
			this.prev = null;
			this.link = null;
		}
	}
	
	public String toString() {
		String out = "";
		if(this.data < 0 && this.link == null && count == 0) {
			out += "<empty list>";
		}
		else if (data >= 0){
			out += this.data;
		}
		if(this.link != null) {
			out += " " + this.link.toString();
			count++;
		}
		else {
			count = 0;
		}
		return out;
	}
}
