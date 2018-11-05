package co.cg.productmgmt.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.cg.productmgmt.dto.Product;
import com.cg.productmgmt.exception.ProductException;

public class ProductDAO implements IProductDAO{
	//map for product Name as key and category as value
	static Map<String,String> productDetails;
	//map for product name as key and product price as value
	static Map<String,Integer> salesDetails;
	static {
		productDetails = new HashMap<>();
		productDetails.put("lux", "soap");
		productDetails.put("colgate","paste");
		productDetails.put("pears","soap");
		productDetails.put("sony","electronics");
		productDetails.put("samsung","electronics");
		productDetails.put("facepack","cosmatics");
		productDetails.put("facecream","cosmatics");
		
		
		salesDetails = new HashMap<>();
		salesDetails.put("lux", 100);
		salesDetails.put("colgate",50);
		salesDetails.put("pears",70);
		salesDetails.put("sony",10000);
		salesDetails.put("samsung",23000);
		salesDetails.put("facepack",100);
		salesDetails.put("facecream",60);
	}
	

@Override
public int updateProducts(String Category, int hike) throws ProductException {
	// TODO Auto-generated method stub
	Set<String> proList = productDetails.keySet();
	boolean flag = false;
	for(String p : proList){
		if(Category.equals(productDetails.get(p))){
			flag = true;
			int values = salesDetails.get(p);
			//Updating the Price of Product Category
			Integer uprice = values+values*hike/100;
			salesDetails.put(p, uprice);
			//Displaying the updated price
			System.out.println("Price of product1 of "+productDetails.get(p)+ " is Updated to :"+uprice);
			
		}
	
		
	}
	//Displaying the notification when Category is not found in the Map
	if(flag == false){
		throw new ProductException("Category Name Not Found");
	}
	return 0;
}

@Override
public Map<String, Integer> getProductDetails() throws ProductException {
	// TODO Auto-generated method stub
	return null;
}
	

}
