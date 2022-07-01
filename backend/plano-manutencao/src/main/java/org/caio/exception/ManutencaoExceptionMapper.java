package org.caio.exception;

import org.jboss.resteasy.reactive.RestResponse;
import org.jboss.resteasy.reactive.server.ServerExceptionMapper;

import javax.ws.rs.core.Response;

public class ManutencaoExceptionMapper {
    @ServerExceptionMapper
    public RestResponse<String> mapException(ManutencaoException x){
        return RestResponse.status(Response.Status.NOT_FOUND, x.name);
    }
}
