public class EightQueens{
	public static void main(String[] args){
		Kattio io = new Kattio(System.in, System.out);
		int[][] queens = new int[8][2];
		int p = 0;
		String temp;
		for(int i = 0; i < 8; i++){
			temp = io.getWord();
			for(int j = 0; j < 8; j++){
				if(temp.charAt(j) == '*'){
					io.flush();
					queens[p][0] = i;
					queens[p][1] = j;
					p++;
				}
			}
		}
		Solve(queens, io);
	}

	private static void Solve(int[][] queens, Kattio io){
		int t;
		for(int i = 0; i < 8; i++){
			for(int j = i + 1; j < 8; j++){
				if(queens[i][0] == queens[j][0]){
					io.println("invalid");
					io.flush();
					return;
				}
				if(queens[i][1] == queens[j][1]){
					io.println("invalid");
					io.flush();
					return;
				}
			}
		}
		for(int i = 0; i < 8; i++){
			for(int j = i + 1; j < 8; j++){
				t = queens[i][0] - queens[j][0];
				if(queens[i][1] == queens[j][1] + t){
					io.println("invalid");
					io.flush();
					return;
				}
				if(queens[i][1] == queens[j][1] - t){
					io.println("invalid");
					io.flush();
					return;
				}
			}
		}
		System.out.println("valid");
	}
}