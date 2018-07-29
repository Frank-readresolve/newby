package io.readresolve.newby;

/**
 * Represents an trainee.
 *
 * @author Frank MARSHALL
 */
public class Trainee {

    private String firstname;

    private String lastname;

    private ContactInfo contactInfo;

    private Address address;

    private Resume resume;

    /**
     * Creates a trainee with given firstname, lastname, contact information and
     * address; and no resume.
     *
     * @param firstname
     *            a firstname
     * @param lastname
     *            a lastname
     * @param info
     *            a contact information
     * @param address
     *            an address
     */
    public Trainee(String firstname, String lastname, ContactInfo info,
	    Address address) {
	setFirstname(firstname);
	setLastname(lastname);
	setContactInfo(info);
	setAddress(address);
    }

    /**
     * Returns the firstname for this trainee.
     *
     * @return the firstname
     */
    public String getFirstname() {
	return firstname;
    }

    private void setFirstname(String firstname) {
	this.firstname = firstname;
    }

    /**
     * Returns the lastname for this trainee.
     *
     * @return the lastname
     */
    public String getLastname() {
	return lastname;
    }

    private void setLastname(String lastname) {
	this.lastname = lastname;
    }

    /**
     * Returns the contact information for this trainee.
     *
     * @return the contact information
     */
    public ContactInfo getContactInfo() {
	return contactInfo;
    }

    private void setContactInfo(ContactInfo info) {
	contactInfo = info;
    }

    /**
     * Returns the address for this trainee.
     *
     * @return the address
     */
    public Address getAddress() {
	return address;
    }

    private void setAddress(Address address) {
	this.address = address;
    }

    /**
     * Returns the resume for this trainee.
     *
     * @return the resume
     */
    public Resume getResume() {
	return resume;
    }

    /**
     * Assigns the given resume to this trainee.
     *
     * @param resume
     *            a resume
     */
    public void setResume(Resume resume) {
	this.resume = resume;
    }
}
