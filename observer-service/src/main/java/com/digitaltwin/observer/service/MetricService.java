package com.digitaltwin.observer.service;

import com.digitaltwin.observer.entity.ServiceMetric;
import com.digitaltwin.observer.repository.ServiceMetricRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;

@Service
@RequiredArgsConstructor
public class MetricService {

    private final ServiceMetricRepository repository;

    public ServiceMetric saveMetric(ServiceMetric metric) {

        metric.setTimestamp(Instant.now());

        return repository.save(metric);
    }

    public List<ServiceMetric> getAllMetrics() {
        return repository.findAll();
    }
}