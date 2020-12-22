public class RandomWalkers{
	public static void main(String[] args){
		int r = Integer.parseInt(args[0]);
		long trials = Long.parseLong(args[1]);
		
		long count = 0;
		for (long i = 1; i<=trials; i++){
			int x = 0;
			int y = 0;
			int steps = 0;
			while((Math.abs(x)+Math.abs(y))!=r){
			double p = Math.random();
			if(p>=0 && p<0.25){
				y = y + 1;
				
			}
			else if(p>=0.25 && p<0.5){
				y = y - 1;
				
			}
			else if(p>=0.5 && p<0.75){
				x = x + 1;
				
			}
			else{
				x = x - 1;
				
			}
			steps = steps + 1;
			}
			count = steps + count;
		}
		System.out.println("average number of steps = "+(double)count/trials);
			
	}
}
			