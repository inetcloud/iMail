/*****************************************************************
   Copyright 2008 by Truong Ngoc Tan (tntan@truthinet.com.vn)

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
package com.inet.web.bf.addressbook;

import com.inet.service.addressbook.ejb.session.RemoteAddressBookManagementSL;
import com.inet.web.application.AbstractApplicationServerProvider;
import com.inet.web.facade.AbstractEJBFacade;

public class AddressBookManagementBF extends AbstractEJBFacade<RemoteAddressBookManagementSL>{

	/**
	 * Address book management bean name
	 */
	private static final String ADDRESS_BOOK_MANAGEMENT_BEAN_NAME = "AddressBookManagementSLBean";
	
	/**
	 * Address book management BF constructor
	 * @param provider AbstractApplicationServerProvider
	 */
	public AddressBookManagementBF(AbstractApplicationServerProvider provider) {
		super(provider, ADDRESS_BOOK_MANAGEMENT_BEAN_NAME, BEAN_SCOPE_REMOTE);
	}

}
