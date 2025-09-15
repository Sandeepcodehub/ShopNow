package com.sandeep.ShopNow_api.service;

import com.sandeep.ShopNow_api.dto.ProductDto;

import java.util.List;

public interface IProductService {

    List<ProductDto> getProducts();
}
