public class Address {
	private String state;
	private String city;
	private int pin;

	public Address(String state, String city, int pin) {
		this.state = state;
		this.city = city;
		this.pin = pin;
	}

	public String getState() {return this.state;}
	public String getCity() {return this.city;}
	public int getPin() {return this.pin;}
}