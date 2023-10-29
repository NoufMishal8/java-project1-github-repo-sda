package com.example.NSalon.Controller;
import com.example.NSalon.Entity.User;
import com.example.NSalon.Repository.UserRepository;
import com.example.NSalon.Service.Implementation.UserServiceImpl;
import com.fasterxml.jackson.core.JsonProcessingException;
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
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();

        User user1 = new User("C1" , "Nouf" );
        User user2 = new User("C2" ,"Faisal");
        userRepository.saveAll(List.of(user1 ,user2));

    }
// ...



// ...

    @Test
    void getAllUsersTest() throws Exception{
        MvcResult mvcResult = mockMvc.perform(get("/all"))
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON))
                .andReturn();
        assertTrue(mvcResult.getResponse().getContentAsString().contains("Nouf"));
        assertTrue(mvcResult.getResponse().getContentAsString().contains("Faisal"));

    }



    @Test
    public void testPostUser() throws Exception {
        // Define the JSON payload for the new user
        String userJson = "{\"userId\": 1, \"username\": \"newuser\"}";

        mockMvc.perform(MockMvcRequestBuilders
                        .post("/users/add")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(userJson))
                .andExpect(MockMvcResultMatchers.status().isOk());

        // Verify that the user has been added to the database
        User addedUser = userRepository.findByUsername("Fahda");
        assertNotNull(addedUser);
        assertEquals(1, addedUser.getUserid());
        assertEquals("Fahda", addedUser.getUserName());
    }
}









        // C
//
//        mockUsers.add(new User("D1","Nouf","n@hotmail.com","012121"));
//        mockUsers.add(new User("F1","Faisal","F@hotmail.com","918227"));
//
//        when(userService.getAllUsers()).thenReturn(mockUsers);
//
//        mockMvc.perform(get("/all"))
//                .andExpect(status().isOk())
//                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
//                .andExpect(jsonPath("$", hasSize(2))) // Ensure you have 2 users
//                .andExpect(jsonPath("$[0].username", is("Nouf")))
//                .andExpect(jsonPath("$[1].username", is("Faisal")));
//    }
