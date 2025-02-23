// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.kusto.models.SkuDescriptionList;
import org.junit.jupiter.api.Test;

public final class SkuDescriptionListTests {
    @Test
    public void testDeserialize() {
        SkuDescriptionList model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"resourceType\":\"xujwbhqwalmuzyo\",\"name\":\"epdkzja\",\"tier\":\"ux\",\"locations\":[\"wbavxbniwdj\"],\"locationInfo\":[],\"restrictions\":[]}]}")
                .toObject(SkuDescriptionList.class);
    }

    @Test
    public void testSerialize() {
        SkuDescriptionList model = new SkuDescriptionList();
        model = BinaryData.fromObject(model).toObject(SkuDescriptionList.class);
    }
}
