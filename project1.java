import java.util.*;
class Employee{
        int empNo;
        String name;
        String joinDate;
        char designationCode;
        String department;
        int basic, hra,it;

        public Employee(int empNo, String name, String joinDate, char designationCode, String department, int basic, int hra, int it) {
            this.empNo = empNo;
            this.name = name;
            this.joinDate = joinDate;
            this.designationCode = designationCode;
            this.department = department;
            this.basic = basic;
            this.hra = hra;
            this.it = it;
        }
    }

    class Designation {
        String title;
        int da;

        public Designation(String title, int da) {
            this.title = title;
            this.da = da;
        }
    }

public class project1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee Number:");
        int searchId = sc.nextInt();

        Employee[] employees = {
            new Employee(1001, "Ashish", "01-04-2009", 'e', "R&D", 20000, 8000, 3000),
            new Employee(1002, "Sushma", "23-08-2012", 'c', "PM", 30000, 12000, 9000),
            new Employee(1003, "Rahul", "12-11-2008", 'k', "Acct", 10000, 8000, 1000),
            new Employee(1004, "Chahat", "29-01-2013", 'r', "Front Desk", 12000, 6000, 2000),
            new Employee(1005, "Ranjan", "16-07-2005", 'm', "Engg", 50000, 20000, 20000),
            new Employee(1006, "Suman", "01-01-2000", 'e', "Manufacturing", 23000, 9000, 4400),
            new Employee(1007, "Tanmay", "12-06-2006", 'c', "PM", 29000, 12000, 10000),
        };
        
        Map<Character, Designation> designationMap = new HashMap<>();
        designationMap.put('e', new Designation("Engineer", 20000));
        designationMap.put('c', new Designation("Consultant", 32000));
        designationMap.put('k', new Designation("Clerk", 12000));
        designationMap.put('r', new Designation("Receptionist", 15000));
        designationMap.put('m', new Designation("Manager", 40000));

        boolean found = false;
        for (Employee emp : employees) {
            if (emp.empNo == searchId) {
                found = true;
                Designation d = designationMap.get(emp.designationCode);
                int salary = emp.basic + emp.hra + d.da- emp.it; 

                System.out.println("EmpNO\tEmpName\tDepartment\tDesignation\tSalary");
                System.out.println(emp.empNo + "\t" + emp.name + "\t" + emp.department + "\t\t" + d.title + "\t\t" + salary);
                break;
            }
        }
        if(!found){
            System.out.println("Employee with ID " + searchId + " not found.");
        }

        sc.close();
}
}
