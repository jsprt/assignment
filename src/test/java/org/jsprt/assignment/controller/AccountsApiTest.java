package org.jsprt.assignment.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class AccountsApiTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void shouldReturnNotImplemented() throws Exception {
        String testCustomerId = "123123";
        mockMvc.perform(get("/customers/" + testCustomerId + "/accounts"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0]['number']", is("11111111111")));
    }
}