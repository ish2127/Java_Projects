import java.util.*;

class Node {
int key;
Node next;

Node(int key) {
	this.key = key;
	this.next = null;
}
}

class Main
{


static void push(Node[] head_ref, int new_key) {
	Node new_node = new Node(new_key);
	new_node.next = head_ref[0];
	head_ref[0] = new_node;
}

public static void main(String[] args) {
	Node[] head = new Node[1];
	int x = 21;

	// Use push() to construct below list 14->21->11->30->10
	push(head, 10);
	push(head, 30);
	push(head, 11);
	push(head, 21);
	push(head, 14);

	// Create a vector of integers from the linked list and search for the value x in the vector using an iterator.
	Vector<Integer> v = new Vector<Integer>();
	Node temp = head[0];
	while (temp != null) {
	v.add(temp.key);
	temp = temp.next;
	}

	int it = v.indexOf(x);
	if (it == -1) {
	System.out.println("NO");
	} else {
	System.out.println("YES");
	}
}
}
