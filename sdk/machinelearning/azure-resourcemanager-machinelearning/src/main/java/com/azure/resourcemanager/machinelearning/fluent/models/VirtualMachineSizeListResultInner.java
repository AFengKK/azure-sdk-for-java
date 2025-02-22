// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.machinelearning.models.VirtualMachineSize;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The List Virtual Machine size operation response. */
@Fluent
public final class VirtualMachineSizeListResultInner {
    /*
     * The list of virtual machine sizes supported by AmlCompute.
     */
    @JsonProperty(value = "value")
    private List<VirtualMachineSize> value;

    /**
     * Get the value property: The list of virtual machine sizes supported by AmlCompute.
     *
     * @return the value value.
     */
    public List<VirtualMachineSize> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of virtual machine sizes supported by AmlCompute.
     *
     * @param value the value value to set.
     * @return the VirtualMachineSizeListResultInner object itself.
     */
    public VirtualMachineSizeListResultInner withValue(List<VirtualMachineSize> value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
