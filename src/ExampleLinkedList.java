import java.util.function.Predicate;

public class ExampleLinkedList {

	Node head;

	ExampleLinkedList(Node head) {
		this.head = head;
	}

	static class Node {
		int data;
		Node next;

		Node(int data, Node next) {
			this.data = data;
			this.next = next;
		}

		boolean isEven() {
			if (data % 2 == 0) {
				return true;
			}
			return false;
		}
	}

	ExampleLinkedList filter(Predicate<Node> p) {
		Node newHead = new Node(0, head);
		Node cursor = newHead;
		while (cursor.next != null) {
			if (p.test(cursor.next)) {
				cursor = cursor.next;
			} else {
				Node next = cursor.next;
				cursor.next = next.next;
			}
		}
		return new ExampleLinkedList(newHead.next);
	}

	void add(int data) {
		Node newNode = new Node(data, null);
		Node cursor = head;
		while (cursor.next != null) {
			cursor = cursor.next;
		}
		cursor.next = newNode;
	}

	public static void main(String[] args) {
		ExampleLinkedList linkedList = new ExampleLinkedList(new Node(0, new Node(4, new Node(6, new Node(3, null)))));
		System.out.println(linkedList);
		linkedList.add(10);
		linkedList.add(25);
		linkedList.add(30);
		System.out.println(linkedList);
		
		Predicate<Node> isEven = new Predicate<Node>() {
			@Override
			public boolean test(Node node) {
				return node.isEven();
			}
		};
		System.out.println(linkedList.filter(isEven));
	}

	@Override
	public String toString() {
		StringBuilder result = new StringBuilder("[");
		Node cursor = head;
		while (cursor != null) {
			result.append(cursor.data);
			if (cursor.next != null) {
				result.append(",");
			}
			cursor = cursor.next;
		}
		result.append("]");
		return result.toString();
	}

}
