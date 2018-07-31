package io.readresolve.newby;

/**
 * Represents a room.
 *
 * @author Frank MARSHALL
 */
public class Room {

    private School school;

    private String name;

    /**
     * Creates a room with given school and name.
     *
     * @param school
     *            a school
     * @param name
     *            a name
     */
    public Room(School school, String name) {
	setSchool(school);
	setName(name);
    }

    /**
     * Returns the school for this room.
     *
     * @return the school
     */
    public School getSchool() {
	return school;
    }

    private void setSchool(School school) {
	this.school = school;
    }

    /**
     * Returns the name for this room.
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

		return "Room est notre ecole [school=" + school + ", name=" + name + "]";

	}
    
    
}
