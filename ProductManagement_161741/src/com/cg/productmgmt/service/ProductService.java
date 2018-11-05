package com.cg.productmgmt.service;
import java.util.Map;

import co.cg.productmgmt.dao.IProductDAO;
import co.cg.productmgmt.dao.ProductDAO;

import com.cg.productmgmt.exception.ProductException;
public class ProductService implements IProductService{
	IProductDAO proDao = new ProductDAO();
		// TODO Auto-generated constructor stub
	public int updateProducts(String Category,int hike) throws ProductException{
		return proDao.updateProducts(Category, hike);
		
	}
	public Map<String,Integer> getProductDetails() throws ProductException{
		return null;
		
	}
	@Override
	public boolean validateHikeRate(int rate) throws ProductException {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean validateCategory(String category) throws ProductException {
		// TODO Auto-generated method stub
		return false;
	}
	

}
