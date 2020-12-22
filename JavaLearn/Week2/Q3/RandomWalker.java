public class RandomWalker{
	public static void main(String[] args){
		int r = Integer.parseInt(args[0]);
		int x = 0;
		int y = 0;
		int steps = 0;
		System.out.println("("+x+","+y+")");
		while((Math.abs(x)+Math.abs(y))!=r){
			double p = Math.random();
			
			if(p>=0 && p<0.25){
				y = y + 1;
				System.out.println("("+x+","+y+")");
			}
			else if(p>=0.25 && p<0.5){
				y = y - 1;
				System.out.println("("+x+","+y+")");
			}
			else if(p>=0.5 && p<0.75){
				x = x + 1;
				System.out.println("("+x+","+y+")");
			}
			else{
				x = x - 1;
				System.out.println("("+x+","+y+")");
			}
			steps = steps + 1;
		}
		System.out.println("steps = "+steps);
		
	}
}