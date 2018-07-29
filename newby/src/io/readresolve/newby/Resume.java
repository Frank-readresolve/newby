package io.readresolve.newby;

import java.util.*;

/**
 * Reprsents a resume.
 *
 * @author Frank MARSHALL
 */
public class Resume {

    private String title;

    private String profile;

    private List<Diploma> diplomas = new ArrayList<>();

    private List<WorkExperience> experiences = new ArrayList<>();

    /**
     * Creates a resume with given title and profile; and no diploma and no work
     * experience.
     *
     * @param title
     *            a title
     * @param profile
     *            a profile
     */
    public Resume(String title, String profile) {
	setTitle(title);
	setProfile(profile);
    }

    /**
     * Returns the title for this resume.
     *
     * @return the title
     */
    public String getTitle() {
	return title;
    }

    private void setTitle(String title) {
	this.title = title;
    }

    /**
     * Returns the profile for this resume.
     *
     * @return the profile
     */
    public String getProfile() {
	return profile;
    }

    private void setProfile(String profile) {
	this.profile = profile;
    }

    /**
     * Returns an <i>immutable</i> view of the diplomas for this resume.
     *
     * @return the diplomas
     */
    public List<Diploma> getDiplomas() {
	return Collections.unmodifiableList(diplomas);
    }

    /**
     * Adds a diploma to this resume.
     *
     * @param diploma
     *            a diploma to add
     * @return {@code true} if the diploma was added; {@code false} otherwise
     */
    public boolean addDiploma(Diploma diploma) {
	return diplomas.add(diploma);
    }

    /**
     * Returns an <i>immutable</i> view of the work experiences for this resume.
     *
     * @return the work experiences
     */
    public List<WorkExperience> getWorkExperiences() {
	return Collections.unmodifiableList(experiences);
    }

    /**
     * Adds a work experience to this resume.
     *
     * @param experience
     *            a work experiences to add
     * @return {@code true} if the work experiences was added; {@code false}
     *         otherwise
     */
    public boolean addWorkExperience(WorkExperience experience) {
	return experiences.add(experience);
    }
}
