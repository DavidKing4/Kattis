import java.lang.Integer;
import java.util.Comparator;
import java.util.LinkedList;

public class IntegerLLComparator implements Comparator<LinkedList<Integer>>{
	public int compare(LinkedList<Integer> l1, LinkedList<Integer> l2){
		if(l1.size() != l2.size() || l1 == null){
			return(l1.size() - l2.size());
		}
		return(l1.peek() - l2.peek());
	}
}