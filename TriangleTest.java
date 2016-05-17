import static org.junit.Assert.*;

import org.junit.Test;


public class TriangleTest {

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	 @Test
     public void testIsTriangle1(){
         Triangle t = new Triangle(2,2,2);
         assertEquals(t.getType(t),"Regular");
     }
 
     @Test
     public void testIsTriangle2(){
         // according to the mutant, this test case should fail
         Triangle t = new Triangle(3,4,5);
         assertEquals(t.getType(t),"Scalene");
     }
 
     @Test
     public void testIsTriangle3(){
         Triangle t = new Triangle(3,3,2);
         assertEquals(t.getType(t),"Isoceles");
     }
     
     @Test
     public void testIsTriangle4(){
         Triangle t = new Triangle(1,1,2);
         assertEquals(t.getType(t),"Illegal");
     }
     
     @Test
     public void testIsTriangle5(){
         Triangle t = new Triangle(0,2,3);
         assertEquals(t.getType(t),"Illegal");
     }
     
}
