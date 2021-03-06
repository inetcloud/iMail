/*****************************************************************
   Copyright 2006 by Hien Nguyen (hiennguyen@truthinet.com)

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
package com.inet.mail;

/**
 * SubStringTest.
 * 
 * @author <a href="mailto:hiennguyen@truthinet.com">Hien Nguyen</a>
 * @version 0.2i
 */
public class SubStringTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String test = "Hien:Nguyen:Van";
		int index = test.indexOf(":");
		System.out.println(test.substring(index+1));
		System.out.println(test.substring(0,index));
	}

}
