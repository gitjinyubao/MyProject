package com.augmentum.common;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.JsonSerializer;
import org.codehaus.jackson.map.SerializerProvider;

public class FullDate2StringSerialize extends JsonSerializer<Date> {

    @Override
    public void serialize(Date arg0, JsonGenerator arg1, SerializerProvider arg2)
            throws IOException, JsonProcessingException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss");
        String dateString = simpleDateFormat.format(arg0);
        arg1.writeString(dateString);
    }
}
