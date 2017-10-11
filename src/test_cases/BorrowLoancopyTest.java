package test_cases;

import static org.junit.Assert.*;

import org.junit.Test;

import server.logic.handler.OutputHandler;
import server.logic.tables.ItemTable;
import server.logic.tables.TitleTable;

public class BorrowLoancopyTest {

	@Test
	public void test() throws Exception {
		//setup
		try{
			OutputHandler outHan = new OutputHandler();
			
			outHan.createTitle("1234567890000,Test Title 1");
			for(int i=0;i<3;++i)
				outHan.createItem("1234567890000");
			outHan.createUser("test@username1,testpassword");
			outHan.createUser("test@username2,testpassword");
			//assertEquals("Borrow books.","Success!",outHan.borrow("test@username1,1234567890000,1").getOutput());
			//assertEquals("Failure due to user not existing.","The User Does Not Exist!",outHan.borrow("nonexistant@username,1234567890000,1").getOutput());
			
			//for(int i=0;i<2;++i)
			assertEquals("Borrow books.","Success!",outHan.borrow("test@username1,1234567890000,1").getOutput());
			//int listsize = ItemTable.getInstance().getItemTable().size();
			//String finalcopies = ItemTable.getInstance().getItemTable().get(listsize-1).getCopynumber();
			assertEquals("Borrow books.","Success!",outHan.borrow("test@username2,1234567890000,1").getOutput());
			assertEquals("Borrow books.","Success!",outHan.borrow("test@username2,1234567890000,2").getOutput());
			//assertEquals("Failure due to missing item.","The Item is Not Available!",outHan.borrow("test@username2,1234567890000,1").getOutput());
			//assertEquals("Failure due to reaching borrow limit.","The Maximun Number of Items is Reached!",outHan.borrow("test@username1,1234567890000,1").getOutput());
			//outHan.collectFine("test@username2,2000000");
			//assertEquals("Failure due to outstanding fees.","Outstanding Fee Exists!",outHan.borrow("test@username2,1234567890000,1").getOutput());
		} catch (Exception e) {
			fail("Exception occured");
		} finally {
			//
		}
	}

}
