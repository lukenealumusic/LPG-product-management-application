package com.lukeneal.api.service;

import com.lukeneal.api.domain.ProductDto;
import com.lukeneal.api.model.Product;
import com.lukeneal.api.repository.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductsService {

    @Autowired
    private ProductsRepository productsRepository;


    public List<ProductDto> getAllProducts(){
        List<ProductDto> productDtos = new ArrayList<>();

        List<Product> products = productsRepository.getAllProducts();

        for(Product product: products){
            ProductDto productDto = new ProductDto();
            productDto.setProductName(product.getName());
            productDto.setDescription(product.getDescription());
            //TODO fix jpa manytoone association
            //productDto.setCategoryName(product.getCategory().getName());
            productDtos.add(productDto);
        }

        return productDtos;
    }

}
