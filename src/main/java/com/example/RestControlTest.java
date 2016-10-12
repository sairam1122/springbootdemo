package com.example;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@RestController
public class RestControlTest {
	
private static Map<String,ProductInfo> products=new HashMap<>();
	
	

@RequestMapping("/add")
public ModelAndView addPro(@ModelAttribute ProductInfo info)
{
	ModelAndView mav=new ModelAndView();

	ProductInfo product=null;
	
	if(products.containsKey(info.getProductName())==false)
	{
		products.put(info.getProductName(), info);

		mav.setViewName("success");

	}
	else
	{

		product=products.get(info.getProductName());
		
		if(product!=info)
		{
			products.put(info.getProductName(), info);
			mav.setViewName("editsuccess");
		}else{
	           mav.setViewName("failure");

		}
	
		

	}
	
	mav.addObject("info",info);
	return mav;
	
	
}

    
    @RequestMapping(value="/restadd/{productName}/{productModel}/{price}")
    public @ResponseBody ResponseEntity<ProductInfo> addProduct(@PathVariable("productName") String productName,@PathVariable("productModel") String productModel,@PathVariable("price") int price)
    {

    	ProductInfo product=null;
    	
		product=new ProductInfo(productName,price,productModel);

    	
    	if(products.containsKey(productName)==false)
    	{
    		
    		products.put(productName, product);


    	}
    	else
    	{
           ProductInfo avaProduct=null;
    		avaProduct=products.get(productName);
    		
    		if(product!=avaProduct)
    		{
    			products.put(productName, product);
    		}else{

    		}
    	
    		

    	}
    	
    	return new ResponseEntity<ProductInfo>(product, HttpStatus.OK);
    	
    	
    }
 
    @RequestMapping("/edit")
    public ModelAndView editProduct(@RequestParam("productName") String productName)
    {
    	ProductInfo info;
    	
    	ModelAndView mav=new ModelAndView();
    	
    	   if(products.containsKey(productName))
           {
    		 info=products.get(productName);
    		 mav.addObject("info",info);
    		 mav.setViewName("AddProduct");
    		 
    	   }
    	   else
    	   {
    		   mav.setViewName("AddProduct");
    		   mav.addObject("Result", "NO PRODUCT IS AVAILABLE PLEASE ADD THE PRODUCT");
    	   }
    	   return mav;
    	 
    	
    	
    }


}
