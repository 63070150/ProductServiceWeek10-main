package com.sop.chapter7.productservice.query;

import com.fasterxml.jackson.databind.util.BeanUtil;
import com.sop.chapter7.productservice.core.ProductEntity;
import com.sop.chapter7.productservice.core.data.ProductRepository;
import com.sop.chapter7.productservice.core.event.ProductCreatedEvent;
import org.axonframework.eventhandling.EventHandler;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class ProductEventHandler {

    private  final ProductRepository productRepository;

    public  ProductEventHandler(ProductRepository prodcutRepository) {
        this.productRepository = prodcutRepository;
    }

    @EventHandler
    public  void on(ProductCreatedEvent event) {

        ProductEntity productEntity = new ProductEntity();
        BeanUtils.copyProperties(event, productEntity);
        productRepository.save(productEntity);
    }
}
