package com.digitaltwin.observer.repository;

import com.digitaltwin.observer.entity.ServiceMetric;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceMetricRepository extends MongoRepository<ServiceMetric, String> {

}