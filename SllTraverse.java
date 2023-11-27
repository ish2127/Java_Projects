public class SllTraverse {

      …

 

      public int traverse() {

            int sum = 0;

            SinglyLinkedListNode current = head;

            SinglyLinkedListNode previous = null;

            while (current != null) {

                  sum += current.value;

                  previous = current;

                  current = current.next;

            }

            return sum;

      }

}