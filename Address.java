
public class Address {
	
	String area;
	String street;
	String city;
	String state;
	String country;
	String pin;
	
	public Address(String area, String street, String city, String state, String country, String pin) {
		super();
		this.area = area;
		this.street = street;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pin = pin;
	}

	@Override
	public String toString() {
		return "Address [area=" + area + ", street=" + street + ", city=" + city + ", state=" + state + ", country="
				+ country + ", pin=" + pin + "]";
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}
	
 
}
