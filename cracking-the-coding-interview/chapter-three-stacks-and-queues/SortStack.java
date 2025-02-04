/* write a program to sort a stack in ascending order (with biggest items on top).
 * you may use at most one additional stack to hold items, but you may not copy the
 * elements into any other data strcuture (such as an array). The stack supports the
 * folowing operations: push, pop, peek, and isEmpty */
import java.util.ArrayDeque;
import java.util.Deque;
class SortStack {
	public static Deque<Integer> sort(Deque<Integer> s) {
		Deque<Integer> r = new ArrayDeque<Integer>();
		while(!s.isEmpty()) {
			int tmp = s.pop(); //step 1
			while(!r.isEmpty() && r.peek() > tmp) { //step 2
				s.push(r.pop());
			}
			r.push(tmp); //step 3
		}
		return r;
	}
}