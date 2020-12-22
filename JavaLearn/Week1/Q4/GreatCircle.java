public class GreatCircle{
	public static void main(String[] args){
		double x1 = Double.parseDouble(args[0]);
		double y1 = Double.parseDouble(args[1]);
		double x2 = Double.parseDouble(args[2]);
		double y2 = Double.parseDouble(args[3]);
		double X1 = Math.toRadians(x1);
		double Y1 = Math.toRadians(y1);
		double X2 = Math.toRadians(x2);
		double Y2 = Math.toRadians(y2);
		double distance = 2*6371*Math.asin(Math.sqrt(Math.sin((X2-X1)/2)*Math.sin((X2-X1)/2) + Math.cos(X1)*Math.cos(X2)*Math.sin((Y2-Y1)/2)*Math.sin((Y2-Y1)/2)));
		System.out.println(distance + " kilometers");
	}
}