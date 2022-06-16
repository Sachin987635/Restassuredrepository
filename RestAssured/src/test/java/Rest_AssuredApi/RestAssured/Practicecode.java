package Rest_AssuredApi.RestAssured;

import org.json.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class Practicecode {
  public static void main(String[] args) {
		JSONObject js=new JSONObject();
		js.put("firstname","Sachin");
		js.put("lastname", "Kumar");
		js.put("rollno", "1");
		js.put("id","1");
		Response r=
		given().contentType(ContentType.JSON)
		.body(js.toString())
		.when()
		.get("http://localhost:3000/DevopsFolks");
		System.out.println("Status Code is : "+r.statusCode());
		System.out.println(r.asString());
}
	
	
}
