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
package com.liferay.faces.alloy.component.toolbar;

/**
 * @author Eduardo Lundgren
 * @author Bruno Basto
 * @author Nathan Cavanaugh
 * @generated
 */
public abstract class ToolbarBase extends javax.faces.component.UIPanel {

	private static final String TOOLBAR_CHILDREN = "toolbarChildren";
	private static final String CSS_CLASS = "cssClass";
	private static final String HIDE_CLASS = "hideClass";
	private static final String RENDER = "render";
	private static final String TOOLBAR_RENDERER = "toolbarRenderer";
	private static final String USE_ARIA = "useARIA";
	private static final String AFTER_CHILDREN_CHANGE = "afterChildrenChange";
	private static final String AFTER_CSS_CLASS_CHANGE = "afterCssClassChange";
	private static final String AFTER_HIDE_CLASS_CHANGE = "afterHideClassChange";
	private static final String AFTER_RENDER_CHANGE = "afterRenderChange";
	private static final String AFTER_TOOLBAR_RENDERER_CHANGE = "afterToolbarRendererChange";
	private static final String AFTER_USE_ARIACHANGE = "afterUseARIAChange";
	private static final String ON_CHILDREN_CHANGE = "onChildrenChange";
	private static final String ON_CSS_CLASS_CHANGE = "onCssClassChange";
	private static final String ON_HIDE_CLASS_CHANGE = "onHideClassChange";
	private static final String ON_RENDER_CHANGE = "onRenderChange";
	private static final String ON_TOOLBAR_RENDERER_CHANGE = "onToolbarRendererChange";
	private static final String ON_USE_ARIACHANGE = "onUseARIAChange";

	protected java.lang.Object getToolbarChildren() {
		return (java.lang.Object) getStateHelper().eval(TOOLBAR_CHILDREN, null);
	}

	protected void setToolbarChildren(java.lang.Object toolbarChildren) {
		getStateHelper().put(TOOLBAR_CHILDREN, toolbarChildren);
	}

	protected java.lang.String getCssClass() {
		return (java.lang.String) getStateHelper().eval(CSS_CLASS, null);
	}

	protected void setCssClass(java.lang.String cssClass) {
		getStateHelper().put(CSS_CLASS, cssClass);
	}

	protected java.lang.String getHideClass() {
		return (java.lang.String) getStateHelper().eval(HIDE_CLASS, null);
	}

	protected void setHideClass(java.lang.String hideClass) {
		getStateHelper().put(HIDE_CLASS, hideClass);
	}

	protected java.lang.Object getRender() {
		return (java.lang.Object) getStateHelper().eval(RENDER, null);
	}

	protected void setRender(java.lang.Object render) {
		getStateHelper().put(RENDER, render);
	}

	protected java.lang.Object getToolbarRenderer() {
		return (java.lang.Object) getStateHelper().eval(TOOLBAR_RENDERER, null);
	}

	protected void setToolbarRenderer(java.lang.Object toolbarRenderer) {
		getStateHelper().put(TOOLBAR_RENDERER, toolbarRenderer);
	}

	protected java.lang.Boolean getUseARIA() {
		return (java.lang.Boolean) getStateHelper().eval(USE_ARIA, null);
	}

	protected void setUseARIA(java.lang.Boolean useARIA) {
		getStateHelper().put(USE_ARIA, useARIA);
	}

	protected java.lang.String getAfterChildrenChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_CHILDREN_CHANGE, null);
	}

	protected void setAfterChildrenChange(java.lang.String afterChildrenChange) {
		getStateHelper().put(AFTER_CHILDREN_CHANGE, afterChildrenChange);
	}

	protected java.lang.String getAfterCssClassChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_CSS_CLASS_CHANGE, null);
	}

	protected void setAfterCssClassChange(java.lang.String afterCssClassChange) {
		getStateHelper().put(AFTER_CSS_CLASS_CHANGE, afterCssClassChange);
	}

	protected java.lang.String getAfterHideClassChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_HIDE_CLASS_CHANGE, null);
	}

	protected void setAfterHideClassChange(java.lang.String afterHideClassChange) {
		getStateHelper().put(AFTER_HIDE_CLASS_CHANGE, afterHideClassChange);
	}

	protected java.lang.String getAfterRenderChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_RENDER_CHANGE, null);
	}

	protected void setAfterRenderChange(java.lang.String afterRenderChange) {
		getStateHelper().put(AFTER_RENDER_CHANGE, afterRenderChange);
	}

	protected java.lang.String getAfterToolbarRendererChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_TOOLBAR_RENDERER_CHANGE, null);
	}

	protected void setAfterToolbarRendererChange(java.lang.String afterToolbarRendererChange) {
		getStateHelper().put(AFTER_TOOLBAR_RENDERER_CHANGE, afterToolbarRendererChange);
	}

	protected java.lang.String getAfterUseARIAChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_USE_ARIACHANGE, null);
	}

	protected void setAfterUseARIAChange(java.lang.String afterUseARIAChange) {
		getStateHelper().put(AFTER_USE_ARIACHANGE, afterUseARIAChange);
	}

	protected java.lang.String getOnChildrenChange() {
		return (java.lang.String) getStateHelper().eval(ON_CHILDREN_CHANGE, null);
	}

	protected void setOnChildrenChange(java.lang.String onChildrenChange) {
		getStateHelper().put(ON_CHILDREN_CHANGE, onChildrenChange);
	}

	protected java.lang.String getOnCssClassChange() {
		return (java.lang.String) getStateHelper().eval(ON_CSS_CLASS_CHANGE, null);
	}

	protected void setOnCssClassChange(java.lang.String onCssClassChange) {
		getStateHelper().put(ON_CSS_CLASS_CHANGE, onCssClassChange);
	}

	protected java.lang.String getOnHideClassChange() {
		return (java.lang.String) getStateHelper().eval(ON_HIDE_CLASS_CHANGE, null);
	}

	protected void setOnHideClassChange(java.lang.String onHideClassChange) {
		getStateHelper().put(ON_HIDE_CLASS_CHANGE, onHideClassChange);
	}

	protected java.lang.String getOnRenderChange() {
		return (java.lang.String) getStateHelper().eval(ON_RENDER_CHANGE, null);
	}

	protected void setOnRenderChange(java.lang.String onRenderChange) {
		getStateHelper().put(ON_RENDER_CHANGE, onRenderChange);
	}

	protected java.lang.String getOnToolbarRendererChange() {
		return (java.lang.String) getStateHelper().eval(ON_TOOLBAR_RENDERER_CHANGE, null);
	}

	protected void setOnToolbarRendererChange(java.lang.String onToolbarRendererChange) {
		getStateHelper().put(ON_TOOLBAR_RENDERER_CHANGE, onToolbarRendererChange);
	}

	protected java.lang.String getOnUseARIAChange() {
		return (java.lang.String) getStateHelper().eval(ON_USE_ARIACHANGE, null);
	}

	protected void setOnUseARIAChange(java.lang.String onUseARIAChange) {
		getStateHelper().put(ON_USE_ARIACHANGE, onUseARIAChange);
	}

}