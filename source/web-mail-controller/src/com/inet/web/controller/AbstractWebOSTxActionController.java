/*****************************************************************
   Copyright 2006 by Dung Nguyen (dungnguyen@truthinet.com)

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
package com.inet.web.controller;

import com.inet.web.controller.bean.WebOSBindContextBean;
import com.inet.web.core.WebDataScope;
import com.inet.web.core.struts.action.AbstractWebOSTxAction;
import com.inet.web.exception.WebOSException;
import com.inet.web.language.LanguageSupport;

/**
 * AbstractWebOSTxActionController.
 * 
 * @author <a href="mailto:dungnguyen@truthinet.com">Dung Nguyen</a>
 * @version 1.0i
 * 
 * Create date Jul 20, 2008
 * <pre>
 *  Initialization AbstractWebOSTxActionController class.
 * </pre>
 */
public abstract class AbstractWebOSTxActionController extends
		AbstractWebOSTxAction {
	/**
	 * bind context bean.
	 */
	private static final String BIND_CONTEXT_BEAN = "webosBindContextBean" ;
		
	/**
	 * the language bean.
	 */
	private static final String LANGUAGE_BEAN = "language" ;
	
	/**
	 * Create <tt>AbstractWebOSTxActionController</tt> instance.
	 */
	protected AbstractWebOSTxActionController() {
		this(WebDataScope.UNKNOWN, true) ;
	}
	
	/**
	 * Create <tt>AbstractWebOSTxActionController</tt> instance from the 
	 * given support menu flag.
	 * 
	 * @param supportMenu boolean - <code>true</code> if user want show menu, 
	 * otherwise <code>false</code> 
	 */
	protected AbstractWebOSTxActionController(boolean supportMenu) {
		this(WebDataScope.UNKNOWN, supportMenu) ;
	}

	/**
	 * Create <tt>AbstractWebOSTxActionController</tt> instance from the given
	 * <tt>WebDataScope</tt> instance.
	 * 
	 * @param scope WebDataScope - the given <tt>WebDataScope</tt> instance.
	 * @param supportMenu boolean - <code>true</code> if user want show menu, 
	 * otherwise <code>false</code>
	 */
	protected AbstractWebOSTxActionController(WebDataScope scope, boolean supportMenu) {
		super(scope);

		// add bind context bean.
		addBusiness(getBean(BIND_CONTEXT_BEAN, WebOSBindContextBean.class)) ;		
	}

	/**
	 * @see com.inet.web.core.struts.action.AbstractAction#getLanguageSupport()
	 */
	protected LanguageSupport getLanguageSupport() throws WebOSException {
		return getBean(LANGUAGE_BEAN, LanguageSupport.class);
	}
}
