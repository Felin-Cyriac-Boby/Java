public class RightTriangle{
	public static void main(String[] args){
		long a = Integer.parseInt(args[0]);
		long b = Integer.parseInt(args[1]);
		long c = Integer.parseInt(args[2]);
		boolean c1 = a>0 && b>0 && c>0;
		boolean c2 = a*a + b*b == c*c;
		boolean c3 = a*a + c*c == b*b;
		boolean c4 = b*b + c*c == a*a;
		System.out.println(c1&&c2 || c1&&c3 || c1&&c4);
	}
}