// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** The results and errors from an execution of a pool autoscale formula. */
@Fluent
public final class AutoScaleRun {
    /*
     * The time at which the autoscale formula was last evaluated.
     */
    @JsonProperty(value = "evaluationTime", required = true)
    private OffsetDateTime evaluationTime;

    /*
     * The final values of all variables used in the evaluation of the
     * autoscale formula. Each variable value is returned in the form
     * $variable=value, and variables are separated by semicolons.
     */
    @JsonProperty(value = "results")
    private String results;

    /*
     * An error that occurred when autoscaling a pool.
     */
    @JsonProperty(value = "error")
    private AutoScaleRunError error;

    /**
     * Get the evaluationTime property: The time at which the autoscale formula was last evaluated.
     *
     * @return the evaluationTime value.
     */
    public OffsetDateTime evaluationTime() {
        return this.evaluationTime;
    }

    /**
     * Set the evaluationTime property: The time at which the autoscale formula was last evaluated.
     *
     * @param evaluationTime the evaluationTime value to set.
     * @return the AutoScaleRun object itself.
     */
    public AutoScaleRun withEvaluationTime(OffsetDateTime evaluationTime) {
        this.evaluationTime = evaluationTime;
        return this;
    }

    /**
     * Get the results property: The final values of all variables used in the evaluation of the autoscale formula. Each
     * variable value is returned in the form $variable=value, and variables are separated by semicolons.
     *
     * @return the results value.
     */
    public String results() {
        return this.results;
    }

    /**
     * Set the results property: The final values of all variables used in the evaluation of the autoscale formula. Each
     * variable value is returned in the form $variable=value, and variables are separated by semicolons.
     *
     * @param results the results value to set.
     * @return the AutoScaleRun object itself.
     */
    public AutoScaleRun withResults(String results) {
        this.results = results;
        return this;
    }

    /**
     * Get the error property: An error that occurred when autoscaling a pool.
     *
     * @return the error value.
     */
    public AutoScaleRunError error() {
        return this.error;
    }

    /**
     * Set the error property: An error that occurred when autoscaling a pool.
     *
     * @param error the error value to set.
     * @return the AutoScaleRun object itself.
     */
    public AutoScaleRun withError(AutoScaleRunError error) {
        this.error = error;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (evaluationTime() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property evaluationTime in model AutoScaleRun"));
        }
        if (error() != null) {
            error().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(AutoScaleRun.class);
}
