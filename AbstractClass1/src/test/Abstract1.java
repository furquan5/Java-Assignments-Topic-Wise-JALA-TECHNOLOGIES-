package test;
public abstract class Abstract1 {
	public double x,z;
	public Abstract1(double x) {
		this.x=x;
	}
	public void cal() {
		z=Math.pow(x,3);
	}
	public abstract void dis();

}
