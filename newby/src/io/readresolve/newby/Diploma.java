package io.readresolve.newby;

import java.time.Year;

/**
 * Represents a diploma.
 *
 * @author Frank MARSHALL
 */
public class Diploma {

    private String name;

    private Year year;

    /**
     * Creates a diploma with given name and year.
     *
     * @param name
     *            a name
     * @param year
     *            a year
     */
    public Diploma(String name, Year year) {
	setName(name);
	setYear(year);
    }

    /**
     * Returns the name for this diploma.
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
     * Returns the year for this diploma.
     * 
     * @return the year
     */
    public Year getYear() {
	return year;
    }

    private void setYear(Year year) {
	this.year = year;
    }
}
