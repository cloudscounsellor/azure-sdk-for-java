/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_08_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for NatGatewaySkuName.
 */
public final class NatGatewaySkuName extends ExpandableStringEnum<NatGatewaySkuName> {
    /** Static value Standard for NatGatewaySkuName. */
    public static final NatGatewaySkuName STANDARD = fromString("Standard");

    /**
     * Creates or finds a NatGatewaySkuName from its string representation.
     * @param name a name to look for
     * @return the corresponding NatGatewaySkuName
     */
    @JsonCreator
    public static NatGatewaySkuName fromString(String name) {
        return fromString(name, NatGatewaySkuName.class);
    }

    /**
     * @return known NatGatewaySkuName values
     */
    public static Collection<NatGatewaySkuName> values() {
        return values(NatGatewaySkuName.class);
    }
}