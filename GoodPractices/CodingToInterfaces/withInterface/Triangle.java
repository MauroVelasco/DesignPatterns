class Triangle implements Figure {
	private float base;
	private float height;

	Triangle(float base, float height){
		this.base = base;
		this.height = height;
	}
	
	public float area(){
		return this.base * this.height / 2;
	}
}
