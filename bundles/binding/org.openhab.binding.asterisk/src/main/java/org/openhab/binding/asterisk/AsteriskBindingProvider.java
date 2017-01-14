/**
 * Copyright (c) 2010-2016 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.asterisk;

import org.openhab.binding.asterisk.internal.AsteriskGenericBindingProvider.AsteriskBindingConfig;
import org.openhab.core.binding.BindingProvider;
import org.openhab.core.items.Item;

/**
 * This interface is implemented by classes that can map openHAB items to
 * Asterisk binding types.
 *
 * Implementing classes should register themselves as a service in order to be
 * taken into account.
 *
 * @author Thomas.Eichstaedt-Engelen
 * @since 0.9.0
 */
public interface AsteriskBindingProvider extends BindingProvider {
	
	/**
	 * Returns the Type of the Item identified by {@code itemName}
	 * 
	 * @param itemName the name of the item to find the type for
	 * @return the type of the Item identified by {@code itemName}
	 */
	Class<? extends Item> getItemType(String itemName);
	
	/** 
	 * Returns the binding type for an item name
	 * 
	 * @param itemName the name of the item
	 * @return the items binding type
	 */
	String getType(String itemName);

	/**
	 * Provides the binding configuration for a given item
	 * @param itemName name of the item you're requesting the binding configuration
	 * @return binding configuration
	 */	
	AsteriskBindingConfig getConfig(String itemName);	
}
