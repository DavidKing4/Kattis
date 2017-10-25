import java.util.Arrays;

public class Classy{
	public static void main(String[] args){
		Kattio io = new Kattio(System.in, System.out);
		int n = io.getInt();
		for(int i = 0; i < n; i++){
			int m = io.getInt();
			Person[] personArray = new Person[m];
			for(int j = 0; j < m; j++){
				Person t = new Person();
				t.setName(io.getWord());
				t.getClass(io.getWord());
				io.getWord();
				personArray[j] = t;
			}
			Arrays.sort(personArray);
			for(int j = 0; j < personArray.length; j++){
				


				io.println(personArray[j].name);

				io.flush();	
			}
			io.println("==============================");
			io.flush();
		}
	}
}