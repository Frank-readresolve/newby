package io.readresolve.newby;

/**
 * Represents a school.
 *
 * @author Frank MARSHALL
 */
public class School {

    private String name;

    private Address address;

    /**
     * Creates a school with given name and address.
     *
     * @param name
     *            a name
     * @param address
     *            an address
     */
    public School(String name, Address address) {
	setName(name);
	setAddress(address);
    }

    /**
     * Returns the name for this school.
     *
     * @return the name
     */
    public String getName() {
	return name;
    }

    private void setName(String name) {
	this.name = name;
    }

    /**
     * Returns the address for this school.
     *
     * @return the address
     */
    public Address getAddress() {
	return address;
    }

    private void setAddress(Address address) {
	this.address = address;
    }

	@Override
	public String toString() {
		return "School [name=" + name + ", address=" + address + ", getName()=" + getName() + ", getAddress()="
				+ getAddress() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
}
