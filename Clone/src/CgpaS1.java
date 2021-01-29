
public class CgpaS1 extends CGpa {
	double gpa[] = new double[4];
	double cgpa;
	
	
	//Student 1
	CgpaS1() {
		this.gpa = new double[] {3.0, 3.2, 3.4, 3.9};
		this.cgpa =3.5;
		
	
	}
	
	public void printinfoCgpa() {
		infoCgpa(gpa, cgpa);

}
}
