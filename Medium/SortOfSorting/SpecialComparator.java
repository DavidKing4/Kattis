import java.util.Comparator;

public class SpecialCompare implements Comparator{
	
	@Override
	public int compare(String s1, String s2){
		if(S1.charAt(0) != S2.charAt(0)){
			return ((int)S1.charAt(0) - (int)S2.charAt(0))
		}
		if(S1.charAt(1) != S2.charAt(1)){
			return ((int)S1.charAt(1) - (int)S2.charAt(1))
		}
		return 1;
	}
}