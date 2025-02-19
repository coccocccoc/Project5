package hiding.quiz;

public class Quiz2 {

	public static void main(String[] args) {
		Car car = new Car();
		car.setCompany("현대");
		car.setModel("소나타");
		car.setColor("흰색");
		car.setMaxSpeed(200);

		System.out.println(car.getCompany());
		System.out.println(car.getModel());
		System.out.println(car.getColor());
		System.out.println(car.getMaxSpeed());

	}

}

class Car {
	private String company;
	private String model;
	private String color;
	private int maxSpeed;

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

}