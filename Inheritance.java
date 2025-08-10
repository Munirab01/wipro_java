import java.lang.management.PlatformManagedObject;

class Employee{
    int eid,mob ;
    double da,hra,pf,cfund,gross,net;
    String ename,address,mailed;
    Employee(){}
}
class Programmer extends Employee{
    int bp_p;
    Programmer(int a,int b,String c,String d,String e,int i){
      eid=a;
      mob=b;
      ename=c;
      address=d;
      mailed=e;
      bp_p=i;
    }
    void cal_p(){
        da=((bp_p*97)/100);
        hra=((bp_p*10)/100);
        pf=((bp_p*12)/100);
        cfund=((bp_p*0.01)/100);
        gross=bp_p+da+hra+pf+cfund;
        net=bp_p+da+hra-pf-cfund;
        System.out.println("Gross sal of Programmer"+gross);
        System.out.println("Net sal of Programmer"+net);
        System.out.println("Sal details=>"+"name="+ename+"BP="+bp_p+"DA="+da+"HRA="+hra+"PF="+pf+"cfund="+cfund);
    }
}
class Team_Lead extends Employee{
    int bp_t;
    Team_Lead(int a ,int b,String c,String d,String e,int i){
      eid=a;
      mob=b;
      ename=c;
      address=d;
      mailed=e;
      bp_t=i;
    }
     void cal_t(){
        da=((bp_t*97)/100);
        hra=((bp_t*10)/100);
        pf=((bp_t*12)/100);
        cfund=((bp_t*0.01)/100);
        gross=bp_t+da+hra+pf+cfund;
        net=bp_t+da+hra-pf-cfund;
        System.out.println("Gross sal of Programmer"+gross);
        System.out.println("Net sal of Programmer"+net);
        System.out.println("Sal details=>"+"name="+ename+"BP="+bp_t+"DA="+da+"HRA="+hra+"PF="+pf+"cfund="+cfund);
    }
}
class AssProjMan extends Employee{
    int bp_a;
    AssProjMan(int a ,int b,String c,String d,String e,int i){
      eid=a;
      mob=b;
      ename=c;
      address=d;
      mailed=e;
      bp_a=i;
    }
     void cal_a(){
        da=((bp_a*97)/100);
        hra=((bp_a*10)/100);
        pf=((bp_a*12)/100);
        cfund=((bp_a*0.01)/100);
        gross=bp_a+da+hra+pf+cfund;
        net=bp_a+da+hra-pf-cfund;
        System.out.println("Gross sal of Programmer"+gross);
        System.out.println("Net sal of Programmer"+net);
        System.out.println("Sal details=>"+"name="+ename+"BP="+bp_a+"DA="+da+"HRA="+hra+"PF="+pf+"cfund="+cfund);
    }
}
class ProjectManager extends Employee{
    int bp_pm;
    ProjectManager(int a ,int b,String c,String d,String e,int i){
      eid=a;
      mob=b;
      ename=c;
      address=d;
      mailed=e;
      bp_pm=i;
    }
     void cal_pm(){
        da=((bp_pm*97)/100);
        hra=((bp_pm*10)/100);
        pf=((bp_pm*12)/100);
        cfund=((bp_pm*0.01)/100);
        gross=bp_pm+da+hra+pf+cfund;
        net=bp_pm+da+hra-pf-cfund;
        System.out.println("Gross sal of Programmer"+gross);
        System.out.println("Net sal of Programmer"+net);
        System.out.println("Sal details=>"+"name="+ename+"BP="+bp_pm+"DA="+da+"HRA="+hra+"PF="+pf+"cfund="+cfund);
    }
}

public class Inheritance {
    public static void main(String args[])
    {
        Employee e =new Employee();
        Programmer pr =new Programmer(1,98907,"hnk","nashik","hnk@gmail.com",35000);
        Team_Lead t = new Team_Lead(5,8907,"Mayur","nashik","mayur@gmail.com",78000);
        AssProjMan a= new AssProjMan(3, 9891, "Priyanka", "Pune", "priya@gmail.com",50000);
        ProjectManager pm= new ProjectManager(2, 9807, "Nirag", "Mumbai", "01.nirag@gmail.com", 70000);
        pr.cal_p();
        t.cal_t();
        a.cal_a();
        pm.cal_pm();
    }
}
    

