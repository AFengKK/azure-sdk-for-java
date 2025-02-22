// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.DatasetFolder;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import com.azure.resourcemanager.datafactory.models.TeradataTableDataset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class TeradataTableDatasetTests {
    @Test
    public void testDeserialize() {
        TeradataTableDataset model =
            BinaryData
                .fromString(
                    "{\"type\":\"TeradataTable\",\"typeProperties\":{},\"description\":\"iquvrehm\",\"linkedServiceName\":{\"referenceName\":\"hvsujztc\",\"parameters\":{}},\"parameters\":{\"h\":{\"type\":\"Object\"},\"nfprnjletlxs\":{\"type\":\"Object\"},\"ddoui\":{\"type\":\"Bool\"}},\"annotations\":[],\"folder\":{\"name\":\"aziynknlqwzdv\"},\"\":{}}")
                .toObject(TeradataTableDataset.class);
        Assertions.assertEquals("iquvrehm", model.description());
        Assertions.assertEquals("hvsujztc", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.OBJECT, model.parameters().get("h").type());
        Assertions.assertEquals("aziynknlqwzdv", model.folder().name());
    }

    @Test
    public void testSerialize() {
        TeradataTableDataset model =
            new TeradataTableDataset()
                .withDescription("iquvrehm")
                .withLinkedServiceName(
                    new LinkedServiceReference().withReferenceName("hvsujztc").withParameters(mapOf()))
                .withParameters(
                    mapOf(
                        "h",
                        new ParameterSpecification().withType(ParameterType.OBJECT),
                        "nfprnjletlxs",
                        new ParameterSpecification().withType(ParameterType.OBJECT),
                        "ddoui",
                        new ParameterSpecification().withType(ParameterType.BOOL)))
                .withAnnotations(Arrays.asList())
                .withFolder(new DatasetFolder().withName("aziynknlqwzdv"));
        model = BinaryData.fromObject(model).toObject(TeradataTableDataset.class);
        Assertions.assertEquals("iquvrehm", model.description());
        Assertions.assertEquals("hvsujztc", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.OBJECT, model.parameters().get("h").type());
        Assertions.assertEquals("aziynknlqwzdv", model.folder().name());
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
