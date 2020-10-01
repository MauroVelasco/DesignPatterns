class Test{
	
	public static void main(String args[]){
		System.out.println("Formulas:");

		Triangle triangle = new Triangle(7,3);

		Formula formula = new Formula();
		formula.print(triangle);
	}
}
