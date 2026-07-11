package com.digitaltwin.observer.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Instant;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "service_metrics")
public class ServiceMetric {

    @Id
    private String id;

    private String serviceName;

    private String podName;

    private Double cpuUsage;

    private Double memoryUsage;

    private Long responseTime;

    private Integer threadCount;

    private Integer errorCount;

    private String status;

    private Instant timestamp;
}
