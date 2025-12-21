package com.sprintforge.common.infrastructure.rest.error;


import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public final class RemoteProblemDetailExtractor {

    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

    private RemoteProblemDetailExtractor() {
    }

    public static String extractDetailOrRaw(String responseBody) {
        if (responseBody == null || responseBody.isBlank()) {
            return "";
        }

        try {
            JsonNode node = OBJECT_MAPPER.readTree(responseBody);
            JsonNode detailNode = node.get("detail");
            return detailNode != null ? detailNode.asText() : responseBody;
        } catch (Exception e) {
            return responseBody;
        }
    }
}
