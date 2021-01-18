public class Birthday {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int t = Integer.parseInt(args[1]);
		boolean[] dates = new boolean[n+1];
		int[] people = new int[n+2];
		for (int j = 0; j < t; j++) {
			for (int i = 1; i <= n; i++) {
				int date =  (int) (Math.random()*n+0.5);
				
				if (!dates[date]) {
					
					dates[date] = true;
					
					
				}
				else {
					people[i] = people[i] + 1;
					break;
				}
			}
			dates = new boolean[n+1];
		}
		
		double count = 0;
		for (int i = 1; i < people.length; i++) {
			count = count + people[i];	
			
			System.out.println(i+"\t"+people[i]+"\t"+count/t);
			if ((double)(count/t) > 0.5) {
				break;
			}
		}
	}
}