/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.vmwarecloudsimple.v2019_04_01;

import com.microsoft.azure.arm.collection.SupportsCreating;
import com.microsoft.azure.arm.resources.collection.SupportsDeletingByResourceGroup;
import com.microsoft.azure.arm.resources.collection.SupportsBatchDeletion;
import com.microsoft.azure.arm.resources.collection.SupportsGettingByResourceGroup;
import rx.Observable;
import com.microsoft.azure.arm.resources.collection.SupportsListingByResourceGroup;
import com.microsoft.azure.arm.collection.SupportsListing;
import rx.Completable;
import com.microsoft.azure.management.vmwarecloudsimple.v2019_04_01.implementation.VirtualMachinesInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing VirtualMachines.
 */
public interface VirtualMachines extends SupportsCreating<VirtualMachine.DefinitionStages.Blank>, SupportsDeletingByResourceGroup, SupportsBatchDeletion, SupportsGettingByResourceGroup<VirtualMachine>, SupportsListingByResourceGroup<VirtualMachine>, SupportsListing<VirtualMachine>, HasInner<VirtualMachinesInner> {
    /**
     * Implements a start method for a virtual machine.
     * Power on virtual machine.
     *
     * @param resourceGroupName The name of the resource group
     * @param virtualMachineName virtual machine name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable startAsync(String resourceGroupName, String virtualMachineName);

    /**
     * Implements shutdown, poweroff, and suspend method for a virtual machine.
     * Power off virtual machine, options: shutdown, poweroff, and suspend.
     *
     * @param resourceGroupName The name of the resource group
     * @param virtualMachineName virtual machine name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable stopAsync(String resourceGroupName, String virtualMachineName);

}