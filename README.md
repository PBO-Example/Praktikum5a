# Praktikum5
Baca instruksi yang diberikan dengan baik.
>Praktikum 5 ini adalah lanjutan dari praktikum 4, oleh karena itu
>file-file terkait latihan berikut ini bisa anda temukan di folder **src\main\java\praktikum4**.

## Pendahuluan
Tujuan dari praktikum 5 kali ini adalah:
a. Peserta dapat mengimplementasikan bentuk polimorfisme di dalam kode program
b. Peserta dapat melakukan operasi pada object dengan benar serta mengetahui perbedaan antara shallow clone dengan deep clone.

Pada praktikum ini kalian akan menggunakan kode program soal 2 dari praktikum 4.
Sesuai dengan topik pembelajaran PBO minggu ini yaitu polymorphism dan copy, clone, shallow clone, deep clone, maka pada praktikum kali ini kalian akan mengimplementasikan bentuk2 polymorhism khususnya polymorphic assignment dan polymorphic data structure. Untuk polymorphic data structure, pengetahuan dan kemampuan programming kalian terkait array (topik Minggu II) sangat dibutuhkan. Setelah itu kalian akan berlatih melakukan shallow clone dan deep clone. Sebagai contoh clone yang benar, silahkan melihat method clone() yang ada pada kelas Point.
>Method clone() adalah method yang diturunkan oleh kelas Objek kepada semua kelas di Java. Silahkan cek Java API.

> **protected Object clone();**

> Saat method yang diturunkan kelas parent dioverride oleh kelas child, maka modifiernya minimal sama dengan method pada kelas parent, tidak boleh lebih strict dibanding modifier method pada kelas Parent. Untuk kasus method clone, maka pada kelas anak, method tersebut bisa diberi modifier protected atau public.


## Kelas Diagram
![Image of praktikum 5](http://api.puro.del.ac.id/v1/file/b3d60e893125db8ca0fee8283aee2667)

## Latihan
1. **[Poin 10]** Latihan 1: clone object Circle
Override method clone() yang diwariskan oleh oleh kelas Object pada kelas Circle.
	> Program test untuk latihan 1 adalah: Kelas TestCircle method testClone()
	
	
	> Perintah test: 
	
	
		>gradle test --tests TestCircle.testClone

2. **[Poin 10]** Latihan 2: clone object Rectangle
Override method clone() yang diwariskan oleh oleh kelas Object pada kelas Rectangle.
	> Program test untuk latihan 2 adalah: Kelas TestRectangle method testClone()
	
	
	> Perintah test: 
	
	
		>gradle test --tests TestRectangle.testClone

3. **[Poin 10]** Latihan 3: clone object Shape
Override method clone() yang diwariskan oleh oleh kelas Object pada kelas Shape.
	> Program test untuk latihan 3 adalah: Kelas TestShape method testClone()
	
	
	> Perintah test: 
	
	
		> gradle test --tests TestShape.testClone

4. **[Poin 15]** Latihan 4: menambahkan elemen ke dalam suatu array of shape
Sebelum mengerjakan latihan 4 s.d. latihan 8, silahkan memahami isi dari method main pada kelas ShapeDriver. Mulai dari dari bagian yang diberi tag comment.
Setelah itu, realisasikan method addElement() pada kelas ShapeDriver sesuai deskripsi yang diberikan. Cek juga kelas diagram untuk mengetahui spesifikasi dari method addElement()
	> Program test untuk latihan 4 adalah: Kelas TestShapeDriver method testAddElement1(), testAddElement2(), dan testAddElement3()
	
	
	> Perintah test: 
	
	
		> gradle test --tests TestShapeDriver.testAddElement1
		> gradle test --tests TestShapeDriver.testAddElement2
		> gradle test --tests TestShapeDriver.testAddElement3

5. **[Poin 15]** Latihan 5: mengubah elemen index tertentu pada suatu array of shape
Realisasikan method setElement() pada kelas ShapeDriver sesuai deskripsi yang diberikan. Cek juga kelas diagram untuk mengetahui spesifikasi dari method setElement()
	> Program test untuk latihan 5 adalah: Kelas TestShapeDriver method testSetElement()
	
	
	> Perintah test: 
	
	
		> gradle test --tests TestShapeDriver.testSetElement

6. **[Poin 15]** Latihan 6: mengambil elemen index tertentu pada suatu array of shape
Realisasikan method getElement() pada kelas ShapeDriver sesuai deskripsi yang diberikan. Cek juga kelas diagram untuk mengetahui spesifikasi dari method getElement()
	> Program test untuk latihan 6 adalah: Kelas TestShapeDriver method testGetElement()
	
	
	> Perintah test: 
	
	
		> gradle test --tests TestShapeDriver.testGetElement
 
7. **[Poin 15]** Latihan 7: mengembalikan seluruh data elemen array of shape dalam bentuk String.
Realisasikan method printArrShape() pada kelas ShapeDriver sesuai deskripsi yang diberikan. Cek juga kelas diagram untuk mengetahui spesifikasi dari method printArrShape()
	> Program test untuk latihan 7 adalah: Kelas TestShapeDriver method testPrintArrShape()
	
	
	> Perintah test: 
	
	
		>gradle test --tests TestShapeDriver.testPrintArrShape

8. **[Poin 10]** Latihan 8: melakukan deep clone pada suatu array of shape.
Realisasikan method deepClone() pada kelas ShapeDriver sesuai deskripsi yang diberikan. Cek juga kelas diagram untuk mengetahui spesifikasi dari method deepClone(). Hati-hati supaya tidak melakukan shallow clone seperti pada method shallowClone()
	> Program test untuk latihan 7 adalah: Kelas TestShapeDriver method        testDeepClone()
	
	
	> Perintah test: 
	
	
		> gradle test --tests TestShapeDriver.testDeepClone




**Catatan Penting:**
1. Anda hanya boleh mengubah kode program yang ada di src\main\java
1. **Semua kode program yang ada di src\test\java  tidak boleh diubah sama sekali!!** Jika anda ubah (akan terlihat pada history), maka nilai anda langsung 0.
1. Jangan memindah-mindahkan file, biarkan setiap file di folder di mana file tersebut berada sebelumnya.
1. Pada beberapa template program sudah disediakan method yang tidak boleh diubah. Maka jangan anda ubah!
