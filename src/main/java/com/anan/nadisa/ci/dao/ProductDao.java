package com.anan.nadisa.ci.dao;

import com.anan.nadisa.ci.entity.Product;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ProductDao extends PagingAndSortingRepository<Product, String>{ }
