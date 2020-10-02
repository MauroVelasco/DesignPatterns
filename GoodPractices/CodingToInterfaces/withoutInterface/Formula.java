class Formula {
	
	public void print(Triangle triangle, Circumference circumference){

		System.out.printf("Area of %s : %.2f\n", triangle.getClass() , triangle.area());
		System.out.printf("Area of %s : %.2f\n", circumference.getClass() , circumference.area());

	}

}
