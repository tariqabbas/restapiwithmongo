package com.mongo.repositories;

import java.math.BigInteger;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mongo.org.Categories;

@Repository
public interface CategoryRepository extends CrudRepository<Categories, BigInteger> {

}
