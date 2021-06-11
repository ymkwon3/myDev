package com.myDev.first.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@WebMvcTest(controllers = mainController.class)
public class mainControllerTest {
    @Autowired
    private MockMvc mvc;

    @Test
    public void main_리턴된다() throws Exception{
        String hello = "main";

        mvc.perform(get("/main")).andExpect(status().isOk()).andExpect(content().string(hello));
    }

    @Test
    public void mainDto_리턴된다() throws Exception{
        String name = "잉민";
        int amount = 3563;

        mvc.perform(get("/main/dto").param("name", name).param("amount", String.valueOf(amount)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.name", is(name)))
                .andExpect(jsonPath("$.amount", is(amount)));
    }
}
