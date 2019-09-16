package com.climate.startup.api;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Value;

@Value
@Builder
@EqualsAndHashCode
public class StartupResources {

    private StartupResource startup;

    @Builder
    @Value
    public static class StartupResource {
        private String message;
    }
}
