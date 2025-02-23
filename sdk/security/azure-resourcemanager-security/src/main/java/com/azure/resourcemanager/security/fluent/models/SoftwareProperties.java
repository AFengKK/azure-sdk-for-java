// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.security.models.EndOfSupportStatus;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Software Inventory resource properties. */
@Fluent
public final class SoftwareProperties {
    /*
     * Unique identifier for the virtual machine in the service.
     */
    @JsonProperty(value = "deviceId")
    private String deviceId;

    /*
     * Platform of the operating system running on the device.
     */
    @JsonProperty(value = "osPlatform")
    private String osPlatform;

    /*
     * Name of the software vendor.
     */
    @JsonProperty(value = "vendor")
    private String vendor;

    /*
     * Name of the software product.
     */
    @JsonProperty(value = "softwareName")
    private String softwareName;

    /*
     * Version number of the software product.
     */
    @JsonProperty(value = "version")
    private String version;

    /*
     * End of support status.
     */
    @JsonProperty(value = "endOfSupportStatus")
    private EndOfSupportStatus endOfSupportStatus;

    /*
     * The end of support date in case the product is upcoming end of support.
     */
    @JsonProperty(value = "endOfSupportDate")
    private String endOfSupportDate;

    /*
     * Number of weaknesses.
     */
    @JsonProperty(value = "numberOfKnownVulnerabilities")
    private Integer numberOfKnownVulnerabilities;

    /*
     * First time that the software was seen in the device.
     */
    @JsonProperty(value = "firstSeenAt")
    private String firstSeenAt;

    /**
     * Get the deviceId property: Unique identifier for the virtual machine in the service.
     *
     * @return the deviceId value.
     */
    public String deviceId() {
        return this.deviceId;
    }

    /**
     * Set the deviceId property: Unique identifier for the virtual machine in the service.
     *
     * @param deviceId the deviceId value to set.
     * @return the SoftwareProperties object itself.
     */
    public SoftwareProperties withDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    /**
     * Get the osPlatform property: Platform of the operating system running on the device.
     *
     * @return the osPlatform value.
     */
    public String osPlatform() {
        return this.osPlatform;
    }

    /**
     * Set the osPlatform property: Platform of the operating system running on the device.
     *
     * @param osPlatform the osPlatform value to set.
     * @return the SoftwareProperties object itself.
     */
    public SoftwareProperties withOsPlatform(String osPlatform) {
        this.osPlatform = osPlatform;
        return this;
    }

    /**
     * Get the vendor property: Name of the software vendor.
     *
     * @return the vendor value.
     */
    public String vendor() {
        return this.vendor;
    }

    /**
     * Set the vendor property: Name of the software vendor.
     *
     * @param vendor the vendor value to set.
     * @return the SoftwareProperties object itself.
     */
    public SoftwareProperties withVendor(String vendor) {
        this.vendor = vendor;
        return this;
    }

    /**
     * Get the softwareName property: Name of the software product.
     *
     * @return the softwareName value.
     */
    public String softwareName() {
        return this.softwareName;
    }

    /**
     * Set the softwareName property: Name of the software product.
     *
     * @param softwareName the softwareName value to set.
     * @return the SoftwareProperties object itself.
     */
    public SoftwareProperties withSoftwareName(String softwareName) {
        this.softwareName = softwareName;
        return this;
    }

    /**
     * Get the version property: Version number of the software product.
     *
     * @return the version value.
     */
    public String version() {
        return this.version;
    }

    /**
     * Set the version property: Version number of the software product.
     *
     * @param version the version value to set.
     * @return the SoftwareProperties object itself.
     */
    public SoftwareProperties withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get the endOfSupportStatus property: End of support status.
     *
     * @return the endOfSupportStatus value.
     */
    public EndOfSupportStatus endOfSupportStatus() {
        return this.endOfSupportStatus;
    }

    /**
     * Set the endOfSupportStatus property: End of support status.
     *
     * @param endOfSupportStatus the endOfSupportStatus value to set.
     * @return the SoftwareProperties object itself.
     */
    public SoftwareProperties withEndOfSupportStatus(EndOfSupportStatus endOfSupportStatus) {
        this.endOfSupportStatus = endOfSupportStatus;
        return this;
    }

    /**
     * Get the endOfSupportDate property: The end of support date in case the product is upcoming end of support.
     *
     * @return the endOfSupportDate value.
     */
    public String endOfSupportDate() {
        return this.endOfSupportDate;
    }

    /**
     * Set the endOfSupportDate property: The end of support date in case the product is upcoming end of support.
     *
     * @param endOfSupportDate the endOfSupportDate value to set.
     * @return the SoftwareProperties object itself.
     */
    public SoftwareProperties withEndOfSupportDate(String endOfSupportDate) {
        this.endOfSupportDate = endOfSupportDate;
        return this;
    }

    /**
     * Get the numberOfKnownVulnerabilities property: Number of weaknesses.
     *
     * @return the numberOfKnownVulnerabilities value.
     */
    public Integer numberOfKnownVulnerabilities() {
        return this.numberOfKnownVulnerabilities;
    }

    /**
     * Set the numberOfKnownVulnerabilities property: Number of weaknesses.
     *
     * @param numberOfKnownVulnerabilities the numberOfKnownVulnerabilities value to set.
     * @return the SoftwareProperties object itself.
     */
    public SoftwareProperties withNumberOfKnownVulnerabilities(Integer numberOfKnownVulnerabilities) {
        this.numberOfKnownVulnerabilities = numberOfKnownVulnerabilities;
        return this;
    }

    /**
     * Get the firstSeenAt property: First time that the software was seen in the device.
     *
     * @return the firstSeenAt value.
     */
    public String firstSeenAt() {
        return this.firstSeenAt;
    }

    /**
     * Set the firstSeenAt property: First time that the software was seen in the device.
     *
     * @param firstSeenAt the firstSeenAt value to set.
     * @return the SoftwareProperties object itself.
     */
    public SoftwareProperties withFirstSeenAt(String firstSeenAt) {
        this.firstSeenAt = firstSeenAt;
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
