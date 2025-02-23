// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.elasticsan.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.elasticsan.fluent.models.VolumeGroupInner;
import com.azure.resourcemanager.elasticsan.models.EncryptionType;
import com.azure.resourcemanager.elasticsan.models.StorageTargetType;
import com.azure.resourcemanager.elasticsan.models.VolumeGroupList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class VolumeGroupListTests {
    @Test
    public void testDeserialize() {
        VolumeGroupList model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"provisioningState\":\"Pending\",\"protocolType\":\"None\",\"encryption\":\"EncryptionAtRestWithPlatformKey\"},\"tags\":{\"jaoyfhrtx\":\"igjyjg\",\"fqawrlyxw\":\"lnerkujysvleju\",\"xgjvtbv\":\"kcprbnw\",\"uouq\":\"ysszdnrujqguh\"},\"id\":\"prwzwbnguitnwui\",\"name\":\"gazxuf\",\"type\":\"zuckyfi\"},{\"properties\":{\"provisioningState\":\"Succeeded\",\"protocolType\":\"None\",\"encryption\":\"EncryptionAtRestWithPlatformKey\"},\"tags\":{\"sdkf\":\"htymw\"},\"id\":\"hwxmnteiwa\",\"name\":\"pvkmijcmmxdcuf\",\"type\":\"fsrpymzidnse\"},{\"properties\":{\"provisioningState\":\"Pending\",\"protocolType\":\"None\",\"encryption\":\"EncryptionAtRestWithPlatformKey\"},\"tags\":{\"mdwzjeiachboo\":\"sne\"},\"id\":\"flnrosfqpteehzz\",\"name\":\"ypyqrimzinp\",\"type\":\"swjdkirso\"},{\"properties\":{\"provisioningState\":\"Succeeded\",\"protocolType\":\"None\",\"encryption\":\"EncryptionAtRestWithPlatformKey\"},\"tags\":{\"kwh\":\"t\",\"gr\":\"soifiyipjxsqw\",\"qabnmoc\":\"bznorcjxvsnby\"},\"id\":\"cyshurzafbljjgp\",\"name\":\"toqcjmklja\",\"type\":\"bqidtqaj\"}],\"nextLink\":\"ulpkudjkrl\"}")
                .toObject(VolumeGroupList.class);
        Assertions.assertEquals("igjyjg", model.value().get(0).tags().get("jaoyfhrtx"));
        Assertions.assertEquals(StorageTargetType.NONE, model.value().get(0).protocolType());
        Assertions.assertEquals(EncryptionType.ENCRYPTION_AT_REST_WITH_PLATFORM_KEY, model.value().get(0).encryption());
    }

    @Test
    public void testSerialize() {
        VolumeGroupList model =
            new VolumeGroupList()
                .withValue(
                    Arrays
                        .asList(
                            new VolumeGroupInner()
                                .withTags(
                                    mapOf(
                                        "jaoyfhrtx",
                                        "igjyjg",
                                        "fqawrlyxw",
                                        "lnerkujysvleju",
                                        "xgjvtbv",
                                        "kcprbnw",
                                        "uouq",
                                        "ysszdnrujqguh"))
                                .withProtocolType(StorageTargetType.NONE)
                                .withEncryption(EncryptionType.ENCRYPTION_AT_REST_WITH_PLATFORM_KEY),
                            new VolumeGroupInner()
                                .withTags(mapOf("sdkf", "htymw"))
                                .withProtocolType(StorageTargetType.NONE)
                                .withEncryption(EncryptionType.ENCRYPTION_AT_REST_WITH_PLATFORM_KEY),
                            new VolumeGroupInner()
                                .withTags(mapOf("mdwzjeiachboo", "sne"))
                                .withProtocolType(StorageTargetType.NONE)
                                .withEncryption(EncryptionType.ENCRYPTION_AT_REST_WITH_PLATFORM_KEY),
                            new VolumeGroupInner()
                                .withTags(mapOf("kwh", "t", "gr", "soifiyipjxsqw", "qabnmoc", "bznorcjxvsnby"))
                                .withProtocolType(StorageTargetType.NONE)
                                .withEncryption(EncryptionType.ENCRYPTION_AT_REST_WITH_PLATFORM_KEY)));
        model = BinaryData.fromObject(model).toObject(VolumeGroupList.class);
        Assertions.assertEquals("igjyjg", model.value().get(0).tags().get("jaoyfhrtx"));
        Assertions.assertEquals(StorageTargetType.NONE, model.value().get(0).protocolType());
        Assertions.assertEquals(EncryptionType.ENCRYPTION_AT_REST_WITH_PLATFORM_KEY, model.value().get(0).encryption());
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
