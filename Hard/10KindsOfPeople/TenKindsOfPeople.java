import java.util.*;

public class TenKindsOfPeople{
	public static void main(String[] args){
		Kattio io = new Kattio(System.in, System.out);
		int n = io.getInt();
		int m = io.getInt();
		String[] map = new String[n];

		for(int i = 0; i < n; i++){
			map[i] = io.getWord();
		}

		int o = io.getInt();
		for(int i = 0; i < o; i++){
			int y1 = io.getInt();
			int x1 = io.getInt();
			int y2 = io.getInt();
			int x2 = io.getInt();

			io.println(magicFunc(map, n, m, x1 - 1, y1 - 1, x2 - 1, y2 - 1));
			io.flush();
		}
	}

	public static String magicFunc(String[] map, int n, int m, int x1, int y1, int x2, int y2){
		if(map[y1].charAt(x1) != map[y2].charAt(x2)){
			return "neither";
		}
		int[][] d = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
		char c = map[y1].charAt(x1);
		boolean[][] visited = new boolean[n][m];
		ArrayDeque<int[]> q = new ArrayDeque<int[]>();
		int[] t = {x1, y1};
		q.add(t);


		while(q.peek() != null){
			t = q.poll();
			for(int i = 0; i < 4; i++){
				if((t[0] + d[i][0] >=  0) && (t[0] + d[i][0] < m) && (t[1] + d[i][1] >=  0) && (t[1] + d[i][1] < n)){
					if(t[0] + d[i][0] == x2 && t[1] + d[i][1] == y2){
						if(c == '1'){
							return "decimal";
						}else if(c == '0'){
							return "binary";
						}
					}
					if(!visited[t[1] + d[i][1]][t[0] + d[i][0]] && map[t[1] + d[i][1]].charAt(t[0] + d[i][0]) == c){
						int[] s = {t[0] + d[i][0], t[1] + d[i][1]};
						q.add(s);
						visited[t[1] + d[i][1]][t[0] + d[i][0]] = true;
					}
				}
			}
		}
		return "neither";
	}
}