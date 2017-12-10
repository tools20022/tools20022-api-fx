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

package com.tools20022.repository.entity;

import com.tools20022.metamodel.*;
import com.tools20022.repository.choice.Status27Choice;
import com.tools20022.repository.choice.Status28Choice;
import com.tools20022.repository.codeset.SettlementStatusCode;
import com.tools20022.repository.codeset.TradeStatusCode;
import com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.Status;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the status of a treasury trade at a specified time.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="TreasuryTradeSettlementStatus"
 * src="doc-files/TreasuryTradeSettlementStatus.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Status Status}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TreasuryTradeSettlementStatus#mmTradeStatus
 * TreasuryTradeSettlementStatus.mmTradeStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TreasuryTradeSettlementStatus#mmAllegedTrade
 * TreasuryTradeSettlementStatus.mmAllegedTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TreasuryTradeSettlementStatus#mmTreasuryTrade
 * TreasuryTradeSettlementStatus.mmTreasuryTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TreasuryTradeSettlementStatus#mmSettlement
 * TreasuryTradeSettlementStatus.mmSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TreasuryTradeSettlementStatus#mmRejectedAmount
 * TreasuryTradeSettlementStatus.mmRejectedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TreasuryTradeSettlementStatus#mmSettlementSuspended
 * TreasuryTradeSettlementStatus.mmSettlementSuspended}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TreasuryTradeSettlementStatus#mmPendingSettlement
 * TreasuryTradeSettlementStatus.mmPendingSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TreasuryTradeSettlementStatus#mmSettlementDate
 * TreasuryTradeSettlementStatus.mmSettlementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TreasuryTradeSettlementStatus#mmWithdrawalReason
 * TreasuryTradeSettlementStatus.mmWithdrawalReason}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TreasuryTrade#mmTreasuryTradeSettlementStatus
 * TreasuryTrade.mmTreasuryTradeSettlementStatus}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.TradeData14#mmCurrentStatus
 * TradeData14.mmCurrentStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeData14#mmCurrentStatusSubType
 * TradeData14.mmCurrentStatusSubType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeData14#mmPreviousStatus
 * TradeData14.mmPreviousStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeData14#mmPreviousStatusSubType
 * TradeData14.mmPreviousStatusSubType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeData12#mmCurrentStatus
 * TradeData12.mmCurrentStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeData12#mmCurrentStatusSubType
 * TradeData12.mmCurrentStatusSubType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeData12#mmPreviousStatus
 * TradeData12.mmPreviousStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeData12#mmPreviousStatusSubType
 * TradeData12.mmPreviousStatusSubType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeData15#mmCurrentStatus
 * TradeData15.mmCurrentStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeData15#mmCurrentStatusSubType
 * TradeData15.mmCurrentStatusSubType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeData15#mmPreviousStatus
 * TradeData15.mmPreviousStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeData15#mmPreviousStatusSubType
 * TradeData15.mmPreviousStatusSubType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeData16#mmCurrentStatus
 * TradeData16.mmCurrentStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeData16#mmCurrentStatusSubType
 * TradeData16.mmCurrentStatusSubType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeData16#mmPreviousStatus
 * TradeData16.mmPreviousStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeData16#mmPreviousStatusSubType
 * TradeData16.mmPreviousStatusSubType}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.TradeData11 TradeData11}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeData14 TradeData14}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeData12 TradeData12}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeData15 TradeData15}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StatusAndSubStatus2
 * StatusAndSubStatus2}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Status28Choice
 * Status28Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Status27Choice
 * Status27Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeData16 TradeData16}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TreasuryTradeSettlementStatus"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the status of a treasury trade at a specified time."
 * </li>
 * </ul>
 */
public class TreasuryTradeSettlementStatus extends Status {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected TradeStatusCode tradeStatus;
	/**
	 * Status of a treasury trade in a central matching/settlement system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TradeStatusCode
	 * TradeStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusAndSubStatus2#mmStatusCode
	 * StatusAndSubStatus2.mmStatusCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusAndSubStatus2#mmSubStatusCode
	 * StatusAndSubStatus2.mmSubStatusCode}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.Status28Choice#mmCode
	 * Status28Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status28Choice#mmProprietary
	 * Status28Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.Status27Choice#mmCode
	 * Status27Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status27Choice#mmProprietary
	 * Status27Choice.mmProprietary}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TreasuryTradeSettlementStatus
	 * TreasuryTradeSettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Status of a treasury trade in a central matching/settlement system."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmTradeStatus = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(StatusAndSubStatus2.mmStatusCode, StatusAndSubStatus2.mmSubStatusCode, Status28Choice.mmCode, Status28Choice.mmProprietary, Status27Choice.mmCode, Status27Choice.mmProprietary);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TreasuryTradeSettlementStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TradeStatus";
			definition = "Status of a treasury trade in a central matching/settlement system.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TradeStatusCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return TreasuryTradeSettlementStatus.class.getMethod("getTradeStatus", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator allegedTrade;
	/**
	 * Specifies whether a trade is alleged (notified by the counterparty) or
	 * not.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeData14#mmAllegedTrade
	 * TradeData14.mmAllegedTrade}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TreasuryTradeSettlementStatus
	 * TreasuryTradeSettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllegedTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether a trade is alleged (notified by the counterparty) or not."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmAllegedTrade = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(TradeData14.mmAllegedTrade);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TreasuryTradeSettlementStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AllegedTrade";
			definition = "Specifies whether a trade is alleged (notified by the counterparty) or not.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return TreasuryTradeSettlementStatus.class.getMethod("getAllegedTrade", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected TreasuryTrade treasuryTrade;
	/**
	 * Treasury trade for which a settlement status is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TreasuryTrade#mmTreasuryTradeSettlementStatus
	 * TreasuryTrade.mmTreasuryTradeSettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.TreasuryTrade
	 * TreasuryTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TreasuryTradeSettlementStatus
	 * TreasuryTradeSettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TreasuryTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Treasury trade for which a settlement status is provided."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmTreasuryTrade = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TreasuryTradeSettlementStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TreasuryTrade";
			definition = "Treasury trade for which a settlement status is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.TreasuryTrade.mmTreasuryTradeSettlementStatus;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.TreasuryTrade.mmObject();
		}
	};
	protected SettlementStatusCode settlement;
	/**
	 * Specifies the status of a settlement eg rejected, settled or awaiting
	 * authorisation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementStatusCode
	 * SettlementStatusCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TreasuryTradeSettlementStatus
	 * TreasuryTradeSettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Settlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the status of a settlement eg rejected, settled or awaiting authorisation."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmSettlement = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TreasuryTradeSettlementStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Settlement";
			definition = "Specifies the status of a settlement eg rejected, settled or awaiting authorisation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SettlementStatusCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return TreasuryTradeSettlementStatus.class.getMethod("getSettlement", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ActiveOrHistoricCurrencyAndAmount rejectedAmount;
	/**
	 * Amount that cannot be settled for instance by a settlement system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount
	 * ActiveOrHistoricCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TreasuryTradeSettlementStatus
	 * TreasuryTradeSettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RejectedAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount that cannot be settled for instance by a settlement system."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmRejectedAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TreasuryTradeSettlementStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RejectedAmount";
			definition = "Amount that cannot be settled for instance by a settlement system.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return TreasuryTradeSettlementStatus.class.getMethod("getRejectedAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator settlementSuspended;
	/**
	 * Cash settlement is suspended.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TreasuryTradeSettlementStatus
	 * TreasuryTradeSettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementSuspended"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cash settlement is suspended."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmSettlementSuspended = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TreasuryTradeSettlementStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SettlementSuspended";
			definition = "Cash settlement is suspended.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return TreasuryTradeSettlementStatus.class.getMethod("getSettlementSuspended", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator pendingSettlement;
	/**
	 * Cash settlement is pending.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TreasuryTradeSettlementStatus
	 * TreasuryTradeSettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cash settlement is pending."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmPendingSettlement = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TreasuryTradeSettlementStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PendingSettlement";
			definition = "Cash settlement is pending.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return TreasuryTradeSettlementStatus.class.getMethod("getPendingSettlement", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODateTime settlementDate;
	/**
	 * Date on which the trade is actually settled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TreasuryTradeSettlementStatus
	 * TreasuryTradeSettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date on which the trade is actually settled."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmSettlementDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TreasuryTradeSettlementStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SettlementDate";
			definition = "Date on which the trade is actually settled.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return TreasuryTradeSettlementStatus.class.getMethod("getSettlementDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text withdrawalReason;
	/**
	 * Reason that an alleged trade is withdrawn.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TreasuryTradeSettlementStatus
	 * TreasuryTradeSettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithdrawalReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason that an alleged trade is withdrawn."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmWithdrawalReason = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TreasuryTradeSettlementStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "WithdrawalReason";
			definition = "Reason that an alleged trade is withdrawn.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return TreasuryTradeSettlementStatus.class.getMethod("getWithdrawalReason", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TreasuryTradeSettlementStatus";
				definition = "Specifies the status of a treasury trade at a specified time.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.TreasuryTrade.mmTreasuryTradeSettlementStatus);
				derivationElement_lazy = () -> Arrays.asList(TradeData14.mmCurrentStatus, TradeData14.mmCurrentStatusSubType, TradeData14.mmPreviousStatus, TradeData14.mmPreviousStatusSubType, TradeData12.mmCurrentStatus,
						TradeData12.mmCurrentStatusSubType, TradeData12.mmPreviousStatus, TradeData12.mmPreviousStatusSubType, TradeData15.mmCurrentStatus, TradeData15.mmCurrentStatusSubType, TradeData15.mmPreviousStatus,
						TradeData15.mmPreviousStatusSubType, TradeData16.mmCurrentStatus, TradeData16.mmCurrentStatusSubType, TradeData16.mmPreviousStatus, TradeData16.mmPreviousStatusSubType);
				superType_lazy = () -> Status.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.TreasuryTradeSettlementStatus.mmTradeStatus, com.tools20022.repository.entity.TreasuryTradeSettlementStatus.mmAllegedTrade,
						com.tools20022.repository.entity.TreasuryTradeSettlementStatus.mmTreasuryTrade, com.tools20022.repository.entity.TreasuryTradeSettlementStatus.mmSettlement,
						com.tools20022.repository.entity.TreasuryTradeSettlementStatus.mmRejectedAmount, com.tools20022.repository.entity.TreasuryTradeSettlementStatus.mmSettlementSuspended,
						com.tools20022.repository.entity.TreasuryTradeSettlementStatus.mmPendingSettlement, com.tools20022.repository.entity.TreasuryTradeSettlementStatus.mmSettlementDate,
						com.tools20022.repository.entity.TreasuryTradeSettlementStatus.mmWithdrawalReason);
				derivationComponent_lazy = () -> Arrays.asList(TradeData11.mmObject(), TradeData14.mmObject(), TradeData12.mmObject(), TradeData15.mmObject(), StatusAndSubStatus2.mmObject(), Status28Choice.mmObject(),
						Status27Choice.mmObject(), TradeData16.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return TreasuryTradeSettlementStatus.class;
			}
		});
		return mmObject_lazy.get();
	}

	public TradeStatusCode getTradeStatus() {
		return tradeStatus;
	}

	public void setTradeStatus(TradeStatusCode tradeStatus) {
		this.tradeStatus = tradeStatus;
	}

	public YesNoIndicator getAllegedTrade() {
		return allegedTrade;
	}

	public void setAllegedTrade(YesNoIndicator allegedTrade) {
		this.allegedTrade = allegedTrade;
	}

	public TreasuryTrade getTreasuryTrade() {
		return treasuryTrade;
	}

	public void setTreasuryTrade(com.tools20022.repository.entity.TreasuryTrade treasuryTrade) {
		this.treasuryTrade = treasuryTrade;
	}

	public SettlementStatusCode getSettlement() {
		return settlement;
	}

	public void setSettlement(SettlementStatusCode settlement) {
		this.settlement = settlement;
	}

	public ActiveOrHistoricCurrencyAndAmount getRejectedAmount() {
		return rejectedAmount;
	}

	public void setRejectedAmount(ActiveOrHistoricCurrencyAndAmount rejectedAmount) {
		this.rejectedAmount = rejectedAmount;
	}

	public YesNoIndicator getSettlementSuspended() {
		return settlementSuspended;
	}

	public void setSettlementSuspended(YesNoIndicator settlementSuspended) {
		this.settlementSuspended = settlementSuspended;
	}

	public YesNoIndicator getPendingSettlement() {
		return pendingSettlement;
	}

	public void setPendingSettlement(YesNoIndicator pendingSettlement) {
		this.pendingSettlement = pendingSettlement;
	}

	public ISODateTime getSettlementDate() {
		return settlementDate;
	}

	public void setSettlementDate(ISODateTime settlementDate) {
		this.settlementDate = settlementDate;
	}

	public Max35Text getWithdrawalReason() {
		return withdrawalReason;
	}

	public void setWithdrawalReason(Max35Text withdrawalReason) {
		this.withdrawalReason = withdrawalReason;
	}
}