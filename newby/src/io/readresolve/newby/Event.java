package io.readresolve.newby;

import java.time.ZonedDateTime;

/**
 * Represents an event.
 *
 * @author Frank MARSHALL
 */
public class Event {



	private Course course;

    private Room room;

    private ZonedDateTime start;

    private ZonedDateTime end;

    /**
     * Creates an event with given course, room, start and end dates.
     *
     * @param course
     *            a course
     * @param room
     *            a room
     * @param start
     *            a start date
     * @param end
     *            an end date
     */
    public Event(Course course, Room room, ZonedDateTime start,
	    ZonedDateTime end) {
	setCourse(course);
	setRoom(room);
	setStart(start);
	setEnd(end);
    }

    /**
     * Returns the course for this event.
     *
     * @return the course
     */
    public Course getCourse() {
	return course;
    }

    private void setCourse(Course course) {
	this.course = course;
    }

    /**
     * Returns the room for this event.
     *
     * @return the room
     */
    public Room getRoom() {
	return room;
    }

    private void setRoom(Room room) {
	this.room = room;
    }

    /**
     * Returns the start date for this event.
     *
     * @return the start date
     */
    public ZonedDateTime getStart() {
	return start;
    }

    private void setStart(ZonedDateTime start) {
	this.start = start;
    }

    /**
     * Returns the end date for this event.
     *
     * @return the end date
     */
    public ZonedDateTime getEnd() {
	return end;
    }

    private void setEnd(ZonedDateTime end) {
	this.end = end;
	
    }
    
    @Override
	public String toString() {
		return "Event YOUNES [course=" + course + ", room=" + room + ", start=" + start + ", end=" + end + "]";
	}
}
