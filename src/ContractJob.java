
class ContractJob extends Job {
    private double hourlyrate;
    private int totalhoursworked;

    // Constructor
    public ContractJob(String companyname, String position, String startdate, String enddate, double hourlywage, int hoursperweek) {
        super(companyname, position, startdate, enddate); // Call to parent class constructor
        this.hourlyrate = hourlyrate;
        this.totalhoursworked = totalhoursworked;
    }

    @Override
    public void displayJobDetails() {
        System.out.println("Contract Job at " + companyname + " as " + position);
        System.out.println("Start Date: " + startdate + ", End Date: " + enddate);
    }
    //assuming a contract job is 24 months 
    @Override
    public int calculateJobDuration() {
        return 24;
    }

    @Override
    public String assessJobSatisfaction() {
        return "Job Satisfaction: Variable";
    }

    public double calculatePayment() {
        return hourlyrate * totalhoursworked;
    }

    public String evaluateJobSecurity() {
        return "Job Security: Low";
    }
}