package com.digitaltwin.observer.controller;

import com.digitaltwin.observer.entity.ServiceMetric;
import com.digitaltwin.observer.service.MetricService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/metrics")
@RequiredArgsConstructor
public class MetricController {

    private final MetricService metricService;

    @PostMapping
    public ServiceMetric saveMetric(@RequestBody ServiceMetric metric) {
        return metricService.saveMetric(metric);
    }

    @GetMapping
    public List<ServiceMetric> getAllMetrics() {
        return metricService.getAllMetrics();
    }
}