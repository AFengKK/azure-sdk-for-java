// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.devcenter.models.LicenseType;
import com.azure.resourcemanager.devcenter.models.LocalAdminStatus;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Properties of a Pool. These properties can be updated after the resource has been created. */
@Fluent
public class PoolUpdateProperties {
    /*
     * Name of a Dev Box definition in parent Project of this Pool
     */
    @JsonProperty(value = "devBoxDefinitionName")
    private String devBoxDefinitionName;

    /*
     * Name of a Network Connection in parent Project of this Pool
     */
    @JsonProperty(value = "networkConnectionName")
    private String networkConnectionName;

    /*
     * Specifies the license type indicating the caller has already acquired licenses for the Dev Boxes that will be
     * created.
     */
    @JsonProperty(value = "licenseType")
    private LicenseType licenseType;

    /*
     * Indicates whether owners of Dev Boxes in this pool are added as local administrators on the Dev Box.
     */
    @JsonProperty(value = "localAdministrator")
    private LocalAdminStatus localAdministrator;

    /** Creates an instance of PoolUpdateProperties class. */
    public PoolUpdateProperties() {
    }

    /**
     * Get the devBoxDefinitionName property: Name of a Dev Box definition in parent Project of this Pool.
     *
     * @return the devBoxDefinitionName value.
     */
    public String devBoxDefinitionName() {
        return this.devBoxDefinitionName;
    }

    /**
     * Set the devBoxDefinitionName property: Name of a Dev Box definition in parent Project of this Pool.
     *
     * @param devBoxDefinitionName the devBoxDefinitionName value to set.
     * @return the PoolUpdateProperties object itself.
     */
    public PoolUpdateProperties withDevBoxDefinitionName(String devBoxDefinitionName) {
        this.devBoxDefinitionName = devBoxDefinitionName;
        return this;
    }

    /**
     * Get the networkConnectionName property: Name of a Network Connection in parent Project of this Pool.
     *
     * @return the networkConnectionName value.
     */
    public String networkConnectionName() {
        return this.networkConnectionName;
    }

    /**
     * Set the networkConnectionName property: Name of a Network Connection in parent Project of this Pool.
     *
     * @param networkConnectionName the networkConnectionName value to set.
     * @return the PoolUpdateProperties object itself.
     */
    public PoolUpdateProperties withNetworkConnectionName(String networkConnectionName) {
        this.networkConnectionName = networkConnectionName;
        return this;
    }

    /**
     * Get the licenseType property: Specifies the license type indicating the caller has already acquired licenses for
     * the Dev Boxes that will be created.
     *
     * @return the licenseType value.
     */
    public LicenseType licenseType() {
        return this.licenseType;
    }

    /**
     * Set the licenseType property: Specifies the license type indicating the caller has already acquired licenses for
     * the Dev Boxes that will be created.
     *
     * @param licenseType the licenseType value to set.
     * @return the PoolUpdateProperties object itself.
     */
    public PoolUpdateProperties withLicenseType(LicenseType licenseType) {
        this.licenseType = licenseType;
        return this;
    }

    /**
     * Get the localAdministrator property: Indicates whether owners of Dev Boxes in this pool are added as local
     * administrators on the Dev Box.
     *
     * @return the localAdministrator value.
     */
    public LocalAdminStatus localAdministrator() {
        return this.localAdministrator;
    }

    /**
     * Set the localAdministrator property: Indicates whether owners of Dev Boxes in this pool are added as local
     * administrators on the Dev Box.
     *
     * @param localAdministrator the localAdministrator value to set.
     * @return the PoolUpdateProperties object itself.
     */
    public PoolUpdateProperties withLocalAdministrator(LocalAdminStatus localAdministrator) {
        this.localAdministrator = localAdministrator;
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
