package org.example

@Grab(group='io.opentelemetry', module='opentelemetry-api', version='2.19.0')
@Grab(group='io.opentelemetry', module='opentelemetry-sdk', version='2.19.0')
import io.opentelemetry.api.GlobalOpenTelemetry
import io.opentelemetry.sdk.metrics.SdkMeterProvider

public class MyOpenTelemetry {
    static void configureOpenTelemetry() {
        def openTelemetry = GlobalOpenTelemetry.get()
        def meterProvider = SdkMeterProvider.builder().build()
        openTelemetry.setMeterProvider(meterProvider)
    }
}
