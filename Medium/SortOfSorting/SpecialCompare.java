import java.util.Comparator;
import java.lang.Character;

public class SpecialCompare implements Comparator<String>{
	
	@Override
	public int compare(String s1, String s2){

		if(s1.charAt(0) != s2.charAt(0)){
			return((int)s1.charAt(0) - (int)s2.charAt(0));
		}

		if(s1.charAt(1) != s2.charAt(1)){
			return((int)s1.charAt(1) - (int)s2.charAt(1));
		}

		return 0;
	}
}