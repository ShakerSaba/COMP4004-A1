package test_cases;

import static org.junit.Assert.*;

import org.junit.Test;

import server.logic.handler.OutputHandler;
import server.logic.tables.TitleTable;

public class FindItemTest {

	@Test
	public void test() throws Exception {
		//setup
		try{
			OutputHandler outHan = new OutputHandler();
			
			TitleTable.getInstance().createtitle("1234567890000", "Test Title");
			assertEquals("Try and get the test title.","Success!",outHan.findTitle("1234567890000").getOutput());
		} catch (Exception e) {
			fail("Exception occured");
		} finally {
			//
		}
	}

}
