package Rest_AssuredApi.RestAssured;

import org.json.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class PostRqstBodydataUsingorg {
  public static void main(String[] args) {
	  	JSONObject innerobject=new JSONObject();
	  	innerobject.put("Hno", "i44");
	  	innerobject.put("Sector", "41");
	  	innerobject.put("Landmark", "Overheadtank");
	  
	  JSONObject outerobject=new JSONObject();
	  outerobject.put("firstname","Sachin");
	  outerobject.put("lastname","Kumar");
	  outerobject.put("id","102");
	  outerobject.put("rollno","2233");
	  outerobject.put("Address", innerobject);
		Response res=
		given().contentType(ContentType.JSON)
		.body(outerobject.toString())
		.when()
		.post("http://localhost:3000/SeleniumFolks");
		System.out.println("Status Code is " + res.statusCode());
		System.out.println(res.asString());
}
}
