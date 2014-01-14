/**
 * Copyright (c) 2000-2014 Liferay, Inc. All rights reserved.
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
package com.liferay.faces.alloy.component.tabview;

import java.io.IOException;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;

import com.liferay.faces.alloy.component.base.AUIRenderer;
import com.liferay.faces.alloy.renderkit.BufferedResponseWriter;
import com.liferay.faces.util.lang.StringPool;


/**
 * @author Eduardo Lundgren
 * @author Bruno Basto
 * @author Nathan Cavanaugh
 */
public abstract class TabViewRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-tabview";

	@Override
	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		super.encodeBegin(facesContext, uiComponent);

		TabView tabView = (TabView) uiComponent;
		encodeHTML(facesContext, tabView);
		encodeJavaScript(facesContext, tabView);
	}

	protected abstract void encodeHTML(FacesContext facesContext, TabView tabView) throws IOException;

	protected void encodeJavaScript(FacesContext facesContext, TabView tabView) throws IOException {

		ResponseWriter backupResponseWriter = facesContext.getResponseWriter();

		BufferedResponseWriter bufferedResponseWriter = (BufferedResponseWriter) facesContext.getResponseWriter();

		beginJavaScript(facesContext, tabView);

		bufferedResponseWriter.write("var tabView = new Y.TabView");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		renderActiveDescendant(responseWriter, tabView);
		responseWriter.write(StringPool.COMMA);
		renderBoundingBox(responseWriter, tabView);
		responseWriter.write(StringPool.COMMA);
		renderContentBox(responseWriter, tabView);
		responseWriter.write(StringPool.COMMA);
		renderDefaultChildType(responseWriter, tabView);
		responseWriter.write(StringPool.COMMA);
		renderDestroyed(responseWriter, tabView);
		responseWriter.write(StringPool.COMMA);
		renderDisabled(responseWriter, tabView);
		responseWriter.write(StringPool.COMMA);
		renderFocused(responseWriter, tabView);
		responseWriter.write(StringPool.COMMA);
		renderHeight(responseWriter, tabView);
		responseWriter.write(StringPool.COMMA);
		renderTabviewId(responseWriter, tabView);
		responseWriter.write(StringPool.COMMA);
		renderInitialized(responseWriter, tabView);
		responseWriter.write(StringPool.COMMA);
		renderTabviewLocale(responseWriter, tabView);
		responseWriter.write(StringPool.COMMA);
		renderMultiple(responseWriter, tabView);
		responseWriter.write(StringPool.COMMA);
		renderRender(responseWriter, tabView);
		responseWriter.write(StringPool.COMMA);
		renderRendered(responseWriter, tabView);
		responseWriter.write(StringPool.COMMA);
		renderSelection(responseWriter, tabView);
		responseWriter.write(StringPool.COMMA);
		renderSrcNode(responseWriter, tabView);
		responseWriter.write(StringPool.COMMA);
		renderStacked(responseWriter, tabView);
		responseWriter.write(StringPool.COMMA);
		renderStrings(responseWriter, tabView);
		responseWriter.write(StringPool.COMMA);
		renderTabIndex(responseWriter, tabView);
		responseWriter.write(StringPool.COMMA);
		renderType(responseWriter, tabView);
		responseWriter.write(StringPool.COMMA);
		renderVisible(responseWriter, tabView);
		responseWriter.write(StringPool.COMMA);
		renderWidth(responseWriter, tabView);

		bufferedResponseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		bufferedResponseWriter.write(StringPool.CLOSE_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.SEMICOLON);

		endJavaScript(facesContext);

		handleBuffer(facesContext, tabView);

		facesContext.setResponseWriter(backupResponseWriter);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderActiveDescendant(ResponseWriter responseWriter, TabView tabView) throws IOException {
		renderString(responseWriter, "activeDescendant", tabView.getActiveDescendant());
	}

	protected void renderBoundingBox(ResponseWriter responseWriter, TabView tabView) throws IOException {
		renderString(responseWriter, "boundingBox", tabView.getBoundingBox());
	}

	protected void renderContentBox(ResponseWriter responseWriter, TabView tabView) throws IOException {
		renderString(responseWriter, "contentBox", tabView.getContentBox());
	}

	protected void renderDefaultChildType(ResponseWriter responseWriter, TabView tabView) throws IOException {
		renderString(responseWriter, "defaultChildType", tabView.getDefaultChildType());
	}

	protected void renderDestroyed(ResponseWriter responseWriter, TabView tabView) throws IOException {
		renderBoolean(responseWriter, "destroyed", tabView.getDestroyed());
	}

	protected void renderDisabled(ResponseWriter responseWriter, TabView tabView) throws IOException {
		renderBoolean(responseWriter, "disabled", tabView.getDisabled());
	}

	protected void renderFocused(ResponseWriter responseWriter, TabView tabView) throws IOException {
		renderBoolean(responseWriter, "focused", tabView.getFocused());
	}

	protected void renderHeight(ResponseWriter responseWriter, TabView tabView) throws IOException {
		renderString(responseWriter, "height", tabView.getHeight());
	}

	protected void renderTabviewId(ResponseWriter responseWriter, TabView tabView) throws IOException {
		renderString(responseWriter, "tabviewId", tabView.getTabviewId());
	}

	protected void renderInitialized(ResponseWriter responseWriter, TabView tabView) throws IOException {
		renderBoolean(responseWriter, "initialized", tabView.getInitialized());
	}

	protected void renderTabviewLocale(ResponseWriter responseWriter, TabView tabView) throws IOException {
		renderString(responseWriter, "tabviewLocale", tabView.getTabviewLocale());
	}

	protected void renderMultiple(ResponseWriter responseWriter, TabView tabView) throws IOException {
		renderBoolean(responseWriter, "multiple", tabView.getMultiple());
	}

	protected void renderRender(ResponseWriter responseWriter, TabView tabView) throws IOException {
		renderString(responseWriter, "render", tabView.getRender());
	}

	protected void renderRendered(ResponseWriter responseWriter, TabView tabView) throws IOException {
		renderBoolean(responseWriter, "rendered", tabView.getRendered());
	}

	protected void renderSelection(ResponseWriter responseWriter, TabView tabView) throws IOException {
		renderString(responseWriter, "selection", tabView.getSelection());
	}

	protected void renderSrcNode(ResponseWriter responseWriter, TabView tabView) throws IOException {
		renderString(responseWriter, "srcNode", tabView.getSrcNode());
	}

	protected void renderStacked(ResponseWriter responseWriter, TabView tabView) throws IOException {
		renderString(responseWriter, "stacked", tabView.getStacked());
	}

	protected void renderStrings(ResponseWriter responseWriter, TabView tabView) throws IOException {
		renderObject(responseWriter, "strings", tabView.getStrings());
	}

	protected void renderTabIndex(ResponseWriter responseWriter, TabView tabView) throws IOException {
		renderNumber(responseWriter, "tabIndex", tabView.getTabIndex());
	}

	protected void renderType(ResponseWriter responseWriter, TabView tabView) throws IOException {
		renderString(responseWriter, "type", tabView.getType());
	}

	protected void renderVisible(ResponseWriter responseWriter, TabView tabView) throws IOException {
		renderBoolean(responseWriter, "visible", tabView.getVisible());
	}

	protected void renderWidth(ResponseWriter responseWriter, TabView tabView) throws IOException {
		renderString(responseWriter, "width", tabView.getWidth());
	}

}