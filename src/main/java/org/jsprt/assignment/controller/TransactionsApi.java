package org.jsprt.assignment.controller;

import io.swagger.annotations.*;
import org.jsprt.assignment.model.Transaction;
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
@Api(value = "Transactions", description = "the Transactions API")
@RestController
public class TransactionsApi {

    @ApiOperation(value = "Find all the transactions for an account", nickname = "getTransactions", notes = "Find all the transactions for an account", response = Transaction.class, responseContainer = "List", tags = {"transactions",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "successful operation", response = Transaction.class, responseContainer = "List"),
            @ApiResponse(code = 400, message = "Invalid Customer/Account ID supplied"),
            @ApiResponse(code = 404, message = "Customer/Account not found"),
            @ApiResponse(code = 405, message = "Customer/Account not active")})
    @RequestMapping(value = "/customers/{id}/accounts/{accountNumber}/transactions",
            produces = {"application/json"},
            method = RequestMethod.GET)
    public ResponseEntity<List<Transaction>> getTransactions(@ApiParam(value = "Customer identifier number", required = true) @PathVariable("id") String id, @ApiParam(value = "Customer account number", required = true) @PathVariable("accountNumber") String accountNumber) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

}
