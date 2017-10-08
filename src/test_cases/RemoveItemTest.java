package test_cases;

import static org.junit.Assert.*;

import org.junit.Test;

import server.logic.handler.OutputHandler;
import server.logic.tables.ItemTable;
import server.logic.tables.TitleTable;

public class RemoveItemTest {

	@Test
	public void test() throws Exception {
		//setup
		try{
			OutputHandler outHan = new OutputHandler();
			
			TitleTable.getInstance().createtitle("1234567890000", "Test Title 1");
			ItemTable.getInstance().createitem("1234567890000");
			TitleTable.getInstance().createtitle("1234567890001", "Test Title 2");
			ItemTable.getInstance().createitem("1234567890001");
			outHan.createUser("test@username,testpassword");
			assertEquals("Delete an item.","Success!",outHan.deleteItem("1234567890000,1").getOutput());
			assertEquals("Borrow the only remaining copy","Success!",outHan.borrow("test@username,1234567890001,1").getOutput());
			assertEquals("Fail due to only copies being borrowed.","Active Loan Exists!",outHan.deleteItem("1234567890001,1").getOutput());
		} catch (Exception e) {
			fail("Exception occured");
		} finally {
			//
		}
	}

}
