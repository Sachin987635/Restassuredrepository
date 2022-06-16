package Rest_AssuredApi.RestAssured;

import static io.restassured.RestAssured.given;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.JSONObject;
import org.json.JSONTokener;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PostdatausingJsonFile {
	public static void main(String[] args) throws FileNotFoundException {
		File f=new File("../RestAssured/BodyData.json");
		FileReader fr=new FileReader(f);
		JSONTokener js=new JSONTokener(fr);
		JSONObject obj=new JSONObject(js);
		  Response res=
				  given()
				  .contentType(ContentType.JSON)
				  .body(obj.toString())
				  .when()
				  .post("http://localhost:3000/DevopsFolks/");
				  System.out.println("Status Code "+res.statusCode());
	}
}
