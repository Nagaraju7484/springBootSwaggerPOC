package com.poc.product.services;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductService {

    @RequestMapping(value="/updateProduct",method= RequestMethod.POST)
    public ProductVO greeting(@RequestParam(value="productName", defaultValue="Insurance") String name, ProductVO productVO ) {
    	productVO.setContent(productVO.getContent() + " Updated Response");
        return productVO;
    }
}
