package Practice1;

import io.restassured.path.json.JsonPath;
import payload.Body;

public class dummyResponse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JsonPath js = new JsonPath(Body.dummyResponse());
		
		int db = js.get("dashboard.purchaseAmount");
		System.out.println(db);
	}

}
