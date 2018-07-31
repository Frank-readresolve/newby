package io.readresolve.newby;

import java.util.*;

/**
 * Reprsents a course.
 *
 * @author Frank MARSHALL
 */
public class Course {

    private Module module;

    private Trainer trainer;

    private List<Trainee> trainees = new ArrayList<>();

    /**
     * Creates a course with given module and trainer; and no trainee.
     *
     * @param module
     *            a module
     * @param trainer
     *            a trainer
     */
    public Course(Module module, Trainer trainer) {
	setModule(module);
	setTrainer(trainer);
    }

    /**
     * Returns the module for this course.
     *
     * @return the module
     */
    public Module getCourse() {
	return module;
    }

    private void setModule(Module module) {
	this.module = module;
    }

    /**
     * Returns the trainer for this course.
     *
     * @return the trainer
     */
    public Trainer getTrainer() {
	return trainer;
    }

    private void setTrainer(Trainer trainer) {
	this.trainer = trainer;
    }

    /**
     * Returns an <i>immutable</i> view of the trainees for this course.
     *
     * @return the trainees
     */
    public List<Trainee> getTrainees() {
	return Collections.unmodifiableList(trainees);
    }

    /**
     * Adds a trainee to this course.
     *
     * @param trainee
     *            a trainee to add
     * @return {@code true} if the trainee was added; {@code false} otherwise
     */
    public boolean addTrainee(Trainee trainee) {
	return trainees.add(trainee);
    }

	@Override
	public String toString() {
		return "Course [module=" + module + ", trainer=" + trainer + ", trainees=" + trainees + "]";
	}
    
    
}
