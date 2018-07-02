package AlgebraicExpression;

public class AlgebraicExpression {

	public static void main(String[] args) {
		
		final double x = 2;
		final double a = 3;
		double y = 0;
		
		
		System.out.println("Evaluating \"y = ax^3 + 7 \" where x = " + x + " and a = " + 3);
		y = a*x*x*x+7;
		System.out.println("y = a* x * x * x + 7 sets y to		:" + y);
		y = a*x*x*(x+7);
		System.out.println("y = a* x * x * (x + 7) sets y to		:" + y);
		y = (a*x)*x*(x+7);
		System.out.println("y = (a* x) * x * (x + 7) sets y to		:" + y);
		y = (a*x)*x*x+7;
		System.out.println("y = (a* x) * x * x + 7 sets y to		:" + y);
		y = a*(x*x*x)+7;
		System.out.println("y = a* (x * x * x) + 7 sets y to		:" + y);
		y = a*x*(x*x+7);
		System.out.println("y = a* x * (x * x + 7) sets y to		:" + y);
		y = a*Math.pow(x,3)+7;
		System.out.println("y = a* x^3 + 7 sets y to		:" + y);
	}

}
