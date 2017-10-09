package test_cases;

import static org.junit.Assert.*;

import org.junit.Test;

import server.logic.handler.OutputHandler;
import server.logic.tables.ItemTable;
import server.logic.tables.TitleTable;

public class RemoveUserTest {

	@Test
	public void test() throws Exception {
		//setup
		try{
			OutputHandler outHan = new OutputHandler();

			outHan.createUser("test@username,testpassword");
			assertEquals("Fails because user already exists.","The User Already Exists!",outHan.createUser("test@username,testpassword").getOutput());
			assertEquals("Delete user.","Success!",outHan.deleteUser("test@username").getOutput());
			assertEquals("Fails because user doesn't exist.","The User Does Not Exist!",outHan.deleteUser("test@username").getOutput());
		} catch (Exception e) {
			fail("Exception occured");
		} finally {
			//
		}
	}

}
