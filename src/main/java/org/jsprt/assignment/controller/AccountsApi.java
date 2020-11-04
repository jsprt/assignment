package org.jsprt.assignment.controller;

import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-11-03T22:27:44.920460+11:00[Australia/Melbourne]")

@Validated
@Api(value = "Accounts", description = "the Accounts API")
@RestController
public class AccountsApi {

    @ApiOperation(value = "Get all accounts for user", nickname = "getAccounts", notes = "Get all accounts for user", response = org.jsprt.assignment.model.Account.class, responseContainer = "List", tags = {"accounts",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "successful operation", response = org.jsprt.assignment.model.Account.class, responseContainer = "List"),
            @ApiResponse(code = 400, message = "Invalid Customer ID supplied"),
            @ApiResponse(code = 404, message = "Customer not found"),
            @ApiResponse(code = 405, message = "Customer not active")})
    @RequestMapping(value = "/customers/{id}/accounts",
            produces = {"application/json"},
            method = RequestMethod.GET)
    public ResponseEntity<List<org.jsprt.assignment.model.Account>> getAccounts(@ApiParam(value = "Customer identifier number", required = true) @PathVariable("id") String id) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

}
