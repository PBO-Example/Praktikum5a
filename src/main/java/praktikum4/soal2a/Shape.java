//Shape.java;
package praktikum4.soal2a;
public class Shape {
	protected String name;
	
	public Shape(String newName){
		name = newName;
	}
	//mengembalikan nama dari objek
	protected  String getName() {
		return name;
	}
	
	protected void setName(String newName) {
		 name = newName;
	}
	/*Praktikum5 Latihan 3*/
	/*Isi method clone() akan mengclone objek Shape this.*/
	/*Sebagai referensi, lihat method clone() pada kelas Point.*/
	//Override method clone() di sini.
	
	
	
	//method ini tidak boleh dihapus atau diubah
	public boolean equals(Object obj){
		if (obj instanceof Shape){
			Shape sha = (Shape) obj;
			return (getName().equalsIgnoreCase(sha.getName()));
		}
		return false;
	}
}
