/**
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */
package org.openmrs.module.register;

import org.openmrs.annotation.AddOnStartup;

public class RegisterConstant {
	@AddOnStartup(description = "Able to add/edit/delete Register")
	public static final String MANAGE_REGISTERS = "Manage Registers";
	
	@AddOnStartup(description = "Able to view Register patient and encounter entries")
	public static final String VIEW_REGISTER_ENTRIES = "View Register Entries";

	@AddOnStartup(description = "Able to add/edit/delete record of Patient and Encounter associated with the Register")
	public static final String MANAGE_REGISTER_ENTRIES = "Manage Register Entries";
}
