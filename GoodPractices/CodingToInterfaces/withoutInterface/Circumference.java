class Circumference {
	private float radius;

	Circumference(float radius){
		this.radius = radius;
	}

	public float area(){
		return (float)Math.PI * this.radius * this.radius;
	}
}
