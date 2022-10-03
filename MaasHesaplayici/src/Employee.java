
public class Employee {
	String name;
	double salary;
	int workHours;
	int hireYear;
    double tax;
	double raiseSalary;
    double bonus;
	
	 Employee(String name, int salary, int workHours, int hireYear) {
	        this.name = name;
	        this.salary = salary;
	        this.workHours = workHours;
	        this.hireYear = hireYear;
	        
	    }




void tax() {
	
	if(salary>=0 && salary<1000) {
		this.tax=this.salary*0;
	}else {
		this.tax=this.salary*0.03;
	}
	
}
void bonus() {
	if(workHours>40) {
		this.bonus = 30 * (this.workHours - 40);
		
	}
}

void raiseSalary() {
	if(2021- hireYear<10) {
		this.raiseSalary=this.salary*0.05;
	}else if (2021 - this.hireYear > 9 && 2021 - this.hireYear < 20) {
        this.raiseSalary = this.salary * 0.10;
    } else {
        this.raiseSalary = this.salary * 0.15;
    }
	
	
}


public String toString() {
	return  "Name: "+ name + "\nHire Year:" +hireYear + "\nWorking Hours : "+ workHours+ "\nSalary: " + salary+ "\nBonus:  " +bonus+
			"\nTax: " +tax +"\nRise in Salary: "+ raiseSalary+  "\nSalary with Taxes and Bonuses : "  + (salary+bonus-tax)+ "\nNet Salary: "+((salary+bonus-tax)+raiseSalary) ;
	
	
}


}