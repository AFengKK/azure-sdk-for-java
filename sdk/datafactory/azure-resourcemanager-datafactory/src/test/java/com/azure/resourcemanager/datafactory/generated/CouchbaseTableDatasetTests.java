// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.CouchbaseTableDataset;
import com.azure.resourcemanager.datafactory.models.DatasetFolder;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class CouchbaseTableDatasetTests {
    @Test
    public void testDeserialize() {
        CouchbaseTableDataset model =
            BinaryData
                .fromString(
                    "{\"type\":\"CouchbaseTable\",\"typeProperties\":{},\"description\":\"hmem\",\"linkedServiceName\":{\"referenceName\":\"clutnpqme\",\"parameters\":{}},\"parameters\":{\"ykyujxsg\":{\"type\":\"String\"},\"rr\":{\"type\":\"Object\"},\"jylmbkzudnigr\":{\"type\":\"Float\"},\"otjewlpxuzzjgnre\":{\"type\":\"Bool\"}},\"annotations\":[],\"folder\":{\"name\":\"otoihiqa\"},\"\":{}}")
                .toObject(CouchbaseTableDataset.class);
        Assertions.assertEquals("hmem", model.description());
        Assertions.assertEquals("clutnpqme", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.STRING, model.parameters().get("ykyujxsg").type());
        Assertions.assertEquals("otoihiqa", model.folder().name());
    }

    @Test
    public void testSerialize() {
        CouchbaseTableDataset model =
            new CouchbaseTableDataset()
                .withDescription("hmem")
                .withLinkedServiceName(
                    new LinkedServiceReference().withReferenceName("clutnpqme").withParameters(mapOf()))
                .withParameters(
                    mapOf(
                        "ykyujxsg",
                        new ParameterSpecification().withType(ParameterType.STRING),
                        "rr",
                        new ParameterSpecification().withType(ParameterType.OBJECT),
                        "jylmbkzudnigr",
                        new ParameterSpecification().withType(ParameterType.FLOAT),
                        "otjewlpxuzzjgnre",
                        new ParameterSpecification().withType(ParameterType.BOOL)))
                .withAnnotations(Arrays.asList())
                .withFolder(new DatasetFolder().withName("otoihiqa"));
        model = BinaryData.fromObject(model).toObject(CouchbaseTableDataset.class);
        Assertions.assertEquals("hmem", model.description());
        Assertions.assertEquals("clutnpqme", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.STRING, model.parameters().get("ykyujxsg").type());
        Assertions.assertEquals("otoihiqa", model.folder().name());
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
