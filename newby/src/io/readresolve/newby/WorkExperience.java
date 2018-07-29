package io.readresolve.newby;

import java.time.LocalDate;

/**
 * Represents a work experience.
 *
 * @author Frank MARSHALL
 */
public class WorkExperience {

    private String companyName;

    private LocalDate start;

    private LocalDate end;

    /**
     * Creates a work experience with given company name, start and end dates.
     *
     * @param companyName
     *            a company name
     * @param start
     *            a start date
     * @param end
     *            an end date
     */
    public WorkExperience(String companyName, LocalDate start, LocalDate end) {
	setCompanyName(companyName);
	setStart(start);
	setEnd(end);
    }

    /**
     * Returns the company name for this work experience.
     *
     * @return the company name
     */
    public String getCompanyName() {
	return companyName;
    }

    private void setCompanyName(String name) {
	companyName = name;
    }

    /**
     * Returns the start date for this work experience.
     *
     * @return the start date
     */
    public LocalDate getStart() {
	return start;
    }

    private void setStart(LocalDate start) {
	this.start = start;
    }

    /**
     * Returns the end date for this work experience.
     *
     * @return the end date
     */
    public LocalDate getEnd() {
	return end;
    }

    private void setEnd(LocalDate end) {
	this.end = end;
    }
}
