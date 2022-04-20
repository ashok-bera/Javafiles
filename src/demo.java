
class Employee{  
 float salary=40000;  
}  
class demo extends Employee{  
 int bonus=10000;  
 public static void main(String args[]){  
   demo p=new demo();  
   System.out.println("Programmer salary is:"+p.salary);  
   System.out.println("Bonus of Programmer is:"+p.bonus);  
}  
}  
