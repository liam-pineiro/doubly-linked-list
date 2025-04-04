package examOne;

public class ExamOne {
	
	public static void main(String[] args) {
		int[] numbers = {10, 15, 35, 67, 89, 101};
		
		DoublyLinkedList inOrder = placeNumbers(numbers);
		System.out.println(inOrder.toString());
		
		DoublyLinkedList reverse = placeReverse(numbers);
		System.out.println(reverse.toString());
	}
	
	public static DoublyLinkedList placeReverse(int[] array) {
		DoublyLinkedList list = new DoublyLinkedList();
		for(int i = 0; i < array.length; i++) {
			list.addToBeginning(array[i]);
		}
		return list;
	}
	
	public static DoublyLinkedList placeNumbers(int[] array) {
		DoublyLinkedList list = new DoublyLinkedList();
		for(int i = 0; i < array.length; i++) {
			list.addToEnd(array[i]);
		}
		return list;
	}
}
