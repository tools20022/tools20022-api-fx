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
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ImpliedCurrencyAndAmount;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.entity.ObligationFulfilment;
import com.tools20022.repository.GeneratedRepository;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Payment information and processes required to transfer cash end to end from
 * the debtor to the creditor.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Payment" src="doc-files/Payment.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} =
 * {@linkplain com.tools20022.repository.entity.ObligationFulfilment
 * ObligationFulfilment}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#mmPaymentObligation
 * Payment.mmPaymentObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Payment#mmCurrencyOfTransfer
 * Payment.mmCurrencyOfTransfer}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#mmCreditMethod
 * Payment.mmCreditMethod}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#mmType
 * Payment.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#mmInstructedAmount
 * Payment.mmInstructedAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#mmPriority
 * Payment.mmPriority}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#mmValueDate
 * Payment.mmValueDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#mmPaymentStatus
 * Payment.mmPaymentStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#mmPartyRole
 * Payment.mmPartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#mmTaxOnPayment
 * Payment.mmTaxOnPayment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#mmPaymentExecution
 * Payment.mmPaymentExecution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Payment#mmPoolingAdjustmentDate
 * Payment.mmPoolingAdjustmentDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#mmEquivalentAmount
 * Payment.mmEquivalentAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#mmCurrencyExchange
 * Payment.mmCurrencyExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Payment#mmInstructionForCreditorAgent
 * Payment.mmInstructionForCreditorAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Payment#mmInstructionForDebtorAgent
 * Payment.mmInstructionForDebtorAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Payment#mmPaymentRelatedIdentifications
 * Payment.mmPaymentRelatedIdentifications}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Payment#mmRelatedInvestigationCase
 * Payment.mmRelatedInvestigationCase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Payment#mmSettlementTimeRequest
 * Payment.mmSettlementTimeRequest}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#mmAmount
 * Payment.mmAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#mmTradeSettlement
 * Payment.mmTradeSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Payment#mmStandardSettlementInstructions
 * Payment.mmStandardSettlementInstructions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Payment#mmRelatedDebitAuthorisation
 * Payment.mmRelatedDebitAuthorisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Payment#mmRelatedInvestigationCaseResolution
 * Payment.mmRelatedInvestigationCaseResolution}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#mmOriginalPayment
 * Payment.mmOriginalPayment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#mmReturnPayment
 * Payment.mmReturnPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Payment#mmRelatedSecuritiesSettlement
 * Payment.mmRelatedSecuritiesSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Payment#mmInvoiceReconciliation
 * Payment.mmInvoiceReconciliation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#mmPaymentInstrument
 * Payment.mmPaymentInstrument}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#mmAccount
 * Payment.mmAccount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#mmAdjustments
 * Payment.mmAdjustments}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Payment#mmContractRegistration
 * Payment.mmContractRegistration}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.CashAccount#mmPayment
 * CashAccount.mmPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Tax#mmRelatedPaymentSettlement
 * Tax.mmRelatedPaymentSettlement}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Adjustment#mmPayment
 * Adjustment.mmPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmPaymentOffset
 * PaymentObligation.mmPaymentOffset}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#mmOriginalPayment
 * Payment.mmOriginalPayment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#mmReturnPayment
 * Payment.mmReturnPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CreditInstrument#mmRelatedPayment
 * CreditInstrument.mmRelatedPayment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentExecution#mmPayment
 * PaymentExecution.mmPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentIdentification#mmPayment
 * PaymentIdentification.mmPayment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentPartyRole#mmPayment
 * PaymentPartyRole.mmPayment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentStatus#mmPayment
 * PaymentStatus.mmPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmPayment
 * SecuritiesSettlement.mmPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmRelatedPayment
 * CurrencyExchange.mmRelatedPayment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Invoice#mmPayment
 * Invoice.mmPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCase#mmUnderlyingPayment
 * PaymentInvestigationCase.mmUnderlyingPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SettlementTimeRequest#mmPayment
 * SettlementTimeRequest.mmPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DebitAuthorisation#mmAuthorisedReturn
 * DebitAuthorisation.mmAuthorisedReturn}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseResolution#mmPaymentCorrection
 * PaymentInvestigationCaseResolution.mmPaymentCorrection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CommercialTradeSettlement#mmPayment
 * CommercialTradeSettlement.mmPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RegisteredContract#mmRelatedPayment
 * RegisteredContract.mmRelatedPayment}</li>
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
 * "Payment"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Payment information and processes required to transfer cash end to end from the debtor to the creditor."
 * </li>
 * </ul>
 */
public class Payment extends ObligationFulfilment {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected List<com.tools20022.repository.entity.PaymentObligation> paymentObligation;
	/**
	 * Specifies the obligation which created the payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmPaymentOffset
	 * PaymentObligation.mmPaymentOffset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PaymentObligation
	 * PaymentObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Payment
	 * Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentObligation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the obligation which created the payment."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPaymentObligation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Payment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PaymentObligation";
			definition = "Specifies the obligation which created the payment.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmPaymentOffset;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmObject();
		}
	};
	protected CurrencyCode currencyOfTransfer;
	/**
	 * Specifies the currency of the amount to be transferred which may be
	 * different from the currency of the debtor's account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CurrencyCode
	 * CurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Payment
	 * Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyOfTransfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the currency of the amount to be transferred which may be different from the currency of the debtor's account."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCurrencyOfTransfer = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Payment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CurrencyOfTransfer";
			definition = "Specifies the currency of the amount to be transferred which may be different from the currency of the debtor's account.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Payment.class.getMethod("getCurrencyOfTransfer", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.CreditInstrument> creditMethod;
	/**
	 * Specifies the transfer method to be used for the credit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CreditInstrument#mmRelatedPayment
	 * CreditInstrument.mmRelatedPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CreditInstrument
	 * CreditInstrument}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Payment
	 * Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the transfer method to be used for the credit."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCreditMethod = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Payment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CreditMethod";
			definition = "Specifies the transfer method to be used for the credit.";
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CreditInstrument.mmRelatedPayment;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CreditInstrument.mmObject();
		}
	};
	protected PaymentTypeCode type;
	/**
	 * Type, or nature, of the payment, eg, express payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode
	 * PaymentTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Payment
	 * Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type, or nature, of the payment, eg, express payment."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Payment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Type, or nature, of the payment, eg, express payment.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PaymentTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Payment.class.getMethod("getType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyAndAmount instructedAmount;
	/**
	 * Amount of money to be moved between the debtor and creditor, before
	 * deduction of charges, expressed in the currency as ordered by the
	 * initiating party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Payment
	 * Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructedAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money to be moved between the debtor and creditor, before deduction of charges, expressed in the currency as ordered by the initiating party."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmInstructedAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Payment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InstructedAmount";
			definition = "Amount of money to be moved between the debtor and creditor, before deduction of charges, expressed in the currency as ordered by the initiating party.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Payment.class.getMethod("getInstructedAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PriorityCode priority;
	/**
	 * Urgency or order of importance that the originator would like the
	 * recipient of the payment to apply to its processing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.PriorityCode
	 * PriorityCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Payment
	 * Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Priority"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Urgency or order of importance that the originator would like the recipient of the payment  to apply to its processing."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmPriority = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Payment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Priority";
			definition = "Urgency or order of importance that the originator would like the recipient of the payment  to apply to its processing.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PriorityCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Payment.class.getMethod("getPriority", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODate valueDate;
	/**
	 * Date on which a payment must be executed
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Payment
	 * Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValueDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date on which a payment must be executed"</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmValueDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Payment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ValueDate";
			definition = "Date on which a payment must be executed";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Payment.class.getMethod("getValueDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.PaymentStatus> paymentStatus;
	/**
	 * Specifies the status of a payment at a specified time.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentStatus#mmPayment
	 * PaymentStatus.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PaymentStatus
	 * PaymentStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Payment
	 * Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the status of a payment at a specified time."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPaymentStatus = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Payment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PaymentStatus";
			definition = "Specifies the status of a payment at a specified time.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentStatus.mmPayment;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PaymentStatus.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.PaymentPartyRole> partyRole;
	/**
	 * Specifies each role linked to a payment and played by a party at that
	 * step in a payment flow.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentPartyRole#mmPayment
	 * PaymentPartyRole.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PaymentPartyRole
	 * PaymentPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Payment
	 * Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies each role linked to a payment and played by a party at that step in a payment flow."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPartyRole = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Payment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PartyRole";
			definition = "Specifies each role linked to a payment and played by a party at that step in a payment flow.";
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentPartyRole.mmPayment;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PaymentPartyRole.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Tax> taxOnPayment;
	/**
	 * Payment levy tax.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmRelatedPaymentSettlement
	 * Tax.mmRelatedPaymentSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Payment
	 * Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxOnPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Payment levy tax."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmTaxOnPayment = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Payment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TaxOnPayment";
			definition = "Payment levy tax.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Tax.mmRelatedPaymentSettlement;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.PaymentExecution> paymentExecution;
	/**
	 * Describes the processes necessary to execute a payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentExecution#mmPayment
	 * PaymentExecution.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PaymentExecution
	 * PaymentExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Payment
	 * Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentExecution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Describes the processes necessary to execute a payment."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPaymentExecution = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Payment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PaymentExecution";
			definition = "Describes the processes necessary to execute a payment.";
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentExecution.mmPayment;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PaymentExecution.mmObject();
		}
	};
	protected ISODate poolingAdjustmentDate;
	/**
	 * Date used for the correction of the value date of a cash pool movement
	 * that has been posted with a different value date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Payment
	 * Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PoolingAdjustmentDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date used for the correction of the value date of a cash pool movement that has been posted with a different value date."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmPoolingAdjustmentDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Payment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PoolingAdjustmentDate";
			definition = "Date used for the correction of the value date of a cash pool movement that has been posted with a different value date.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Payment.class.getMethod("getPoolingAdjustmentDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ImpliedCurrencyAndAmount equivalentAmount;
	/**
	 * Amount of money to be transferred between debtor and creditor, before
	 * deduction of charges, expressed in the currency of the debtor's account,
	 * and to be transferred in a different currency.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ImpliedCurrencyAndAmount
	 * ImpliedCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Payment
	 * Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EquivalentAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money to be transferred between debtor and creditor, before deduction of charges, expressed in the currency of the debtor's account, and to be transferred in a different currency."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmEquivalentAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Payment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EquivalentAmount";
			definition = "Amount of money to be transferred between debtor and creditor, before deduction of charges, expressed in the currency of the debtor's account, and to be transferred in a different currency.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Payment.class.getMethod("getEquivalentAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.CurrencyExchange> currencyExchange;
	/**
	 * Information on the exchange rate and amounts used in the payment
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmRelatedPayment
	 * CurrencyExchange.mmRelatedPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CurrencyExchange
	 * CurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Payment
	 * Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyExchange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information on the exchange rate and amounts used in the payment"</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCurrencyExchange = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Payment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CurrencyExchange";
			definition = "Information on the exchange rate and amounts used in the payment";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.mmRelatedPayment;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.mmObject();
		}
	};
	protected InstructionCode instructionForCreditorAgent;
	/**
	 * Further information related to the processing of the payment instruction
	 * that may need to be acted upon by the creditor agent. Usage: The
	 * instruction can relate to a level of service, can be an instruction to be
	 * executed by the creditor's agent, or can be information required by the
	 * creditor's agent to process the instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionCode
	 * InstructionCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Payment
	 * Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionForCreditorAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Further information related to the processing of the payment instruction that may need to be acted upon by the creditor agent. \nUsage: The instruction can relate to a level of service, can be an instruction to be executed by the creditor's agent, or can be information required by the creditor's agent to process the instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmInstructionForCreditorAgent = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Payment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InstructionForCreditorAgent";
			definition = "Further information related to the processing of the payment instruction that may need to be acted upon by the creditor agent. \nUsage: The instruction can relate to a level of service, can be an instruction to be executed by the creditor's agent, or can be information required by the creditor's agent to process the instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> InstructionCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Payment.class.getMethod("getInstructionForCreditorAgent", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected InstructionCode instructionForDebtorAgent;
	/**
	 * Further information related to the processing of the payment instruction
	 * that may need to be acted upon by the debtor's agent. Usage: The
	 * instruction can relate to a level of service, can be an instruction to be
	 * executed by the debtor's agent, or can be information required by the
	 * debtor's agent to process the instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionCode
	 * InstructionCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Payment
	 * Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionForDebtorAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Further information related to the processing of the payment instruction that may need to be acted upon by the debtor's agent.  \nUsage: The instruction can relate to a level of service, can be an instruction to be executed by the debtor's agent, or can be information required by the debtor's agent to process the instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmInstructionForDebtorAgent = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Payment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InstructionForDebtorAgent";
			definition = "Further information related to the processing of the payment instruction that may need to be acted upon by the debtor's agent.  \nUsage: The instruction can relate to a level of service, can be an instruction to be executed by the debtor's agent, or can be information required by the debtor's agent to process the instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> InstructionCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Payment.class.getMethod("getInstructionForDebtorAgent", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.PaymentIdentification> paymentRelatedIdentifications;
	/**
	 * Identifications provided to identify a payment at different processing
	 * levels.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentIdentification#mmPayment
	 * PaymentIdentification.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.PaymentIdentification
	 * PaymentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Payment
	 * Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentRelatedIdentifications"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifications provided to identify a payment at different processing levels."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPaymentRelatedIdentifications = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Payment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PaymentRelatedIdentifications";
			definition = "Identifications provided to identify a payment at different processing levels.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentIdentification.mmPayment;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PaymentIdentification.mmObject();
		}
	};
	protected PaymentInvestigationCase relatedInvestigationCase;
	/**
	 * Investigation case assigned to the payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCase#mmUnderlyingPayment
	 * PaymentInvestigationCase.mmUnderlyingPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCase
	 * PaymentInvestigationCase}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Payment
	 * Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedInvestigationCase"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Investigation case assigned to the payment."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedInvestigationCase = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Payment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedInvestigationCase";
			definition = "Investigation case assigned to the payment.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentInvestigationCase.mmUnderlyingPayment;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PaymentInvestigationCase.mmObject();
		}
	};
	protected SettlementTimeRequest settlementTimeRequest;
	/**
	 * Information on the requested settlement time of the instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SettlementTimeRequest#mmPayment
	 * SettlementTimeRequest.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SettlementTimeRequest
	 * SettlementTimeRequest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Payment
	 * Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementTimeRequest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information on the requested settlement time of the instruction."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSettlementTimeRequest = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Payment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SettlementTimeRequest";
			definition = "Information on the requested settlement time of the instruction.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SettlementTimeRequest.mmPayment;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SettlementTimeRequest.mmObject();
		}
	};
	protected CurrencyAndAmount amount;
	/**
	 * Amount of the payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Payment
	 * Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Amount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of the payment."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Payment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Amount";
			definition = "Amount of the payment.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Payment.class.getMethod("getAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.CommercialTradeSettlement> tradeSettlement;
	/**
	 * Specifies the settlement operation which originates the payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CommercialTradeSettlement#mmPayment
	 * CommercialTradeSettlement.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CommercialTradeSettlement
	 * CommercialTradeSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Payment
	 * Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the settlement operation which originates the payment."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmTradeSettlement = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Payment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TradeSettlement";
			definition = "Specifies the settlement operation which originates the payment.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CommercialTradeSettlement.mmPayment;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CommercialTradeSettlement.mmObject();
		}
	};
	protected Max140Text standardSettlementInstructions;
	/**
	 * Identifies the standard settlement instructions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Payment
	 * Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StandardSettlementInstructions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the standard settlement instructions."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmStandardSettlementInstructions = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Payment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "StandardSettlementInstructions";
			definition = "Identifies the standard settlement instructions.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max140Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Payment.class.getMethod("getStandardSettlementInstructions", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected DebitAuthorisation relatedDebitAuthorisation;
	/**
	 * Payment which is the result of the debit authorisation
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DebitAuthorisation#mmAuthorisedReturn
	 * DebitAuthorisation.mmAuthorisedReturn}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DebitAuthorisation
	 * DebitAuthorisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Payment
	 * Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedDebitAuthorisation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Payment which is the result of the debit authorisation"</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedDebitAuthorisation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Payment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedDebitAuthorisation";
			definition = "Payment which is the result of the debit authorisation";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.DebitAuthorisation.mmAuthorisedReturn;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.DebitAuthorisation.mmObject();
		}
	};
	protected PaymentInvestigationCaseResolution relatedInvestigationCaseResolution;
	/**
	 * Case resolution related to a specific payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseResolution#mmPaymentCorrection
	 * PaymentInvestigationCaseResolution.mmPaymentCorrection}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseResolution
	 * PaymentInvestigationCaseResolution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Payment
	 * Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedInvestigationCaseResolution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Case resolution related to a specific payment."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedInvestigationCaseResolution = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Payment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedInvestigationCaseResolution";
			definition = "Case resolution related to a specific payment.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentInvestigationCaseResolution.mmPaymentCorrection;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PaymentInvestigationCaseResolution.mmObject();
		}
	};
	protected Payment originalPayment;
	/**
	 * Original payment which is returned.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmReturnPayment
	 * Payment.mmReturnPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Payment
	 * Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Original payment which is returned."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmOriginalPayment = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Payment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OriginalPayment";
			definition = "Original payment which is returned.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Payment.mmReturnPayment;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Payment.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Payment> returnPayment;
	/**
	 * Payment which offsets an original payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmOriginalPayment
	 * Payment.mmOriginalPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Payment
	 * Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReturnPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Payment which offsets an original payment."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmReturnPayment = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Payment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ReturnPayment";
			definition = "Payment which offsets an original payment.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Payment.mmOriginalPayment;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Payment.mmObject();
		}
	};
	protected SecuritiesSettlement relatedSecuritiesSettlement;
	/**
	 * Securities settlement process which is the source of the payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmPayment
	 * SecuritiesSettlement.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Payment
	 * Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedSecuritiesSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities settlement process which is the source of the payment."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedSecuritiesSettlement = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Payment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedSecuritiesSettlement";
			definition = "Securities settlement process which is the source of the payment.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmPayment;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Invoice> invoiceReconciliation;
	/**
	 * Reconciliation of the amounts of an invoice with the amounts included in
	 * one or more payments.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Invoice#mmPayment
	 * Invoice.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Invoice Invoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Payment
	 * Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvoiceReconciliation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reconciliation of the amounts of an invoice with the amounts included in one or more payments."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmInvoiceReconciliation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Payment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvoiceReconciliation";
			definition = "Reconciliation of the amounts of an invoice with the amounts included in one or more payments.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Invoice.mmPayment;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Invoice.mmObject();
		}
	};
	protected PaymentInstrumentCode paymentInstrument;
	/**
	 * Payment type at the origin of the cash entry eg, a cheque.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentInstrumentCode
	 * PaymentInstrumentCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Payment
	 * Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentInstrument"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Payment type at the origin of the cash entry eg, a cheque."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmPaymentInstrument = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Payment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PaymentInstrument";
			definition = "Payment type at the origin of the cash entry eg, a cheque.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PaymentInstrumentCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Payment.class.getMethod("getPaymentInstrument", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CashAccount account;
	/**
	 * Account debited for the payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount#mmPayment
	 * CashAccount.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CashAccount
	 * CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Payment
	 * Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Account"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account debited for the payment."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmAccount = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Payment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Account";
			definition = "Account debited for the payment.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CashAccount.mmPayment;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashAccount.mmObject();
		}
	};
	protected Adjustment adjustments;
	/**
	 * Specifies the charges or the allowance related to a payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment#mmPayment
	 * Adjustment.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Adjustment
	 * Adjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Payment
	 * Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Adjustments"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the charges or the allowance related to a payment."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmAdjustments = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Payment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Adjustments";
			definition = "Specifies the charges or the allowance related to a payment.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Adjustment.mmPayment;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Adjustment.mmObject();
		}
	};
	protected RegisteredContract contractRegistration;
	/**
	 * Provides the payment of the registered contract.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.RegisteredContract#mmRelatedPayment
	 * RegisteredContract.mmRelatedPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.RegisteredContract
	 * RegisteredContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Payment
	 * Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContractRegistration"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the payment of the registered contract."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmContractRegistration = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Payment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ContractRegistration";
			definition = "Provides the payment of the registered contract.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.RegisteredContract.mmRelatedPayment;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.RegisteredContract.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Payment";
				definition = "Payment information and processes required to transfer cash end to end from the debtor to the creditor.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CashAccount.mmPayment, com.tools20022.repository.entity.Tax.mmRelatedPaymentSettlement, com.tools20022.repository.entity.Adjustment.mmPayment,
						com.tools20022.repository.entity.PaymentObligation.mmPaymentOffset, com.tools20022.repository.entity.Payment.mmOriginalPayment, com.tools20022.repository.entity.Payment.mmReturnPayment,
						com.tools20022.repository.entity.CreditInstrument.mmRelatedPayment, com.tools20022.repository.entity.PaymentExecution.mmPayment, com.tools20022.repository.entity.PaymentIdentification.mmPayment,
						com.tools20022.repository.entity.PaymentPartyRole.mmPayment, com.tools20022.repository.entity.PaymentStatus.mmPayment, com.tools20022.repository.entity.SecuritiesSettlement.mmPayment,
						com.tools20022.repository.entity.CurrencyExchange.mmRelatedPayment, com.tools20022.repository.entity.Invoice.mmPayment, com.tools20022.repository.entity.PaymentInvestigationCase.mmUnderlyingPayment,
						com.tools20022.repository.entity.SettlementTimeRequest.mmPayment, com.tools20022.repository.entity.DebitAuthorisation.mmAuthorisedReturn,
						com.tools20022.repository.entity.PaymentInvestigationCaseResolution.mmPaymentCorrection, com.tools20022.repository.entity.CommercialTradeSettlement.mmPayment,
						com.tools20022.repository.entity.RegisteredContract.mmRelatedPayment);
				superType_lazy = () -> ObligationFulfilment.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Payment.mmPaymentObligation, com.tools20022.repository.entity.Payment.mmCurrencyOfTransfer, com.tools20022.repository.entity.Payment.mmCreditMethod,
						com.tools20022.repository.entity.Payment.mmType, com.tools20022.repository.entity.Payment.mmInstructedAmount, com.tools20022.repository.entity.Payment.mmPriority,
						com.tools20022.repository.entity.Payment.mmValueDate, com.tools20022.repository.entity.Payment.mmPaymentStatus, com.tools20022.repository.entity.Payment.mmPartyRole,
						com.tools20022.repository.entity.Payment.mmTaxOnPayment, com.tools20022.repository.entity.Payment.mmPaymentExecution, com.tools20022.repository.entity.Payment.mmPoolingAdjustmentDate,
						com.tools20022.repository.entity.Payment.mmEquivalentAmount, com.tools20022.repository.entity.Payment.mmCurrencyExchange, com.tools20022.repository.entity.Payment.mmInstructionForCreditorAgent,
						com.tools20022.repository.entity.Payment.mmInstructionForDebtorAgent, com.tools20022.repository.entity.Payment.mmPaymentRelatedIdentifications, com.tools20022.repository.entity.Payment.mmRelatedInvestigationCase,
						com.tools20022.repository.entity.Payment.mmSettlementTimeRequest, com.tools20022.repository.entity.Payment.mmAmount, com.tools20022.repository.entity.Payment.mmTradeSettlement,
						com.tools20022.repository.entity.Payment.mmStandardSettlementInstructions, com.tools20022.repository.entity.Payment.mmRelatedDebitAuthorisation,
						com.tools20022.repository.entity.Payment.mmRelatedInvestigationCaseResolution, com.tools20022.repository.entity.Payment.mmOriginalPayment, com.tools20022.repository.entity.Payment.mmReturnPayment,
						com.tools20022.repository.entity.Payment.mmRelatedSecuritiesSettlement, com.tools20022.repository.entity.Payment.mmInvoiceReconciliation, com.tools20022.repository.entity.Payment.mmPaymentInstrument,
						com.tools20022.repository.entity.Payment.mmAccount, com.tools20022.repository.entity.Payment.mmAdjustments, com.tools20022.repository.entity.Payment.mmContractRegistration);
			}

			@Override
			public Class<?> getInstanceClass() {
				return Payment.class;
			}
		});
		return mmObject_lazy.get();
	}

	public List<PaymentObligation> getPaymentObligation() {
		return paymentObligation;
	}

	public void setPaymentObligation(List<com.tools20022.repository.entity.PaymentObligation> paymentObligation) {
		this.paymentObligation = paymentObligation;
	}

	public CurrencyCode getCurrencyOfTransfer() {
		return currencyOfTransfer;
	}

	public void setCurrencyOfTransfer(CurrencyCode currencyOfTransfer) {
		this.currencyOfTransfer = currencyOfTransfer;
	}

	public List<CreditInstrument> getCreditMethod() {
		return creditMethod;
	}

	public void setCreditMethod(List<com.tools20022.repository.entity.CreditInstrument> creditMethod) {
		this.creditMethod = creditMethod;
	}

	public PaymentTypeCode getType() {
		return type;
	}

	public void setType(PaymentTypeCode type) {
		this.type = type;
	}

	public CurrencyAndAmount getInstructedAmount() {
		return instructedAmount;
	}

	public void setInstructedAmount(CurrencyAndAmount instructedAmount) {
		this.instructedAmount = instructedAmount;
	}

	public PriorityCode getPriority() {
		return priority;
	}

	public void setPriority(PriorityCode priority) {
		this.priority = priority;
	}

	public ISODate getValueDate() {
		return valueDate;
	}

	public void setValueDate(ISODate valueDate) {
		this.valueDate = valueDate;
	}

	public List<PaymentStatus> getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(List<com.tools20022.repository.entity.PaymentStatus> paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public List<PaymentPartyRole> getPartyRole() {
		return partyRole;
	}

	public void setPartyRole(List<com.tools20022.repository.entity.PaymentPartyRole> partyRole) {
		this.partyRole = partyRole;
	}

	public List<Tax> getTaxOnPayment() {
		return taxOnPayment;
	}

	public void setTaxOnPayment(List<com.tools20022.repository.entity.Tax> taxOnPayment) {
		this.taxOnPayment = taxOnPayment;
	}

	public List<PaymentExecution> getPaymentExecution() {
		return paymentExecution;
	}

	public void setPaymentExecution(List<com.tools20022.repository.entity.PaymentExecution> paymentExecution) {
		this.paymentExecution = paymentExecution;
	}

	public ISODate getPoolingAdjustmentDate() {
		return poolingAdjustmentDate;
	}

	public void setPoolingAdjustmentDate(ISODate poolingAdjustmentDate) {
		this.poolingAdjustmentDate = poolingAdjustmentDate;
	}

	public ImpliedCurrencyAndAmount getEquivalentAmount() {
		return equivalentAmount;
	}

	public void setEquivalentAmount(ImpliedCurrencyAndAmount equivalentAmount) {
		this.equivalentAmount = equivalentAmount;
	}

	public List<CurrencyExchange> getCurrencyExchange() {
		return currencyExchange;
	}

	public void setCurrencyExchange(List<com.tools20022.repository.entity.CurrencyExchange> currencyExchange) {
		this.currencyExchange = currencyExchange;
	}

	public InstructionCode getInstructionForCreditorAgent() {
		return instructionForCreditorAgent;
	}

	public void setInstructionForCreditorAgent(InstructionCode instructionForCreditorAgent) {
		this.instructionForCreditorAgent = instructionForCreditorAgent;
	}

	public InstructionCode getInstructionForDebtorAgent() {
		return instructionForDebtorAgent;
	}

	public void setInstructionForDebtorAgent(InstructionCode instructionForDebtorAgent) {
		this.instructionForDebtorAgent = instructionForDebtorAgent;
	}

	public List<PaymentIdentification> getPaymentRelatedIdentifications() {
		return paymentRelatedIdentifications;
	}

	public void setPaymentRelatedIdentifications(List<com.tools20022.repository.entity.PaymentIdentification> paymentRelatedIdentifications) {
		this.paymentRelatedIdentifications = paymentRelatedIdentifications;
	}

	public PaymentInvestigationCase getRelatedInvestigationCase() {
		return relatedInvestigationCase;
	}

	public void setRelatedInvestigationCase(com.tools20022.repository.entity.PaymentInvestigationCase relatedInvestigationCase) {
		this.relatedInvestigationCase = relatedInvestigationCase;
	}

	public SettlementTimeRequest getSettlementTimeRequest() {
		return settlementTimeRequest;
	}

	public void setSettlementTimeRequest(com.tools20022.repository.entity.SettlementTimeRequest settlementTimeRequest) {
		this.settlementTimeRequest = settlementTimeRequest;
	}

	public CurrencyAndAmount getAmount() {
		return amount;
	}

	public void setAmount(CurrencyAndAmount amount) {
		this.amount = amount;
	}

	public List<CommercialTradeSettlement> getTradeSettlement() {
		return tradeSettlement;
	}

	public void setTradeSettlement(List<com.tools20022.repository.entity.CommercialTradeSettlement> tradeSettlement) {
		this.tradeSettlement = tradeSettlement;
	}

	public Max140Text getStandardSettlementInstructions() {
		return standardSettlementInstructions;
	}

	public void setStandardSettlementInstructions(Max140Text standardSettlementInstructions) {
		this.standardSettlementInstructions = standardSettlementInstructions;
	}

	public DebitAuthorisation getRelatedDebitAuthorisation() {
		return relatedDebitAuthorisation;
	}

	public void setRelatedDebitAuthorisation(com.tools20022.repository.entity.DebitAuthorisation relatedDebitAuthorisation) {
		this.relatedDebitAuthorisation = relatedDebitAuthorisation;
	}

	public PaymentInvestigationCaseResolution getRelatedInvestigationCaseResolution() {
		return relatedInvestigationCaseResolution;
	}

	public void setRelatedInvestigationCaseResolution(com.tools20022.repository.entity.PaymentInvestigationCaseResolution relatedInvestigationCaseResolution) {
		this.relatedInvestigationCaseResolution = relatedInvestigationCaseResolution;
	}

	public Payment getOriginalPayment() {
		return originalPayment;
	}

	public void setOriginalPayment(com.tools20022.repository.entity.Payment originalPayment) {
		this.originalPayment = originalPayment;
	}

	public List<Payment> getReturnPayment() {
		return returnPayment;
	}

	public void setReturnPayment(List<com.tools20022.repository.entity.Payment> returnPayment) {
		this.returnPayment = returnPayment;
	}

	public SecuritiesSettlement getRelatedSecuritiesSettlement() {
		return relatedSecuritiesSettlement;
	}

	public void setRelatedSecuritiesSettlement(com.tools20022.repository.entity.SecuritiesSettlement relatedSecuritiesSettlement) {
		this.relatedSecuritiesSettlement = relatedSecuritiesSettlement;
	}

	public List<Invoice> getInvoiceReconciliation() {
		return invoiceReconciliation;
	}

	public void setInvoiceReconciliation(List<com.tools20022.repository.entity.Invoice> invoiceReconciliation) {
		this.invoiceReconciliation = invoiceReconciliation;
	}

	public PaymentInstrumentCode getPaymentInstrument() {
		return paymentInstrument;
	}

	public void setPaymentInstrument(PaymentInstrumentCode paymentInstrument) {
		this.paymentInstrument = paymentInstrument;
	}

	public CashAccount getAccount() {
		return account;
	}

	public void setAccount(com.tools20022.repository.entity.CashAccount account) {
		this.account = account;
	}

	public Adjustment getAdjustments() {
		return adjustments;
	}

	public void setAdjustments(com.tools20022.repository.entity.Adjustment adjustments) {
		this.adjustments = adjustments;
	}

	public RegisteredContract getContractRegistration() {
		return contractRegistration;
	}

	public void setContractRegistration(com.tools20022.repository.entity.RegisteredContract contractRegistration) {
		this.contractRegistration = contractRegistration;
	}
}