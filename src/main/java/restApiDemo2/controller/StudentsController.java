package restApiDemo2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



import restApiDemo2.Dtos.StudentsDto;

@RestController
@RequestMapping("/studentid")

public class StudentsController {

	@GetMapping(value = "")

	public StudentsDto getStudents() {

		StudentsDto dto = new StudentsDto();
		dto.setName("Bikash Thapa");
		dto.setAddress("Rocky Mount, NC");
		dto.setEmailAddress("bt217859@gmail.com");
		dto.setGender("Male");

		return dto;

	}

	@PostMapping(value = "")
	public void createStudents(@RequestBody StudentsDto dto) {
		System.out.println(dto.toString());
	}
}
