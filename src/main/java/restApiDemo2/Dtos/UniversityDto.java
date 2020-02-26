package restApiDemo2.Dtos;

import java.util.List;

public class UniversityDto {

	private String ClassNumber;
	private String GPA;
	private String Grade;

	private List<StudentsDto> students;

	public String getClassNumber() {
		return ClassNumber;
	}

	public void setClassNumber(String classNumber) {
		ClassNumber = classNumber;
	}

	public String getGPA() {
		return GPA;
	}

	public void setGPA(String gPA) {
		GPA = gPA;
	}

	public String getGrade() {
		return Grade;
	}

	public void setGrade(String grade) {
		Grade = grade;
	}

	public List<StudentsDto> getStudents() {
		return students;
	}

	public void setStudents(List<StudentsDto> students) {
		this.students = students;
	}

	@Override
	public String toString() {
		return "UniversityDto [ClassNumber=" + ClassNumber + ", GPA=" + GPA + ", Grade=" + Grade + ", students="
				+ students + "]";
	}

}
