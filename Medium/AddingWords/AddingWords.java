import java.util.Scanner;
import java.util.ArrayDeque;

public class AddingWords{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		WordNumber[] a = new WordNumber[2001];
		int p = 0;
		while(s.hasNext()){
			String[] cmd = s.nextLine().split(" ");
			int l = cmd.length;
			if(cmd[0].compareTo("def") == 0){
				int i = 0;
				while(i < p){
					if(a[i].compareString(cmd[1]) == 0){
						a[i].number = Integer.parseInt(cmd[2]);
						break;
					}
					i++;
				}
				if(i == p){
					WordNumber t = new WordNumber(cmd[1], Integer.parseInt(cmd[2]));
					a[p] = t;
					p++;
				}
			}else if(cmd[0].compareTo("calc") == 0){
				int total = 0;
				int i = 0;
				int c = 0;
				while(i < p && c < (l-1)/2){
					for(int j = 0; j < (l-1)/2; j++){
						if(a[i].compareString(cmd[(j * 2) + 1]) == 0){
							if(j == 0 || cmd[j * 2].compareTo("+") == 0){
								total += a[i].number;
							}else if(cmd[j * 2].compareTo("-") == 0){
								total -= a[i].number;
							}
							c++;
						}
					}
					i++;
				}
				for(int j = 1; j < l; j++){
					System.out.print(cmd[j] + " ");
				}
				if(i == p && c < (l-1)/2){
					System.out.println("unknown");
				}else{
					int j = 0;
					while(j < p){
						if(a[j].number == total){
							System.out.println(a[j].word);
							break;
						}
						j++;
					}
					if(j == p){
						System.out.println("unknown");
					}
				}
			}else if(cmd[0].compareTo("clear") == 0){
				p = 0;
			}
		}
	}	
}