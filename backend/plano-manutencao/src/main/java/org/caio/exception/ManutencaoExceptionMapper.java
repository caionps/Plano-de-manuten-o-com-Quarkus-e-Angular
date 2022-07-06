package org.caio.exception;

import org.jboss.resteasy.reactive.RestResponse;
import org.jboss.resteasy.reactive.server.ServerExceptionMapper;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class ManutencaoExceptionMapper implements ExceptionMapper<ManutencaoException> {
//    @Override
//    public RestResponse<String> mapException(ManutencaoException x){
//        return RestResponse.status(Response.Status.NOT_FOUND, "O id " + x.id + " não está cadastrado");
//    }

    @Override
    public Response toResponse(ManutencaoException e) {
        return Response.status(Response.Status.NOT_FOUND).entity(e.getMessage()).build();
    }
}
