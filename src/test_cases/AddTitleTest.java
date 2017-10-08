package test_cases;

import static org.junit.Assert.*;

import org.junit.Test;

import server.logic.handler.OutputHandler;

public class AddTitleTest {

	@Test
	public void test() throws Exception {
		//setup
		try{
			OutputHandler outHan = new OutputHandler();
			
			assertEquals("Create a title.","Success!",outHan.createTitle("1234567890000,Test Title").getOutput());
			assertEquals("Fail due to already existing title.","The Title Already Exists!",outHan.createTitle("1234567890000,Test Title").getOutput());
		} catch (Exception e) {
			fail("Exception occured");
		} finally {
			//
		}
	}

}
