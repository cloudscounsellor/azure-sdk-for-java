// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.microsoft.spring.data.gremlin.annotation;

import org.springframework.data.annotation.Persistent;

import java.lang.annotation.*;

/**
 * Specifies the field as EdgeSet of graph.
 */
@Persistent
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface EdgeSet {
}

