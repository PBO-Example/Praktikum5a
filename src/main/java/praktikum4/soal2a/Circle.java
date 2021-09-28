//Circle.java
package praktikum4.soal2a;
public class Circle extends Shape {
	private Point p;
	private int diameter;
	public static double PI=3.14;
	public Circle() {
		super("Circle");
		p = new Point(0,0);
		diameter= 1;
	}
	public Circle(Point varPoint, int varDiamter) {
		super("Circle");
		p = new Point(varPoint);
		diameter= varDiamter;
	}
	public Circle(Circle c) {
		super("Circle");
		p = new Point(c.p);
		diameter= c.diameter;
	}
	public void setP(Point varP) {
		p.setAbsis(varP.getAbsis());
		p.setOrdinat(varP.getOrdinat());
	}
	
	public void setDiameter(int varDiameter) {
		diameter = varDiameter;
	}
	public Point getP() {
		return p;
	}
	
	public int getDiameter() {
		return diameter;
	}
	//override
	public double getArea() {
		return (PI*Math.pow((double)diameter/2, 2));
	}

	//override
	public double getCircumference() {
		return (2*PI*((double)diameter/2));
	}

	//override
	public  String toString() {
		return(
				"\n" + getName() + 
				" with :\n\tPoint : " + p +
				"\n\tDiameter  : " + diameter +
				"\n\tLuas : " + getArea() +
				"\n\tKeliling : " + getCircumference()
		);
	}
	/*Praktikum5 Latihan 1*/
	/*Isi method clone() akan mengclone objek Circle this.*/
	/*Sebagai referensi, lihat method clone() pada kelas Point.*/
	//Override method clone() di sini
	
	
	//method ini tidak boleh dihapus atau diubah
	public boolean equals(Object obj){
		if (obj instanceof Circle){
			Circle cir = (Circle) obj;
			return (getName().equalsIgnoreCase(cir.getName())&& getP().equals(cir.getP()) && getDiameter() == cir.getDiameter()&&PI==cir.PI);
		}
		return false;
	}
	
}
