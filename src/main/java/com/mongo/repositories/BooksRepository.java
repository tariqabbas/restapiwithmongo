package com.mongo.repositories;

import java.math.BigInteger;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mongo.org.Books;

@Repository
public interface BooksRepository extends CrudRepository<Books, BigInteger> {

}
