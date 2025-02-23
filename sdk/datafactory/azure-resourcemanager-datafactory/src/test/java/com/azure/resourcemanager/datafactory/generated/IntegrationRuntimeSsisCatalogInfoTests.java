// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.IntegrationRuntimeSsisCatalogInfo;
import com.azure.resourcemanager.datafactory.models.IntegrationRuntimeSsisCatalogPricingTier;
import com.azure.resourcemanager.datafactory.models.SecureString;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class IntegrationRuntimeSsisCatalogInfoTests {
    @Test
    public void testDeserialize() {
        IntegrationRuntimeSsisCatalogInfo model =
            BinaryData
                .fromString(
                    "{\"catalogServerEndpoint\":\"bsizus\",\"catalogAdminUserName\":\"zlbscmnlziji\",\"catalogAdminPassword\":{\"type\":\"SecureString\",\"value\":\"ehgmvflnwyv\"},\"catalogPricingTier\":\"PremiumRS\",\"dualStandbyPairName\":\"erlniylylyfw\",\"\":{}}")
                .toObject(IntegrationRuntimeSsisCatalogInfo.class);
        Assertions.assertEquals("bsizus", model.catalogServerEndpoint());
        Assertions.assertEquals("zlbscmnlziji", model.catalogAdminUsername());
        Assertions.assertEquals("ehgmvflnwyv", model.catalogAdminPassword().value());
        Assertions.assertEquals(IntegrationRuntimeSsisCatalogPricingTier.PREMIUM_RS, model.catalogPricingTier());
        Assertions.assertEquals("erlniylylyfw", model.dualStandbyPairName());
    }

    @Test
    public void testSerialize() {
        IntegrationRuntimeSsisCatalogInfo model =
            new IntegrationRuntimeSsisCatalogInfo()
                .withCatalogServerEndpoint("bsizus")
                .withCatalogAdminUsername("zlbscmnlziji")
                .withCatalogAdminPassword(new SecureString().withValue("ehgmvflnwyv"))
                .withCatalogPricingTier(IntegrationRuntimeSsisCatalogPricingTier.PREMIUM_RS)
                .withDualStandbyPairName("erlniylylyfw")
                .withAdditionalProperties(mapOf());
        model = BinaryData.fromObject(model).toObject(IntegrationRuntimeSsisCatalogInfo.class);
        Assertions.assertEquals("bsizus", model.catalogServerEndpoint());
        Assertions.assertEquals("zlbscmnlziji", model.catalogAdminUsername());
        Assertions.assertEquals("ehgmvflnwyv", model.catalogAdminPassword().value());
        Assertions.assertEquals(IntegrationRuntimeSsisCatalogPricingTier.PREMIUM_RS, model.catalogPricingTier());
        Assertions.assertEquals("erlniylylyfw", model.dualStandbyPairName());
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
