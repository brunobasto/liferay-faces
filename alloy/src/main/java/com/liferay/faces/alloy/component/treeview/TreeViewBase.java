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
package com.liferay.faces.alloy.component.treeview;

/**
 * @author Eduardo Lundgren
 * @author Bruno Basto
 * @author Nathan Cavanaugh
 * @generated
 */
public abstract class TreeViewBase extends javax.faces.component.UIPanel {

	private static final String TREEVIEW_CHILDREN = "treeviewChildren";
	private static final String CONTAINER = "container";
	private static final String INDEX = "index";
	private static final String LAST_SELECTED = "lastSelected";
	private static final String LAZY_LOAD = "lazyLoad";
	private static final String SELECT_ON_TOGGLE = "selectOnToggle";
	private static final String TYPE = "type";
	private static final String AFTER_CHILDREN_CHANGE = "afterChildrenChange";
	private static final String AFTER_CONTAINER_CHANGE = "afterContainerChange";
	private static final String AFTER_INDEX_CHANGE = "afterIndexChange";
	private static final String AFTER_LAST_SELECTED_CHANGE = "afterLastSelectedChange";
	private static final String AFTER_LAZY_LOAD_CHANGE = "afterLazyLoadChange";
	private static final String AFTER_SELECT_ON_TOGGLE_CHANGE = "afterSelectOnToggleChange";
	private static final String AFTER_TYPE_CHANGE = "afterTypeChange";
	private static final String ON_CHILDREN_CHANGE = "onChildrenChange";
	private static final String ON_CONTAINER_CHANGE = "onContainerChange";
	private static final String ON_INDEX_CHANGE = "onIndexChange";
	private static final String ON_LAST_SELECTED_CHANGE = "onLastSelectedChange";
	private static final String ON_LAZY_LOAD_CHANGE = "onLazyLoadChange";
	private static final String ON_SELECT_ON_TOGGLE_CHANGE = "onSelectOnToggleChange";
	private static final String ON_TYPE_CHANGE = "onTypeChange";

	protected java.lang.Object getTreeviewChildren() {
		return (java.lang.Object) getStateHelper().eval(TREEVIEW_CHILDREN, null);
	}

	protected void setTreeviewChildren(java.lang.Object treeviewChildren) {
		getStateHelper().put(TREEVIEW_CHILDREN, treeviewChildren);
	}

	protected java.lang.String getContainer() {
		return (java.lang.String) getStateHelper().eval(CONTAINER, null);
	}

	protected void setContainer(java.lang.String container) {
		getStateHelper().put(CONTAINER, container);
	}

	protected java.lang.Object getIndex() {
		return (java.lang.Object) getStateHelper().eval(INDEX, null);
	}

	protected void setIndex(java.lang.Object index) {
		getStateHelper().put(INDEX, index);
	}

	protected java.lang.Object getLastSelected() {
		return (java.lang.Object) getStateHelper().eval(LAST_SELECTED, null);
	}

	protected void setLastSelected(java.lang.Object lastSelected) {
		getStateHelper().put(LAST_SELECTED, lastSelected);
	}

	protected java.lang.Boolean getLazyLoad() {
		return (java.lang.Boolean) getStateHelper().eval(LAZY_LOAD, null);
	}

	protected void setLazyLoad(java.lang.Boolean lazyLoad) {
		getStateHelper().put(LAZY_LOAD, lazyLoad);
	}

	protected java.lang.Boolean getSelectOnToggle() {
		return (java.lang.Boolean) getStateHelper().eval(SELECT_ON_TOGGLE, null);
	}

	protected void setSelectOnToggle(java.lang.Boolean selectOnToggle) {
		getStateHelper().put(SELECT_ON_TOGGLE, selectOnToggle);
	}

	protected java.lang.String getType() {
		return (java.lang.String) getStateHelper().eval(TYPE, null);
	}

	protected void setType(java.lang.String type) {
		getStateHelper().put(TYPE, type);
	}

	protected java.lang.String getAfterChildrenChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_CHILDREN_CHANGE, null);
	}

	protected void setAfterChildrenChange(java.lang.String afterChildrenChange) {
		getStateHelper().put(AFTER_CHILDREN_CHANGE, afterChildrenChange);
	}

	protected java.lang.String getAfterContainerChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_CONTAINER_CHANGE, null);
	}

	protected void setAfterContainerChange(java.lang.String afterContainerChange) {
		getStateHelper().put(AFTER_CONTAINER_CHANGE, afterContainerChange);
	}

	protected java.lang.String getAfterIndexChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_INDEX_CHANGE, null);
	}

	protected void setAfterIndexChange(java.lang.String afterIndexChange) {
		getStateHelper().put(AFTER_INDEX_CHANGE, afterIndexChange);
	}

	protected java.lang.String getAfterLastSelectedChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_LAST_SELECTED_CHANGE, null);
	}

	protected void setAfterLastSelectedChange(java.lang.String afterLastSelectedChange) {
		getStateHelper().put(AFTER_LAST_SELECTED_CHANGE, afterLastSelectedChange);
	}

	protected java.lang.String getAfterLazyLoadChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_LAZY_LOAD_CHANGE, null);
	}

	protected void setAfterLazyLoadChange(java.lang.String afterLazyLoadChange) {
		getStateHelper().put(AFTER_LAZY_LOAD_CHANGE, afterLazyLoadChange);
	}

	protected java.lang.String getAfterSelectOnToggleChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_SELECT_ON_TOGGLE_CHANGE, null);
	}

	protected void setAfterSelectOnToggleChange(java.lang.String afterSelectOnToggleChange) {
		getStateHelper().put(AFTER_SELECT_ON_TOGGLE_CHANGE, afterSelectOnToggleChange);
	}

	protected java.lang.String getAfterTypeChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_TYPE_CHANGE, null);
	}

	protected void setAfterTypeChange(java.lang.String afterTypeChange) {
		getStateHelper().put(AFTER_TYPE_CHANGE, afterTypeChange);
	}

	protected java.lang.String getOnChildrenChange() {
		return (java.lang.String) getStateHelper().eval(ON_CHILDREN_CHANGE, null);
	}

	protected void setOnChildrenChange(java.lang.String onChildrenChange) {
		getStateHelper().put(ON_CHILDREN_CHANGE, onChildrenChange);
	}

	protected java.lang.String getOnContainerChange() {
		return (java.lang.String) getStateHelper().eval(ON_CONTAINER_CHANGE, null);
	}

	protected void setOnContainerChange(java.lang.String onContainerChange) {
		getStateHelper().put(ON_CONTAINER_CHANGE, onContainerChange);
	}

	protected java.lang.String getOnIndexChange() {
		return (java.lang.String) getStateHelper().eval(ON_INDEX_CHANGE, null);
	}

	protected void setOnIndexChange(java.lang.String onIndexChange) {
		getStateHelper().put(ON_INDEX_CHANGE, onIndexChange);
	}

	protected java.lang.String getOnLastSelectedChange() {
		return (java.lang.String) getStateHelper().eval(ON_LAST_SELECTED_CHANGE, null);
	}

	protected void setOnLastSelectedChange(java.lang.String onLastSelectedChange) {
		getStateHelper().put(ON_LAST_SELECTED_CHANGE, onLastSelectedChange);
	}

	protected java.lang.String getOnLazyLoadChange() {
		return (java.lang.String) getStateHelper().eval(ON_LAZY_LOAD_CHANGE, null);
	}

	protected void setOnLazyLoadChange(java.lang.String onLazyLoadChange) {
		getStateHelper().put(ON_LAZY_LOAD_CHANGE, onLazyLoadChange);
	}

	protected java.lang.String getOnSelectOnToggleChange() {
		return (java.lang.String) getStateHelper().eval(ON_SELECT_ON_TOGGLE_CHANGE, null);
	}

	protected void setOnSelectOnToggleChange(java.lang.String onSelectOnToggleChange) {
		getStateHelper().put(ON_SELECT_ON_TOGGLE_CHANGE, onSelectOnToggleChange);
	}

	protected java.lang.String getOnTypeChange() {
		return (java.lang.String) getStateHelper().eval(ON_TYPE_CHANGE, null);
	}

	protected void setOnTypeChange(java.lang.String onTypeChange) {
		getStateHelper().put(ON_TYPE_CHANGE, onTypeChange);
	}

}