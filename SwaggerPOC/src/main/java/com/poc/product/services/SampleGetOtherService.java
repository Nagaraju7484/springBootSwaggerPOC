/**
 * 
 */
package com.poc.product.services;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author komali
 *
 */
@RestController
public class SampleGetOtherService {
	
	 @RequestMapping(value="/productdescription", method= RequestMethod.GET)
	public ProductVO samplePostGreeting(@RequestParam(value="productname", defaultValue="Insurance") String name) {
        return new ProductVO(1,"product Details of :  "+name);
	 }

}
