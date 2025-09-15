package com.sandeep.ShopNow_api.service.impl;

import com.sandeep.ShopNow_api.dto.ProductDto;
import com.sandeep.ShopNow_api.entity.Product;
import com.sandeep.ShopNow_api.repository.ProductRepository;
import com.sandeep.ShopNow_api.service.IProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements IProductService {

    private final ProductRepository productRepository;

    @Override
    public List<ProductDto> getProducts() {
        return productRepository.findAll()
                .stream().map(this::transformToDTO).collect(Collectors.toList());
    }

    private ProductDto transformToDTO(Product product) {
        ProductDto productDto = new ProductDto();
        BeanUtils.copyProperties(product, productDto);
        productDto.setProductId(product.getId());
        return productDto;
    }
}
