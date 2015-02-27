/*
 * Copyright (c) SiteWhere, LLC. All rights reserved. http://www.sitewhere.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package com.sitewhere.rest.model.device.element;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.sitewhere.spi.device.element.IDeviceElementSchema;

/**
 * Default implementation of {@link IDeviceElementSchema}.
 * 
 * @author Derek
 */
@JsonInclude(Include.NON_NULL)
public class DeviceElementSchema extends DeviceUnit implements IDeviceElementSchema {

	public DeviceElementSchema() {
	}
}