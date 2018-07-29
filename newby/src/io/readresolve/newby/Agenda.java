package io.readresolve.newby;

import java.util.*;

/**
 * Represents an agenda.
 *
 * @author Frank MARSHALL
 */
public class Agenda {

    private List<Event> events = new ArrayList<>();

    /**
     * Creates an agenda with no event.
     */
    public Agenda() {
	// EMpty constructor
    }

    /**
     * Returns an <i>immutable</i> view of the events for this agenda.
     *
     * @return the events
     */
    public List<Event> getEvents() {
	return Collections.unmodifiableList(events);
    }

    /**
     * Adds an event to this agenda.
     *
     * @param event
     *            an event to add
     * @return {@code true} if the event was added; {@code false} otherwise
     */
    public boolean addEvent(Event event) {
	return events.add(event);
    }
}
