/*
 * Created By: Abhinav Kumar Mishra
 * Copyright &copy; 2016. Abhinav Kumar Mishra. 
 * All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.abhinavmishra14.services;

import org.apache.axiom.om.OMAbstractFactory;
import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.OMFactory;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.github.abhinavmishra14.pojo.AuthResult;
import com.github.abhinavmishra14.pojo.UserModel;

/**
 * The Class MyWebservices.
 * 
 * @author Abhinav Kumar Mishra
 */
public class MyWebservices {
	
	/** The Constant LOG. */
	private static final Log LOG = LogFactory.getLog(MyWebservices.class);
	
	/** The Constant USERNAME. */
	private static final String USERNAME = "admin";
	
	/** The Constant RESULT. */
	private static final String RESULT = "result";
	
	/** The Constant FAILURE. */
	private static final String FAILURE = "Failure";
	
	/** The Constant SUCCESS. */
	private static final String SUCCESS = "Success";
	
	/** The Constant RESPONSE_MSG. */
	private static final String RESPONSE_MSG = "responseMessage";
	
	/** The Constant SESSIONID. */
	private static final String SESSIONID = "sessionId";
	
	/**
	 * Health check.
	 *
	 * @return the OM element
	 */
	public OMElement healthCheck () {
		LOG.info("Checking health status..");
		final OMFactory messageFactory = OMAbstractFactory.getOMFactory();
		final OMElement result = messageFactory.createOMElement(RESULT, null);
		result.setText("It Works!");
		return result;
	}
	
	/**
	 * Authenticate user pojo.
	 *
	 * @param userModel the user model
	 * @return the auth result
	 */
	public AuthResult authenticateUserPojo(final UserModel userModel){
		LOG.info("authenticateUserPojo invoked..");
		final String userName = userModel.getUserName();
		final String pass = userModel.getPassword();
		final AuthResult authResult = new AuthResult();
		if(USERNAME.equals(userName) && USERNAME.equals(pass)) {
			authResult.setResponseMessage(SUCCESS);
			authResult.setSessionId("123xyz");
		} else {
			authResult.setResponseMessage(FAILURE);
		}
		return authResult;
	}
	
	/**
	 * Authenticate user.
	 *
	 * @param userName the user name
	 * @param password the password
	 * @return the OM element
	 */
	public OMElement authenticateUser(final String userName, final String password) {
		LOG.info("authenticateUser invoked..");
		final OMFactory messageFactory = OMAbstractFactory.getOMFactory();
		final OMElement result = messageFactory.createOMElement(RESULT, null);
		final OMElement responseMessage = messageFactory.createOMElement(RESPONSE_MSG, null);

		if(USERNAME.equals(userName) && USERNAME.equals(password)) {
			responseMessage.setText(SUCCESS);
			final OMElement sessionId = messageFactory.createOMElement(SESSIONID, null);
			sessionId.setText("123abc");
			result.addChild(sessionId);
		} else {
			responseMessage.setText(FAILURE);
		}
		result.addChild(responseMessage);
		return result;
	}
}
