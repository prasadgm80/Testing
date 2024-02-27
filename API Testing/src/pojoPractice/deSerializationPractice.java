package pojoPractice;

import static io.restassured.RestAssured.given;

import java.util.ArrayList;
import java.util.List;

import io.restassured.RestAssured;

public class deSerializationPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		//serialization with an array
		deserialize des = new deserialize();
		data dat = new data();
		data dat1 = new data();
		support sup = new support();
		
		dat.setAvatar("A");
		dat.setEmail("E");
		dat.setFirst_name("F");
		dat.setId("i");
		dat.setLast_name("l");
		
		dat1.setAvatar("AB");
		dat1.setEmail("EF");
		dat1.setFirst_name("FG");
		dat1.setId("ij");
		dat1.setLast_name("lm");
		
		sup.setText("T");
		sup.setUrl("url");
		
		List<data> avatar = new ArrayList<data>();
		avatar.add(dat);
		avatar.add(dat1);
		
		
		des.setData(avatar);
		
		des.setPage("A");
		des.setPer_page("Z"); 
		des.setTotal("X");
		des.setTotal_pages("Z");
		des.setSupport(sup);
		//des.setData(null);
		
		
		//System.out.println(des.toString());
		
RestAssured.baseURI = "https://reqres.in";
		
		deserialize output = given().log().all()
				.header("Content-Type","application/json").queryParam("page", "2").
				body(des)
					.when().get("/api/users")
					.as(deserialize.class);
		
	/*	
		
        //deSerialization with an array
         
         
		RestAssured.baseURI = "https://reqres.in";
		
		deserialize output = given().log().all()
				.header("Content-Type","application/json").queryParam("page", "2").
				body("")
					.when().get("/api/users")
					.as(deserialize.class);
				
		System.out.println(output.getTotal());
		
		//System.out.println(output.getData().size());
		
		List<data> id = output.getData();
		
		for(int j=0; j<id.size(); j++)
		{
			
		if(	id.get(j).getId().equalsIgnoreCase("michael.lawson@reqres.in"))
		{
		System.out.println(id.get(j).getFirst_name());	
		}
		}
		
		for(int i=0; i<output.getData().size(); i++)
		{
			System.out.println(output.getData().get(i).getId());
			System.out.println(output.getData().get(i).getEmail());
			System.out.println(output.getData().get(i).getFirst_name());
			System.out.println(output.getData().get(i).getLast_name());
			System.out.println(output.getData().get(i).getAvatar());
		}
		
		System.out.println(output.getSupport().getText());
		System.out.println(output.getSupport().getUrl());
	}
*/
}
}

