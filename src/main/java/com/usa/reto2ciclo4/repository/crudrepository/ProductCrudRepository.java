package com.usa.reto2ciclo4.repository.crudrepository;

import com.usa.reto2ciclo4.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductCrudRepository extends MongoRepository<Product, String> {

}