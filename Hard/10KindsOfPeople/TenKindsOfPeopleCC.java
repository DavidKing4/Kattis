import java.util.ArrayDeque;

public class TenKindsOfPeopleCC{
	public static void main(String[] args){
		Kattio io = new Kattio(System.in, System.out);
		int m = io.getInt();
		int n = io.getInt();
		char[][][] map = new char[n][m][2];

		for(int j = 0; j < m; j++){
			String t = io.getWord();
			for(int i = 0; i < n; i++){
				map[i][j][0] = t.charAt(i);
			}
		}

		int cnum = 0;
		for(int j = 0; j < m; j++){
			for(int i = 0; i < n; i++){
				if(map[i][j][1] == '\u0000'){
					FF(map, i, j, cnum, n, m);
					cnum++;
				}
			}
		}

		int p = io.getInt();
		for(int i = 0; i < p; i++){
			int y1 = io.getInt() - 1;
			int x1 = io.getInt() - 1;
			int y2 = io.getInt() - 1;
			int x2 = io.getInt() - 1;

			if(map[x1][y1][1] == map[x2][y2][1]){
				if(map[x1][y1][0] == '0'){
					io.println("binary");
				}else{
					io.println("decimal");
				}
			}else{
				io.println("neither");
			}
			io.flush();
		}
	}

	public static void FF(char[][][] map, int x, int y, int cnum, int n, int m){
		int[][] d = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
		boolean[][] visited = new boolean[n][m];
		char c = map[x][y][0];
		ArrayDeque<int[]> q = new ArrayDeque<int[]>();
		int[] t = {x, y};
		map[x][y][1] = (char)cnum;
		q.add(t);

		while(q.peek() != null){
			t = q.poll();
			for(int i = 0; i < 4; i++){
				if((t[0] + d[i][0] >=  0) && (t[0] + d[i][0] < n) && (t[1] + d[i][1] >=  0) && (t[1] + d[i][1] < m)){
					if(!visited[t[0] + d[i][0]][t[1] + d[i][1]] && map[t[0] + d[i][0]][t[1] + d[i][1]][0] == c){
						int[] s = {t[0] + d[i][0], t[1] + d[i][1]};
						map[t[0] + d[i][0]][t[1] + d[i][1]][1] = (char)cnum;
						q.add(s);
						visited[t[0] + d[i][0]][t[1] + d[i][1]] = true;
					}
				}
			}
		}
		return;
	}
}