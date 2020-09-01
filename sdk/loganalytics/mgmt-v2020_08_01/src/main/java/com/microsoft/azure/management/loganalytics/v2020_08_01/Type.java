/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.loganalytics.v2020_08_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for Type.
 */
public final class Type extends ExpandableStringEnum<Type> {
    /** Static value StorageAccount for Type. */
    public static final Type STORAGE_ACCOUNT = fromString("StorageAccount");

    /** Static value EventHub for Type. */
    public static final Type EVENT_HUB = fromString("EventHub");

    /**
     * Creates or finds a Type from its string representation.
     * @param name a name to look for
     * @return the corresponding Type
     */
    @JsonCreator
    public static Type fromString(String name) {
        return fromString(name, Type.class);
    }

    /**
     * @return known Type values
     */
    public static Collection<Type> values() {
        return values(Type.class);
    }
}