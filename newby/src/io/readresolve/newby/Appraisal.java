package io.readresolve.newby;

/**
 * Represents an appraisal.
 *
 * @author Frank MARSHALL
 */
public class Appraisal {

    private Trainee trainee;

    private Module module;

    private Grade grade;

    /**
     * Creates an appraisal with given trainee, module and grade.
     * 
     * @param trainee
     *            a trainee
     * @param module
     *            a module
     * @param grade
     *            a grade
     */
    public Appraisal(Trainee trainee, Module module, Grade grade) {
	setTrainee(trainee);
	setModule(module);
	setGrade(grade);
    }

    /**
     * Returns the trainee for this appraisal.
     *
     * @return the trainee
     */
    public Trainee getTrainee() {
	return trainee;
    }

    private void setTrainee(Trainee trainee) {
	this.trainee = trainee;
    }

    /**
     * Returns the module for this appraisal.
     *
     * @return the module
     */
    public Module getModule() {
	return module;
    }

    private void setModule(Module module) {
	this.module = module;
    }

    /**
     * Returns the grade for this appraisal.
     *
     * @return the grade
     */
    public Grade getGrade() {
	return grade;
    }

    private void setGrade(Grade grade) {
	this.grade = grade;
    }

	@Override
	public String toString() {
		return "Appraisal [trainee=" + trainee + ", module=" + module + ", grade=" + grade + "]";
	}
}
