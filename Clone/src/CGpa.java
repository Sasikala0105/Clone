
public class CGpa {
	double gpa[] = new double[5];
	double cgpa;



public void infoCgpa(double a[], double b) {
	this.gpa=a;
	this.cgpa=b;
	
	double sum=0, finalCgpa=0;
	for(int i=0; i<gpa.length; i++) {
		sum+= gpa[i];
		
		System.out.println("GPA" +i+ "    : "+gpa[i]);
		
	}
	
	finalCgpa= sum/gpa.length;
	System.out.println("Average Cgpa "+finalCgpa);
	System.out.println("--------------------------------");
	

}
}
