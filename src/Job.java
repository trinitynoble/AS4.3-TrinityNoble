/*
 * Trinity Noble
 * AS3.3 CS325
 * 08.10.24 
 */

//This class defines shared attributes and methods common to all job types.
public abstract class Job {

    public String companyname;
    public String position;
    public String startdate;
    public String enddate;

    // Constructor to create the job object and set its initial values
    //the 'this.' keyword because the variable names are used in both instances.
    public Job(String companyname, String position, String startdate, String enddate) {
        this.companyname = companyname;
        this.position = position;
        this.startdate = startdate;
        this.enddate = enddate;
    }

    // Creating the abstract methods which can be implemented by the subclasses of this abstract class
    public abstract void displayJobDetails();//will display company name, position, start and end
    public abstract int calculateJobDuration();//performs calculation of the difference between start date and end date to determine job duration
    public abstract String assessJobSatisfaction();//Allows the employee to rank the various jobs they have had. This will be either 'High', 'Moderate' or 'Weak'

    // Getters and Setters for each attribute. This encapsulates the attributes so they can be accessible outside of the  class.
    public String getCompanyName() {
        return companyname;
    }
    public void setCompanyName(String companyname) {
        this.companyname = companyname;
    }

    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }

    public String getStartDate() {
        return startdate;
    }
    public void setStartDate(String startdate) {
        this.startdate = startdate;
    }

    public String getEndDate() {
        return enddate;
    }
    public void setEndDate(String enddate) {
        this.enddate = enddate;
    }
}

