/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.eventgrid.v2019_06_01.implementation;

import com.microsoft.azure.management.eventgrid.v2019_06_01.DomainTopicProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * Domain Topic.
 */
@JsonFlatten
public class DomainTopicInner extends ProxyResource {
    /**
     * Provisioning state of the domain topic. Possible values include:
     * 'Creating', 'Updating', 'Deleting', 'Succeeded', 'Canceled', 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState")
    private DomainTopicProvisioningState provisioningState;

    /**
     * Get provisioning state of the domain topic. Possible values include: 'Creating', 'Updating', 'Deleting', 'Succeeded', 'Canceled', 'Failed'.
     *
     * @return the provisioningState value
     */
    public DomainTopicProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set provisioning state of the domain topic. Possible values include: 'Creating', 'Updating', 'Deleting', 'Succeeded', 'Canceled', 'Failed'.
     *
     * @param provisioningState the provisioningState value to set
     * @return the DomainTopicInner object itself.
     */
    public DomainTopicInner withProvisioningState(DomainTopicProvisioningState provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

}
