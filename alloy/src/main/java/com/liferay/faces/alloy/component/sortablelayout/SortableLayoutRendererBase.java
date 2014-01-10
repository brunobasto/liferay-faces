/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */
package com.liferay.faces.alloy.component.sortablelayout;

import java.io.IOException;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;

import com.liferay.faces.alloy.component.base.AUIRenderer;
import com.liferay.faces.util.lang.StringPool;

/**
 * @author Eduardo Lundgren
 * @author Bruno Basto
 * @author Nathan Cavanaugh
 */
public abstract class SortableLayoutRendererBase extends AUIRenderer {

	@Override
	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		super.encodeBegin(facesContext, uiComponent);
		SortableLayout sortableLayout = (SortableLayout) uiComponent;
		encodeHTML(facesContext, sortableLayout);
		encodeJavaScript(facesContext, sortableLayout);
	}

	protected abstract void encodeHTML(FacesContext facesContext, SortableLayout sortableLayout) throws IOException;

	protected void encodeJavaScript(FacesContext facesContext, SortableLayout sortableLayout) throws IOException {

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.startElement("script", sortableLayout);
		responseWriter.writeAttribute("type", "text/javascript", null);

		responseWriter.write(StringPool.FORWARD_SLASH);
		responseWriter.write(StringPool.FORWARD_SLASH);
		responseWriter.write(StringPool.SPACE);
		responseWriter.write(StringPool.CDATA_OPEN);
		responseWriter.write(StringPool.NEW_LINE);

		responseWriter.write("YUI().use");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.NEW_LINE);
		responseWriter.write("'aui-sortablelayout',");
		responseWriter.write(StringPool.NEW_LINE);
		responseWriter.write("function(Y) ");
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);
		responseWriter.write(StringPool.NEW_LINE);
		responseWriter.write("var sortableLayout = new Y.SortableLayout");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);
		responseWriter.write(StringPool.NEW_LINE);

		if(sortableLayout.getDelegateConfig() != null)
		{

			responseWriter.write("delegateConfig: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(sortableLayout.getDelegateConfig().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(sortableLayout.getDragNodes() != null)
		{

			responseWriter.write("dragNodes: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(sortableLayout.getDragNodes().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(sortableLayout.getDropContainer() != null)
		{

			responseWriter.write("dropContainer: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(sortableLayout.getDropContainer().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(sortableLayout.getDropNodes() != null)
		{

			responseWriter.write("dropNodes: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(sortableLayout.getDropNodes().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(sortableLayout.getGroups() != null)
		{

			responseWriter.write("groups: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(sortableLayout.getGroups().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(sortableLayout.getLazyStart() != null)
		{

			responseWriter.write("lazyStart: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(sortableLayout.getLazyStart().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(sortableLayout.getPlaceholder() != null)
		{

			responseWriter.write("placeholder: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(sortableLayout.getPlaceholder().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(sortableLayout.getProxy() != null)
		{

			responseWriter.write("proxy: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(sortableLayout.getProxy().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(sortableLayout.getProxyNode() != null)
		{

			responseWriter.write("proxyNode: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(sortableLayout.getProxyNode().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		responseWriter.write(StringPool.NEW_LINE);
		responseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		responseWriter.write(StringPool.CLOSE_PARENTHESIS);
		responseWriter.write(StringPool.SEMICOLON);
		responseWriter.write(StringPool.NEW_LINE);
		responseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		responseWriter.write(StringPool.NEW_LINE);
		responseWriter.write(StringPool.CLOSE_PARENTHESIS);
		responseWriter.write(StringPool.SEMICOLON);

		responseWriter.write(StringPool.NEW_LINE);
		responseWriter.write(StringPool.FORWARD_SLASH);
		responseWriter.write(StringPool.FORWARD_SLASH);
		responseWriter.write(StringPool.SPACE);
		responseWriter.write(StringPool.CDATA_CLOSE);
		responseWriter.write(StringPool.NEW_LINE);

		responseWriter.endElement("script");
		responseWriter.write(StringPool.NEW_LINE);
	}

}