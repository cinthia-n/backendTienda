/**
 * @author: Edson A. Terceros T.
 */

package edu.umss.dip.ssiservice.controller;

import edu.umss.dip.ssiservice.dto.MaquinariaDto;
import edu.umss.dip.ssiservice.model.Maquinaria;
import edu.umss.dip.ssiservice.service.*;
import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;
import org.springframework.stereotype.Controller;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.InputStream;
import java.util.List;

@Controller
@Path("/maquinarias")
@Produces(MediaType.APPLICATION_JSON)
public class MaquinariaController extends GenericController<Maquinaria, MaquinariaDto> {
    private MaquinariaService service;
    private SubCategoriaService subCategoriaService;

    public MaquinariaController(MaquinariaService service, SubCategoriaService subCategoriaService) {
        this.service = service;
        this.subCategoriaService = subCategoriaService;
    }

    @Override
    @GET
    public List<MaquinariaDto> getAll() {
        return super.getAll();
    }


    @Path("/{id}/imagen")
    @POST
    @Consumes(MediaType.MULTIPART_FORM_DATA)
    @Produces(MediaType.APPLICATION_JSON)
    public Response uploadFile(@PathParam("id") String id,
            @FormDataParam("file") InputStream file,
            @FormDataParam("file") FormDataContentDisposition fileDisposition) {
        service.saveImage(Long.valueOf(id), file);
        return Response.ok("Data uploaded successfully !!").build();
    }

    @Override
    protected GenericService getService() {
        return service;
    }

}
