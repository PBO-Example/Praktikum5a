//TestShapeDriver.java
package praktikum4.soal2b;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.jupiter.api.BeforeEach;
import java.util.Collection;
import java.util.stream.*;
import praktikum4.soal2a.*; 

public class TestShapeDriver {
	
	static Stream<Arguments> ciArray() {
    return Stream.of(
        Arguments.of(new Circle(new Point(10,10),5),"\nCircle with :\n\tPoint : (10,10)\n\tDiameter  : 5\n\tLuas : 19.625\n\tKeliling : 15.700000000000001"),
        Arguments.of(new Circle(new Point(3,7),11),"\nCircle with :\n\tPoint : (3,7)\n\tDiameter  : 11\n\tLuas : 94.985\n\tKeliling : 34.54"),
		Arguments.of(new Circle(new Point(10,2),4),"\nCircle with :\n\tPoint : (10,2)\n\tDiameter  : 4\n\tLuas : 12.56\n\tKeliling : 12.56")
    );}
	
	static Stream<Arguments> recArray() {
    return Stream.of(
        Arguments.of(new Rectangle(new Point(10,10),new Point(3,3)),"\nRectangle with :\n\tPoint P1: (10,10)\n\tPoint P2: (3,3)\n\twidth : 7\n\theight : 7\n\tLuas : 49.0\n\tKeliling : 28.0"),
        Arguments.of(new Rectangle(new Point(3,7),new Point(9,12)),"\nRectangle with :\n\tPoint P1: (3,7)\n\tPoint P2: (9,12)\n\twidth : 6\n\theight : 5\n\tLuas : 30.0\n\tKeliling : 22.0"),
		Arguments.of(new Rectangle(new Point(10,2),new Point(1,1)),"\nRectangle with :\n\tPoint P1: (10,2)\n\tPoint P2: (1,1)\n\twidth : 9\n\theight : 1\n\tLuas : 9.0\n\tKeliling : 20.0")
    );}
	
		
	static Stream<Arguments> shaArray() {
		Shape[] myArrShape0 = new Shape[5];
		Shape[] myArrShape00 = new Shape[5];
		Shape[] myArrShape000 = new Shape[5];
		Shape[] myArrShape1a= new Shape[5];
		Shape[] myArrShape1b= new Shape[5];
		Shape[] myArrShape1c= new Shape[5];
	
		myArrShape1a[0] = new Circle(new Point(10,10),5);
		myArrShape1b[0] = new Rectangle(new Point(10,10),new Point(3,3));
		myArrShape1c[0] = new Circle(new Point(3,7),11);
	
    return Stream.of(
        Arguments.of(myArrShape0,new Circle(new Point(10,10),5),myArrShape1a),
        Arguments.of(myArrShape00,new Rectangle(new Point(10,10),new Point(3,3)),myArrShape1b),
		Arguments.of(myArrShape000,new Circle(new Point(3,7),11),myArrShape1c)
		);}
	
	static Stream<Arguments> shaArray1() {
		Shape[] myArrShape1a= new Shape[5];
		Shape[] myArrShape1b= new Shape[5];
		Shape[] myArrShape2a= new Shape[5];
		Shape[] myArrShape2b= new Shape[5];
	
		myArrShape1a[0] = new Circle(new Point(10,10),5);
		myArrShape1b[0] = new Rectangle(new Point(10,10),new Point(3,3));
		
		myArrShape2a[0] = new Circle(new Point(10,10),5);
		myArrShape2a[1] = new Circle(new Point(3,7),11);
		
		myArrShape2b[0] = new Rectangle(new Point(10,10),new Point(3,3));
		myArrShape2b[1] = new Rectangle(new Point(3,7),new Point(9,12));
		
    return Stream.of(
        Arguments.of(myArrShape1a,new Circle(new Point(3,7),11),myArrShape2a),
        Arguments.of(myArrShape1b,new Rectangle(new Point(3,7),new Point(9,12)),myArrShape2b));
		}
		
	static Stream<Arguments> shaArray2() {
		Shape[] myArrShape5= new Shape[5];
		myArrShape5[0] = new Rectangle(new Point(10,10),new Point(3,3));
		myArrShape5[1] = new Circle(new Point(10,10),5);
		myArrShape5[2] = new Rectangle(new Point(3,7),new Point(9,12));
		myArrShape5[3] = new Circle(new Point(3,7),11);
		myArrShape5[4] = new Rectangle(new Point(10,2),new Point(1,1));
    return Stream.of(
        Arguments.of(myArrShape5,new Circle(new Point(10,10),5)),
        Arguments.of(myArrShape5,new Rectangle(new Point(3,7),new Point(9,12))
    ));}
	
	static Stream<Arguments> shaArray3() {
		Shape[] myArrShape0 = new Shape[5];
		Shape[] myArrShape00 = new Shape[5];
		Shape[] myArrShape000 = new Shape[5];
		Shape[] myArrShape1a= new Shape[5];
		Shape[] myArrShape1aa= new Shape[5];
		Shape[] myArrShape1b= new Shape[5];
		Shape[] myArrShape1c= new Shape[5];
	
		myArrShape1a[0] = new Circle(new Point(10,10),5);
		myArrShape1aa[0] = new Circle(new Point(10,10),5);
		myArrShape1aa[3] = new Rectangle(new Point(3,7),new Point(9,12));
		myArrShape1b[2] = new Rectangle(new Point(10,10),new Point(3,3));
		myArrShape1c[4] = new Circle(new Point(3,7),11);
		
	
    return Stream.of(
        Arguments.of(myArrShape0,new Circle(new Point(10,10),5),myArrShape1a,0),
        Arguments.of(myArrShape00,new Rectangle(new Point(10,10),new Point(3,3)),myArrShape1b,2),
		Arguments.of(myArrShape000,new Circle(new Point(3,7),11),myArrShape1c,4),
		Arguments.of(myArrShape1a,new Rectangle(new Point(3,7),new Point(9,12)),myArrShape1aa,3),
		Arguments.of(myArrShape1a,new Rectangle(new Point(3,7),new Point(9,12)),myArrShape1a,5),
		Arguments.of(myArrShape1a,new Rectangle(new Point(3,7),new Point(9,12)),myArrShape1a,-1)
		);}
	
	static Stream<Arguments> shaArray4() {
		Shape[] myArrShape0 = new Shape[5];
		Shape[] myArrShape1a= new Shape[5];
		Shape[] myArrShape5= new Shape[5];
		
		myArrShape1a[0] = new Circle(new Point(10,10),5);
		
		
		myArrShape5[0] = new Rectangle(new Point(10,10),new Point(3,3));
		myArrShape5[1] = new Circle(new Point(10,10),5);
		myArrShape5[2] = new Rectangle(new Point(3,7),new Point(9,12));
		myArrShape5[3] = new Circle(new Point(3,7),11);
		myArrShape5[4] = new Rectangle(new Point(10,2),new Point(1,1));
	
    return Stream.of(
		Arguments.of(myArrShape0,3,null),
		Arguments.of(myArrShape1a,0, new Circle(new Point(10,10),5)),
		Arguments.of(myArrShape5,0,new Rectangle(new Point(10,10),new Point(3,3))),
		Arguments.of(myArrShape5,2,new Rectangle(new Point(3,7),new Point(9,12))),
		Arguments.of(myArrShape5,5,null),
		Arguments.of(myArrShape5,-2,null)
		);}
	
		
	static Stream<Arguments> shaArray5() {
		Shape[] myArrShape0 = new Shape[5];
		Shape[] myArrShape1 = new Shape[5];
		Shape[] myArrShape5= new Shape[5];
		
		myArrShape1[0] = new Circle(new Point(10,10),5);
		myArrShape1[1] = new Rectangle(new Point(10,10),new Point(3,3));
		
		myArrShape5[0] = new Circle(new Point(10,2),4);
		myArrShape5[1] = new Rectangle(new Point(10,2),new Point(1,1));
		myArrShape5[2] = new Circle(new Point(3,7),11);
		myArrShape5[3] = new Rectangle(new Point(3,7),new Point(9,12));
		myArrShape5[4] = new Rectangle(new Point(10,10),new Point(3,3));
	
    return Stream.of(
		Arguments.of(myArrShape0,""),
		Arguments.of(myArrShape1,"\nCircle with :\n\tPoint : (10,10)\n\tDiameter  : 5\n\tLuas : 19.625\n\tKeliling : 15.700000000000001\nRectangle with :\n\tPoint P1: (10,10)\n\tPoint P2: (3,3)\n\twidth : 7\n\theight : 7\n\tLuas : 49.0\n\tKeliling : 28.0"),
		Arguments.of(myArrShape5,"\nCircle with :\n\tPoint : (10,2)\n\tDiameter  : 4\n\tLuas : 12.56\n\tKeliling : 12.56\nRectangle with :\n\tPoint P1: (10,2)\n\tPoint P2: (1,1)\n\twidth : 9\n\theight : 1\n\tLuas : 9.0\n\tKeliling : 20.0\nCircle with :\n\tPoint : (3,7)\n\tDiameter  : 11\n\tLuas : 94.985\n\tKeliling : 34.54\nRectangle with :\n\tPoint P1: (3,7)\n\tPoint P2: (9,12)\n\twidth : 6\n\theight : 5\n\tLuas : 30.0\n\tKeliling : 22.0\nRectangle with :\n\tPoint P1: (10,10)\n\tPoint P2: (3,3)\n\twidth : 7\n\theight : 7\n\tLuas : 49.0\n\tKeliling : 28.0")
		);}
		
	static Stream<Arguments> shaArray6() {
		Shape[] myArrShape0 = new Shape[5];
		Shape[] myArrShape1 = new Shape[5];
		Shape[] myArrShape5= new Shape[5];
		
		myArrShape1[0] = new Circle(new Point(10,10),5);
		myArrShape1[1] = new Rectangle(new Point(10,10),new Point(3,3));
		
		myArrShape5[0] = new Circle(new Point(10,2),4);
		myArrShape5[1] = new Rectangle(new Point(10,2),new Point(1,1));
		myArrShape5[2] = new Circle(new Point(3,7),11);
		myArrShape5[3] = new Rectangle(new Point(3,7),new Point(9,12));
		myArrShape5[4] = new Rectangle(new Point(10,10),new Point(3,3));
	
    return Stream.of(
		Arguments.of(myArrShape0,""),
		Arguments.of(myArrShape1,""),
		Arguments.of(myArrShape5,"")
		);}
	
	@ParameterizedTest
	@MethodSource("recArray")
	void testCreateRectangle(Rectangle r, String s) {
		assertThat(r.toString(), containsString(s));
	}
	
    @ParameterizedTest
	@MethodSource("ciArray")
	void testCreateCircle(Circle c, String s) {
		assertThat(c.toString(), containsString(s));
	}
	
	@ParameterizedTest
	@MethodSource("shaArray")
	public void testAddElement1(Shape[] shpArr,Shape shp, Shape[] shpArrTarget) {
		ShapeDriver.nbEl =0;
		Shape [] shpArrAfter = ShapeDriver.addElement(shpArr, shp);
		assertEquals(shpArrAfter.length , shpArrTarget.length);
		for(int i=0; i< shpArrTarget.length;i++){
			assertEquals(shpArrTarget[i],shpArrAfter[i]);
		}
	}
	@ParameterizedTest
	@MethodSource("shaArray1")
	public void testAddElement2(Shape[] shpArr,Shape shp, Shape[] shpArrTarget) {
		ShapeDriver.nbEl =1;
		Shape [] shpArrAfter = ShapeDriver.addElement(shpArr, shp);
		assertEquals(shpArrAfter.length , shpArrTarget.length);
		for(int i=0; i< shpArrTarget.length;i++){
			assertEquals(shpArrTarget[i],shpArrAfter[i]);
		}
	}
	@ParameterizedTest
	@MethodSource("shaArray2")
	public void testAddElement3(Shape[] shpArr,Shape shp) {
		ShapeDriver.nbEl =5;
		Shape [] shpArrAfter = ShapeDriver.addElement(shpArr, shp);
		assertEquals(shpArrAfter.length , shpArr.length);
		for(int i=0; i< shpArr.length;i++){
			assertEquals(shpArr[i],shpArrAfter[i]);
		}
	}
	
	@ParameterizedTest
	@MethodSource("shaArray3")
	public void testSetElement(Shape[] shpArr,Shape shp, Shape[] shpArrTarget, int index) {
		Shape [] shpArrAfter = ShapeDriver.setElement(shpArr, shp, index);
		assertEquals(shpArrAfter.length , shpArrTarget.length);
		for(int i=0; i< shpArrTarget.length;i++){
			assertEquals(shpArrTarget[i],shpArrAfter[i]);
		}
	}
	@ParameterizedTest
	@MethodSource("shaArray4")
	public void testGetElement(Shape[] shpArr,int index, Shape shp) {
		Shape shpArrAfter = ShapeDriver.getElement(shpArr, index);
		assertEquals(shp,shpArrAfter);
	}
	
	@ParameterizedTest
	@MethodSource("shaArray5")
	public void testPrintArrShape(Shape[] shpArr,String str) {
		String after =ShapeDriver.printArrShape(shpArr);
		assertThat(after, containsString(str));
	}
	@ParameterizedTest
	@MethodSource("shaArray6")
	public void testDeepClone(Shape[] shpArr,String str) {
		Shape[] after=ShapeDriver.deepClone(shpArr);
		if (shpArr==null)
			assertEquals(after,null);
		else{
			for(int i=0; i< shpArr.length;i++){
				if(shpArr[i]!=null && after[i]!=null){
					assertEquals(shpArr[i],after[i]);
					assertNotSame(shpArr[i],after[i], "should not point to same Object");
				}
			}
		}
	}
}