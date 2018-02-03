public class FastLL{
	public Link head;
	public Link ass;
	public int length;

	public void FastLL(Link l){
		this.head = l;
		this.ass = l;
		length = 1;
	}

	public int pop(){
		int n = head.value;
		head = head.p;
		length--;
		return n;
	}

	public void add(Link l){
		this.ass.p = l;
		this.ass = l;
		length++;
	}
}