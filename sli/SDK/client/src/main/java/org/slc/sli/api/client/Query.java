package org.slc.sli.api.client;

import java.util.Map;

/**
 * Query parameters for requests to the SLI ReSTful API service. Parameters are encoded
 * and passed to the service with the request.
 *
 * @author asaarela
 */
public interface Query {

    /**
     * Return true if the query should return the targets of an association and not the
     * association itself.
     * @return true if we're requesting association targets, false otherwise.
     */
    public abstract boolean targets();

    /**
     * Get the query parameters associated with this query instance.
     *
     * @return map of query parameters.
     */
    public abstract Map<String, Object> getParameters();

}