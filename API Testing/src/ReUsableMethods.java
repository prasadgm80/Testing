import io.restassured.path.json.JsonPath;

public class ReUsableMethods {
	
	public static JsonPath rawToJson(String res)
	{
		JsonPath jp = new JsonPath(res);
		return jp;
	}
	

}
