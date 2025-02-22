// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.SapHanaLinkedServiceProperties;
import com.azure.resourcemanager.datafactory.models.SapHanaAuthenticationType;
import com.azure.resourcemanager.datafactory.models.SecretBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class SapHanaLinkedServicePropertiesTests {
    @Test
    public void testDeserialize() {
        SapHanaLinkedServiceProperties model =
            BinaryData
                .fromString("{\"authenticationType\":\"Basic\",\"password\":{\"type\":\"SecretBase\"}}")
                .toObject(SapHanaLinkedServiceProperties.class);
        Assertions.assertEquals(SapHanaAuthenticationType.BASIC, model.authenticationType());
    }

    @Test
    public void testSerialize() {
        SapHanaLinkedServiceProperties model =
            new SapHanaLinkedServiceProperties()
                .withAuthenticationType(SapHanaAuthenticationType.BASIC)
                .withPassword(new SecretBase());
        model = BinaryData.fromObject(model).toObject(SapHanaLinkedServiceProperties.class);
        Assertions.assertEquals(SapHanaAuthenticationType.BASIC, model.authenticationType());
    }
}
