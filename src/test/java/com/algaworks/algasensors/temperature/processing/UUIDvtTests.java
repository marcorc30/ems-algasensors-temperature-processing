package com.algaworks.algasensors.temperature.processing;

import com.algaworks.algasensors.temperature.processing.common.IdGeneratorUUID;
import com.algaworks.algasensors.temperature.processing.common.UUIDvUtils;
import org.junit.jupiter.api.Test;

import java.util.UUID;

public class UUIDvtTests {

    @Test
    void testarUUID(){

        UUID uuid = IdGeneratorUUID.generateTimeBasedUUID();
        UUID uuid1 = IdGeneratorUUID.generateTimeBasedUUID();
        UUID uuid2 = IdGeneratorUUID.generateTimeBasedUUID();
        UUID uuid3 = IdGeneratorUUID.generateTimeBasedUUID();
        UUID uuid4 = IdGeneratorUUID.generateTimeBasedUUID();

        System.out.println(UUIDvUtils.extractOffsetDateTime(uuid));
        System.out.println(UUIDvUtils.extractOffsetDateTime(uuid1));
        System.out.println(UUIDvUtils.extractOffsetDateTime(uuid2));
        System.out.println(UUIDvUtils.extractOffsetDateTime(uuid3));
        System.out.println(UUIDvUtils.extractOffsetDateTime(uuid4));


    }


}
