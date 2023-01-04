import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Tomato{
	
	private int x;
	private int y; 
	
	Tomato(int x, int y){
		this.x = x;
		this.y =y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
}

public class Test {

	static int n,m;
	static int[][] graph;
	public static int dx[] = {-1,1,0,0};
	public static int dy[] = {0,0,-1,1};
	static Queue<Tomato> queue;
	int count =0;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		graph = new int[n][m];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				graph[i][j] = sc.nextInt();
				
				if(graph[i][j] == 1) {
					queue.add(new Tomato(i,j));
				}
				
			}
		}
		
		System.out.println(bfs());

	}//main()
	
	static int bfs(){
		
		while(!queue.isEmpty()) {
			Tomato to1 =  queue.poll();
			int x = to1.getX();
			int y = to1.getY();
			
			for(int i=0;i<4;i++) {
				int nx = x+ dx[i];
				int ny = y+ dy[i];
				
				if(nx <0 || ny <0 || nx >= n || ny >y) {
					
				}
				
			}
		}

		
		return 1;
		
	}//bfs()
	

}//class
