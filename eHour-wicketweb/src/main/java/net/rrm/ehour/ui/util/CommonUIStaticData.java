/**
 * Created on Jun 19, 2007
 * Created by Thies Edeling
 * Copyright (C) 2005, 2006 te-con, All Rights Reserved.
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 * 
 * thies@te-con.nl
 * TE-CON
 * Legmeerstraat 4-2h, 1058ND, AMSTERDAM, The Netherlands
 *
 */

package net.rrm.ehour.ui.util;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

import net.rrm.ehour.project.domain.ProjectAssignmentType;
import net.rrm.ehour.util.EhourConstants;

/**
 * Commons 
 **/

public class CommonUIStaticData
{
	public final static int	AJAX_CALENDARPANEL_MONTH_CHANGE = 1;
	public final static int	AJAX_CALENDARPANEL_WEEK_CLICK = 2;
	public final static int	AJAX_ENTRYSELECTOR_FILTER_CHANGE = 3;
	public final static int	AJAX_FORM_SUBMIT = 4;
	public final static int	AJAX_DELETE = 5;
	public final static int AJAX_LIST_CHANGE = 6;
	
	public final static String ROLE_CONSULTANT = "ROLE_CONSULTANT";
	public final static String ROLE_ADMIN = "ROLE_ADMIN";
	public final static String ROLE_REPORT = "ROLE_REPORT";
	public final static String ROLE_PM = "ROLE_PROJECTMANAGER";
	
	/**
	 * Get currencies
	 * @return
	 */
	public static Map<String, String> getCurrencies()
	{
		SortedMap<String, String> currencies = new TreeMap<String,String>();
		
		currencies.put("Dollar", "$");
		currencies.put("Euro", "&#8364;");
		currencies.put("Yen", "&yen;");
		currencies.put("Pound", "&pound;");
		
		return currencies;
	}
	
	/**
	 * Get resource key for project assignment type
	 * @param type
	 * @return
	 */
	public static String getResourceKeyForProjectAssignmentType(ProjectAssignmentType type)
	{
		String	key;
		switch (type.getAssignmentTypeId().intValue())
		{
			case EhourConstants.ASSIGNMENT_DATE:
				key = "assignment.dateRange";
				break;
			case EhourConstants.ASSIGNMENT_TIME_ALLOTTED_FIXED:
				key = "assignment.allottedFixed";
				break;
			case EhourConstants.ASSIGNMENT_TIME_ALLOTTED_FLEX:
				key = "assignment.allottedFlex";
				break;
			default:
				key = "assignment.allotted";
				break;
		}
		
		return key;
	}
	
}
