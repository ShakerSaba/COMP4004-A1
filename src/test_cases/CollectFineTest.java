package test_cases;

import static org.junit.Assert.*;

import org.junit.Test;

import server.logic.handler.OutputHandler;

public class CollectFineTest {

	@Test
	public void test() throws Exception {
		//setup
		try{
			OutputHandler outHan = new OutputHandler();
			outHan.createUser("test@username,testpassword");
			assertEquals("Apply fine to collect from user","Success!",outHan.collectFine("test@username,2000000").getOutput());
			assertEquals("Fail due to user not existing","The User Does Not Exist!",outHan.collectFine("nonexistant@username,2000000").getOutput());
		} catch (Exception e) {
			fail("Exception occured");
		} finally {
			//
		}
	}

}
