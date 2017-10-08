package test_cases;

import static org.junit.Assert.*;

import org.junit.Test;

import server.logic.handler.OutputHandler;

public class AddUserTest {

	@Test
	public void test() throws Exception {
		//setup
		try{
			OutputHandler outHan = new OutputHandler();
			
			assertEquals("Create a user.","Success!",outHan.createUser("test@username,testpassword").getOutput());
			assertEquals("Fail due to user being in wrong format.","Your input should in this format:'username,password'",outHan.createUser("testusername,testpassword").getOutput());
			assertEquals("Fail due to already existing user.","The User Already Exists!",outHan.createUser("test@username,testpassword").getOutput());
		} catch (Exception e) {
			fail("Exception occured");
		} finally {
			//
		}
	}

}
