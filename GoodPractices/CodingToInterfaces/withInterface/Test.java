import java.util.ArrayList;

class Test{
	public static void main(String args[]){
		System.out.println("Formulas:");
		
		ArrayList<Figure> figures = new ArrayList<Figure>();
		
		Figure triangle = new Triangle(7,3);
		Figure circumference = new Circumference(9);
		figures.add(triangle);
		figures.add(circumference);
		
		Formula.printArea(figures);
	}
}
