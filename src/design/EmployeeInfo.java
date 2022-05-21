package design;

import java.util.Scanner;

public class EmployeeInfo {

    /*This class can be implemented from Employee interface then add additional methods in EmployeeInfo class.
     * Also, Employee interface can be implemented into an abstract class.So create an Abstract class
     * then inherit that abstract class into EmployeeInfo class.Once you done with designing EmployeeInfo class,
     * go to FortuneEmployee class to apply all the fields and attributes.
     *
     * Important: YOU MUST USE the
     * OOP(abstraction,Encapsulation, Inheritance and Polymorphism) concepts in every level possible.
     * Use all kind of keywords(super,this,static,final........)
     * Implement Nested class.
     * Use Exception Handling.
     *
     */

    /*
     * declare few static and final fields and some non-static fields
     */
    static String companyName, date;
    int employeeId, salary;
    String name, address, department, email;



    /*
     * You must implement the logic for below 2 methods and
     * following 2 methods are prototype as well for other methods need to be design,
     * as you will come up with the new ideas.
     */

    /*
     * you must have multiple constructor.
     * Must implement below constructor.
     */
    public int getEmployeeInfo() {

        return employeeId;

    }

    public void setEmployeeInfo(int employeeId) {

        this.employeeId = employeeId;

    }

    public int getSalary() {

        return salary;
    }

    public void setSalary(int salary) {

        this.salary = salary;
    }

    public String getName() {

        return name;

    }

    public void setName(String name) {

        this.name = name;

    }

    public String getAddress() {

        return address;

    }

    public void setAddress(String address) {

        this.address = address;

    }

    public String getDepartment() {

        return department;

    }

    public void setDepartment(String department) {

        this.department = department;

    }

    public String getEmail() {

        return email;

    }

    public void setEmail(String email) {

        this.email = email;

    }

    /*
     * This methods should calculate Employee bonus based on salary and performance.
     * Then it will return the total yearly bonus. So you need to implement the logic.
     * Hints: 10% of the salary for best performance, 8% of the salary for average performance and so on.
     * You can set arbitrary number for performance.
     * So you probably need to send 2 arguments.
     *
     */
    public static int calculateEmployeeBonus() {


        //Getting salary using getter
        int sal = emp.getSalary();
        int increment = 0;
        //Incrementing salary based on condition
        if ((sal >= 1000) && (sal <= 1500)) {
            //incrementing salary 2%
            increment += (sal * 2) / 100;
            sal = sal + increment;

            emp.setSalary(sal);
            System.out.println("\n Salary is incremented \n");
            System.out.println(emp);

        } else if ((sal >= 1500) && (sal <= 5000)) {
            //incrementing salary 5%
            increment += (sal * 5) / 100;
            sal = sal + increment;

            emp.setSalary(sal);
            System.out.println("\n Salary is incremented \n");
            System.out.println(emp);
        } else if ((sal >= 5000 ) && (sal <= 25000)) {
            //incrementing salary 5%
            increment += (sal * 10) / 100;
            sal = sal + increment;

            emp.setSalary(sal);
            System.out.println("\n Salary is incremented \n");
            System.out.println(emp);
        }


        else {
            System.out.println("\n Salary is not incremented \n");
            System.out.println(emp);
        }









        /*
         * This methods should calculate Employee Pension based on salary and numbers of years with the company.
         * Then it will return the total pension. So you need to implement the logic.
         * Hints: pension will be 5% of the salary for 1 year, 10% for 2 years with the company and so on.
         *
         */
        public static int calculateEmployeePension() {
            int total = 0;
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter start date in format (example: May,2015): ");
            String joiningDate = sc.nextLine();
            System.out.println("Please enter today's date in format (example: August,2017): ");
            String todaysDate = sc.nextLine();
            String convertedJoiningDate = DateConversion.convertDate(joiningDate);
            String convertedTodaysDate = DateConversion.convertDate(todaysDate);

            //implement numbers of year from above two dates
            //Calculate pension


            return total;
        }
        private static class DateConversion {

            public DateConversion(Months months) {
            }

            public static String convertDate(String date) {
                String[] extractMonth = date.split(",");
                String givenMonth = extractMonth[0];
                int monthDate = whichMonth(givenMonth);
                String actualDate = monthDate + "/" + extractMonth[1];
                return actualDate;
            }

            public static int whichMonth(String givenMonth) {
                Months months = Months.valueOf(givenMonth);
                int date = 0;
                switch (months) {
                    case January:
                        date = 1;
                        break;
                    case February:
                        date = 2;
                        break;
                    case March:
                        date = 3;
                        break;
                    case April:
                        date = 4;
                        break;
                    case May:
                        date = 5;
                        break;
                    case June:
                        date = 6;
                        break;
                    case July:
                        date = 7;
                        break;
                    case August:
                        date = 8;
                        break;
                    case September:
                        date = 9;
                        break;
                    case October:
                        date = 10;
                        break;
                    case November:
                        date = 11;
                        break;
                    case December:
                        date = 12;
                        break;
                    default:
                        date = 0;
                        break;
                }
                return date;

            }
        }
    }
}
