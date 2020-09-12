package com.thoughtworks.capability.gtb.deserializer;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.thoughtworks.capability.gtb.vo.UserVo;

import java.io.IOException;

public class UserDeserializer extends StdDeserializer<UserVo> {

    protected UserDeserializer() {
        super(UserVo.class);
    }

    @Override
    public UserVo deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {
        return new UserVo();
    }
}
