package com.quiz.lesson03;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.quiz.lesson03.model.RealEstate;

@RestController
public class Lesson03Quiz01RestController {

	//http://localhost/lesson03/quiz01/1?id=20
	public RealEstate quiz01(@RequestParam("id") int id) {
	
		return realEstateBO.getRealEstate(id);
	}
	
}
