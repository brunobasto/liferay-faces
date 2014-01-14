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
package com.liferay.faces.alloy.component.formbuildermultiplechoicefield;

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
public abstract class FormBuilderMultipleChoiceFieldRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-form-builder-field-multiple-choice";

	@Override
	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		super.encodeBegin(facesContext, uiComponent);

		FormBuilderMultipleChoiceField formBuilderMultipleChoiceField = (FormBuilderMultipleChoiceField) uiComponent;
		encodeHTML(facesContext, formBuilderMultipleChoiceField);
		encodeJavaScript(facesContext, formBuilderMultipleChoiceField);
	}

	protected abstract void encodeHTML(FacesContext facesContext, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException;

	protected void encodeJavaScript(FacesContext facesContext, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {

		ResponseWriter backupResponseWriter = facesContext.getResponseWriter();

		BufferedResponseWriter bufferedResponseWriter = (BufferedResponseWriter) facesContext.getResponseWriter();

		beginJavaScript(facesContext, formBuilderMultipleChoiceField);

		bufferedResponseWriter.write("var formBuilderMultipleChoiceField = new Y.FormBuilderMultipleChoiceField");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		renderAcceptChildren(responseWriter, formBuilderMultipleChoiceField);
		responseWriter.write(StringPool.COMMA);
		renderBuilder(responseWriter, formBuilderMultipleChoiceField);
		responseWriter.write(StringPool.COMMA);
		renderControlsToolbar(responseWriter, formBuilderMultipleChoiceField);
		responseWriter.write(StringPool.COMMA);
		renderDataType(responseWriter, formBuilderMultipleChoiceField);
		responseWriter.write(StringPool.COMMA);
		renderDisabled(responseWriter, formBuilderMultipleChoiceField);
		responseWriter.write(StringPool.COMMA);
		renderDropZoneNode(responseWriter, formBuilderMultipleChoiceField);
		responseWriter.write(StringPool.COMMA);
		renderHiddenAttributes(responseWriter, formBuilderMultipleChoiceField);
		responseWriter.write(StringPool.COMMA);
		renderFormbuildermultiplechoicefieldId(responseWriter, formBuilderMultipleChoiceField);
		responseWriter.write(StringPool.COMMA);
		renderLabel(responseWriter, formBuilderMultipleChoiceField);
		responseWriter.write(StringPool.COMMA);
		renderLabelNode(responseWriter, formBuilderMultipleChoiceField);
		responseWriter.write(StringPool.COMMA);
		renderLocalizationMap(responseWriter, formBuilderMultipleChoiceField);
		responseWriter.write(StringPool.COMMA);
		renderName(responseWriter, formBuilderMultipleChoiceField);
		responseWriter.write(StringPool.COMMA);
		renderOptionTemplate(responseWriter, formBuilderMultipleChoiceField);
		responseWriter.write(StringPool.COMMA);
		renderOptions(responseWriter, formBuilderMultipleChoiceField);
		responseWriter.write(StringPool.COMMA);
		renderFormbuildermultiplechoicefieldParent(responseWriter, formBuilderMultipleChoiceField);
		responseWriter.write(StringPool.COMMA);
		renderPredefinedValue(responseWriter, formBuilderMultipleChoiceField);
		responseWriter.write(StringPool.COMMA);
		renderReadOnly(responseWriter, formBuilderMultipleChoiceField);
		responseWriter.write(StringPool.COMMA);
		renderReadOnlyAttributes(responseWriter, formBuilderMultipleChoiceField);
		responseWriter.write(StringPool.COMMA);
		renderRequired(responseWriter, formBuilderMultipleChoiceField);
		responseWriter.write(StringPool.COMMA);
		renderRequiredFlagNode(responseWriter, formBuilderMultipleChoiceField);
		responseWriter.write(StringPool.COMMA);
		renderSelected(responseWriter, formBuilderMultipleChoiceField);
		responseWriter.write(StringPool.COMMA);
		renderShowLabel(responseWriter, formBuilderMultipleChoiceField);
		responseWriter.write(StringPool.COMMA);
		renderStrings(responseWriter, formBuilderMultipleChoiceField);
		responseWriter.write(StringPool.COMMA);
		renderTabIndex(responseWriter, formBuilderMultipleChoiceField);
		responseWriter.write(StringPool.COMMA);
		renderTemplate(responseWriter, formBuilderMultipleChoiceField);
		responseWriter.write(StringPool.COMMA);
		renderTemplateNode(responseWriter, formBuilderMultipleChoiceField);
		responseWriter.write(StringPool.COMMA);
		renderTip(responseWriter, formBuilderMultipleChoiceField);
		responseWriter.write(StringPool.COMMA);
		renderTipFlagNode(responseWriter, formBuilderMultipleChoiceField);
		responseWriter.write(StringPool.COMMA);
		renderType(responseWriter, formBuilderMultipleChoiceField);
		responseWriter.write(StringPool.COMMA);
		renderUnique(responseWriter, formBuilderMultipleChoiceField);
		responseWriter.write(StringPool.COMMA);
		renderZIndex(responseWriter, formBuilderMultipleChoiceField);

		bufferedResponseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		bufferedResponseWriter.write(StringPool.CLOSE_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.SEMICOLON);

		endJavaScript(facesContext);

		handleBuffer(facesContext, formBuilderMultipleChoiceField);

		facesContext.setResponseWriter(backupResponseWriter);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderAcceptChildren(ResponseWriter responseWriter, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		renderBoolean(responseWriter, "acceptChildren", formBuilderMultipleChoiceField.getAcceptChildren());
	}

	protected void renderBuilder(ResponseWriter responseWriter, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		renderBoolean(responseWriter, "builder", formBuilderMultipleChoiceField.getBuilder());
	}

	protected void renderControlsToolbar(ResponseWriter responseWriter, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		renderObject(responseWriter, "controlsToolbar", formBuilderMultipleChoiceField.getControlsToolbar());
	}

	protected void renderDataType(ResponseWriter responseWriter, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		renderString(responseWriter, "dataType", formBuilderMultipleChoiceField.getDataType());
	}

	protected void renderDisabled(ResponseWriter responseWriter, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		renderBoolean(responseWriter, "disabled", formBuilderMultipleChoiceField.getDisabled());
	}

	protected void renderDropZoneNode(ResponseWriter responseWriter, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		renderString(responseWriter, "dropZoneNode", formBuilderMultipleChoiceField.getDropZoneNode());
	}

	protected void renderHiddenAttributes(ResponseWriter responseWriter, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		renderArray(responseWriter, "hiddenAttributes", formBuilderMultipleChoiceField.getHiddenAttributes());
	}

	protected void renderFormbuildermultiplechoicefieldId(ResponseWriter responseWriter, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		renderString(responseWriter, "formbuildermultiplechoicefieldId", formBuilderMultipleChoiceField.getFormbuildermultiplechoicefieldId());
	}

	protected void renderLabel(ResponseWriter responseWriter, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		renderString(responseWriter, "label", formBuilderMultipleChoiceField.getLabel());
	}

	protected void renderLabelNode(ResponseWriter responseWriter, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		renderString(responseWriter, "labelNode", formBuilderMultipleChoiceField.getLabelNode());
	}

	protected void renderLocalizationMap(ResponseWriter responseWriter, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		renderObject(responseWriter, "localizationMap", formBuilderMultipleChoiceField.getLocalizationMap());
	}

	protected void renderName(ResponseWriter responseWriter, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		renderString(responseWriter, "name", formBuilderMultipleChoiceField.getName());
	}

	protected void renderOptionTemplate(ResponseWriter responseWriter, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		renderString(responseWriter, "optionTemplate", formBuilderMultipleChoiceField.getOptionTemplate());
	}

	protected void renderOptions(ResponseWriter responseWriter, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		renderObject(responseWriter, "options", formBuilderMultipleChoiceField.getOptions());
	}

	protected void renderFormbuildermultiplechoicefieldParent(ResponseWriter responseWriter, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		renderString(responseWriter, "formbuildermultiplechoicefieldParent", formBuilderMultipleChoiceField.getFormbuildermultiplechoicefieldParent());
	}

	protected void renderPredefinedValue(ResponseWriter responseWriter, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		renderString(responseWriter, "predefinedValue", formBuilderMultipleChoiceField.getPredefinedValue());
	}

	protected void renderReadOnly(ResponseWriter responseWriter, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		renderBoolean(responseWriter, "readOnly", formBuilderMultipleChoiceField.getReadOnly());
	}

	protected void renderReadOnlyAttributes(ResponseWriter responseWriter, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		renderArray(responseWriter, "readOnlyAttributes", formBuilderMultipleChoiceField.getReadOnlyAttributes());
	}

	protected void renderRequired(ResponseWriter responseWriter, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		renderBoolean(responseWriter, "required", formBuilderMultipleChoiceField.getRequired());
	}

	protected void renderRequiredFlagNode(ResponseWriter responseWriter, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		renderString(responseWriter, "requiredFlagNode", formBuilderMultipleChoiceField.getRequiredFlagNode());
	}

	protected void renderSelected(ResponseWriter responseWriter, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		renderBoolean(responseWriter, "selected", formBuilderMultipleChoiceField.getSelected());
	}

	protected void renderShowLabel(ResponseWriter responseWriter, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		renderBoolean(responseWriter, "showLabel", formBuilderMultipleChoiceField.getShowLabel());
	}

	protected void renderStrings(ResponseWriter responseWriter, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		renderObject(responseWriter, "strings", formBuilderMultipleChoiceField.getStrings());
	}

	protected void renderTabIndex(ResponseWriter responseWriter, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		renderNumber(responseWriter, "tabIndex", formBuilderMultipleChoiceField.getTabIndex());
	}

	protected void renderTemplate(ResponseWriter responseWriter, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		renderString(responseWriter, "template", formBuilderMultipleChoiceField.getTemplate());
	}

	protected void renderTemplateNode(ResponseWriter responseWriter, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		renderString(responseWriter, "templateNode", formBuilderMultipleChoiceField.getTemplateNode());
	}

	protected void renderTip(ResponseWriter responseWriter, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		renderString(responseWriter, "tip", formBuilderMultipleChoiceField.getTip());
	}

	protected void renderTipFlagNode(ResponseWriter responseWriter, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		renderString(responseWriter, "tipFlagNode", formBuilderMultipleChoiceField.getTipFlagNode());
	}

	protected void renderType(ResponseWriter responseWriter, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		renderString(responseWriter, "type", formBuilderMultipleChoiceField.getType());
	}

	protected void renderUnique(ResponseWriter responseWriter, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		renderBoolean(responseWriter, "unique", formBuilderMultipleChoiceField.getUnique());
	}

	protected void renderZIndex(ResponseWriter responseWriter, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		renderNumber(responseWriter, "zIndex", formBuilderMultipleChoiceField.getZIndex());
	}

}