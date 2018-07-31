package io.readresolve.newby;

/**
 * Represents a module.
 *
 * @author Frank MARSHALL
 */
public class Module {

    private Topic topic;

    private Level level;

    /**
     * Creates a module with given topic and level.
     *
     * @param topic
     *            a topic
     * @param level
     *            a level
     */
    public Module(Topic topic, Level level) {
	setTopic(topic);
	setLevel(level);
    }

    /**
     * Returns the topic for this module.
     *
     * @return the topic
     */
    public Topic getTopic() {
	return topic;
    }

    private void setTopic(Topic topic) {
	this.topic = topic;
    }

    /**
     * Returns the level for this module.
     *
     * @return the level
     */
    public Level getLevel() {
	return level;
    }

    @Override
	public String toString() {
		return "Module [topic=" + topic + ", level=" + level + "]";
	}

	private void setLevel(Level level) {
	this.level = level;
    }

	/**
	 * @param arg0
	 * @return
	 * @see java.lang.Enum#compareTo(java.lang.Enum)
	 */
	public final int compareTo(Level arg0) {
		return level.compareTo(arg0);
	}

	/**
	 * @param arg0
	 * @return
	 * @see java.lang.Enum#equals(java.lang.Object)
	 */
	public final boolean equals(Object arg0) {
		return level.equals(arg0);
	}

	/**
	 * @return
	 * @see java.lang.Enum#getDeclaringClass()
	 */
	public final Class<Level> getDeclaringClass() {
		return level.getDeclaringClass();
	}

	/**
	 * @return
	 * @see java.lang.Enum#hashCode()
	 */
	public final int hashCode() {
		return level.hashCode();
	}

	/**
	 * @return
	 * @see java.lang.Enum#name()
	 */
	public final String name() {
		return level.name();
	}

	/**
	 * @return
	 * @see java.lang.Enum#ordinal()
	 */
	public final int ordinal() {
		return level.ordinal();
	}
    
    
    
}
