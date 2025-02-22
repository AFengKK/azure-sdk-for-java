// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.OrcFormat;
import org.junit.jupiter.api.Test;

public final class OrcFormatTests {
    @Test
    public void testDeserialize() {
        OrcFormat model = BinaryData.fromString("{\"type\":\"OrcFormat\",\"\":{}}").toObject(OrcFormat.class);
    }

    @Test
    public void testSerialize() {
        OrcFormat model = new OrcFormat();
        model = BinaryData.fromObject(model).toObject(OrcFormat.class);
    }
}
