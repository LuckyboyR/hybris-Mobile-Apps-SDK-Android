/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 2-Sep-2015 12:47:22 PM
 * ----------------------------------------------------------------
 *
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2013 hybris AG
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of hybris
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with hybris.
 *
 *
 */
package com.hybris.mobile.lib.commerce.data.order;

import com.hybris.mobile.lib.commerce.data.order.OrderEntry;
import java.util.List;

public class OrderEntryList  implements java.io.Serializable 
{

	/** <i>Generated property</i> for <code>OrderEntryList.orderEntries</code> property defined at extension <code>commercewebservicescommons</code>. */
	private List<OrderEntry> orderEntries;
		
	public OrderEntryList()
	{
		// default constructor
	}
	
		
	public void setOrderEntries(final List<OrderEntry> orderEntries)
	{
		this.orderEntries = orderEntries;
	}
	
		
	public List<OrderEntry> getOrderEntries() 
	{
		return orderEntries;
	}
		
	
}