package com.salescode.paths;

import com.salescode.models.Employee;
import com.salescode.services.EmployeeService;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/employees")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class EmployeeResource {

    @Inject
    EmployeeService employeeService;

    // POST /employees  -> create employee
    @POST
    public Response createEmployee(Employee employee) {
        Employee created = employeeService.addEmployee(employee);
        return Response
                .status(Response.Status.CREATED)
                .entity(created)
                .build();
    }

    // DELETE /employees/{id}  -> delete employee
    @DELETE
    @Path("/{id}")
    public Response deleteEmployee(@PathParam("id") Long id) {
        boolean deleted = employeeService.deleteEmployee(id);
        if (!deleted) {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
        return Response.noContent().build(); // 204
    }
}

