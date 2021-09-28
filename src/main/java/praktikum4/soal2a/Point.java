//Point.java
package praktikum4.soal2a;
public class Point{
	//attributes
	private int x;
	private int y;
	
	//constructor;
	public Point(){
		x = 0;
		y = 0;
	}
	
	public Point(int newX, int newY){
		x = newX;
		y = newY;
	}
	
	public Point(Point P){
		x = P.getAbsis();
		y = P.getOrdinat();
	}
	
	//setter
	public void setAbsis(int newX){
		x = newX;
	}
	public void setOrdinat(int newY){
		y = newY;
	}
	
	//getter
	public int getAbsis(){
		return x;
	}
	public int getOrdinat(){
		return y;
	}
	
	public String toString(){
		return ("("+x+","+y+")");
	}
	public boolean equals(Object obj){
		if (obj instanceof Point){
			Point p = (Point) obj;
			return (getAbsis() == p.getAbsis() && getOrdinat() == p.getOrdinat());
		}
		return false;
	}
	/*Overriding method clone yang diwariskan oleh kelas Object*/
	/*Cloning object Point dapat dilakukan dengan tiga cara,*/
	/*Cara I: menggunakan copy contructor dari kelas Point, dengan syarat isi dari copy constructor bukan dynamic aliasing.*/
	/*Cara II: menggunakan contructor dengan parameter dari kelas Point. Kelas Point bukan kelas yang memiliki kelas lain sebagi atribut, jadi tidak mungkin terjadi dynamic aliasing*/
	/*Cara III: cloning dengan create objek poin baru dan mengcopy nilai atribut objek this ke objek baru.*/
	public Object clone(){
		//Point p = new Point(this);
		//Point p = new Point(x, y);
		Point p = new Point();
		p.setAbsis(x);
		p.setOrdinat(y);
		return p;
	}
}