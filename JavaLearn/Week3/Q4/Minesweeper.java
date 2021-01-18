public class Minesweeper {
	public static void main(String[] args) {
		int m = Integer.parseInt(args[0]);
		int n = Integer.parseInt(args[1]);
		int k = Integer.parseInt(args[2]);
		boolean[][] arr = new boolean[m][n];
		int count = 0;
		while (count < k) {
			int x = (int) (Math.random()*m);
			int y = (int) (Math.random()*n);
			if (!arr[x][y]) {
				arr[x][y] = true;
				count = count + 1;
			}
		}
		
		for (int x = 0; x < arr.length; x++) {
			for( int y = 0; y < arr[x].length; y++) {
				count = 0;
				if (arr[x][y]) {
					System.out.print("*"+"  ");
					
				}
				else {
					
					int[] p1 = {x-1,y-1};
					int[] p2 = {x-1,y+1};
					int[] p3 = {x+1,y-1};
					int[] p4 = {x+1,y+1};
					int[] p5 = {x-1,y};
					int[] p6 = {x+1,y};
					int[] p7 = {x,y+1};
					int[] p8 = {x,y-1};
					int[][] points = {p1,p2,p3,p4,p5,p6,p7,p8};
					for (int i = 0; i < points.length; i++) {
						boolean check_1 = points[i][0] >= 0 && points[i][0] < m;
						boolean check_2 = points[i][1] >= 0 && points[i][1] < n;
						if (check_1 && check_2) {
							
							int row = points[i][0];
							int col = points[i][1];
							
							if (arr[row][col]) {
								count = count + 1;
							}
						}
					}
					System.out.print(count+"  ");
					
				}
			}
			System.out.println("");
		}
	}
}


	
