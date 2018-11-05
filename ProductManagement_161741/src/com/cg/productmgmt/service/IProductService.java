package com.cg.productmgmt.service;

import java.util.Map;

import com.cg.productmgmt.exception.ProductException;

interface IProductService {
	public int updateProducts(String Category,int hike) throws ProductException;
	public Map<String,Integer> getProductDetails() throws ProductException;
	boolean validateHikeRate(int rate) throws ProductException;
	boolean validateCategory(String category) throws ProductException;
}
