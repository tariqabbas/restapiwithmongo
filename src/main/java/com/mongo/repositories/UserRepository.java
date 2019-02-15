package com.mongo.repositories;

import java.math.BigInteger;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mongo.org.Users;

@Repository
public interface UserRepository extends CrudRepository<Users, BigInteger> {

}
