public class DiscreteDistribution {
	public static void main(String[] args) {
		int m = Integer.parseInt(args[0]);
		int[] cumu = new int[args.length-1];
		
		int sum = 0;
		for (int i = 1; i < args.length; i++) {
			sum = sum + Integer.parseInt(args[i]);
			cumu[i-1] = sum;
		}
		int max = cumu[cumu.length-1];
		for (int i = 0; i < m; i++) {
			int r = (int) (Math.random()*max);
			for (int j = 0; j < cumu.length; j++) {
				if (r < cumu[j]) {
					System.out.print((j+1) +" ");
					break;
				}
			} 
		}
	}
}