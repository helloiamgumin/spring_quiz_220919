package com.quiz.lesson03.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.lesson03.dao.RealEstateDAO;
import com.quiz.lesson03.model.RealEstate;

@Service
public class RealEstateBO {
	
	// input: controller가 넘겨주는 id
	// output: RealEsate 한 행(단건)
	@Autowired
	private RealEstateDAO realEstateDAO;
	
	// input: controller가 넘겨주는 id
	// output: RealEsate 단건 => 컨트롤러하나테 넘김
	public RealEstate getRealEstateById(int id) {
		return realEstateDAO.selectRealEstateById(id);
	}
	
	// input: controller가 넘겨준 rentPrice
	// output: List<RealEstate> => 컨트롤러한테 넘김 
	public List<RealEstate> getRealEstateListByRentPrice(int rentPrice) {
		return realEstateDAO.selectRealEstateListByRentPrice(rentPrice);
	}
	
	// input: 컨트롤러가 넘겨준 area, price
	// output: List<RealEstate> => 컨트롤러한테 넘김
	public List<RealEstate> getRealEstateListByAreaPrice(int area, int price) {
		return realEstateDAO.selectRealEstateListByAreaPrice(area, price);
	}
	
	// input: RealEstate
	// output: int(성공한 행의 개수)
	public int addRealEstate(RealEstate realEstate) {
		return realEstateDAO.insertRealEstate(realEstate);
	}
	
	public int addRealEstateAsField(int realtorId, String address, int area, String type,
			int price, Integer rentPrice) {
		
		return realEstateDAO.insertRealEstateAsField(realtorId, address, area, type, price, rentPrice);
	}
	
	public int updateRealEstateById(int id, String type, int price) {
		return realEstateDAO.updateRealEstateById(id, type, price);
	}
	
	public void deleteRealEstateById(int id) {
		realEstateDAO.deleteRealEstateById(id);
	}
}
