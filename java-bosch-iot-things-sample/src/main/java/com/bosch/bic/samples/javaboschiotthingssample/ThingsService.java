package com.bosch.bic.samples.javaboschiotthingssample;

import lombok.RequiredArgsConstructor;
import org.eclipse.ditto.client.DittoClient;
import org.eclipse.ditto.model.things.ThingId;
import org.springframework.stereotype.Service;

import java.util.concurrent.ExecutionException;

@RequiredArgsConstructor
@Service
public class ThingsService {

    private final DittoClient dittoClient;

    public String retrieveThingData(String thingId) throws ExecutionException, InterruptedException {
        return this.dittoClient.twin()
                .forId(ThingId.of(thingId))
                .retrieve()
                .get()
                .toJsonString();
    }
}
