package com.quiz.lesson03.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.lesson03.dao.RealEstateDAO;
import com.quiz.lesson03.model.RealEstate;

@Service
public class RealEstateBO {

	@Autowired
	private RealEstateDAO realEstateDAO;
	
	public RealEstate getRealEstate1(int id) {
		return realEstateDAO.selectRealEstate1(id);
	}
	
	public RealEstate getRealEstate2(int rentPrice) {
		return realEstateDAO.selectRealEstate2(rentPrice);
	}
	
	public RealEstate getRealEstate3(int area, int price) {
		return realEstateDAO.selectRealEstate3(area, price);
	}
}
