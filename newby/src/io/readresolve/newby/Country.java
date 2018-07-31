package io.readresolve.newby;

/**
 * Represents a country.
 *
 * @author Frank MARSHALL
 */
public class Country {

    private String code;

    private String name;

    /**
     * Creates a country with given code and name.
     *
     * @param code
     *            a code
     * @param name
     *            a name
     */
    public Country(String code, String name) {
	setCode(code);
	setName(name);
    }

    /**
     * Returns the code for this country.
     *
     * @return the code
     */
    public String getCode() {
	return code;
    }

    private void setCode(String code) {
	this.code = code;
    }

    /**
     * Returns the name for this country.
     *
     * @return the name
     */
    public String getName() {
	return name;
    }

    private void setName(String name) {
	this.name = name;
    }

	@Override
	public String toString() {
		return "Country [name=" + name + "]";
	}
    
}
