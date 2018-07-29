package io.readresolve.newby;

/**
 * Represents a town.
 *
 * @author Frank MARSHALL
 */
public class Town {

    private Country country;

    private String name;

    /**
     * Creates a town with given country and name.
     *
     * @param country
     *            a country
     * @param name
     *            a name
     */
    public Town(Country country, String name) {
	setCountry(country);
	setName(name);
    }

    /**
     * Returns the country for this town.
     *
     * @return the country
     */
    public Country getCountry() {
	return country;
    }

    private void setCountry(Country country) {
	this.country = country;
    }

    /**
     * Returns the name for this town.
     *
     * @return the name
     */
    public String getName() {
	return name;
    }

    private void setName(String name) {
	this.name = name;
    }
}
