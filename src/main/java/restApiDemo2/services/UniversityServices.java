package restApiDemo2.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import restApiDemo2.Dtos.StudentsDto;
import restApiDemo2.Dtos.UniversityDto;

@Service
public class UniversityServices {

	public UniversityDto getStudents() {
		UniversityDto u = new UniversityDto();
		u.setClassNumber("BIO-123");
		u.setGPA("3.89");
		u.setGrade("A");

		List<StudentsDto> students = new ArrayList<StudentsDto>();

		StudentsDto s1 = new StudentsDto();
		s1.setName("Bikash Thapa");
		s1.setAddress("Rocky Mount");
		s1.setEmailAddress("bkasthapa030@yahoo.com");
		s1.setGender("Male");

		StudentsDto s2 = new StudentsDto();
		s2.setName("Bijaya Thapa");
		s2.setAddress("Pokhara, Nepal");
		s2.setEmailAddress("bjthapa@yahoo.com");
		s2.setGender("Male");

		students.add(s1);
		students.add(s2);

		u.setStudents(students);

		return u;
	}

}
