

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Trinity Noble");

        // Create job instances
        FullTimeJob fulltime = new FullTimeJob("Noble Enterprises", "Lead Engineer", "2021", "2024", 60, 40);
        PartTimeJob parttime = new PartTimeJob("Community Pool", "Lifeguard", "2022", "2023", 10, 12);
        ContractJob contract = new ContractJob("Trinity Realestate", "Real Estate Agent", "2022", "2024", 80, 90);

        // Add jobs to employee's history
        employee.addJob(fulltime);
        employee.addJob(parttime);
        employee.addJob(contract);
        employee.displayJobHistory();
//Calculation of the total job experience
        System.out.println("Total Experience: " + employee.calculateTotalExperience() + " months");

//Displaying the additional methods (I couldnt really think of anything else so i followed your example, I hope you dont mind!)
        System.out.println("Full-Time Job Salary: $" + fulltime.calculateSalary());
        System.out.println("Full-Time Job Work-Life Balance: " + fulltime.evaluateWorkLifeBalance());
        System.out.println("Part-Time Job Weekly Earnings: $" + parttime.calculateWeeklyEarnings());
        System.out.println("Part-Time Job Flexibility: " + parttime.evaluateFlexibility());
        System.out.println("Contract Job Payment: $" + contract.calculatePayment());
    }
}
