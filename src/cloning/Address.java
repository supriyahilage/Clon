package cloning;

public class Address {

	String City;
	String country;
	int pin;
	
	public Address() {
		
	}
	public Address(String City,String country,int pin) {
		this.City=City;
		this.country=country;
		this.pin=pin;
		
	}
	@Override
	public String toString() {
		return "Address [City=" + City + ", country=" + country + ", pin=" + pin + "]";
	}
}