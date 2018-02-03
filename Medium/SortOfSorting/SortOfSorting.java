import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class SortOfSorting{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		while(n != 0){
			s.nextLine();
			String[] Names = new String[n];
			for(int i = 0; i < n; i++){
				Names[i] = s.nextLine();
			}
			Comparator<String> c = new SpecialCompare();
			Arrays.sort(Names, c);
			for(int i = 0; i < n; i++){
				System.out.println(Names[i]);
			}
			if((n = s.nextInt()) != 0){
				System.out.println();
			}
		}
	}
}
