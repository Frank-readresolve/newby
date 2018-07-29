package io.readresolve.newby;

/**
 * Represents a contact information.
 *
 * @author Frank MARSHALL
 */
public class ContactInfo {

    private String mobile;

    private String email;

    /**
     * Creates a contact information with given mobile number and email address.
     *
     * @param number
     *            a mobile number
     * @param address
     *            an email address
     */
    public ContactInfo(String number, String address) {
	setMobile(number);
	setEmail(address);
    }

    /**
     * Returns the mobile number for this contact information.
     *
     * @return the mobile
     */
    public String getMobile() {
	return mobile;
    }

    private void setMobile(String number) {
	mobile = number;
    }

    /**
     * Returns the email address for this contact information.
     *
     * @return the email address
     */
    public String getEmail() {
	return email;
    }

    private void setEmail(String address) {
	email = address;
    }
}
