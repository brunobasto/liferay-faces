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
package com.liferay.faces.alloy.component.formbuilderfileuploadfield;

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
public abstract class FormBuilderFileUploadFieldRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-form-builder-field-upload";

	@Override
	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		super.encodeBegin(facesContext, uiComponent);

		FormBuilderFileUploadField formBuilderFileUploadField = (FormBuilderFileUploadField) uiComponent;
		encodeHTML(facesContext, formBuilderFileUploadField);
		encodeJavaScript(facesContext, formBuilderFileUploadField);
	}

	protected abstract void encodeHTML(FacesContext facesContext, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException;

	protected void encodeJavaScript(FacesContext facesContext, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {

		ResponseWriter backupResponseWriter = facesContext.getResponseWriter();

		BufferedResponseWriter bufferedResponseWriter = (BufferedResponseWriter) facesContext.getResponseWriter();

		beginJavaScript(facesContext, formBuilderFileUploadField);

		bufferedResponseWriter.write("var formBuilderFileUploadField = new Y.FormBuilderFileUploadField");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		renderAcceptChildren(responseWriter, formBuilderFileUploadField);
		responseWriter.write(StringPool.COMMA);
		renderBuilder(responseWriter, formBuilderFileUploadField);
		responseWriter.write(StringPool.COMMA);
		renderControlsToolbar(responseWriter, formBuilderFileUploadField);
		responseWriter.write(StringPool.COMMA);
		renderDataType(responseWriter, formBuilderFileUploadField);
		responseWriter.write(StringPool.COMMA);
		renderDisabled(responseWriter, formBuilderFileUploadField);
		responseWriter.write(StringPool.COMMA);
		renderDropZoneNode(responseWriter, formBuilderFileUploadField);
		responseWriter.write(StringPool.COMMA);
		renderHiddenAttributes(responseWriter, formBuilderFileUploadField);
		responseWriter.write(StringPool.COMMA);
		renderFormbuilderfileuploadfieldId(responseWriter, formBuilderFileUploadField);
		responseWriter.write(StringPool.COMMA);
		renderLabel(responseWriter, formBuilderFileUploadField);
		responseWriter.write(StringPool.COMMA);
		renderLabelNode(responseWriter, formBuilderFileUploadField);
		responseWriter.write(StringPool.COMMA);
		renderLocalizationMap(responseWriter, formBuilderFileUploadField);
		responseWriter.write(StringPool.COMMA);
		renderName(responseWriter, formBuilderFileUploadField);
		responseWriter.write(StringPool.COMMA);
		renderFormbuilderfileuploadfieldParent(responseWriter, formBuilderFileUploadField);
		responseWriter.write(StringPool.COMMA);
		renderPredefinedValue(responseWriter, formBuilderFileUploadField);
		responseWriter.write(StringPool.COMMA);
		renderReadOnly(responseWriter, formBuilderFileUploadField);
		responseWriter.write(StringPool.COMMA);
		renderReadOnlyAttributes(responseWriter, formBuilderFileUploadField);
		responseWriter.write(StringPool.COMMA);
		renderRequired(responseWriter, formBuilderFileUploadField);
		responseWriter.write(StringPool.COMMA);
		renderRequiredFlagNode(responseWriter, formBuilderFileUploadField);
		responseWriter.write(StringPool.COMMA);
		renderSelected(responseWriter, formBuilderFileUploadField);
		responseWriter.write(StringPool.COMMA);
		renderShowLabel(responseWriter, formBuilderFileUploadField);
		responseWriter.write(StringPool.COMMA);
		renderStrings(responseWriter, formBuilderFileUploadField);
		responseWriter.write(StringPool.COMMA);
		renderTabIndex(responseWriter, formBuilderFileUploadField);
		responseWriter.write(StringPool.COMMA);
		renderTemplate(responseWriter, formBuilderFileUploadField);
		responseWriter.write(StringPool.COMMA);
		renderTemplateNode(responseWriter, formBuilderFileUploadField);
		responseWriter.write(StringPool.COMMA);
		renderTip(responseWriter, formBuilderFileUploadField);
		responseWriter.write(StringPool.COMMA);
		renderTipFlagNode(responseWriter, formBuilderFileUploadField);
		responseWriter.write(StringPool.COMMA);
		renderType(responseWriter, formBuilderFileUploadField);
		responseWriter.write(StringPool.COMMA);
		renderUnique(responseWriter, formBuilderFileUploadField);
		responseWriter.write(StringPool.COMMA);
		renderZIndex(responseWriter, formBuilderFileUploadField);

		bufferedResponseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		bufferedResponseWriter.write(StringPool.CLOSE_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.SEMICOLON);

		endJavaScript(facesContext);

		handleBuffer(facesContext, formBuilderFileUploadField);

		facesContext.setResponseWriter(backupResponseWriter);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderAcceptChildren(ResponseWriter responseWriter, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		renderBoolean(responseWriter, "acceptChildren", formBuilderFileUploadField.getAcceptChildren());
	}

	protected void renderBuilder(ResponseWriter responseWriter, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		renderBoolean(responseWriter, "builder", formBuilderFileUploadField.getBuilder());
	}

	protected void renderControlsToolbar(ResponseWriter responseWriter, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		renderObject(responseWriter, "controlsToolbar", formBuilderFileUploadField.getControlsToolbar());
	}

	protected void renderDataType(ResponseWriter responseWriter, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		renderString(responseWriter, "dataType", formBuilderFileUploadField.getDataType());
	}

	protected void renderDisabled(ResponseWriter responseWriter, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		renderBoolean(responseWriter, "disabled", formBuilderFileUploadField.getDisabled());
	}

	protected void renderDropZoneNode(ResponseWriter responseWriter, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		renderString(responseWriter, "dropZoneNode", formBuilderFileUploadField.getDropZoneNode());
	}

	protected void renderHiddenAttributes(ResponseWriter responseWriter, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		renderArray(responseWriter, "hiddenAttributes", formBuilderFileUploadField.getHiddenAttributes());
	}

	protected void renderFormbuilderfileuploadfieldId(ResponseWriter responseWriter, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		renderString(responseWriter, "formbuilderfileuploadfieldId", formBuilderFileUploadField.getFormbuilderfileuploadfieldId());
	}

	protected void renderLabel(ResponseWriter responseWriter, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		renderString(responseWriter, "label", formBuilderFileUploadField.getLabel());
	}

	protected void renderLabelNode(ResponseWriter responseWriter, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		renderString(responseWriter, "labelNode", formBuilderFileUploadField.getLabelNode());
	}

	protected void renderLocalizationMap(ResponseWriter responseWriter, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		renderObject(responseWriter, "localizationMap", formBuilderFileUploadField.getLocalizationMap());
	}

	protected void renderName(ResponseWriter responseWriter, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		renderString(responseWriter, "name", formBuilderFileUploadField.getName());
	}

	protected void renderFormbuilderfileuploadfieldParent(ResponseWriter responseWriter, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		renderString(responseWriter, "formbuilderfileuploadfieldParent", formBuilderFileUploadField.getFormbuilderfileuploadfieldParent());
	}

	protected void renderPredefinedValue(ResponseWriter responseWriter, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		renderString(responseWriter, "predefinedValue", formBuilderFileUploadField.getPredefinedValue());
	}

	protected void renderReadOnly(ResponseWriter responseWriter, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		renderBoolean(responseWriter, "readOnly", formBuilderFileUploadField.getReadOnly());
	}

	protected void renderReadOnlyAttributes(ResponseWriter responseWriter, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		renderArray(responseWriter, "readOnlyAttributes", formBuilderFileUploadField.getReadOnlyAttributes());
	}

	protected void renderRequired(ResponseWriter responseWriter, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		renderBoolean(responseWriter, "required", formBuilderFileUploadField.getRequired());
	}

	protected void renderRequiredFlagNode(ResponseWriter responseWriter, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		renderString(responseWriter, "requiredFlagNode", formBuilderFileUploadField.getRequiredFlagNode());
	}

	protected void renderSelected(ResponseWriter responseWriter, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		renderBoolean(responseWriter, "selected", formBuilderFileUploadField.getSelected());
	}

	protected void renderShowLabel(ResponseWriter responseWriter, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		renderBoolean(responseWriter, "showLabel", formBuilderFileUploadField.getShowLabel());
	}

	protected void renderStrings(ResponseWriter responseWriter, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		renderObject(responseWriter, "strings", formBuilderFileUploadField.getStrings());
	}

	protected void renderTabIndex(ResponseWriter responseWriter, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		renderNumber(responseWriter, "tabIndex", formBuilderFileUploadField.getTabIndex());
	}

	protected void renderTemplate(ResponseWriter responseWriter, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		renderString(responseWriter, "template", formBuilderFileUploadField.getTemplate());
	}

	protected void renderTemplateNode(ResponseWriter responseWriter, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		renderString(responseWriter, "templateNode", formBuilderFileUploadField.getTemplateNode());
	}

	protected void renderTip(ResponseWriter responseWriter, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		renderString(responseWriter, "tip", formBuilderFileUploadField.getTip());
	}

	protected void renderTipFlagNode(ResponseWriter responseWriter, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		renderString(responseWriter, "tipFlagNode", formBuilderFileUploadField.getTipFlagNode());
	}

	protected void renderType(ResponseWriter responseWriter, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		renderString(responseWriter, "type", formBuilderFileUploadField.getType());
	}

	protected void renderUnique(ResponseWriter responseWriter, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		renderBoolean(responseWriter, "unique", formBuilderFileUploadField.getUnique());
	}

	protected void renderZIndex(ResponseWriter responseWriter, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		renderNumber(responseWriter, "zIndex", formBuilderFileUploadField.getZIndex());
	}

}