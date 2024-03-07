package addPlace;

public class response {
	
	private String status;
	private String place_id;
	private String scope;
	private String reference;
	private String id;
	private String msg;
	
	private getLocation location;
	private String accuracy;
	private String name;
	private String phone_number;
	private String address;
	private String types;	
	private String website;
	private String language;
	
	
	public getLocation getLocation() {
		return location;
	}

	public void setLocation(getLocation location) {
		this.location = location;
	}

	public String getAccuracy() {
		return accuracy;
	}

	public void setAccuracy(String accuracy) {
		this.accuracy = accuracy;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTypes() {
		return types;
	}

	public void setTypes(String types) {
		this.types = types;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setPlace_id(String place_id) {
		this.place_id = place_id;
	}

	public void setScope(String scope) {
		this.scope = scope;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public void setId(String id) {
		this.id = id;
	}

	
	
	
	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getStatus() {
		return status;
	}
	
	public String getPlace_id() {
		return place_id;
	}
	
	public String getScope() {
		return scope;
	}
	
	public String getReference() {
		return reference;
	}
	
	public String getId() {
		return id;
	}
	

}
