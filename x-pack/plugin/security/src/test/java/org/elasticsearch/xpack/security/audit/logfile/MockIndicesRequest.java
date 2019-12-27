/*
 * Copyright Elasticsearch B.V. and/or licensed to Elasticsearch B.V. under one
 * or more contributor license agreements. Licensed under the Elastic License;
 * you may not use this file except in compliance with the Elastic License.
 */
package org.elasticsearch.xpack.security.audit.logfile;

import org.elasticsearch.action.ActionRequest;
import org.elasticsearch.action.ActionRequestValidationException;
import org.elasticsearch.action.CompositeIndicesRequest;
import org.elasticsearch.action.IndicesRequest;
import org.elasticsearch.action.support.IndicesOptions;

public class MockIndicesRequest extends ActionRequest implements IndicesRequest, CompositeIndicesRequest {

    private final String[] indices;
    private final IndicesOptions indicesOptions;

    public MockIndicesRequest(IndicesOptions indicesOptions, String... indices) {
        this.indices = indices;
        this.indicesOptions = indicesOptions;
    }

    @Override
    public String[] indices() {
        return indices;
    }

    @Override
    public IndicesOptions indicesOptions() {
        return indicesOptions;
    }

    @Override
    public ActionRequestValidationException validate() {
        return null;
    }
}
