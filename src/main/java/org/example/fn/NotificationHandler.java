package org.example.fn;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cloudevents.CloudEvent;

import java.io.IOException;
import java.util.Map;

public class NotificationHandler {

    public String handleRequest(CloudEvent event) throws IOException {
        System.out.println("Starting handleRequest" + event.toString());
        ObjectMapper objectMapper = new ObjectMapper();
        Map data = objectMapper.convertValue(event.getData().get(), Map.class);
        Map additionalDetails = objectMapper.convertValue(data.get("additionalDetails"), Map.class);
        String nameSpace = String.valueOf(additionalDetails.get("namespace"));
        String bucketName = String.valueOf(additionalDetails.get("bucketName"));
        String objName = String.valueOf(data.get("resourceName"));

        // TODO: Implementation to call DUS
        // TODO: Build index document from response of DUS
        // TODO: Write call to opensearch

        return event.toString();
    }

}