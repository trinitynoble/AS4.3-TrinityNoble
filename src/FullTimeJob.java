// Inherits common attributes and methods from the Job class. It adds specific attributes and methods from the Job class.
class FullTimeJob extends Job {
    private double hourlywage;
    private int hoursperweek;

    // initialize the attributes of a full time Job.
    public FullTimeJob(String companyname, String position, String startdate, String enddate, double hourlywage, int hoursperweek) {
        super(companyname, position, startdate, enddate); // Call to parent class constructor
        this.hourlywage = hourlywage;
        this.hoursperweek = hoursperweek;
    }

    @Override
    public void displayJobDetails() {
        System.out.println("Full Time Job at " + companyname + " as " + position);
        System.out.println("Start Date: " + startdate + ", End Date: " + enddate);
    }
    //This is a less complex calculation, so it doesnt deal with dates and stuff
    @Override
    public int calculateJobDuration() {
        return 72;
    }

    @Override
    public String assessJobSatisfaction() {
        return "Job Satisfaction: High";
    }

    public double calculateSalary() {
        return hourlywage * hoursperweek * 4; // multiplied by 4 bc there are typically 4 weeks in a month
    }

    public String evaluateWorkLifeBalance() {
        if (hoursperweek <= 40) {
            return "Excellent work life balance";
        } else {
            return "Poor work life balance";
        }
    }
}
