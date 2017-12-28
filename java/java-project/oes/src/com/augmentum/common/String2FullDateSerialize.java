package com.augmentum.common;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.map.JsonDeserializer;

import com.augmentum.oes.util.StringUtil;

public class String2FullDateSerialize extends JsonDeserializer<Date> {

    @Override
    public Date deserialize(JsonParser arg0, DeserializationContext arg1)
            throws IOException, JsonProcessingException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss");
        String date = arg0.getText();
        if (StringUtil.isEmpty(date)) {
            return null;
        }

        try {
            return simpleDateFormat.parse(date);
        } catch (ParseException e) {
            throw new RuntimeException();
        }
    }
}
