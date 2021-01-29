
public class CgpaS2 extends CGpa{
	
	double gpa[] = new double[4];
	double cgpa;
	
	
	//Student 2
	CgpaS2() {
		this.gpa = new double[] {2.8, 3.0, 3.4, 3.5};
		this.cgpa =3.6;

}
	public void printinfoCgpa() {
		infoCgpa(gpa, cgpa);

}
}