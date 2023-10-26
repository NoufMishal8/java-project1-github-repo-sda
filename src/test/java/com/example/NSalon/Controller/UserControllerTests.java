package com.example.NSalon.Controller;
import com.example.NSalon.Entity.User;
import com.example.NSalon.Repository.UserRepository;
import com.example.NSalon.Service.Implementation.UserServiceImpl;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import java.util.List;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;





import org.springframework.beans.factory.annotation.Autowired;

import static org.hamcrest.Matchers.containsString;
import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@SpringBootTest
@AutoConfigureMockMvc
public class UserControllerTests {

    private MockMvc mockMvc;
    private final ObjectMapper objectMapper= new ObjectMapper();



    @Autowired
    private UserRepository userRepository;
    private WebApplicationContext webApplicationContext;

    @BeforeEach
    public void Setup(){
//        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
        this.mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();


//        User user1 = new User("1L", "U","UU","0111111" );
//
////        User user2 = new User("U2" ,"HHH","H","02222222");
//
//        userRepository.saveAll(List.of(user1 ));

    }

// ...



// ...

    @Test
    public void testGetAllUsers() throws Exception {
        MockMvc mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();

        mockMvc.perform(MockMvcRequestBuilders.get("/users"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("C1").value("user1"))
//                .andExpect(MockMvcResultMatchers.jsonPath("$[1].username").value("user2"))
//                .andExpect(MockMvcResultMatchers.jsonPath("$[2].username").value("user3"))
                .andReturn();
    }


//    @Test
//    public void testGetAllUsers() throws Exception {
//        mockMvc.perform(MockMvcRequestBuilders.get("/users")
//                        .contentType(MediaType.APPLICATION_JSON))
//                .andExpect(MockMvcResultMatchers.status().isOk())
//                .andExpect(MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON));
//    }
    @Test
    void PostUserTest() throws Exception {


        User newUser = new User("1L", "U","UU","0111111");

        String requestBody = objectMapper.writeValueAsString (newUser);

        MvcResult mvcResult = mockMvc.perform(post("/users/add")
                                .content(requestBody)
                                .contentType(MediaType.APPLICATION_JSON)
                        )

                        .andExpect(status().isCreated())
                        .andReturn();
        assertTrue(mvcResult.getResponse().getContentAsString().contains("User Added Successfully"));


    }}







//
//        // C
//
//        mockUsers.add(new User("D1","Duaa","d@hotmail.com","012121"));
//        mockUsers.add(new User("F1","Faisal","F@hotmail.com","918227"));
//
//        when(userService.getAllUsers()).thenReturn(mockUsers);
//
//        mockMvc.perform(get("/all"))
//                .andExpect(status().isOk())
//                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
//                .andExpect(jsonPath("$", hasSize(2))) // Ensure you have 2 users
//                .andExpect(jsonPath("$[0].username", is("Duaa")))
//                .andExpect(jsonPath("$[1].username", is("user2")));
//    }
