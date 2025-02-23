// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.PipelineFolder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class PipelineFolderTests {
    @Test
    public void testDeserialize() {
        PipelineFolder model = BinaryData.fromString("{\"name\":\"cgjbirxbp\"}").toObject(PipelineFolder.class);
        Assertions.assertEquals("cgjbirxbp", model.name());
    }

    @Test
    public void testSerialize() {
        PipelineFolder model = new PipelineFolder().withName("cgjbirxbp");
        model = BinaryData.fromObject(model).toObject(PipelineFolder.class);
        Assertions.assertEquals("cgjbirxbp", model.name());
    }
}
