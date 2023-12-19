package org.example

@Grab(group='io.opentelemetry', module='opentelemetry-api')
@Grab(group='io.opentelemetry', module='opentelemetry-sdk')
import io.opentelemetry.api.GlobalOpenTelemetry
import io.opentelemetry.sdk.metrics.SdkMeterProvider

public class MyOpenTelemetry {
    static void configureOpenTelemetry() {
        def openTelemetry = GlobalOpenTelemetry.get()
        def meterProvider = SdkMeterProvider.builder().build()
        openTelemetry.setMeterProvider(meterProvider)
    }
}
