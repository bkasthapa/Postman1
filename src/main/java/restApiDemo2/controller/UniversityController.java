package restApiDemo2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import restApiDemo2.Dtos.UniversityDto;
import restApiDemo2.services.UniversityServices;

@RestController
@RequestMapping("/colleges")
public class UniversityController {

	private UniversityServices universityservices;

	@GetMapping("")
	public UniversityDto getStudentByID() {
		return universityservices.getStudents();

	}

	public UniversityServices getUniversityservices() {
		return universityservices;
	}

	public void setUniversityservices(UniversityServices universityservices) {
		this.universityservices = universityservices;
	}

}
