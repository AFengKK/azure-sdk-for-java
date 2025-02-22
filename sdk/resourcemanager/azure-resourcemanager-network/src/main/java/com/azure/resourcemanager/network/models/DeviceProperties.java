// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** List of properties of the device. */
@Fluent
public final class DeviceProperties {
    /*
     * Name of the device Vendor.
     */
    @JsonProperty(value = "deviceVendor")
    private String deviceVendor;

    /*
     * Model of the device.
     */
    @JsonProperty(value = "deviceModel")
    private String deviceModel;

    /*
     * Link speed.
     */
    @JsonProperty(value = "linkSpeedInMbps")
    private Integer linkSpeedInMbps;

    /** Creates an instance of DeviceProperties class. */
    public DeviceProperties() {
    }

    /**
     * Get the deviceVendor property: Name of the device Vendor.
     *
     * @return the deviceVendor value.
     */
    public String deviceVendor() {
        return this.deviceVendor;
    }

    /**
     * Set the deviceVendor property: Name of the device Vendor.
     *
     * @param deviceVendor the deviceVendor value to set.
     * @return the DeviceProperties object itself.
     */
    public DeviceProperties withDeviceVendor(String deviceVendor) {
        this.deviceVendor = deviceVendor;
        return this;
    }

    /**
     * Get the deviceModel property: Model of the device.
     *
     * @return the deviceModel value.
     */
    public String deviceModel() {
        return this.deviceModel;
    }

    /**
     * Set the deviceModel property: Model of the device.
     *
     * @param deviceModel the deviceModel value to set.
     * @return the DeviceProperties object itself.
     */
    public DeviceProperties withDeviceModel(String deviceModel) {
        this.deviceModel = deviceModel;
        return this;
    }

    /**
     * Get the linkSpeedInMbps property: Link speed.
     *
     * @return the linkSpeedInMbps value.
     */
    public Integer linkSpeedInMbps() {
        return this.linkSpeedInMbps;
    }

    /**
     * Set the linkSpeedInMbps property: Link speed.
     *
     * @param linkSpeedInMbps the linkSpeedInMbps value to set.
     * @return the DeviceProperties object itself.
     */
    public DeviceProperties withLinkSpeedInMbps(Integer linkSpeedInMbps) {
        this.linkSpeedInMbps = linkSpeedInMbps;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
