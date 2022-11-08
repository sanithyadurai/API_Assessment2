package assessmentchaining;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DeleteIncident extends RestAssuredBase {
    @Test(dependsOnMethods = "assessmentchaining.PutIncidentWithFile.put")
	public void delete() {
    	
    	Response response = RestAssured.given().header("Authorization","Bearer myTohkhJERJZKfqy4TNfJwVlS6uTUb5ozvmVgjFguQ3iCQVbkJfelfumjm91renOu_r9HCUInR_0ZFqhZ6222f")
    			.delete("/incident/"+sys_id);
   
    	System.out.println(response.getStatusCode());
    	
  

	}

}
