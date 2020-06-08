package com.org.complex.object.repository;

import com.org.complex.object.model.Data;
import com.org.complex.object.model.PermanentAddress;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DataRepository extends MongoRepository<Data, Integer> {

}
