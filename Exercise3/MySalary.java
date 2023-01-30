package Exercise3;

public class MySalary {

    public static void main(String[] args) {

            SalaryBase sb=new SalaryBase();             //calling Base Salary

            SalaryEmployee se= new SalaryEmployee() ;   //calling Employee Salary

            SalaryPresident sp=new SalaryPresident();   //calling President Salary

        //for all salary output
        System.out.println("Base Salary : "+sb.calcSalary(500,300));
        System.out.println("President Salary : " +sp.calcSalary(500,600));
        System.out.println("Employee Bonus : "+se.clcBonus(500));
        System.out.println("Employee Salary : "+se.calcSalary(500,600));


    }
}
