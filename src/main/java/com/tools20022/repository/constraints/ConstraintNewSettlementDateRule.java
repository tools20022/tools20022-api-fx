/* Tools20022 - API for ISO 20022
* Copyright (C) 2017 Tools20022.com - László Bukodi 
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.tools20022.repository.constraints;

import com.tools20022.core.repo.NotImplementedConstraintException;
import com.tools20022.metamodel.MMConstraint;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.msg.TradeData11;

/**
 * New Settlement Date is only to be used when there has been an amendment to
 * the settlement date. For example, when there has been a currency calendar
 * amendment or a settlement deferral event.
 */
public class ConstraintNewSettlementDateRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TradeData11 TradeData11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewSettlementDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "New Settlement Date is only to be used when there has been an amendment to the settlement date. For example, when there has been a currency calendar amendment or a settlement deferral event."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TradeData11> forTradeData11 = new MMConstraint<TradeData11>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewSettlementDateRule";
			definition = "New Settlement Date is only to be used when there has been an amendment to the settlement date. For example, when there has been a currency calendar amendment or a settlement deferral event.";
			owner_lazy = () -> TradeData11.mmObject();
		}

		@Override
		public void executeValidator(TradeData11 obj) throws Exception {
			checkTradeData11(obj);
		}
	};

	/**
	 * New Settlement Date is only to be used when there has been an amendment
	 * to the settlement date. For example, when there has been a currency
	 * calendar amendment or a settlement deferral event.
	 */
	public static void checkTradeData11(TradeData11 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}