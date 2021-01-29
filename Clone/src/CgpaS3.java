
public class CgpaS3 extends CGpa {
	double gpa[] = new double[5];
	double cgpa;
	
	
	//Student 3
	CgpaS3() {
		this.gpa = new double[] {3.3, 3.5, 3.4, 3.1, 3.0};
		this.cgpa =3.6;		

}
	
	public void printinfoCgpa() {
		infoCgpa(gpa, cgpa);
	}

}
