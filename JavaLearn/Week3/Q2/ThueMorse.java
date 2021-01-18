public class ThueMorse {
	public static void main(String[] args) {
		int n = 1;
		int m = Integer.parseInt(args[0]);
		while (n < m) {
			n = n*2;
		}
		boolean[] arr = new boolean[n];
		for (int i = 1; i < arr.length; i = i*2) {
			for (int j = 0; j < i; j++) {
				if (arr[j]) {
					arr[i+j] = false;
				}
				else {
					arr[i+j] = true;
				}
			}
		}
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < m; j++) {
				if (arr[i] == arr[j]) {
					System.out.print("+" +"  ");
				}
				else {
					System.out.print("-"+"  ");
				}
			}
			System.out.println("");
		}
	
	}
}

