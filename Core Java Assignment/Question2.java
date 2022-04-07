class EmployeeDetail{
    private String emp_Id;
    private String name;
    private String email;
    private String phone_no;

    public void setEmpId(String emp_Id){
        this.emp_Id=emp_Id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setPhone(String phone){
        this.phone_no = phone;
    }


    public String getEmp_Id(){
        return emp_Id;
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public String getPhone(){
        return phone_no;
    }
}


public class Question2 {
    public static void main(String[] args) { 
        EmployeeDetail emp1 = new EmployeeDetail();
        emp1.setName("Aman Gaud");
        emp1.setEmpId("225609832232442343243");
        emp1.setEmail("aman.gaud@starkindustries");
        emp1.setPhone("798718823430");

        System.out.println("Name : "+emp1.getName()+ "\nEmployee Id : "+emp1.getEmp_Id()+ "\nEmail : "+emp1.getEmail()+ "\nPhone Number : "+emp1.getPhone());
    }
}
