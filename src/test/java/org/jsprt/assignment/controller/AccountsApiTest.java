package org.jsprt.assignment.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest
class AccountsApiTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void shouldReturnNotImplemented() throws Exception {
        String testCustomerId = "123123";
        mockMvc.perform(get("/customers/" + testCustomerId + "/accounts"))
                .andExpect(status().isNotImplemented());
    }
}