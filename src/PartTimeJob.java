// PartTimeJob.java
class PartTimeJob extends Job {
    private double hourlywage;
    private int hoursperweek;

    // Constructor
    public PartTimeJob(String companyname, String position, String startdate, String enddate, double hourlywage, int hoursperweek) {
        super(companyname, position, startdate, enddate); // Call to parent class constructor
        this.hourlywage = hourlywage;
        this.hoursperweek = hoursperweek;
    }

    @Override
    public void displayJobDetails() {
        System.out.println("Part-Time Job at " + companyname + " as " + position);
        System.out.println("Start Date: " + startdate + ", End Date: " + enddate);
    }
//Assuming a parttime job is 12 months.
    @Override
    public int calculateJobDuration() {
        return 12; 
    }

    @Override
    public String assessJobSatisfaction() {
        return "Job Satisfaction: Moderate";
    }

    public double calculateWeeklyEarnings() {
        return hourlywage * hoursperweek;
    }

    public String evaluateFlexibility() {
        return hoursperweek <= 20 ? "Highly flexible schedule" : "Moderately flexible schedule";
    }
}