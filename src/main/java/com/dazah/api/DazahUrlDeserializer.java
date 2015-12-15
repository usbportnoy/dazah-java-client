package com.dazah.api;

import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.map.JsonDeserializer;

import java.io.IOException;
import java.net.URL;

/**
 * Created by usbportnoy on 12/13/15.
 */
public class DazahUrlDeserializer extends JsonDeserializer<URL> {
    @Override
    public URL deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
        return null;
    }
}
