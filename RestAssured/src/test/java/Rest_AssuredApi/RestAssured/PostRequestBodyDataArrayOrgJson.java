package Rest_AssuredApi.RestAssured;

import static io.restassured.RestAssured.*;

import org.json.JSONArray;
import org.json.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PostRequestBodyDataArrayOrgJson {
	public static void main(String[] args) {
	  JSONObject primaryAddresss=new JSONObject();
	  primaryAddresss.put("Ward No","10");
	  primaryAddresss.put("Landmark","Overhead tank");
	  primaryAddresss.put("Sector ","41");
	  primaryAddresss.put("Flat No ","i44/18");
	  
	  JSONObject secondaryDetails=new JSONObject();
	  secondaryDetails.put("Room no","18");
	  secondaryDetails.put("Company Name","TCS");
	  secondaryDetails.put("Company Address ","Yahin Noida Mein hi");
	  secondaryDetails.put("Travelling ","Metro");
	  
	  JSONArray AddressandDetails = new JSONArray();
	  AddressandDetails.put(0,primaryAddresss);
	  AddressandDetails.put(1,secondaryDetails);
	  
	  JSONObject Basicinfo = new JSONObject();
	  Basicinfo.put("Name", "Sachin Kumar");
	  Basicinfo.put("Id", "sk786");
	  Basicinfo.put("Phone No", "7009895341");
	  Basicinfo.put("Email", "test@gmail.com");
	  Basicinfo.put("Address", AddressandDetails);
	  
	  Response res=
	  given()
	  .contentType(ContentType.JSON)
	  .body(Basicinfo.toString())
	  .when()
	  .get("http://localhost:3000/DevopsFolks/");
	  System.out.println("Status Code "+res.statusCode());
	  System.out.println(res.asPrettyString());
	}
}
