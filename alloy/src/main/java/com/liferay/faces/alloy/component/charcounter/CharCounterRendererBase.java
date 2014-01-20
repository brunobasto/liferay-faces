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
package com.liferay.faces.alloy.component.charcounter;

import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

import javax.faces.application.ResourceDependency;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;

import com.liferay.faces.alloy.component.base.RendererBase;
import com.liferay.faces.util.lang.StringPool;

/**
 * @author Bruno Basto
 * @author Kyle Stiemann
 * @generated
 */
@ResourceDependency(library = "aui", name = "aui.js")
public abstract class CharCounterRendererBase extends RendererBase {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-char-counter";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		CharCounter charCounter = (CharCounter) uiComponent;

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.write("var charCounter = new A.CharCounter");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAttributes = new ArrayList<String>();

		renderCounter(renderedAttributes, charCounter);
		renderDestroyed(renderedAttributes, charCounter);
		renderInitialized(renderedAttributes, charCounter);
		renderInput(renderedAttributes, charCounter);
		renderMaxLength(renderedAttributes, charCounter);

		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		renderAfterCounterChange(renderedAfterEvents, charCounter);
		renderAfterDestroyedChange(renderedAfterEvents, charCounter);
		renderAfterInitializedChange(renderedAfterEvents, charCounter);
		renderAfterInputChange(renderedAfterEvents, charCounter);
		renderAfterMaxLengthChange(renderedAfterEvents, charCounter);

		Iterator<String> afterEventsIterator = renderedAfterEvents.iterator();

		while (afterEventsIterator.hasNext()) {
			responseWriter.write(afterEventsIterator.next());

			if (afterEventsIterator.hasNext()) {
				responseWriter.write(StringPool.COMMA);
			}
		}

		responseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		responseWriter.write(StringPool.COMMA);

		responseWriter.write("on");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedOnEvents = new ArrayList<String>();

		renderOnCounterChange(renderedOnEvents, charCounter);
		renderOnDestroyedChange(renderedOnEvents, charCounter);
		renderOnInitializedChange(renderedOnEvents, charCounter);
		renderOnInputChange(renderedOnEvents, charCounter);
		renderOnMaxLengthChange(renderedOnEvents, charCounter);

		Iterator<String> onEventsIterator = renderedOnEvents.iterator();

		while (onEventsIterator.hasNext()) {
			responseWriter.write(onEventsIterator.next());

			if (onEventsIterator.hasNext()) {
				responseWriter.write(StringPool.COMMA);
			}
		}

		responseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		responseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		responseWriter.write(StringPool.CLOSE_PARENTHESIS);
		responseWriter.write(".render()");
		responseWriter.write(StringPool.SEMICOLON);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderCounter(List<String> renderedAttributes, CharCounter charCounter) throws IOException {
		java.lang.Object counter = charCounter.getCounter();

		if (counter != null) {
			renderedAttributes.add(renderString(CharCounter.COUNTER, counter));
		}
	}

	protected void renderDestroyed(List<String> renderedAttributes, CharCounter charCounter) throws IOException {
		java.lang.Boolean destroyed = charCounter.getDestroyed();

		if (destroyed != null) {
			renderedAttributes.add(renderBoolean(CharCounter.DESTROYED, destroyed));
		}
	}

	protected void renderInitialized(List<String> renderedAttributes, CharCounter charCounter) throws IOException {
		java.lang.Boolean initialized = charCounter.getInitialized();

		if (initialized != null) {
			renderedAttributes.add(renderBoolean(CharCounter.INITIALIZED, initialized));
		}
	}

	protected void renderInput(List<String> renderedAttributes, CharCounter charCounter) throws IOException {
		java.lang.Object input = charCounter.getInput();

		if (input != null) {
			renderedAttributes.add(renderString(CharCounter.INPUT, input));
		}
	}

	protected void renderMaxLength(List<String> renderedAttributes, CharCounter charCounter) throws IOException {
		java.lang.Object maxLength = charCounter.getMaxLength();

		if (maxLength != null) {
			renderedAttributes.add(renderNumber(CharCounter.MAX_LENGTH, maxLength));
		}
	}

	protected void renderAfterCounterChange(List<String> renderedAttributes, CharCounter charCounter) throws IOException {
		java.lang.String afterCounterChange = charCounter.getAfterCounterChange();

		if (afterCounterChange != null) {
			renderedAttributes.add(renderString(CharCounter.AFTER_COUNTER_CHANGE, afterCounterChange));
		}
	}

	protected void renderAfterDestroyedChange(List<String> renderedAttributes, CharCounter charCounter) throws IOException {
		java.lang.String afterDestroyedChange = charCounter.getAfterDestroyedChange();

		if (afterDestroyedChange != null) {
			renderedAttributes.add(renderString(CharCounter.AFTER_DESTROYED_CHANGE, afterDestroyedChange));
		}
	}

	protected void renderAfterInitializedChange(List<String> renderedAttributes, CharCounter charCounter) throws IOException {
		java.lang.String afterInitializedChange = charCounter.getAfterInitializedChange();

		if (afterInitializedChange != null) {
			renderedAttributes.add(renderString(CharCounter.AFTER_INITIALIZED_CHANGE, afterInitializedChange));
		}
	}

	protected void renderAfterInputChange(List<String> renderedAttributes, CharCounter charCounter) throws IOException {
		java.lang.String afterInputChange = charCounter.getAfterInputChange();

		if (afterInputChange != null) {
			renderedAttributes.add(renderString(CharCounter.AFTER_INPUT_CHANGE, afterInputChange));
		}
	}

	protected void renderAfterMaxLengthChange(List<String> renderedAttributes, CharCounter charCounter) throws IOException {
		java.lang.String afterMaxLengthChange = charCounter.getAfterMaxLengthChange();

		if (afterMaxLengthChange != null) {
			renderedAttributes.add(renderString(CharCounter.AFTER_MAX_LENGTH_CHANGE, afterMaxLengthChange));
		}
	}

	protected void renderOnCounterChange(List<String> renderedAttributes, CharCounter charCounter) throws IOException {
		java.lang.String onCounterChange = charCounter.getOnCounterChange();

		if (onCounterChange != null) {
			renderedAttributes.add(renderString(CharCounter.ON_COUNTER_CHANGE, onCounterChange));
		}
	}

	protected void renderOnDestroyedChange(List<String> renderedAttributes, CharCounter charCounter) throws IOException {
		java.lang.String onDestroyedChange = charCounter.getOnDestroyedChange();

		if (onDestroyedChange != null) {
			renderedAttributes.add(renderString(CharCounter.ON_DESTROYED_CHANGE, onDestroyedChange));
		}
	}

	protected void renderOnInitializedChange(List<String> renderedAttributes, CharCounter charCounter) throws IOException {
		java.lang.String onInitializedChange = charCounter.getOnInitializedChange();

		if (onInitializedChange != null) {
			renderedAttributes.add(renderString(CharCounter.ON_INITIALIZED_CHANGE, onInitializedChange));
		}
	}

	protected void renderOnInputChange(List<String> renderedAttributes, CharCounter charCounter) throws IOException {
		java.lang.String onInputChange = charCounter.getOnInputChange();

		if (onInputChange != null) {
			renderedAttributes.add(renderString(CharCounter.ON_INPUT_CHANGE, onInputChange));
		}
	}

	protected void renderOnMaxLengthChange(List<String> renderedAttributes, CharCounter charCounter) throws IOException {
		java.lang.String onMaxLengthChange = charCounter.getOnMaxLengthChange();

		if (onMaxLengthChange != null) {
			renderedAttributes.add(renderString(CharCounter.ON_MAX_LENGTH_CHANGE, onMaxLengthChange));
		}
	}

}