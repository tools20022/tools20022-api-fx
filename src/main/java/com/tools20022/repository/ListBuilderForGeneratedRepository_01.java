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

package com.tools20022.repository;

import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.msg.*;
import com.tools20022.repository.other.SignatureEnvelope;
import com.tools20022.repository.other.SupplementaryDataEnvelope1;
import java.util.List;

class ListBuilderForGeneratedRepository_01 {

	@SuppressWarnings("unchecked")
	static <T> List<T> addElems(List<T> list) {
		list.add((T) BranchData2.mmObject());
		list.add((T) BranchAndFinancialInstitutionIdentification5.mmObject());
		list.add((T) DateAndPlaceOfBirth.mmObject());
		list.add((T) OrganisationIdentificationSchemeName1Choice.mmObject());
		list.add((T) GenericOrganisationIdentification1.mmObject());
		list.add((T) PersonIdentificationSchemeName1Choice.mmObject());
		list.add((T) GenericPersonIdentification1.mmObject());
		list.add((T) PersonIdentification5.mmObject());
		list.add((T) ContactDetails2.mmObject());
		list.add((T) Pagination.mmObject());
		list.add((T) OrganisationIdentification7.mmObject());
		list.add((T) SupplementaryData1.mmObject());
		list.add((T) IdentificationSource3Choice.mmObject());
		list.add((T) OtherIdentification1.mmObject());
		list.add((T) Party10Choice.mmObject());
		list.add((T) PartyIdentification42.mmObject());
		list.add((T) Party9Choice.mmObject());
		list.add((T) NameAndAddress8.mmObject());
		list.add((T) PartyIdentification44.mmObject());
		list.add((T) PartyIdentification59.mmObject());
		list.add((T) PartyIdentification73Choice.mmObject());
		list.add((T) ClearingBrokerIdentification1.mmObject());
		list.add((T) AmountsAndValueDate1.mmObject());
		list.add((T) ContactInformation1.mmObject());
		list.add((T) MatchingSystemReference1Choice.mmObject());
		list.add((T) PartyIdentification60.mmObject());
		list.add((T) FundIdentification4.mmObject());
		list.add((T) TradePartyIdentification6.mmObject());
		list.add((T) SettlementParties29.mmObject());
		list.add((T) MessageReference.mmObject());
		list.add((T) WithdrawalReason1.mmObject());
		list.add((T) PayInCallItem.mmObject());
		list.add((T) Value.mmObject());
		list.add((T) ReportData5.mmObject());
		list.add((T) AcknowledgementDetails1Choice.mmObject());
		list.add((T) BalanceStatus2.mmObject());
		list.add((T) AgreedRate2.mmObject());
		list.add((T) CurrencyFactors1.mmObject());
		list.add((T) PayInFactors1.mmObject());
		list.add((T) ReportData4.mmObject());
		list.add((T) PayInScheduleItems1.mmObject());
		list.add((T) ReportParameter1.mmObject());
		list.add((T) RequestDetails4.mmObject());
		list.add((T) RequestDetails5.mmObject());
		list.add((T) RequestDetails3.mmObject());
		list.add((T) Event1.mmObject());
		list.add((T) RejectionReason2.mmObject());
		list.add((T) BusinessApplicationHeader1.mmObject());
		list.add((T) RegulatoryReporting4.mmObject());
		list.add((T) TradeAgreement12.mmObject());
		list.add((T) TradeData11.mmObject());
		list.add((T) CounterpartySideTransactionReporting1.mmObject());
		list.add((T) UniqueTransactionIdentifier2.mmObject());
		list.add((T) TradingSideTransactionReporting1.mmObject());
		list.add((T) Event2.mmObject());
		list.add((T) AgreedRate3.mmObject());
		list.add((T) SecurityIdentification19.mmObject());
		list.add((T) GeneralInformation5.mmObject());
		list.add((T) RegulatoryReporting6.mmObject());
		list.add((T) TradeData14.mmObject());
		list.add((T) TradeAgreement15.mmObject());
		list.add((T) NonDeliverableForwardConditions1.mmObject());
		list.add((T) TradeData12.mmObject());
		list.add((T) TradeAgreement14.mmObject());
		list.add((T) TradeData15.mmObject());
		list.add((T) StatusAndSubStatus2.mmObject());
		list.add((T) Status28Choice.mmObject());
		list.add((T) Status27Choice.mmObject());
		list.add((T) NDFOpeningFixing1Choice.mmObject());
		list.add((T) OpeningConditions1.mmObject());
		list.add((T) AgreementConditions1.mmObject());
		list.add((T) SettlementRateSource1.mmObject());
		list.add((T) NetObligation1.mmObject());
		list.add((T) NetReportData1.mmObject());
		list.add((T) NettingIdentification1Choice.mmObject());
		list.add((T) RequestDetails19.mmObject());
		list.add((T) NonDeliverableForwardConditions2.mmObject());
		list.add((T) SplitTradeDetails3.mmObject());
		list.add((T) TradeData16.mmObject());
		list.add((T) FixingConditions1.mmObject());
		list.add((T) SupplementaryDataEnvelope1.mmObject());
		list.add((T) SignatureEnvelope.mmObject());
		list.add((T) Max35Text.mmObject());
		list.add((T) ISODateTime.mmObject());
		list.add((T) ISODate.mmObject());
		list.add((T) CountryCode.mmObject());
		list.add((T) Max70Text.mmObject());
		list.add((T) Max140Text.mmObject());
		list.add((T) Max350Text.mmObject());
		list.add((T) CurrencyCode.mmObject());
		list.add((T) ActiveCurrencyCode.mmObject());
		list.add((T) DistributionPolicyCode.mmObject());
		list.add((T) DividendPolicyCode.mmObject());
		list.add((T) FormOfSecurityCode.mmObject());
		list.add((T) YesNoIndicator.mmObject());
		list.add((T) EventFrequencyCode.mmObject());
		list.add((T) EUSavingsDirectiveCode.mmObject());
		list.add((T) FrequencyCode.mmObject());
		list.add((T) Number.mmObject());
		list.add((T) PriceMethodCode.mmObject());
		list.add((T) CurrencyAndAmount.mmObject());
		list.add((T) ActiveCurrencyAndAmount.mmObject());
		list.add((T) DecimalNumber.mmObject());
		list.add((T) AddressTypeCode.mmObject());
		list.add((T) AddressType2Code.mmObject());
		list.add((T) Max16Text.mmObject());
		list.add((T) PhoneNumber.mmObject());
		list.add((T) Max256Text.mmObject());
		list.add((T) BICFIIdentifier.mmObject());
		list.add((T) SignatureTypeCode.mmObject());
		list.add((T) ISOTime.mmObject());
		list.add((T) IBAN2007Identifier.mmObject());
		list.add((T) BBANIdentifier.mmObject());
		list.add((T) UPICIdentifier.mmObject());
		list.add((T) Max2048Text.mmObject());
		list.add((T) AnyBICIdentifier.mmObject());
		list.add((T) HoldingTransferableCode.mmObject());
		list.add((T) PlusOrMinusIndicator.mmObject());
		list.add((T) BusinessDayConventionCode.mmObject());
		list.add((T) CashAccountTypeCode.mmObject());
		list.add((T) ActiveOrHistoricCurrencyCode.mmObject());
		list.add((T) SecuritiesAccountPurposeTypeCode.mmObject());
		list.add((T) Exact4AlphaNumericText.mmObject());
		list.add((T) FundCashAccountCode.mmObject());
		list.add((T) AccountOwnershipTypeCode.mmObject());
		list.add((T) TaxExemptReasonCode.mmObject());
		list.add((T) AccountStatusCode.mmObject());
		list.add((T) LanguageCode.mmObject());
		list.add((T) IncomePreferenceCode.mmObject());
		list.add((T) TaxWithholdingMethodCode.mmObject());
		list.add((T) RICIdentifier.mmObject());
		list.add((T) TickerIdentifier.mmObject());
		list.add((T) ConsolidatedTapeAssociationIdentifier.mmObject());
		list.add((T) EuroclearClearstreamIdentifier.mmObject());
		list.add((T) RoundingDirectionCode.mmObject());
		list.add((T) MoneyLaunderingCheckCode.mmObject());
		list.add((T) NamePrefix1Code.mmObject());
		list.add((T) GenderCode.mmObject());
		list.add((T) ResidentialStatusCode.mmObject());
		list.add((T) CertificateTypeCode.mmObject());
		list.add((T) PercentageRate.mmObject());
		list.add((T) PartyRoleCode.mmObject());
		list.add((T) CardTypeCode.mmObject());
		list.add((T) ISOYearMonth.mmObject());
		list.add((T) CHIPSUniversalIdentifier.mmObject());
		list.add((T) NewZealandNCCIdentifier.mmObject());
		list.add((T) IrishNSCIdentifier.mmObject());
		list.add((T) UKDomesticSortCodeIdentifier.mmObject());
		list.add((T) CHIPSParticipantIdentifier.mmObject());
		list.add((T) SwissBCIdentifier.mmObject());
		list.add((T) FedwireRoutingNumberIdentifier.mmObject());
		list.add((T) PortugueseNCCIdentifier.mmObject());
		list.add((T) RussianCentralBankIdentificationCodeIdentifier.mmObject());
		list.add((T) ItalianDomesticIdentifier.mmObject());
		list.add((T) AustrianBankleitzahlIdentifier.mmObject());
		list.add((T) CanadianPaymentsARNIdentifier.mmObject());
		list.add((T) SwissSICIdentifier.mmObject());
		list.add((T) GermanBankleitzahlIdentifier.mmObject());
		list.add((T) SpanishDomesticInterbankingIdentifier.mmObject());
		list.add((T) SouthAfricanNCCIdentifier.mmObject());
		list.add((T) HongKongBankIdentifier.mmObject());
		list.add((T) ExtensiveBranchNetworkIdentifier.mmObject());
		list.add((T) SmallNetworkIdentifier.mmObject());
		list.add((T) SEDOLIdentifier.mmObject());
		list.add((T) CUSIPIdentifier.mmObject());
		list.add((T) QUICKIdentifier.mmObject());
		list.add((T) WertpapierIdentifier.mmObject());
		list.add((T) DutchIdentifier.mmObject());
		list.add((T) ValorenIdentifier.mmObject());
		list.add((T) SicovamIdentifier.mmObject());
		list.add((T) BelgianIdentifier.mmObject());
		list.add((T) CommunicationMethodCode.mmObject());
		list.add((T) Max4AlphaNumericText.mmObject());
		list.add((T) FundOrderTypeCode.mmObject());
		list.add((T) BlockedReasonCode.mmObject());
		list.add((T) AccountUsageTypeCode.mmObject());
		list.add((T) ProvidedCode.mmObject());
		list.add((T) ConductClassificationCode.mmObject());
		list.add((T) RiskLevelCode.mmObject());
		list.add((T) InsuranceCode.mmObject());
		list.add((T) ISATypeCode.mmObject());
		list.add((T) ISOYear.mmObject());
		list.add((T) ActiveOrHistoricCurrencyAndAmount.mmObject());
		list.add((T) AccountManagementStatusCode.mmObject());
		list.add((T) RejectedStatusReasonCode.mmObject());
		list.add((T) PaymentTypeCode.mmObject());
		list.add((T) ImpliedCurrencyAndAmount.mmObject());
		list.add((T) CashClearingSystemCode.mmObject());
		list.add((T) ExternalClearingSystemIdentification1Code.mmObject());
		list.add((T) ExternalFinancialInstitutionIdentification1Code.mmObject());
		list.add((T) Max3NumericText.mmObject());
		list.add((T) PaymentInstrumentCode.mmObject());
		list.add((T) DebitCreditCode.mmObject());
		list.add((T) PaymentInstructionStatusCode.mmObject());
		list.add((T) Max10Text.mmObject());
		list.add((T) LimitTypeCode.mmObject());
		list.add((T) FloorLimitTypeCode.mmObject());
		list.add((T) Max34Text.mmObject());
		list.add((T) ReservationTypeCode.mmObject());
		list.add((T) BalanceTypeCode.mmObject());
		list.add((T) BalanceCounterpartyCode.mmObject());
		list.add((T) BICNonFIIdentifier.mmObject());
		list.add((T) EANGLNIdentifier.mmObject());
		list.add((T) DunsIdentifier.mmObject());
		list.add((T) ExternalOrganisationIdentification1Code.mmObject());
		list.add((T) ExternalPersonIdentification1Code.mmObject());
		list.add((T) SystemEventTypeCode.mmObject());
		list.add((T) TrueFalseIndicator.mmObject());
		list.add((T) StandingOrderTypeCode.mmObject());
		list.add((T) PaymentStatusCode.mmObject());
		list.add((T) CashPaymentStatusCode.mmObject());
		list.add((T) PriorityCode.mmObject());
		list.add((T) InstructionCode.mmObject());
		list.add((T) EntryStatusCode.mmObject());
		list.add((T) TransferTypeCode.mmObject());
		list.add((T) UKTaxGroupUnitCode.mmObject());
		list.add((T) SettlementDateCode.mmObject());
		list.add((T) ValuationTimingCode.mmObject());
		list.add((T) TypeOfPriceCode.mmObject());
		list.add((T) TaxableIncomePerShareCalculatedCode.mmObject());
		list.add((T) ChargeTypeCode.mmObject());
		list.add((T) CalculationBasisCode.mmObject());
		list.add((T) TaxTypeCode.mmObject());
		list.add((T) EUCapitalGainCode.mmObject());
		list.add((T) Max5NumericText.mmObject());
		list.add((T) EUDividendStatusCode.mmObject());
		list.add((T) BalanceStatusCode.mmObject());
		list.add((T) ProcessingTypeCode.mmObject());
		list.add((T) SystemStatusCode.mmObject());
		list.add((T) SystemClosureReasonCode.mmObject());
		list.add((T) LimitStatusCode.mmObject());
		list.add((T) SuspendedStatusReasonCode.mmObject());
		list.add((T) PendingFailingSettlementCode.mmObject());
		list.add((T) PendingSettlementStatusReasonCode.mmObject());
		list.add((T) PaymentPurposeCode.mmObject());
		list.add((T) Max20000Text.mmObject());
		list.add((T) UnmatchedStatusReasonCode.mmObject());
		list.add((T) CancelledStatusReasonV2Code.mmObject());
		list.add((T) PendingFailingReasonCode.mmObject());
		list.add((T) Max15NumericText.mmObject());
		list.add((T) TaxationBasisCode.mmObject());
		list.add((T) ChargeBearerTypeCode.mmObject());
		list.add((T) BeneficiaryCertificationCompletionCode.mmObject());
		list.add((T) CommissionTypeV2Code.mmObject());
		list.add((T) StampDutyTypeCode.mmObject());
		list.add((T) PhysicalTransferTypeCode.mmObject());
		list.add((T) AcknowledgementReasonCode.mmObject());
		list.add((T) NoReasonCode.mmObject());
		list.add((T) Max210Text.mmObject());
		list.add((T) InstructionProcessingStatusCode.mmObject());
		list.add((T) RejectionReasonV2Code.mmObject());
		list.add((T) RepairReasonV2Code.mmObject());
		list.add((T) MatchingStatusCode.mmObject());
		list.add((T) UnmatchedReasonCode.mmObject());
		list.add((T) SecuritiesSettlementStatusCode.mmObject());
		list.add((T) DeniedReasonCode.mmObject());
		list.add((T) ModifiedStatusReasonCode.mmObject());
		list.add((T) ReceiveDeliveryCode.mmObject());
		list.add((T) DeliveryReceiptTypeCode.mmObject());
		list.add((T) ExternalFinancialInstrumentIdentificationType1Code.mmObject());
		list.add((T) ProcessingPositionCode.mmObject());
		list.add((T) Exact3NumericText.mmObject());
		list.add((T) MICIdentifier.mmObject());
		list.add((T) MarketTypeCode.mmObject());
		list.add((T) PriceValueTypeCode.mmObject());
		list.add((T) Max3Number.mmObject());
		list.add((T) OpeningClosingCode.mmObject());
		list.add((T) ReportingCode.mmObject());
		list.add((T) TradeTransactionConditionCode.mmObject());
		list.add((T) EligibilityCode.mmObject());
		list.add((T) AffirmationStatusCode.mmObject());
		list.add((T) InterestComputationMethodCode.mmObject());
		list.add((T) SecuritiesPaymentStatusCode.mmObject());
		list.add((T) PaymentDirectionIndicator.mmObject());
		list.add((T) OptionStyleCode.mmObject());
		list.add((T) OptionDefinitionTypeCode.mmObject());
		list.add((T) BaseOneRate.mmObject());
		list.add((T) SafekeepingPlaceCode.mmObject());
		list.add((T) SecuritiesTransactionTypeV2Code.mmObject());
		list.add((T) SettlementTransactionConditionCode.mmObject());
		list.add((T) DeliveryReturnCode.mmObject());
		list.add((T) CashSystemTypeCode.mmObject());
		list.add((T) CashSettlementSystemCode.mmObject());
		list.add((T) ExposureTypeCode.mmObject());
		list.add((T) MarketClientSideCode.mmObject());
		list.add((T) RegistrationCode.mmObject());
		list.add((T) SettlingCapacityCode.mmObject());
		list.add((T) TaxLiabilityCode.mmObject());
		list.add((T) SettlementStandingInstructionDatabaseCode.mmObject());
		list.add((T) TypeOfIdentificationCode.mmObject());
		list.add((T) TransferReasonCode.mmObject());
		list.add((T) CopyDuplicateCode.mmObject());
		list.add((T) CopyDuplicate1Code.mmObject());
		list.add((T) CorporateActionCancellationReasonCode.mmObject());
		list.add((T) ProcessingStatusCode.mmObject());
		list.add((T) EventCompletenessStatusCode.mmObject());
		list.add((T) EventConfirmationStatusCode.mmObject());
		list.add((T) CorporateActionEventTypeV3Code.mmObject());
		list.add((T) CorporateActionMandatoryVoluntaryCode.mmObject());
		list.add((T) CorporateActionEventProcessingStatusCode.mmObject());
		list.add((T) ShortLongCode.mmObject());
		list.add((T) BeneficiaryCertificationTypeCode.mmObject());
		list.add((T) CorporateActionOptionCode.mmObject());
		list.add((T) FractionDispositionTypeCode.mmObject());
		list.add((T) CorporateActionChangeTypeCode.mmObject());
		list.add((T) QuantityCode.mmObject());
		list.add((T) AmountPriceTypeCode.mmObject());
		list.add((T) CorporateActionInstructionCancellationProcessingStatusCode.mmObject());
		list.add((T) RejectionReasonCode.mmObject());
		list.add((T) CorporateActionInstructionProcessingStatusCode.mmObject());
		list.add((T) AdditionalBusinessProcessCode.mmObject());
		list.add((T) OptionFeaturesCode.mmObject());
		list.add((T) DividendRateTypeCode.mmObject());
		list.add((T) RateStatusCode.mmObject());
		list.add((T) InterestRateTypeCode.mmObject());
		list.add((T) RateTypeCode.mmObject());
		list.add((T) PaymentCode.mmObject());
		list.add((T) IntermediateSecurityDistributionTypeCode.mmObject());
		list.add((T) CorporateActionReversalReasonCode.mmObject());
		list.add((T) CorporateActionEventProcessingTypeCode.mmObject());
		list.add((T) OptionAvailabilityStatusCode.mmObject());
		list.add((T) NonEligibleProceedsIndicatorCode.mmObject());
		list.add((T) OfferTypeV2Code.mmObject());
		list.add((T) CorporateActionNotificationTypeCode.mmObject());
		list.add((T) RenounceableStatusCode.mmObject());
		list.add((T) DividendTypeCode.mmObject());
		list.add((T) CorporateActionFrequencyTypeCode.mmObject());
		list.add((T) ConversionTypeCode.mmObject());
		list.add((T) DistributionTypeCode.mmObject());
		list.add((T) CorporateActionEventStageCode.mmObject());
		list.add((T) ElectionMovementTypeCode.mmObject());
		list.add((T) LotteryTypeCode.mmObject());
		list.add((T) CertificationFormatTypeCode.mmObject());
		list.add((T) Max105Text.mmObject());
		list.add((T) PartialSettlementCode.mmObject());
		list.add((T) SecuritiesBalanceTypeV2Code.mmObject());
		list.add((T) PriceSourceCode.mmObject());
		list.add((T) PreConfirmationCode.mmObject());
		list.add((T) LegalFrameworkCode.mmObject());
		list.add((T) Exact4NumericText.mmObject());
		list.add((T) BlockTradeCode.mmObject());
		list.add((T) SettlementSystemMethodCode.mmObject());
		list.add((T) AutoBorrowingCode.mmObject());
		list.add((T) MatchingProcessCode.mmObject());
		list.add((T) RepurchaseTypeCode.mmObject());
		list.add((T) GeneratedReasonCode.mmObject());
		list.add((T) TransactionActivityCode.mmObject());
		list.add((T) TransactionStatusCode.mmObject());
		list.add((T) ClearingSideCode.mmObject());
		list.add((T) ClearingAccountTypeCode.mmObject());
		list.add((T) PartyTypeCode.mmObject());
		list.add((T) TradingCapacityCode.mmObject());
		list.add((T) AllegementReasonCode.mmObject());
		list.add((T) ReplacementProcessingStatusCode.mmObject());
		list.add((T) CancellationStatusCode.mmObject());
		list.add((T) CashMarginOrderCode.mmObject());
		list.add((T) SideCode.mmObject());
		list.add((T) CustomerOrderCapacityCode.mmObject());
		list.add((T) PositionEffectCode.mmObject());
		list.add((T) Max128Text.mmObject());
		list.add((T) ClearingFeeTypeCode.mmObject());
		list.add((T) CalculationMethodCode.mmObject());
		list.add((T) PrePaymentSpeedCode.mmObject());
		list.add((T) CalculationTypeCode.mmObject());
		list.add((T) AssignmentMethodCode.mmObject());
		list.add((T) SettleStyleCode.mmObject());
		list.add((T) StandardisationCode.mmObject());
		list.add((T) OptionPartyCode.mmObject());
		list.add((T) UnitOfMeasureCode.mmObject());
		list.add((T) AppearanceCode.mmObject());
		list.add((T) LegalRestrictionsCode.mmObject());
		list.add((T) ProductTypeCode.mmObject());
		list.add((T) RatingValueIdentifier.mmObject());
		list.add((T) SecurityStatusCode.mmObject());
		list.add((T) SettlementTypeCode.mmObject());
		list.add((T) OperatorCode.mmObject());
		list.add((T) OrderQuantityTypeCode.mmObject());
		list.add((T) AllOrNoneIndicator.mmObject());
		list.add((T) StayOnSideTypeCode.mmObject());
		list.add((T) DayBookingInstructionCode.mmObject());
		list.add((T) BookingUnitCode.mmObject());
		list.add((T) BookingTypeCode.mmObject());
		list.add((T) PreAllocationMethodCode.mmObject());
		list.add((T) BusinessProcessTypeCode.mmObject());
		list.add((T) TradeTypeCode.mmObject());
		list.add((T) InterestTypeCode.mmObject());
		list.add((T) TradeRegulatoryConditionsCode.mmObject());
		list.add((T) CallInCode.mmObject());
		list.add((T) CallIn1Code.mmObject());
		list.add((T) ExposureTypeV2Code.mmObject());
		list.add((T) TerminationTypeCode.mmObject());
		list.add((T) DeliveryTypeCode.mmObject());
		list.add((T) LendingTransactionMethodCode.mmObject());
		list.add((T) BorrowingReasonCode.mmObject());
		list.add((T) CollateralTypeCode.mmObject());
		list.add((T) Max4NumericText.mmObject());
		list.add((T) SecuritiesLendingTypeCode.mmObject());
		list.add((T) ReversibleCode.mmObject());
		list.add((T) Max4Text.mmObject());
		list.add((T) Max15PlusSignedNumericText.mmObject());
		list.add((T) ExternalBankTransactionDomainCode.mmObject());
		list.add((T) ExternalBankTransactionFamilyCode.mmObject());
		list.add((T) ExternalChannelCode.mmObject());
		list.add((T) Max500Text.mmObject());
		list.add((T) InterestCode.mmObject());
		list.add((T) RemittanceLocationMethodCode.mmObject());
		list.add((T) DocumentTypeCode.mmObject());
		list.add((T) TransactionReasonCode.mmObject());
		list.add((T) AdjustmentDirectionCode.mmObject());
		list.add((T) TaxRecordPeriodCode.mmObject());
		list.add((T) CSCManagementCode.mmObject());
		list.add((T) CardDataReadingCode.mmObject());
		list.add((T) CardholderVerificationCapabilityCode.mmObject());
		list.add((T) OnLineCapabilityCode.mmObject());
		list.add((T) UserInterfaceCode.mmObject());
		list.add((T) POIComponentTypeCode.mmObject());
		list.add((T) CardPaymentServiceTypeCode.mmObject());
		list.add((T) ChargeIncludedIndicator.mmObject());
		list.add((T) PaymentMethodCode.mmObject());
		list.add((T) ServiceLevelCode.mmObject());
		list.add((T) ClearingChannelCode.mmObject());
		list.add((T) ExternalCode.mmObject());
		list.add((T) PaymentCategoryPurposeCode.mmObject());
		list.add((T) ExchangeRateTypeCode.mmObject());
		list.add((T) ChequeTypeCode.mmObject());
		list.add((T) ChequeDeliveryCode.mmObject());
		list.add((T) RegulatoryReportingTypeCode.mmObject());
		list.add((T) SequenceTypeCode.mmObject());
		list.add((T) Max1025Text.mmObject());
		list.add((T) CancellationReasonCode.mmObject());
		list.add((T) SettlementMethodCode.mmObject());
		list.add((T) ExternalStatusReason1Code.mmObject());
		list.add((T) Max2000Text.mmObject());
		list.add((T) DemandStatusCode.mmObject());
		list.add((T) ExternalUndertakingDocumentTypeCode.mmObject());
		list.add((T) ExternalDocumentFormatCode.mmObject());
		list.add((T) ExternalMandateReason1Code.mmObject());
		list.add((T) ISONormalisedDateTime.mmObject());
		list.add((T) UndertakingStatusCode.mmObject());
		list.add((T) TerminationReasonCode.mmObject());
		list.add((T) ExternalTypeOfPartyCode.mmObject());
		list.add((T) UndertakingNameCode.mmObject());
		list.add((T) ExternalUndertakingTypeCode.mmObject());
		list.add((T) GovernanceIdentificationCode.mmObject());
		list.add((T) ExternalUnderlyingTradeTransactionTypeCode.mmObject());
		list.add((T) PresentationMediumCode.mmObject());
		list.add((T) ExternalModelFormIdentificationCode.mmObject());
		list.add((T) ISO2ALanguageCode.mmObject());
		list.add((T) VariationTypeCode.mmObject());
		list.add((T) DemandTypeCode.mmObject());
		list.add((T) ExternalUndertakingStatusCategoryCode.mmObject());
		list.add((T) TradeStatusCode.mmObject());
		list.add((T) StatusSubTypeCode.mmObject());
		list.add((T) LEIIdentifier.mmObject());
		list.add((T) SideIndicatorCode.mmObject());
		list.add((T) SideIndicator1Code.mmObject());
		list.add((T) UnderlyingProductIdentifierCode.mmObject());
		list.add((T) UnderlyingProductIdentifier1Code.mmObject());
		list.add((T) AllocationIndicatorCode.mmObject());
		list.add((T) AllocationIndicator1Code.mmObject());
		list.add((T) CollateralisationIndicatorCode.mmObject());
		list.add((T) CollateralisationIndicator1Code.mmObject());
		list.add((T) Exact42Text.mmObject());
		list.add((T) TradingMethodCode.mmObject());
		list.add((T) Trading1MethodCode.mmObject());
		list.add((T) Max20Text.mmObject());
		list.add((T) WithdrawalReasonCode.mmObject());
		list.add((T) WithdrawalReason1Code.mmObject());
		list.add((T) EntryCode.mmObject());
		list.add((T) Entry2Code.mmObject());
		list.add((T) TypeOfAmountCode.mmObject());
		list.add((T) Max10000Binary.mmObject());
		list.add((T) AttendanceContextCode.mmObject());
		list.add((T) TransactionEnvironmentCode.mmObject());
		list.add((T) TransactionChannelCode.mmObject());
		list.add((T) AuthenticationMethodCode.mmObject());
		list.add((T) AuthenticationEntityCode.mmObject());
		list.add((T) TerminalManagementActionCode.mmObject());
		list.add((T) TerminalManagementActionTriggerCode.mmObject());
		list.add((T) TerminalManagementAdditionalProcessCode.mmObject());
		list.add((T) TerminalManagementActionResultCode.mmObject());
		list.add((T) TerminalManagementErrorActionCode.mmObject());
		list.add((T) Max140Binary.mmObject());
		list.add((T) POIComponentAssessmentCode.mmObject());
		list.add((T) FinancialCaptureCode.mmObject());
		list.add((T) BatchTransactionTypeCode.mmObject());
		list.add((T) ExchangePolicyCode.mmObject());
		list.add((T) RejectReasonCode.mmObject());
		list.add((T) TMSContactLevelCode.mmObject());
		list.add((T) TypeTransactionTotalsCode.mmObject());
		list.add((T) Max35NumericText.mmObject());
		list.add((T) LocationCategoryCode.mmObject());
		list.add((T) Max2NumericText.mmObject());
		list.add((T) ResponseCode.mmObject());
		list.add((T) Min6Max8Text.mmObject());
		list.add((T) FailureReasonCode.mmObject());
		list.add((T) CardAccountTypeCode.mmObject());
		list.add((T) CSCResultCode.mmObject());
		list.add((T) CardholderAddressVerificationResultCode.mmObject());
		list.add((T) OnLineReasonCode.mmObject());
		ListBuilderForGeneratedRepository_02.addElems(list);
		return list;
	}
}