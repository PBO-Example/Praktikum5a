//Rectangle.java
package praktikum4.soal2a;
public class Rectangle extends Shape {
	private Point p1;
	private Point p2;

	
	public Rectangle(){
		super( "Rectangle");
		p1 = new Point();
		p2 = new Point();
	}

	
	public Rectangle(Point varPoint1, Point varPoint2){
		super( "Rectangle");
		p1 = new Point(varPoint1);
		p2 = new Point(varPoint2);
	}

	
	public Rectangle(Rectangle r){
		super( "Rectangle");
		p1 = new Point(r.getP1());
		p2 = new Point(r.getP2());
	}

	//setter
	public void setP1(Point varPoint1){
		p1.setAbsis(varPoint1.getAbsis());
		p1.setOrdinat(varPoint1.getOrdinat());
	}
	public void setP2(Point varPoint2){
		p2.setAbsis(varPoint2.getAbsis());
		p2.setOrdinat(varPoint2.getOrdinat());
	}

	//getter
	public Point getP1(){
		return p1;
	}
	public Point getP2(){
		return p2;
	}

	
	public int getWidth(){
		return Math.abs(getP1().getAbsis() - getP2().getAbsis());
	}

	public int getHeight(){
		return Math.abs(getP1().getOrdinat() - getP2().getOrdinat());
	}
	
	//override abstract method
	//mengembalikan luas Rectangle dalam type double
	public double getArea(){
		return  ((double)getWidth() * getHeight());
	}

	//mengembalikan keliling Rectangle dalam type double
	public double getCircumference(){
		return  ((double)2 * (getWidth() + getHeight()));
	}

	//menampilkan informasi Rectangle ke console
	public String toString(){
		return(
			"\n" + getName() + 
			" with :\n\tPoint P1: " + p1 +
			"\n\tPoint P2: " + p2 +
			"\n\twidth : " + getWidth() +
			"\n\theight : " + getHeight() +
			"\n\tLuas : " + getArea() +
			"\n\tKeliling : " + getCircumference()
		);
	}
	/*Praktikum5 Latihan 2*/
	/*Isi method clone() akan mengclone objek Rectangle this.*/
	/*Sebagai referensi, lihat method clone() pada kelas Point.*/
	//Override method clone() di sini.
	
	
	
	
	//method ini tidak boleh dihapus atau diubah
	public boolean equals(Object obj){
		if (obj instanceof Rectangle){
			Rectangle rec = (Rectangle) obj;
			return (getName().equalsIgnoreCase(rec.getName()) &&getP1().equals(rec.getP1()) && getP2().equals(rec.getP2()));
		}
		return false;
	}
	
}
