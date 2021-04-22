package com.api.rmgYantra;

import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;

public class GetSingleProject {
	
	@Test
	public void getSignleProject()
		
		{
		    given()
		    .get("https://reqres.in/api/user/2")
		    .then()
		    .log().all();
		    
		}
	@Test	
	public void getAllProjects()
	{
		given()
	    .get("https://reqres.in/api/user")
	    .then()
	    .log().all();
	}
	}

