package re;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
public class caseTest {


	@Test
	public void testAddcart() {
		Shoping x = new Shoping() ;
		assertTrue(0 == x.getcount()) ;
	}

	@Test
	public void testAddBook() {
		AddingBook x = new AddingBook() ;
		x.addcart();
		x.addBook(0, 127,"java", 1);
		assertTrue(1==x.al.get(0).ala.size()) ;
		assertTrue(127 == x.al.get(0).ala.get(0).priceBook) ;
		x.al.get(0).ala.clear();
		x.al.clear();

	}
	@Test
public	void testAddBook2() {
		AddingBook y = new AddingBook() ; 
		y.addcart();
		y.addBook(0, 127,"java", 1);
		y.addBook(0, 100,"Web desing Book", 1);
		assertTrue(2==y.al.get(0).ala.size())  ;
		assertTrue(227 == y.al.get(0).getcount()) ;
		
	}
}
