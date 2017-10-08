package test_cases;

import static org.junit.Assert.*;

import org.junit.Test;

import server.logic.handler.OutputHandler;
import server.logic.tables.ItemTable;
import server.logic.tables.TitleTable;

public class AddItemTest {

	@Test
	public void test() throws Exception {
		//setup
		try{
			OutputHandler outHan = new OutputHandler();
			
			TitleTable.getInstance().createtitle("1234567890000", "Test Title");
			ItemTable.getInstance().createitem("1234567890000");
			assertEquals("Try create a new instance of test item.","Success!",outHan.createItem("1234567890000").getOutput());
		} catch (Exception e) {
			fail("Exception occured");
		} finally {
			//
		}
	}

}
