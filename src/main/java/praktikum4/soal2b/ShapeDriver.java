/*ShapeDriver.java*/
package praktikum4.soal2b;
import praktikum4.soal2a.*;
import java.util.Scanner;
public class ShapeDriver {
	
	final static int MAX_EL=5;
	static int nbEl=0;
	
	public static Rectangle createRectangle(int a,int b, int c, int d){
		return new Rectangle(new Point(a,b), new Point(c,d));
	}
	public static Circle createCircle(int a,int b, int c){
		return new Circle(new Point(a,b), c);
	}
	
	/*Praktikum5 Latihan 4*/
	//Realisasikan (tulis kode program) method addElement() di sini, yang dapat
	//menambah elemen  pada suatu array of shape, selama array of shape tersebut 
	//belum penuh (nbEl < MAX_EL)
	
	
	
	/*Praktikum5 Latihan 5*/
	//Realisasikan (tulis kode program) method setElement() di sini, yang dapat
	//mengubah isi elemen pada suatu array of shape pada index tertentu, selama //index masih valid (dalam rentang 0 sampai dengan ukuran array of shape).
	
	
	
	/*Praktikum5 Latihan 6*/
	//Realisasikan (tulis kode program) method getElement() di sini, yang 
	//mengakses element pada index  tertentu dari suatu array of shape, dan 
	//mengembalikan element tersebut sebagai kembalian method. Perhatikan index //harus valid (dalam rentang 0 sampai dengan ukuran array of shape)
	
	
	
	/*Praktikum5 Latihan 7*/
	//Realisasikan (tulis kode program) method printArrShape() di sini, yang akan 
	//mengubah isi suatu array of shape menjadi String dan mengembalikan String 
	//tersebut sebagai kembalian method. Manfaatkan method toString() yang ada 
	//pada setiap element array of shape.Jika array of shape dalam keadaan kosong 
	//maka printArrShape() akan mengembalikan String kosong ""
	
	
	
	/*Method ini jangan dihapus*/
	//Method shallowClone()ini mengclone (shallow clone) suatu array of Shape, //dimana tiap elemen objek hasil clone dihasilkan dari dynamic aliasing.
	public static Shape[] shallowClone(Shape [] sourceArr){
		Shape[] targetSrc = new Shape[sourceArr.length];
		for(int i=0;i<sourceArr.length;i++){
			if (sourceArr[i]!=null)
				targetSrc[i] = sourceArr[i];
		}
		return targetSrc;
	}
	
	/*Praktikum5 Latihan 8*/
	//Realisasikan (tulis kode program) method deepClone() di sini, yang men-clone (deep clone) suatu array of shape dan mengembalikan hasil sebagai kembalian method. Hati-hati jangan melakukan shallow clone seperti pada method shallowClone(). Untuk melakukan deep clone, silahkan menggunakan method clone yang ada pada tiap elemen array of shape
	
	
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int a=0, b=0,c=0,d=0,e=0, f=0,g=0;
		System.out.print("Input nilai absis I:");
		a=scn.nextInt();
		System.out.print("Input nilai ordinat I:");
		b=scn.nextInt();
		System.out.print("Input nilai absis II:");
		c=scn.nextInt();
		System.out.print("Input nilai Ordinat II:");
		d=scn.nextInt();
		System.out.print(createRectangle(a,b,c,d));
		
		System.out.print("\nInput nilai absis I:");
		e=scn.nextInt();
		System.out.print("Input nilai ordinat I:");
		f=scn.nextInt();
		System.out.print("Input diameter:");
		g=scn.nextInt();
		System.out.print(createCircle(e,f,g));
		
		/*Praktikum 5.
		Kode progam di bawah ini ditulis untuk mendemonstrasikan polymorphic assignment dan polymorphic data structure serta perbedaan antara clone dan deepclone.
		Kode progam di bawah ini ditulis untuk mendemonstrasikan polymorphic assignment dan polymorphic data structure serta perbedaan antara clone dan deepclone.
		Untuk menunjukkan polymorphic data structure, diinstasiasi sebuah array of Shape, objek dari Circle dan objek dari Rectangle. Kedua objek akan ditambahkan ke dalam array of Shape.
		Setelah itu akan dilakukan shallow clone dan deepclone, serta demontrasi perbedaan efek shallow clone dan deepclone.*/
		/* Uncomment bagian ini setelah semua program anda lulus test
		//Create sebuah array of shape yang dapat menampung 5 elemen
		Shape[] shapeArr1 = new Shape[MAX_EL];
		//Menambah elemen pertama pada array of shape dengan memanggil method addElement().
		addElement (shapeArr1, createCircle(e,f,g));
		
		//Menambah elemen pertama pada array of shape dengan memanggil method setElement()
		setElement (shapeArr1, createRectangle(a,b,c,d), 1);
		
		//Menampilkan isi dari shapeArr1
		System.out.print("\n--Isi dari Array of Shape 1--");
		System.out.print(printArrShape(shapeArr1));
		
		//ShapeArr2 adalah hasil shallow clone dari shapeArr1
		Shape[] shapeArr2 = shallowClone(shapeArr1);
		System.out.print("\n--Isi dari Array of Shape 2 hasil Shallow Clone dari Array Shape 1--");
		System.out.print(printArrShape(shapeArr2));
		//ShapeArr3 adalah hasil deep clone dari shapeArr1
		Shape[] shapeArr3 = deepClone(shapeArr1);
		System.out.print("\n--Isi dari Array of Shape 3  hasil deepClone dari Array Shape 1--");
		System.out.print(printArrShape(shapeArr3));
		
		//Elemen kedua pada shapeArr1 diubah statenya; absis dari point pertama diubah menjadi 10. Setelah perubahan ini,  akan dicek apakah  elemen dari Array of Shape 2 (hasil shallow clone) atau Array of Shape 3 (hasil deep clone) yang akan ikut berubah.
		Rectangle el1 =(Rectangle)shapeArr1[1];
		el1.getP1().setAbsis(10);
		System.out.print("\n--Isi dari Array of Shape 1 elemen indeks 1 diubah statenya, absis poin 1 diubah menjadi 10--");
		System.out.print(printArrShape(shapeArr1));
		System.out.print("\n--Isi dari Array of Shape 2 setelah ubah elemen kedua Array Shape 1--");
		System.out.print(printArrShape(shapeArr2));
		System.out.print("\n--Isi dari Array of Shape 3  setelah ubah Array Shape 1--");
		System.out.print(printArrShape(shapeArr3));
		*/
	}
}