package io.readresolve.newby;

/**
 * Represents an trainer.
 *
 * @author Frank MARSHALL
 */
public class Trainer {

    private String firstname;

    private String lastname;

    private ContactInfo contactInfo;

    private Resume resume;

    /**
     * Creates a trainee with given firstname, lastname and contact information;
     * and no resume.
     *
     * @param firstname
     *            a firstname
     * @param lastname
     *            a lastname
     * @param info
     *            a contact information
     */
    public Trainer(String firstname, String lastname, ContactInfo info) {
	setFirstname(firstname);
	setLastname(lastname);
	setContactInfo(info);
    }

    /**
     * Returns the firstname for this trainer.
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
     * Returns the lastname for this trainer.
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
     * Returns the contact information for this trainer.
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
     * Returns the resume for this trainer.
     *
     * @return the resume
     */
    public Resume getResume() {
	return resume;
    }

    /**
     * Assigns the given resume to this trainer.
     *
     * @param resume
     *            a resume
     */
    public void setResume(Resume resume) {
	this.resume = resume;
    }
}
