package io.readresolve.newby;

/**
 * Represents an address.
 *
 * @author Frank MARSHALL
 */
public class Address {

	private String road;

	private Town town;

	/**
	 * Creates a country with given road and town.
	 *
	 * @param road
	 *            a road
	 * @param town
	 *            a town
	 */
	public Address(String road, Town town) {
		setRoad(road);
		setTown(town);
	}

	/**
	 * Returns the road for this address.
	 *
	 * @return the road
	 */
	public String getRoad() {
		return road;
	}

	private void setRoad(String road) {
		this.road = road;
	}

	/**
	 * Returns the town for this address.
	 *
	 * @return the town
	 */
	public Town getTown() {
		return town;
	}

	private void setTown(Town town) {
		this.town = town;
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
	
}
