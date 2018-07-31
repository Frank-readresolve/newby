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


	private void setLevel(Level level) {
	this.level = level;
    }

	@Override
	public String toString() {
		return "Module [level=" + level + "]";
	}
    
    
    
}
