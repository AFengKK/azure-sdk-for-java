// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
package com.azure.storage.file.share.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import java.time.OffsetDateTime;

/** An Access policy. */
@Fluent
@JacksonXmlRootElement(localName = "AccessPolicy")
public final class ShareAccessPolicy {

    /*
     * The date-time the policy is active.
     */
    @JsonProperty(value = "Start")
    private OffsetDateTime startsOn;

    /*
     * The date-time the policy expires.
     */
    @JsonProperty(value = "Expiry")
    private OffsetDateTime expiresOn;

    /*
     * The permissions for the ACL policy.
     */
    @JsonProperty(value = "Permission")
    private String permissions;

    /** Creates an instance of ShareAccessPolicy class. */
    public ShareAccessPolicy() {}

    /**
     * Get the startsOn property: The date-time the policy is active.
     *
     * @return the startsOn value.
     */
    public OffsetDateTime getStartsOn() {
        return this.startsOn;
    }

    /**
     * Set the startsOn property: The date-time the policy is active.
     *
     * @param startsOn the startsOn value to set.
     * @return the ShareAccessPolicy object itself.
     */
    public ShareAccessPolicy setStartsOn(OffsetDateTime startsOn) {
        this.startsOn = startsOn;
        return this;
    }

    /**
     * Get the expiresOn property: The date-time the policy expires.
     *
     * @return the expiresOn value.
     */
    public OffsetDateTime getExpiresOn() {
        return this.expiresOn;
    }

    /**
     * Set the expiresOn property: The date-time the policy expires.
     *
     * @param expiresOn the expiresOn value to set.
     * @return the ShareAccessPolicy object itself.
     */
    public ShareAccessPolicy setExpiresOn(OffsetDateTime expiresOn) {
        this.expiresOn = expiresOn;
        return this;
    }

    /**
     * Get the permissions property: The permissions for the ACL policy.
     *
     * @return the permissions value.
     */
    public String getPermissions() {
        return this.permissions;
    }

    /**
     * Set the permissions property: The permissions for the ACL policy.
     *
     * @param permissions the permissions value to set.
     * @return the ShareAccessPolicy object itself.
     */
    public ShareAccessPolicy setPermissions(String permissions) {
        this.permissions = permissions;
        return this;
    }
}
