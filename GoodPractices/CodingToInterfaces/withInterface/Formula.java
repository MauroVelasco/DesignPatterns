import java.util.ArrayList;

class Formula {
	
	public static void printArea(ArrayList<Figure> figures){
		
		for(Figure figure : figures){
			System.out.printf("Area of %s : %.2f\n", figure.getClass() , figure.area());
		}

	}

}
