package com.quinbay.ecommerce.seller_microservice.repository;


import com.quinbay.ecommerce.seller_microservice.entity.SellerEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SellerRepository extends CrudRepository<SellerEntity,Long> {

}
