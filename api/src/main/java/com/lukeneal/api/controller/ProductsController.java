package com.lukeneal.api.controller;

import com.lukeneal.api.domain.ProductDto;
import com.lukeneal.api.service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@CrossOrigin(origins = "*")
@RestController
public class ProductsController {

    @Autowired
    private ProductsService productsService;

    @RequestMapping("/api/products/get-all-products")
    private ResponseEntity<List<ProductDto>> getAllProducts(){
        List<ProductDto> productDtos = productsService.getAllProducts();
        return new ResponseEntity<>(productDtos, HttpStatus.OK);
    }


}
