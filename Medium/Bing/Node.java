public class Node{

public int x;
public Node[] children;

	public Node(){
		this.x = 0;
		this.children = new Node[26];
	}

	public int update(String s){
		x++;
		if(s.length() == 0){
			return x;
		}
		if(children[(int)s.charAt(0) - 97] == null){
			Node n = new Node();
			children[(int)s.charAt(0) - 97] = n;
		}
		return children[(int)s.charAt(0) - 97].update(s.substring(1, s.length()));
	}
}