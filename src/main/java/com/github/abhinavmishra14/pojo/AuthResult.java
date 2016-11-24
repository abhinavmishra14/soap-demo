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
package com.github.abhinavmishra14.pojo;

import java.io.Serializable;

/**
 * The Class AuthResult.
 */
public class AuthResult implements Serializable{

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 3869694084982552728L;
	
	/** The session id. */
	private String sessionId;
	
	/** The response message. */
	private String responseMessage;
	
	/**
	 * Gets the session id.
	 *
	 * @return the session id
	 */
	public String getSessionId() {
		return sessionId;
	}
	
	/**
	 * Sets the session id.
	 *
	 * @param sessionId the session id
	 */
	public void setSessionId(final String sessionId) {
		this.sessionId = sessionId;
	}
	
	/**
	 * Gets the response message.
	 *
	 * @return the response message
	 */
	public String getResponseMessage() {
		return responseMessage;
	}
	
	/**
	 * Sets the response message.
	 *
	 * @param responseMessage the response message
	 */
	public void setResponseMessage(final String responseMessage) {
		this.responseMessage = responseMessage;
	}
}
