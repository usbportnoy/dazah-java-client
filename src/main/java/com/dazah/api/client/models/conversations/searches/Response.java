package com.dazah.api.client.models.conversations.searches;

import com.dazah.api.client.models.messages.Message;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Created by usbportnoy on 12/13/15.
 */
public class Response extends com.dazah.api.client.models.Response {
    private float relevanceScore;
    private Message message;

    @JsonProperty("relevance_score")
    public float getRelevanceScore() {
        return relevanceScore;
    }

    public void setRelevanceScore(float relevanceScore) {
        this.relevanceScore = relevanceScore;
    }

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }
}
