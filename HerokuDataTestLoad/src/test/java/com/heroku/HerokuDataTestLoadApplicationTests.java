package com.heroku;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.heroku.dao.HerokuDataDaoImpl;
import com.heroku.model.ResponseAnswer;
import com.heroku.service.HerokuDataServiceImpl;

@SpringBootTest
@RunWith(SpringRunner.class)
@AutoConfigureMockMvc
class HerokuDataTestLoadApplicationTests {

	@Test
	void contextLoads() {
	}

	
	@Mock
	private HerokuDataDaoImpl herokuDataDaoImpl;
	 
	  @InjectMocks 
	  
	  private HerokuDataServiceImpl herokuDataServiceImpl;
	 
		/*
		 * @InjectMocks private JdbcTemplate jdbcTemplate;
		 */
	 
	
	
		
		  @Before
		  public void init() { MockitoAnnotations.initMocks(this); }
		 
	
		
		  @Test
		  public void insertResponseAnswerDataTest() {
			  List<ResponseAnswer> responseanswer = new ArrayList<ResponseAnswer>();
				Date d = new Date();
				ResponseAnswer rsa = new ResponseAnswer();
				java.sql.Date fromdate = new java.sql.Date(d.getTime());
				Timestamp ts = new Timestamp(d.getTime());
				for (int i = 0; i < 10; i++) {
					

					rsa.setLastmodifieddate(ts);
					rsa.setIsdeleted(true);
					rsa.setAnswer__c("answer" + i);
					rsa.setResponse__c("response" + i);
					rsa.setName("name" + i);
					rsa.setSystemmodstamp(ts);
					rsa.setConnectionsentid("consentid" + i);
					rsa.setOwnerid("ownerid" + i);
					rsa.setCreatedbyid("createdid" + i);
					rsa.setCreateddate(ts);
					rsa.setConnectionreceivedid("conrviedid" + i);
					rsa.setLastmodifiedbyid("lastmedbyyid" + i);

					rsa.setSfid("sfid" + i);
					rsa.setId(Long.valueOf(i));
					rsa.set_hc_lastop("hclasttop" + i);
					rsa.set_hc_err("hcerror" + i);

					responseanswer.add(rsa);
				}
//Mockito.when(herokuDataDaoImpl.insertResponseAnswerData(responseanswer)

			//	Mockito.when(herokuDataDaoImpl.insertResponseAnswerData(responseanswer)).thenReturn(Mockito.any());
		
		//  herokuDataServiceImpl.insertResponseAnswerData();
		  }
		  
		/*
		 * @Test public void insertResponseDataTest() {
		 * herokuDataServiceImpl.insertResponseData(); }
		 * 
		 * @Test public void insertApplicationDataTest() {
		 * herokuDataServiceImpl.insertApplicationData(); }
		 * 
		 * @Test public void insertAssessmentDataTest() {
		 * herokuDataServiceImpl.insertAssessmentData();; }
		 * 
		 * @Test public void insertEmailMessageDataTest() {
		 * herokuDataServiceImpl.insertEmailMessageData(); }
		 * 
		 * 
		 * @Test public void insertErrorLogDataTest() {
		 * herokuDataServiceImpl.insertErrorLogData(); }
		 * 
		 * @Test public void insertIntegrationTransactionDataTest() {
		 * herokuDataServiceImpl.insertIntegrationTransactionData(); }
		 */
	
}
