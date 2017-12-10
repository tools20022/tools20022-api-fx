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

package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.TradeStatus6Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the status of a trade in a central matching and settlement system.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.TradeStatus6Code#Invalid
 * TradeStatus6Code.mmInvalid}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TradeStatus6Code#Matched
 * TradeStatus6Code.mmMatched}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeStatus6Code#SettlementMaturePending
 * TradeStatus6Code.mmSettlementMaturePending}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TradeStatus6Code#Rejected
 * TradeStatus6Code.mmRejected}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TradeStatus6Code#Rescinded
 * TradeStatus6Code.mmRescinded}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TradeStatus6Code#Settled
 * TradeStatus6Code.mmSettled}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TradeStatus6Code#Split
 * TradeStatus6Code.mmSplit}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TradeStatus6Code#Unmatched
 * TradeStatus6Code.mmUnmatched}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeStatus6Code#SettlementMature
 * TradeStatus6Code.mmSettlementMature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeStatus6Code#FixUnmatched
 * TradeStatus6Code.mmFixUnmatched}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TradeStatus6Code#Netted
 * TradeStatus6Code.mmNetted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeStatus6Code#PartialFix
 * TradeStatus6Code.mmPartialFix}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeStatus6Code#OpenMatched
 * TradeStatus6Code.mmOpenMatched}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.TradeStatusCode
 * TradeStatusCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"INVA"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TradeStatus6Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the status of a trade in a central matching and settlement system."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class TradeStatus6Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeStatus6Code
	 * TradeStatus6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Invalid"</li>
	 * </ul>
	 */
	public static final TradeStatus6Code Invalid = new TradeStatus6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Invalid";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeStatus6Code.mmObject();
			codeName = TradeStatusCode.Invalid.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeStatus6Code
	 * TradeStatus6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Matched"</li>
	 * </ul>
	 */
	public static final TradeStatus6Code Matched = new TradeStatus6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Matched";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeStatus6Code.mmObject();
			codeName = TradeStatusCode.Matched.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeStatus6Code
	 * TradeStatus6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementMaturePending"</li>
	 * </ul>
	 */
	public static final TradeStatus6Code SettlementMaturePending = new TradeStatus6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementMaturePending";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeStatus6Code.mmObject();
			codeName = TradeStatusCode.SettlementMaturePending.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeStatus6Code
	 * TradeStatus6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rejected"</li>
	 * </ul>
	 */
	public static final TradeStatus6Code Rejected = new TradeStatus6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rejected";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeStatus6Code.mmObject();
			codeName = TradeStatusCode.Rejected.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeStatus6Code
	 * TradeStatus6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rescinded"</li>
	 * </ul>
	 */
	public static final TradeStatus6Code Rescinded = new TradeStatus6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rescinded";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeStatus6Code.mmObject();
			codeName = TradeStatusCode.Rescinded.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeStatus6Code
	 * TradeStatus6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Settled"</li>
	 * </ul>
	 */
	public static final TradeStatus6Code Settled = new TradeStatus6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Settled";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeStatus6Code.mmObject();
			codeName = TradeStatusCode.Settled.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeStatus6Code
	 * TradeStatus6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Split"</li>
	 * </ul>
	 */
	public static final TradeStatus6Code Split = new TradeStatus6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Split";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeStatus6Code.mmObject();
			codeName = TradeStatusCode.Split.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeStatus6Code
	 * TradeStatus6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unmatched"</li>
	 * </ul>
	 */
	public static final TradeStatus6Code Unmatched = new TradeStatus6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unmatched";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeStatus6Code.mmObject();
			codeName = TradeStatusCode.Unmatched.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeStatus6Code
	 * TradeStatus6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementMature"</li>
	 * </ul>
	 */
	public static final TradeStatus6Code SettlementMature = new TradeStatus6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementMature";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeStatus6Code.mmObject();
			codeName = TradeStatusCode.SettlementMature.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeStatus6Code
	 * TradeStatus6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FixUnmatched"</li>
	 * </ul>
	 */
	public static final TradeStatus6Code FixUnmatched = new TradeStatus6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FixUnmatched";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeStatus6Code.mmObject();
			codeName = TradeStatusCode.FixUnmatched.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeStatus6Code
	 * TradeStatus6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Netted"</li>
	 * </ul>
	 */
	public static final TradeStatus6Code Netted = new TradeStatus6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Netted";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeStatus6Code.mmObject();
			codeName = TradeStatusCode.Netted.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeStatus6Code
	 * TradeStatus6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialFix"</li>
	 * </ul>
	 */
	public static final TradeStatus6Code PartialFix = new TradeStatus6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialFix";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeStatus6Code.mmObject();
			codeName = TradeStatusCode.PartialFix.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeStatus6Code
	 * TradeStatus6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OpenMatched"</li>
	 * </ul>
	 */
	public static final TradeStatus6Code OpenMatched = new TradeStatus6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OpenMatched";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeStatus6Code.mmObject();
			codeName = TradeStatusCode.OpenMatched.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, TradeStatus6Code> codesByName = new LinkedHashMap<>();

	protected TradeStatus6Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("INVA");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TradeStatus6Code";
				definition = "Specifies the status of a trade in a central matching and settlement system.";
				trace_lazy = () -> TradeStatusCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TradeStatus6Code.Invalid, com.tools20022.repository.codeset.TradeStatus6Code.Matched,
						com.tools20022.repository.codeset.TradeStatus6Code.SettlementMaturePending, com.tools20022.repository.codeset.TradeStatus6Code.Rejected, com.tools20022.repository.codeset.TradeStatus6Code.Rescinded,
						com.tools20022.repository.codeset.TradeStatus6Code.Settled, com.tools20022.repository.codeset.TradeStatus6Code.Split, com.tools20022.repository.codeset.TradeStatus6Code.Unmatched,
						com.tools20022.repository.codeset.TradeStatus6Code.SettlementMature, com.tools20022.repository.codeset.TradeStatus6Code.FixUnmatched, com.tools20022.repository.codeset.TradeStatus6Code.Netted,
						com.tools20022.repository.codeset.TradeStatus6Code.PartialFix, com.tools20022.repository.codeset.TradeStatus6Code.OpenMatched);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Invalid.getCodeName().get(), Invalid);
		codesByName.put(Matched.getCodeName().get(), Matched);
		codesByName.put(SettlementMaturePending.getCodeName().get(), SettlementMaturePending);
		codesByName.put(Rejected.getCodeName().get(), Rejected);
		codesByName.put(Rescinded.getCodeName().get(), Rescinded);
		codesByName.put(Settled.getCodeName().get(), Settled);
		codesByName.put(Split.getCodeName().get(), Split);
		codesByName.put(Unmatched.getCodeName().get(), Unmatched);
		codesByName.put(SettlementMature.getCodeName().get(), SettlementMature);
		codesByName.put(FixUnmatched.getCodeName().get(), FixUnmatched);
		codesByName.put(Netted.getCodeName().get(), Netted);
		codesByName.put(PartialFix.getCodeName().get(), PartialFix);
		codesByName.put(OpenMatched.getCodeName().get(), OpenMatched);
	}

	public static TradeStatus6Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static TradeStatus6Code[] values() {
		TradeStatus6Code[] values = new TradeStatus6Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, TradeStatus6Code> {
		@Override
		public TradeStatus6Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(TradeStatus6Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}