/*****************************************************************
   Copyright 2006 by Duyen Tang (tttduyen@truthinet.com)

   Licensed under the iNet Solutions Corp.,;
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.truthinet.com/licenses

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
*****************************************************************/
package com.inet.web.controller.mail.domain;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.inet.web.controller.mail.AbstractWebOSAjaxContentController;
import com.inet.web.exception.WebOSException;
import com.inet.web.service.mail.domain.LoadMailDomainService;

/**
 * LoadMailDomainController.
 * 
 * @author <a href="mailto:tttduyen@truthinet.com">Duyen Tang</a>
 * @version 0.2i
 */
public class LoadMailDomainAjaxContent extends
		AbstractWebOSAjaxContentController<LoadMailDomainService> {

	/**
	 * The constructor
	 * 
	 * @param service LoadMailDomainService - the load mail domain service
	 */
	public LoadMailDomainAjaxContent(LoadMailDomainService loadMailDomainService) {
		super(loadMailDomainService);
	}

	/**
	 * @see com.inet.web.core.ajax.AbstractAjaxContent#executeBusiness(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	protected String executeBusiness(HttpServletRequest request,
			HttpServletResponse response) throws WebOSException {
		return getBusinessBean().execute(request, response).toString();
	}

}
