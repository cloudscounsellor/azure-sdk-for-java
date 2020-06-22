// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.microsoft.spring.data.gremlin.annotation;

import com.microsoft.spring.data.gremlin.common.Constants;
import org.springframework.data.annotation.Persistent;

import java.lang.annotation.*;

/**
 * Specifies the domain class as graph, with one optional collection(String).
 */
@Persistent
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface Graph {
    /**
     * The collection of given Graph.
     * @return class name if not specify.
     */
    String collection() default Constants.DEFAULT_COLLECTION_NAME;
}
