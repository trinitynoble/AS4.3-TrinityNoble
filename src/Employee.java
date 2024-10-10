import java.util.ArrayList;
import java.util.List;
//I'm using arrays in order to store the job information required.
class Employee {
    private String name;
    private List<Job> jobhistory;

    // Constructor
    public Employee(String name) {
        this.name = name;
        this.jobhistory = new ArrayList<>();
    }

    // Add a job to the employee's history
    public void addJob(Job job) {
        jobhistory.add(job);
    }

    // Display job details for each job in the history
    public void displayJobHistory() {
        for (Job job : jobhistory) {
            job.displayJobDetails();
            System.out.println("Duration: " + job.calculateJobDuration() + " months");
            System.out.println(job.assessJobSatisfaction());
            System.out.println("-----------------------------------");
        }
    }

    // Calculate total experience
    public int calculateTotalExperience() {
        int totalExperience = 0;
        for (Job job : jobhistory) {
            totalExperience += job.calculateJobDuration();
        }
        return totalExperience;
    }
}
