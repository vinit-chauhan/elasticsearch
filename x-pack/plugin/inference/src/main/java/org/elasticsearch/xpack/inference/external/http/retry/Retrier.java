/*
 * Copyright Elasticsearch B.V. and/or licensed to Elasticsearch B.V. under one
 * or more contributor license agreements. Licensed under the Elastic License
 * 2.0; you may not use this file except in compliance with the Elastic License
 * 2.0.
 */

package org.elasticsearch.xpack.inference.external.http.retry;

import org.apache.http.client.methods.HttpRequestBase;
import org.elasticsearch.action.ActionListener;
import org.elasticsearch.inference.InferenceServiceResults;

public interface Retrier {
    void send(HttpRequestBase request, ResponseHandler responseHandler, ActionListener<InferenceServiceResults> listener);
}