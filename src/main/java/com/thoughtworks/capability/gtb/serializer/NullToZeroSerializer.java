package com.thoughtworks.capability.gtb.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;

public class NullToZeroSerializer extends StdSerializer<Integer> {


    public NullToZeroSerializer(Class<Integer> t) {
        super(t);
    }

    public NullToZeroSerializer() {
        this(null);
    }


    @Override
    public void serialize(Integer value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
        gen.writeNumber(0);
    }
}
