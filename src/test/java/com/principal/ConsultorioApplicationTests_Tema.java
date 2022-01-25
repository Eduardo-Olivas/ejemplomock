package com.principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.AutoConfigureJsonTesters;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.json.JacksonTester;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Description;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.principal.controller.TemaController;
import com.principal.controller.UserController;
import com.principal.dto.UserReqDTO;
import com.principal.impl.TemaServiceImpl;

import com.principal.model.Tema;
import com.principal.model.User;
import com.principal.repo.TemaRepository;
import com.principal.repo.UserRepository;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;

import static org.hamcrest.Matchers.containsString;

import org.springframework.test.context.junit4.SpringRunner;


@WebMvcTest(TemaController.class)
@ComponentScan(basePackages = "com.principal")
class ConsultorioApplicationTests_Tema {
	
	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private TemaServiceImpl Srv;
	
	@MockBean
	private TemaRepository Repo;
	
    String name_mock= "Python";
    String level_mock= "1";
    String time_mock= "1hr";
    String trainer_mock= "Jesus Mendez";
    String price_mock= "100";
    String description_mock= "Learn how to use NumPy, Pandas, Seaborn , Matplotlib , Plotly , Scikit-Learn , Machine Learning, Tensorflow , and more!";
    String lenguajes_mock= "ESP,ENG";
    String cc_mock= "ESP,ENG";
    String download_mock= "15";
    String certification_mock= "15";
    String videos_mock= "15";
    String type_mock= "15";
    
    
	Tema mockONE  = new Tema(name_mock, level_mock, time_mock, trainer_mock, price_mock, description_mock, lenguajes_mock, cc_mock, download_mock, certification_mock, videos_mock, type_mock);
	Tema mockONE2  = new Tema(name_mock, level_mock, time_mock, trainer_mock, price_mock, description_mock, lenguajes_mock, cc_mock, download_mock, certification_mock, videos_mock, type_mock);

	
	
	
	@Autowired
	public TemaController temaController;
	
	@Test
	@Description("sevice tema not null")
	public void temaServiceTest() throws Exception {
		
		assertThat(Srv).isNotNull();
	}
	
	@Test
	@Description("controller tema not null")
	public void temaControllerTest() throws Exception {
		assertThat(temaController).isNotNull();
	}
	
	@Test
	@Description("Onse Tema")
	public void getTemaTest() throws Exception {
	/*	Mockito.when(
				Srv.findById(Mockito.anyLong())
				).thenReturn(CompletableFuture.completedFuture( mockONE) );
		
		RequestBuilder reqBuilder = 
				MockMvcRequestBuilders
					.get("http://localhost:8181/api/temas/16")
					.accept(MediaType.APPLICATION_JSON);
		
		MvcResult res = mockMvc.perform(reqBuilder).andReturn();
		
		System.out.println(res.getResponse());
		String expected ="{}";
		
		//JSONAssert.assertEquals( expected , res.getResponse(), false);
		 
		*/
		//given
		given(Srv.findById(Mockito.anyLong()))
		.willReturn(
			CompletableFuture.completedFuture(mockONE)
				);
		//when
		
		
//		String expected = "{\"name\"=\"Carlos\", \"lastName\"=Rojo\", \"surName\"=\"Cano\", \"email\"=\"charly@hotmail.com\", \"role\"=\"admin\", \"username\"=\"charlyatos\", \"password\"=123, \"status\"=0, \"userModifier\"=1, \"userCreator\"=1}";
//		String expected = "name=Carlos, lastName=Rojo, surName=Cano, email=charly@hotmail.com, role=admin, username=charlyatos, password=123, status=0, userModifier=1, userCreator=1";
		String expected = "";
//		MvcResult response = 
			this.mockMvc.perform(get("http://localhost:8181/api/temas/16").accept(MediaType.APPLICATION_JSON) )
			.andDo(print())
			.andExpect(content().string(expected))
//			.andExpect(status().is4xxClientError());
			.andExpect(status().is2xxSuccessful())
			;
//			.andReturn();
		//then
		
	}
	
	@Test
	@Description("All Temas")
	public void allTemasTest() throws Exception {
		
		List<Tema> all = new ArrayList<Tema>();
		all.add(mockONE);
		all.add(mockONE2);
		
		given(Srv.findAll())
		.willReturn(
			CompletableFuture.completedFuture(all)
				);
		//when
		
		
		String expected = "";
			this.mockMvc.perform(get("http://localhost:8181/api/temas").accept(MediaType.APPLICATION_JSON) )
			.andDo(print())
			.andExpect(content().string(expected))
			.andExpect(status().is2xxSuccessful())
			;
		//then
		
	}

	@Test
	@Description("delete a user")
	public void delUserTest() throws Exception {
		
		
		given(Srv.delete(Mockito.anyLong()))
		.willReturn(
			CompletableFuture.completedFuture(true)
				);
		//when
		
		String expected = "";
			this.mockMvc.perform(delete("http://localhost:8181/api/temas/16") )
			.andDo(print())
			.andExpect(content().string(expected))
			.andExpect(status().is2xxSuccessful())
			;
		//then
		
	}
	
	@Test
	@Description("add a tema")
//	@Disabled
	public void addTemaTest() throws Exception {
		
		
		given(Srv.save(Mockito.any()))
		.willReturn(
			CompletableFuture.completedFuture(new Tema())
				);
		//when
//		String Body = "{\"name\":\"Carlos\", \"lastName\":\"Rojo\", \"surName\":\"Cano\", \"email\":\"charly@hotmail.com\", \"role\":\"admin\", \"username\":\"charlyatos\", \"password\":\"123\", \"status\":\"0\", \"userModifier\":\"1\", \"userCreator\":\"1\"}";
		
		String Body;
		
		Body = "{"
				+ "\"name\":\"Python\", "
				+ "\"level\":\"1\", "
				+ "\"time\":\"1hr\", "
				+ "\"trainer\":\"Learn how to use NumPy, Pandas, Seaborn , Matplotlib , Plotly , Scikit-Learn , Machine Learning, Tensorflow , and more!\", "
				+ "\"price\":\"ESP\", "
				+ "\"description\":\"ESP\", "
				+ "\"lenguage\":\"123\", "
				+ "\"cc\":\"0\", "
				+ "\"download\":\"1\", "
				+ "\"certification\":\"1\","
				+ "\"video\":\"1\","
				+ "\"type\":\"1\""
				+ "}";
		String expected = "";
			this.mockMvc.perform(
					post("http://localhost:8181/api/temas/")
					.accept(MediaType.APPLICATION_JSON)
	                .contentType(MediaType.APPLICATION_JSON)
					.content(Body)
					)
			.andDo(print())
			.andExpect(content().string(expected))
			.andExpect(status().is2xxSuccessful());
		//then
		
	}
	@Test
	@Description("add a tema object mapper")
//	@Disabled
	public void addUserTest2() throws Exception {
		
		
		given(Srv.save(Mockito.any()))
		.willReturn(
			CompletableFuture.completedFuture(new Tema())
				);
		//when
		ObjectMapper mapr = new ObjectMapper();
		
		String Body = mapr.writeValueAsString(mockONE); 
		String expected = "";
			this.mockMvc.perform(
					post("http://localhost:8181/api/temas/")
					.accept(MediaType.APPLICATION_JSON)
	                .contentType(MediaType.APPLICATION_JSON)
					.content(Body)
					)
			.andDo(print())
			.andExpect(content().string(expected))
			.andExpect(status().is2xxSuccessful())
			;
		//then
			
		
	}
}
