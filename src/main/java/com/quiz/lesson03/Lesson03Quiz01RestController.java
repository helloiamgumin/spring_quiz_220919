package com.quiz.lesson03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.quiz.lesson03.bo.RealEstateBO;
import com.quiz.lesson03.model.RealEstate;

@RestController
public class Lesson03Quiz01RestController {

	@Autowired
	private RealEstateBO realEstateBO;
	
	@RequestMapping("/lesson03/quiz01/1")
	public RealEstate quiz01_1(
			@RequestParam("id") int id
	) {
		return realEstateBO.getRealEstate1(id);
	}
	
	@RequestMapping("/lesson03/quiz01/2")
	public RealEstate quiz01_2(
			@RequestParam("rentPrice") int rentPrice
	) {
		//if (rentPrice < ) {
			return realEstateBO.getRealEstate2(rentPrice);
		//}
	}
	
	@RequestMapping("/lesson03/quiz01/3")
	public RealEstate quiz01_3(
			@RequestParam("area") int area
			, @RequestParam("price") int price
	) {
		//if(area >=  & price <= ) {
			return realEstateBO.getRealEstate3(area, price);
		//}
	}
}
