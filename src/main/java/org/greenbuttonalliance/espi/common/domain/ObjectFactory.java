/*
 *     Copyright (c) 2018-2019 Green Button Alliance, Inc.
 *
 *     Portions copyright (c) 2013-2018 EnergyOS.org
 *
 *     Licensed under the Apache License, Version 2.0 (the "License");
 *     you may not use this file except in compliance with the License.
 *     You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *     Unless required by applicable law or agreed to in writing, software
 *     distributed under the License is distributed on an "AS IS" BASIS,
 *     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     See the License for the specific language governing permissions and
 *     limitations under the License.
 *
 */

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.08.27 at 01:43:57 PM EDT 
//

package org.greenbuttonalliance.espi.common.domain;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each Java content interface and Java
 * element interface generated in the org.naesb.espi package.
 * <p>
 * An ObjectFactory allows you to programmatically construct new instances of the
 * Java representation for XML content. The Java representation of XML content
 * can consist of schema derived interfaces and classes representing the binding
 * of schema type definitions, element declarations and model groups. Factory
 * methods for each of these are provided in this class.
 */
@XmlRegistry
public class ObjectFactory {

	private static final String NAESB_URI = "http://naesb.org/espi";

	public static final QName IntervalReading_QNAME = new QName(
			NAESB_URI, "IntervalReading");
	public static final QName IntervalBlock_QNAME = new QName(
			NAESB_URI, "IntervalBlock");
	public static final QName Object_QNAME = new QName(NAESB_URI,
			"Object");
	public static final QName ReadingType_QNAME = new QName(
			NAESB_URI, "ReadingType");
	public static final QName SummaryMeasurement_QNAME = new QName(
			NAESB_URI, "SummaryMeasurement");
	public static final QName Authorization_QNAME = new QName(
			NAESB_URI, "Authorization");
	public static final QName ElectricPowerQualitySummary_QNAME = new QName(
			NAESB_URI, "ElectricPowerQualitySummary");
	public static final QName ReadingQuality_QNAME = new QName(
			NAESB_URI, "ReadingQuality");
	public static final QName Subscription_QNAME = new QName(
			NAESB_URI, "Subscription");
	public static final QName LocalTimeParameters_QNAME = new QName(
			NAESB_URI, "LocalTimeParameters");
	public static final QName ApplicationInformation_QNAME = new QName(
			NAESB_URI, "ApplicationInformation");
	public static final QName DateTimeInterval_QNAME = new QName(
			NAESB_URI, "DateTimeInterval");
	public static final QName ServiceStatus_QNAME = new QName(
			NAESB_URI, "ServiceStatus");
	public static final QName IdentifiedObject_QNAME = new QName(
			NAESB_URI, "IdentifiedObject");
	public static final QName MeterReading_QNAME = new QName(
			NAESB_URI, "MeterReading");
	public static final QName UsagePoint_QNAME = new QName(
			NAESB_URI, "UsagePoint");
	public static final QName BatchItemInfo_QNAME = new QName(
			NAESB_URI, "BatchItemInfo");
	public static final QName ElectricPowerUsageSummary_QNAME = new QName(
			NAESB_URI, "ElectricPowerUsageSummary");
	public static final QName LineItem_QNAME = new QName(
			NAESB_URI, "LineItem");
	public static final QName RetailCustomer_QNAME = new QName(
			NAESB_URI, "RetailCustomer");
	public static final QName GrantType_QNAME = new QName(
			NAESB_URI, "GrantType");

	/**
	 * Create a new ObjectFactory that can be used to create new instances of
	 * schema derived classes for package: org.naesb.espi
	 */
	public ObjectFactory() {
	}

	/**
	 * Create an instance of {@link MeterReading }
	 */
	public MeterReading createMeterReading() {
		return new MeterReading();
	}

	/**
	 * Create an instance of {@link UsagePoint }
	 */
	public UsagePoint createUsagePoint() {
		return new UsagePoint();
	}

	/**
	 * Create an instance of {@link BatchItemInfo }
	 */
	public BatchItemInfo createBatchItemInfo() {
		return new BatchItemInfo();
	}

	/**
	 * Create an instance of {@link ElectricPowerUsageSummary }
	 */
	public ElectricPowerUsageSummary createElectricPowerUsageSummary() {
		return new ElectricPowerUsageSummary();
	}

	/**
	 * Create an instance of {@link TimeConfiguration }
	 */
	public TimeConfiguration createTimeConfiguration() {
		return new TimeConfiguration();
	}

	/**
	 * Create an instance of {@link ApplicationInformation }
	 */
	public ApplicationInformation createApplicationInformation() {
		return new ApplicationInformation();
	}

	/**
	 * Create an instance of {@link DateTimeInterval }
	 */
	public DateTimeInterval createDateTimeInterval() {
		return new DateTimeInterval();
	}

	/**
	 * Create an instance of {@link ServiceStatus }
	 */
	public ServiceStatus createServiceStatus() {
		return new ServiceStatus();
	}

	/**
	 * Create an instance of {@link IdentifiedObject }
	 */
	public IdentifiedObject createIdentifiedObject() {
		return new IdentifiedObject();
	}

	/**
	 * Create an instance of {@link SummaryMeasurement }
	 */
	public SummaryMeasurement createSummaryMeasurement() {
		return new SummaryMeasurement();
	}

	/**
	 * Create an instance of {@link Authorization }
	 */
	public Authorization createAuthorization() {
		return new Authorization();
	}

	/**
	 * Create an instance of {@link Subscription }
	 */
	public Subscription createSubscription() {
		return new Subscription();
	}

	/**
	 * Create an instance of {@link ReadingQuality }
	 */
	public ReadingQuality createReadingQuality() {
		return new ReadingQuality();
	}

	/**
	 * Create an instance of {@link ElectricPowerQualitySummary }
	 */
	public ElectricPowerQualitySummary createElectricPowerQualitySummary() {
		return new ElectricPowerQualitySummary();
	}

	/**
	 * Create an instance of {@link IntervalReading }
	 */
	public IntervalReading createIntervalReading() {
		return new IntervalReading();
	}

	/**
	 * Create an instance of {@link java.lang.Object }
	 */
	public java.lang.Object createObject() {
		return new java.lang.Object();
	}

	/**
	 * Create an instance of {@link IntervalBlock }
	 */
	public IntervalBlock createIntervalBlock() {
		return new IntervalBlock();
	}

	/**
	 * Create an instance of {@link ReadingType }
	 */
	public ReadingType createReadingType() {
		return new ReadingType();
	}

	/**
	 * Create an instance of {@link RetailCustomer }
	 */
	public RetailCustomer createRetailCustomer() {
		return new RetailCustomer();
	}

	/**
	 * Create an instance of {@link RationalNumber }
	 */
	public RationalNumber createRationalNumber() {
		return new RationalNumber();
	}

	/**
	 * Create an instance of {@link ServiceCategory }
	 */
	public ServiceCategory createServiceCategory() {
		return new ServiceCategory();
	}

	/**
	 * Create an instance of {@link Resource }
	 */
	public Resource createResource() {
		return new Resource();
	}

	/**
	 * Create an instance of {@link ReadingInterharmonic }
	 */
	public ReadingInterharmonic createReadingInterharmonic() {
		return new ReadingInterharmonic();
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link IntervalReading }
	 * {@code >}
	 */
	@XmlElementDecl(namespace = NAESB_URI, name = "IntervalReading")
	public JAXBElement<IntervalReading> createIntervalReading(
			IntervalReading value) {
		return new JAXBElement<IntervalReading>(IntervalReading_QNAME,
				IntervalReading.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link IntervalBlock }
	 * {@code >}
	 */
	@XmlElementDecl(namespace = NAESB_URI, name = "IntervalBlock")
	public JAXBElement<IntervalBlock> createIntervalBlock(IntervalBlock value) {
		return new JAXBElement<IntervalBlock>(IntervalBlock_QNAME,
				IntervalBlock.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link java.lang.Object }{@code >}
	 */
	@XmlElementDecl(namespace = NAESB_URI, name = "Object")
	public JAXBElement<java.lang.Object> createObject(java.lang.Object value) {
		return new JAXBElement<java.lang.Object>(Object_QNAME,
				java.lang.Object.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link ReadingType }
	 * {@code >}
	 */
	@XmlElementDecl(namespace = NAESB_URI, name = "ReadingType")
	public JAXBElement<ReadingType> createReadingType(ReadingType value) {
		return new JAXBElement<ReadingType>(ReadingType_QNAME,
				ReadingType.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link RetailCustomer }
	 * {@code >}
	 */
	@XmlElementDecl(namespace = NAESB_URI, name = "RetailCustomer")
	public JAXBElement<RetailCustomer> createRetailCustomer(RetailCustomer value) {
		return new JAXBElement<RetailCustomer>(RetailCustomer_QNAME,
				RetailCustomer.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link SummaryMeasurement }{@code >}
	 */
	@XmlElementDecl(namespace = NAESB_URI, name = "SummaryMeasurement")
	public JAXBElement<SummaryMeasurement> createSummaryMeasurement(
			SummaryMeasurement value) {
		return new JAXBElement<SummaryMeasurement>(SummaryMeasurement_QNAME,
				SummaryMeasurement.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link Authorization }
	 * {@code >}
	 */
	@XmlElementDecl(namespace = NAESB_URI, name = "Authorization")
	public JAXBElement<Authorization> createAuthorization(Authorization value) {
		return new JAXBElement<Authorization>(Authorization_QNAME,
				Authorization.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link ElectricPowerQualitySummary }{@code >}
	 */
	@XmlElementDecl(namespace = NAESB_URI, name = "ElectricPowerQualitySummary")
	public JAXBElement<ElectricPowerQualitySummary> createElectricPowerQualitySummary(
			ElectricPowerQualitySummary value) {
		return new JAXBElement<ElectricPowerQualitySummary>(
				ElectricPowerQualitySummary_QNAME,
				ElectricPowerQualitySummary.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link ReadingQuality }
	 * {@code >}
	 */
	@XmlElementDecl(namespace = NAESB_URI, name = "ReadingQuality")
	public JAXBElement<ReadingQuality> createReadingQuality(ReadingQuality value) {
		return new JAXBElement<ReadingQuality>(ReadingQuality_QNAME,
				ReadingQuality.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link Subscription }
	 * {@code >}
	 */
	@XmlElementDecl(namespace = NAESB_URI, name = "Subscription")
	public JAXBElement<Subscription> createSubscription(Subscription value) {
		return new JAXBElement<Subscription>(Subscription_QNAME,
				Subscription.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link TimeConfiguration }{@code >}
	 */
	@XmlElementDecl(namespace = NAESB_URI, name = "LocalTimeParameters")
	public JAXBElement<TimeConfiguration> createLocalTimeParameters(
			TimeConfiguration value) {
		return new JAXBElement<TimeConfiguration>(LocalTimeParameters_QNAME,
				TimeConfiguration.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link ApplicationInformation }{@code >}
	 */
	@XmlElementDecl(namespace = NAESB_URI, name = "ApplicationInformation")
	public JAXBElement<ApplicationInformation> createApplicationInformation(
			ApplicationInformation value) {
		return new JAXBElement<ApplicationInformation>(
				ApplicationInformation_QNAME, ApplicationInformation.class,
				null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link GrantType }
	 * {@code >}
	 */
	@XmlElementDecl(namespace = NAESB_URI, name = "GrantType")
	public JAXBElement<GrantType> createGrantType(GrantType value) {
		return new JAXBElement<GrantType>(GrantType_QNAME, GrantType.class,
				null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link DateTimeInterval }{@code >}
	 */
	@XmlElementDecl(namespace = NAESB_URI, name = "DateTimeInterval")
	public JAXBElement<DateTimeInterval> createDateTimeInterval(
			DateTimeInterval value) {
		return new JAXBElement<DateTimeInterval>(DateTimeInterval_QNAME,
				DateTimeInterval.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link ServiceStatus }
	 * {@code >}
	 */
	@XmlElementDecl(namespace = NAESB_URI, name = "ServiceStatus")
	public JAXBElement<ServiceStatus> createServiceStatus(ServiceStatus value) {
		return new JAXBElement<ServiceStatus>(ServiceStatus_QNAME,
				ServiceStatus.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link IdentifiedObject }{@code >}
	 */
	@XmlElementDecl(namespace = NAESB_URI, name = "IdentifiedObject")
	public JAXBElement<IdentifiedObject> createIdentifiedObject(
			IdentifiedObject value) {
		return new JAXBElement<IdentifiedObject>(IdentifiedObject_QNAME,
				IdentifiedObject.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link MeterReading }
	 * {@code >}
	 */
	@XmlElementDecl(namespace = NAESB_URI, name = "MeterReading")
	public JAXBElement<MeterReading> createMeterReading(MeterReading value) {
		return new JAXBElement<MeterReading>(MeterReading_QNAME,
				MeterReading.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link UsagePoint }
	 * {@code >}
	 */
	@XmlElementDecl(namespace = NAESB_URI, name = "UsagePoint")
	public JAXBElement<UsagePoint> createUsagePoint(UsagePoint value) {
		return new JAXBElement<UsagePoint>(UsagePoint_QNAME, UsagePoint.class,
				null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link BatchItemInfo }
	 * {@code >}
	 */
	@XmlElementDecl(namespace = NAESB_URI, name = "BatchItemInfo")
	public JAXBElement<BatchItemInfo> createBatchItemInfo(BatchItemInfo value) {
		return new JAXBElement<BatchItemInfo>(BatchItemInfo_QNAME,
				BatchItemInfo.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link ElectricPowerUsageSummary }{@code >}
	 */
	@XmlElementDecl(namespace = NAESB_URI, name = "ElectricPowerUsageSummary")
	public JAXBElement<ElectricPowerUsageSummary> createElectricPowerUsageSummary(
			ElectricPowerUsageSummary value) {
		return new JAXBElement<ElectricPowerUsageSummary>(
				ElectricPowerUsageSummary_QNAME,
				ElectricPowerUsageSummary.class, null, value);
	}

	@XmlElementDecl(namespace = NAESB_URI, name = "costAdditionalDetailLastPeriod")
	public JAXBElement<LineItem> createLineItem(LineItem v) {
		return new JAXBElement<LineItem>(LineItem_QNAME, LineItem.class, null,
				v);
	}

}