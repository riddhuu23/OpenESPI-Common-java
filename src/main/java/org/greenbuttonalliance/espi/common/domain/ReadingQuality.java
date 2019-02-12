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

import org.greenbuttonalliance.espi.common.models.atom.adapters.ReadingQualityAdapter;

import javax.persistence.*;
import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Quality of a specific reading value or interval reading value. Note that more
 * than one Quality may be applicable to a given Reading. Typically not used
 * unless problems or unusual conditions occur (i.e., quality for each Reading
 * is assumed to be 'Good' (valid) unless stated otherwise in associated
 * ReadingQuality).
 * <p/>
 * <p>
 * Java class for ReadingQuality complex type.
 * <p/>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * 
 * <pre>
 * &lt;complexType name="ReadingQuality">
 *   &lt;complexContent>
 *     &lt;extension base="{http://naesb.org/espi}Object">
 *       &lt;sequence>
 *         &lt;element name="quality" type="{http://naesb.org/espi}QualityOfReading"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReadingQuality", propOrder = { "quality" })
@Entity
@Table(name = "reading_qualities")
@XmlJavaTypeAdapter(ReadingQualityAdapter.class)
@XmlRootElement(name = "ReadingQuality")
public class ReadingQuality {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@XmlTransient
	protected Long id;

	@XmlElement(required = true)
	protected String quality;

	@XmlTransient
	@ManyToOne
	@JoinColumn(name = "interval_reading_id")
	protected IntervalReading intervalReading;

	/**
	 * Gets the value of the quality property.
	 *
	 * @return possible object is {@link String }
	 */
	public String getQuality() {
		return quality;
	}

	/**
	 * Sets the value of the quality property.
	 *
	 * @param value
	 *            allowed object is {@link String }
	 */
	public void setQuality(String value) {
		this.quality = value;
	}

	public IntervalReading getIntervalReading() {
		return intervalReading;
	}

	public void setIntervalReading(IntervalReading intervalReading) {
		this.intervalReading = intervalReading;
	}

}
