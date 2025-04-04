package examOne;

public class DoublyLinkedList {
	private DoublyLinkedNode beginning;
	private DoublyLinkedNode end; 
	private int size; 
	private int count;
	
	public DoublyLinkedList() {
		this.beginning = null;
		this.end = null;
		this.size = 0;
	}
	
	public void addToBeginning(int data) {
		if(size == 0) {
			DoublyLinkedNode node = new DoublyLinkedNode(data, null, null);
			beginning = node;
			end = node;
		}
		else {
			DoublyLinkedNode node = new DoublyLinkedNode(data, null, beginning);
			beginning.setPrev(node);
			beginning = node;
		}
		size++;
	}
	
	public void addToEnd(int data) {
		if(size == 0) {
			DoublyLinkedNode node = new DoublyLinkedNode(data, null, null);
			beginning = node;
			end = node;
		}
		else {
			DoublyLinkedNode node = new DoublyLinkedNode(data, end, null);
			end.setLink(node);
			end = node;
		}
		size++;
	}
	
	public String toString() {
		String result = "";
		count = 0;
		DoublyLinkedNode node = beginning;
		while(node != null) {
			if(count == 0) {
				result += node.getData();
			}
			else {
				result += ", " + node.getData();
			}
			node = node.getLink();
			count++;
		}
		return result;
	}
}
