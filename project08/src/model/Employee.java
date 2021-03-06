package model;

public class Employee extends Person {
	private int noOfChildren;

	public Employee() {
	}

	public Employee(int noOfChildren) {
		this.noOfChildren = noOfChildren;
	}

	public Employee(int id, String name, int noOfChildren) {
		super(name, id);
		this.noOfChildren = noOfChildren;
	}

	public int getNoOfChildren() {
		return noOfChildren;
	}

	public void setNoOfChildren(int noOfChildren) {
		this.noOfChildren = noOfChildren;
	}

	public String toString() {
		return super.toString() + "," + noOfChildren;
	}

}
