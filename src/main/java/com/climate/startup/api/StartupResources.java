package com.climate.startup.api;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Value;

@Value
@Builder
@EqualsAndHashCode
public class StartupResources {

    private final StartupResource startupResource;

    @Builder
    @Value
    public static final class StartupResource {
        private String message;
    }
}
