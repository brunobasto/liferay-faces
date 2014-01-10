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
package com.liferay.faces.alloy.component.imagegallery;

/**
 * @author Eduardo Lundgren
 * @author Bruno Basto
 * @author Nathan Cavanaugh
 * @generated
 */
public abstract class ImageGalleryBase extends javax.faces.component.UIPanel {

	private static final String ANIM = "anim";
	private static final String AUTO_PLAY = "autoPlay";
	private static final String IMAGEGALLERY_BODY_CONTENT = "imagegalleryBodyContent";
	private static final String CAPTION = "caption";
	private static final String CAPTION_EL = "captionEl";
	private static final String CAPTION_FROM_TITLE = "captionFromTitle";
	private static final String CENTERED = "centered";
	private static final String CLOSE_EL = "closeEl";
	private static final String CONTROL_LEFT_EL = "controlLeftEl";
	private static final String CONTROL_RIGHT_EL = "controlRightEl";
	private static final String CURRENT_INDEX = "currentIndex";
	private static final String DELAY = "delay";
	private static final String IMAGE = "image";
	private static final String IMAGE_ANIM = "imageAnim";
	private static final String INFO_EL = "infoEl";
	private static final String INFO_TEMPLATE = "infoTemplate";
	private static final String LINKS = "links";
	private static final String LOADER = "loader";
	private static final String LOADING = "loading";
	private static final String LOADING_EL = "loadingEl";
	private static final String MAX_HEIGHT = "maxHeight";
	private static final String MAX_WIDTH = "maxWidth";
	private static final String MODAL = "modal";
	private static final String PAGINATION = "pagination";
	private static final String PAGINATION_EL = "paginationEl";
	private static final String PAGINATION_INSTANCE = "paginationInstance";
	private static final String PAUSED = "paused";
	private static final String PAUSED_LABEL = "pausedLabel";
	private static final String PLAYING = "playing";
	private static final String PLAYING_LABEL = "playingLabel";
	private static final String PRELOAD_ALL_IMAGES = "preloadAllImages";
	private static final String REPEAT = "repeat";
	private static final String SHOW_CLOSE = "showClose";
	private static final String SHOW_CONTROLS = "showControls";
	private static final String SHOW_PLAYER = "showPlayer";
	private static final String TAB_INDEX = "tabIndex";
	private static final String TOOLBAR = "toolbar";
	private static final String TOTAL_LINKS = "totalLinks";
	private static final String USE_ORIGINAL_IMAGE = "useOriginalImage";
	private static final String VISIBLE = "visible";
	private static final String Z_INDEX = "zIndex";
	private static final String AFTER_ANIM_CHANGE = "afterAnimChange";
	private static final String AFTER_AUTO_PLAY_CHANGE = "afterAutoPlayChange";
	private static final String AFTER_BODY_CONTENT_CHANGE = "afterBodyContentChange";
	private static final String AFTER_CAPTION_CHANGE = "afterCaptionChange";
	private static final String AFTER_CAPTION_EL_CHANGE = "afterCaptionElChange";
	private static final String AFTER_CAPTION_FROM_TITLE_CHANGE = "afterCaptionFromTitleChange";
	private static final String AFTER_CENTERED_CHANGE = "afterCenteredChange";
	private static final String AFTER_CLOSE_EL_CHANGE = "afterCloseElChange";
	private static final String AFTER_CONTROL_LEFT_EL_CHANGE = "afterControlLeftElChange";
	private static final String AFTER_CONTROL_RIGHT_EL_CHANGE = "afterControlRightElChange";
	private static final String AFTER_CURRENT_INDEX_CHANGE = "afterCurrentIndexChange";
	private static final String AFTER_DELAY_CHANGE = "afterDelayChange";
	private static final String AFTER_IMAGE_CHANGE = "afterImageChange";
	private static final String AFTER_IMAGE_ANIM_CHANGE = "afterImageAnimChange";
	private static final String AFTER_INFO_EL_CHANGE = "afterInfoElChange";
	private static final String AFTER_INFO_TEMPLATE_CHANGE = "afterInfoTemplateChange";
	private static final String AFTER_LINKS_CHANGE = "afterLinksChange";
	private static final String AFTER_LOADER_CHANGE = "afterLoaderChange";
	private static final String AFTER_LOADING_CHANGE = "afterLoadingChange";
	private static final String AFTER_LOADING_EL_CHANGE = "afterLoadingElChange";
	private static final String AFTER_MAX_HEIGHT_CHANGE = "afterMaxHeightChange";
	private static final String AFTER_MAX_WIDTH_CHANGE = "afterMaxWidthChange";
	private static final String AFTER_MODAL_CHANGE = "afterModalChange";
	private static final String AFTER_PAGINATION_CHANGE = "afterPaginationChange";
	private static final String AFTER_PAGINATION_EL_CHANGE = "afterPaginationElChange";
	private static final String AFTER_PAGINATION_INSTANCE_CHANGE = "afterPaginationInstanceChange";
	private static final String AFTER_PAUSED_CHANGE = "afterPausedChange";
	private static final String AFTER_PAUSED_LABEL_CHANGE = "afterPausedLabelChange";
	private static final String AFTER_PLAYING_CHANGE = "afterPlayingChange";
	private static final String AFTER_PLAYING_LABEL_CHANGE = "afterPlayingLabelChange";
	private static final String AFTER_PRELOAD_ALL_IMAGES_CHANGE = "afterPreloadAllImagesChange";
	private static final String AFTER_REPEAT_CHANGE = "afterRepeatChange";
	private static final String AFTER_SHOW_CLOSE_CHANGE = "afterShowCloseChange";
	private static final String AFTER_SHOW_CONTROLS_CHANGE = "afterShowControlsChange";
	private static final String AFTER_SHOW_PLAYER_CHANGE = "afterShowPlayerChange";
	private static final String AFTER_TAB_INDEX_CHANGE = "afterTabIndexChange";
	private static final String AFTER_TOOLBAR_CHANGE = "afterToolbarChange";
	private static final String AFTER_TOTAL_LINKS_CHANGE = "afterTotalLinksChange";
	private static final String AFTER_USE_ORIGINAL_IMAGE_CHANGE = "afterUseOriginalImageChange";
	private static final String AFTER_VISIBLE_CHANGE = "afterVisibleChange";
	private static final String AFTER_ZINDEX_CHANGE = "afterZIndexChange";
	private static final String ON_ANIM_CHANGE = "onAnimChange";
	private static final String ON_AUTO_PLAY_CHANGE = "onAutoPlayChange";
	private static final String ON_BODY_CONTENT_CHANGE = "onBodyContentChange";
	private static final String ON_CAPTION_CHANGE = "onCaptionChange";
	private static final String ON_CAPTION_EL_CHANGE = "onCaptionElChange";
	private static final String ON_CAPTION_FROM_TITLE_CHANGE = "onCaptionFromTitleChange";
	private static final String ON_CENTERED_CHANGE = "onCenteredChange";
	private static final String ON_CLOSE_EL_CHANGE = "onCloseElChange";
	private static final String ON_CONTROL_LEFT_EL_CHANGE = "onControlLeftElChange";
	private static final String ON_CONTROL_RIGHT_EL_CHANGE = "onControlRightElChange";
	private static final String ON_CURRENT_INDEX_CHANGE = "onCurrentIndexChange";
	private static final String ON_DELAY_CHANGE = "onDelayChange";
	private static final String ON_IMAGE_CHANGE = "onImageChange";
	private static final String ON_IMAGE_ANIM_CHANGE = "onImageAnimChange";
	private static final String ON_INFO_EL_CHANGE = "onInfoElChange";
	private static final String ON_INFO_TEMPLATE_CHANGE = "onInfoTemplateChange";
	private static final String ON_LINKS_CHANGE = "onLinksChange";
	private static final String ON_LOADER_CHANGE = "onLoaderChange";
	private static final String ON_LOADING_CHANGE = "onLoadingChange";
	private static final String ON_LOADING_EL_CHANGE = "onLoadingElChange";
	private static final String ON_MAX_HEIGHT_CHANGE = "onMaxHeightChange";
	private static final String ON_MAX_WIDTH_CHANGE = "onMaxWidthChange";
	private static final String ON_MODAL_CHANGE = "onModalChange";
	private static final String ON_PAGINATION_CHANGE = "onPaginationChange";
	private static final String ON_PAGINATION_EL_CHANGE = "onPaginationElChange";
	private static final String ON_PAGINATION_INSTANCE_CHANGE = "onPaginationInstanceChange";
	private static final String ON_PAUSED_CHANGE = "onPausedChange";
	private static final String ON_PAUSED_LABEL_CHANGE = "onPausedLabelChange";
	private static final String ON_PLAYING_CHANGE = "onPlayingChange";
	private static final String ON_PLAYING_LABEL_CHANGE = "onPlayingLabelChange";
	private static final String ON_PRELOAD_ALL_IMAGES_CHANGE = "onPreloadAllImagesChange";
	private static final String ON_REPEAT_CHANGE = "onRepeatChange";
	private static final String ON_SHOW_CLOSE_CHANGE = "onShowCloseChange";
	private static final String ON_SHOW_CONTROLS_CHANGE = "onShowControlsChange";
	private static final String ON_SHOW_PLAYER_CHANGE = "onShowPlayerChange";
	private static final String ON_TAB_INDEX_CHANGE = "onTabIndexChange";
	private static final String ON_TOOLBAR_CHANGE = "onToolbarChange";
	private static final String ON_TOTAL_LINKS_CHANGE = "onTotalLinksChange";
	private static final String ON_USE_ORIGINAL_IMAGE_CHANGE = "onUseOriginalImageChange";
	private static final String ON_VISIBLE_CHANGE = "onVisibleChange";
	private static final String ON_ZINDEX_CHANGE = "onZIndexChange";

	protected java.lang.Boolean getAnim() {
		return (java.lang.Boolean) getStateHelper().eval(ANIM, null);
	}

	protected void setAnim(java.lang.Boolean anim) {
		getStateHelper().put(ANIM, anim);
	}

	protected java.lang.Boolean getAutoPlay() {
		return (java.lang.Boolean) getStateHelper().eval(AUTO_PLAY, null);
	}

	protected void setAutoPlay(java.lang.Boolean autoPlay) {
		getStateHelper().put(AUTO_PLAY, autoPlay);
	}

	protected java.lang.String getImagegalleryBodyContent() {
		return (java.lang.String) getStateHelper().eval(IMAGEGALLERY_BODY_CONTENT, null);
	}

	protected void setImagegalleryBodyContent(java.lang.String imagegalleryBodyContent) {
		getStateHelper().put(IMAGEGALLERY_BODY_CONTENT, imagegalleryBodyContent);
	}

	protected java.lang.String getCaption() {
		return (java.lang.String) getStateHelper().eval(CAPTION, null);
	}

	protected void setCaption(java.lang.String caption) {
		getStateHelper().put(CAPTION, caption);
	}

	protected java.lang.Object getCaptionEl() {
		return (java.lang.Object) getStateHelper().eval(CAPTION_EL, null);
	}

	protected void setCaptionEl(java.lang.Object captionEl) {
		getStateHelper().put(CAPTION_EL, captionEl);
	}

	protected java.lang.Boolean getCaptionFromTitle() {
		return (java.lang.Boolean) getStateHelper().eval(CAPTION_FROM_TITLE, null);
	}

	protected void setCaptionFromTitle(java.lang.Boolean captionFromTitle) {
		getStateHelper().put(CAPTION_FROM_TITLE, captionFromTitle);
	}

	protected java.lang.Boolean getCentered() {
		return (java.lang.Boolean) getStateHelper().eval(CENTERED, null);
	}

	protected void setCentered(java.lang.Boolean centered) {
		getStateHelper().put(CENTERED, centered);
	}

	protected java.lang.Object getCloseEl() {
		return (java.lang.Object) getStateHelper().eval(CLOSE_EL, null);
	}

	protected void setCloseEl(java.lang.Object closeEl) {
		getStateHelper().put(CLOSE_EL, closeEl);
	}

	protected java.lang.Object getControlLeftEl() {
		return (java.lang.Object) getStateHelper().eval(CONTROL_LEFT_EL, null);
	}

	protected void setControlLeftEl(java.lang.Object controlLeftEl) {
		getStateHelper().put(CONTROL_LEFT_EL, controlLeftEl);
	}

	protected java.lang.Object getControlRightEl() {
		return (java.lang.Object) getStateHelper().eval(CONTROL_RIGHT_EL, null);
	}

	protected void setControlRightEl(java.lang.Object controlRightEl) {
		getStateHelper().put(CONTROL_RIGHT_EL, controlRightEl);
	}

	protected java.lang.Object getCurrentIndex() {
		return (java.lang.Object) getStateHelper().eval(CURRENT_INDEX, null);
	}

	protected void setCurrentIndex(java.lang.Object currentIndex) {
		getStateHelper().put(CURRENT_INDEX, currentIndex);
	}

	protected java.lang.Object getDelay() {
		return (java.lang.Object) getStateHelper().eval(DELAY, null);
	}

	protected void setDelay(java.lang.Object delay) {
		getStateHelper().put(DELAY, delay);
	}

	protected java.lang.Object getImage() {
		return (java.lang.Object) getStateHelper().eval(IMAGE, null);
	}

	protected void setImage(java.lang.Object image) {
		getStateHelper().put(IMAGE, image);
	}

	protected java.lang.Object getImageAnim() {
		return (java.lang.Object) getStateHelper().eval(IMAGE_ANIM, null);
	}

	protected void setImageAnim(java.lang.Object imageAnim) {
		getStateHelper().put(IMAGE_ANIM, imageAnim);
	}

	protected java.lang.Object getInfoEl() {
		return (java.lang.Object) getStateHelper().eval(INFO_EL, null);
	}

	protected void setInfoEl(java.lang.Object infoEl) {
		getStateHelper().put(INFO_EL, infoEl);
	}

	protected java.lang.String getInfoTemplate() {
		return (java.lang.String) getStateHelper().eval(INFO_TEMPLATE, null);
	}

	protected void setInfoTemplate(java.lang.String infoTemplate) {
		getStateHelper().put(INFO_TEMPLATE, infoTemplate);
	}

	protected java.lang.Object getLinks() {
		return (java.lang.Object) getStateHelper().eval(LINKS, null);
	}

	protected void setLinks(java.lang.Object links) {
		getStateHelper().put(LINKS, links);
	}

	protected java.lang.Object getLoader() {
		return (java.lang.Object) getStateHelper().eval(LOADER, null);
	}

	protected void setLoader(java.lang.Object loader) {
		getStateHelper().put(LOADER, loader);
	}

	protected java.lang.Boolean getLoading() {
		return (java.lang.Boolean) getStateHelper().eval(LOADING, null);
	}

	protected void setLoading(java.lang.Boolean loading) {
		getStateHelper().put(LOADING, loading);
	}

	protected java.lang.Object getLoadingEl() {
		return (java.lang.Object) getStateHelper().eval(LOADING_EL, null);
	}

	protected void setLoadingEl(java.lang.Object loadingEl) {
		getStateHelper().put(LOADING_EL, loadingEl);
	}

	protected java.lang.Object getMaxHeight() {
		return (java.lang.Object) getStateHelper().eval(MAX_HEIGHT, null);
	}

	protected void setMaxHeight(java.lang.Object maxHeight) {
		getStateHelper().put(MAX_HEIGHT, maxHeight);
	}

	protected java.lang.Object getMaxWidth() {
		return (java.lang.Object) getStateHelper().eval(MAX_WIDTH, null);
	}

	protected void setMaxWidth(java.lang.Object maxWidth) {
		getStateHelper().put(MAX_WIDTH, maxWidth);
	}

	protected java.lang.Boolean getModal() {
		return (java.lang.Boolean) getStateHelper().eval(MODAL, null);
	}

	protected void setModal(java.lang.Boolean modal) {
		getStateHelper().put(MODAL, modal);
	}

	protected java.lang.Object getPagination() {
		return (java.lang.Object) getStateHelper().eval(PAGINATION, null);
	}

	protected void setPagination(java.lang.Object pagination) {
		getStateHelper().put(PAGINATION, pagination);
	}

	protected java.lang.Object getPaginationEl() {
		return (java.lang.Object) getStateHelper().eval(PAGINATION_EL, null);
	}

	protected void setPaginationEl(java.lang.Object paginationEl) {
		getStateHelper().put(PAGINATION_EL, paginationEl);
	}

	protected java.lang.Object getPaginationInstance() {
		return (java.lang.Object) getStateHelper().eval(PAGINATION_INSTANCE, null);
	}

	protected void setPaginationInstance(java.lang.Object paginationInstance) {
		getStateHelper().put(PAGINATION_INSTANCE, paginationInstance);
	}

	protected java.lang.Boolean getPaused() {
		return (java.lang.Boolean) getStateHelper().eval(PAUSED, null);
	}

	protected void setPaused(java.lang.Boolean paused) {
		getStateHelper().put(PAUSED, paused);
	}

	protected java.lang.String getPausedLabel() {
		return (java.lang.String) getStateHelper().eval(PAUSED_LABEL, null);
	}

	protected void setPausedLabel(java.lang.String pausedLabel) {
		getStateHelper().put(PAUSED_LABEL, pausedLabel);
	}

	protected java.lang.Boolean getPlaying() {
		return (java.lang.Boolean) getStateHelper().eval(PLAYING, null);
	}

	protected void setPlaying(java.lang.Boolean playing) {
		getStateHelper().put(PLAYING, playing);
	}

	protected java.lang.String getPlayingLabel() {
		return (java.lang.String) getStateHelper().eval(PLAYING_LABEL, null);
	}

	protected void setPlayingLabel(java.lang.String playingLabel) {
		getStateHelper().put(PLAYING_LABEL, playingLabel);
	}

	protected java.lang.Boolean getPreloadAllImages() {
		return (java.lang.Boolean) getStateHelper().eval(PRELOAD_ALL_IMAGES, null);
	}

	protected void setPreloadAllImages(java.lang.Boolean preloadAllImages) {
		getStateHelper().put(PRELOAD_ALL_IMAGES, preloadAllImages);
	}

	protected java.lang.Boolean getRepeat() {
		return (java.lang.Boolean) getStateHelper().eval(REPEAT, null);
	}

	protected void setRepeat(java.lang.Boolean repeat) {
		getStateHelper().put(REPEAT, repeat);
	}

	protected java.lang.Boolean getShowClose() {
		return (java.lang.Boolean) getStateHelper().eval(SHOW_CLOSE, null);
	}

	protected void setShowClose(java.lang.Boolean showClose) {
		getStateHelper().put(SHOW_CLOSE, showClose);
	}

	protected java.lang.Boolean getShowControls() {
		return (java.lang.Boolean) getStateHelper().eval(SHOW_CONTROLS, null);
	}

	protected void setShowControls(java.lang.Boolean showControls) {
		getStateHelper().put(SHOW_CONTROLS, showControls);
	}

	protected java.lang.Boolean getShowPlayer() {
		return (java.lang.Boolean) getStateHelper().eval(SHOW_PLAYER, null);
	}

	protected void setShowPlayer(java.lang.Boolean showPlayer) {
		getStateHelper().put(SHOW_PLAYER, showPlayer);
	}

	protected java.lang.Object getTabIndex() {
		return (java.lang.Object) getStateHelper().eval(TAB_INDEX, null);
	}

	protected void setTabIndex(java.lang.Object tabIndex) {
		getStateHelper().put(TAB_INDEX, tabIndex);
	}

	protected java.lang.Object getToolbar() {
		return (java.lang.Object) getStateHelper().eval(TOOLBAR, null);
	}

	protected void setToolbar(java.lang.Object toolbar) {
		getStateHelper().put(TOOLBAR, toolbar);
	}

	protected java.lang.Boolean getTotalLinks() {
		return (java.lang.Boolean) getStateHelper().eval(TOTAL_LINKS, null);
	}

	protected void setTotalLinks(java.lang.Boolean totalLinks) {
		getStateHelper().put(TOTAL_LINKS, totalLinks);
	}

	protected java.lang.Boolean getUseOriginalImage() {
		return (java.lang.Boolean) getStateHelper().eval(USE_ORIGINAL_IMAGE, null);
	}

	protected void setUseOriginalImage(java.lang.Boolean useOriginalImage) {
		getStateHelper().put(USE_ORIGINAL_IMAGE, useOriginalImage);
	}

	protected java.lang.Boolean getVisible() {
		return (java.lang.Boolean) getStateHelper().eval(VISIBLE, null);
	}

	protected void setVisible(java.lang.Boolean visible) {
		getStateHelper().put(VISIBLE, visible);
	}

	protected java.lang.Object getZIndex() {
		return (java.lang.Object) getStateHelper().eval(Z_INDEX, null);
	}

	protected void setZIndex(java.lang.Object zIndex) {
		getStateHelper().put(Z_INDEX, zIndex);
	}

	protected java.lang.String getAfterAnimChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_ANIM_CHANGE, null);
	}

	protected void setAfterAnimChange(java.lang.String afterAnimChange) {
		getStateHelper().put(AFTER_ANIM_CHANGE, afterAnimChange);
	}

	protected java.lang.String getAfterAutoPlayChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_AUTO_PLAY_CHANGE, null);
	}

	protected void setAfterAutoPlayChange(java.lang.String afterAutoPlayChange) {
		getStateHelper().put(AFTER_AUTO_PLAY_CHANGE, afterAutoPlayChange);
	}

	protected java.lang.String getAfterBodyContentChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_BODY_CONTENT_CHANGE, null);
	}

	protected void setAfterBodyContentChange(java.lang.String afterBodyContentChange) {
		getStateHelper().put(AFTER_BODY_CONTENT_CHANGE, afterBodyContentChange);
	}

	protected java.lang.String getAfterCaptionChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_CAPTION_CHANGE, null);
	}

	protected void setAfterCaptionChange(java.lang.String afterCaptionChange) {
		getStateHelper().put(AFTER_CAPTION_CHANGE, afterCaptionChange);
	}

	protected java.lang.String getAfterCaptionElChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_CAPTION_EL_CHANGE, null);
	}

	protected void setAfterCaptionElChange(java.lang.String afterCaptionElChange) {
		getStateHelper().put(AFTER_CAPTION_EL_CHANGE, afterCaptionElChange);
	}

	protected java.lang.String getAfterCaptionFromTitleChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_CAPTION_FROM_TITLE_CHANGE, null);
	}

	protected void setAfterCaptionFromTitleChange(java.lang.String afterCaptionFromTitleChange) {
		getStateHelper().put(AFTER_CAPTION_FROM_TITLE_CHANGE, afterCaptionFromTitleChange);
	}

	protected java.lang.String getAfterCenteredChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_CENTERED_CHANGE, null);
	}

	protected void setAfterCenteredChange(java.lang.String afterCenteredChange) {
		getStateHelper().put(AFTER_CENTERED_CHANGE, afterCenteredChange);
	}

	protected java.lang.String getAfterCloseElChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_CLOSE_EL_CHANGE, null);
	}

	protected void setAfterCloseElChange(java.lang.String afterCloseElChange) {
		getStateHelper().put(AFTER_CLOSE_EL_CHANGE, afterCloseElChange);
	}

	protected java.lang.String getAfterControlLeftElChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_CONTROL_LEFT_EL_CHANGE, null);
	}

	protected void setAfterControlLeftElChange(java.lang.String afterControlLeftElChange) {
		getStateHelper().put(AFTER_CONTROL_LEFT_EL_CHANGE, afterControlLeftElChange);
	}

	protected java.lang.String getAfterControlRightElChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_CONTROL_RIGHT_EL_CHANGE, null);
	}

	protected void setAfterControlRightElChange(java.lang.String afterControlRightElChange) {
		getStateHelper().put(AFTER_CONTROL_RIGHT_EL_CHANGE, afterControlRightElChange);
	}

	protected java.lang.String getAfterCurrentIndexChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_CURRENT_INDEX_CHANGE, null);
	}

	protected void setAfterCurrentIndexChange(java.lang.String afterCurrentIndexChange) {
		getStateHelper().put(AFTER_CURRENT_INDEX_CHANGE, afterCurrentIndexChange);
	}

	protected java.lang.String getAfterDelayChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_DELAY_CHANGE, null);
	}

	protected void setAfterDelayChange(java.lang.String afterDelayChange) {
		getStateHelper().put(AFTER_DELAY_CHANGE, afterDelayChange);
	}

	protected java.lang.String getAfterImageChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_IMAGE_CHANGE, null);
	}

	protected void setAfterImageChange(java.lang.String afterImageChange) {
		getStateHelper().put(AFTER_IMAGE_CHANGE, afterImageChange);
	}

	protected java.lang.String getAfterImageAnimChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_IMAGE_ANIM_CHANGE, null);
	}

	protected void setAfterImageAnimChange(java.lang.String afterImageAnimChange) {
		getStateHelper().put(AFTER_IMAGE_ANIM_CHANGE, afterImageAnimChange);
	}

	protected java.lang.String getAfterInfoElChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_INFO_EL_CHANGE, null);
	}

	protected void setAfterInfoElChange(java.lang.String afterInfoElChange) {
		getStateHelper().put(AFTER_INFO_EL_CHANGE, afterInfoElChange);
	}

	protected java.lang.String getAfterInfoTemplateChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_INFO_TEMPLATE_CHANGE, null);
	}

	protected void setAfterInfoTemplateChange(java.lang.String afterInfoTemplateChange) {
		getStateHelper().put(AFTER_INFO_TEMPLATE_CHANGE, afterInfoTemplateChange);
	}

	protected java.lang.String getAfterLinksChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_LINKS_CHANGE, null);
	}

	protected void setAfterLinksChange(java.lang.String afterLinksChange) {
		getStateHelper().put(AFTER_LINKS_CHANGE, afterLinksChange);
	}

	protected java.lang.String getAfterLoaderChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_LOADER_CHANGE, null);
	}

	protected void setAfterLoaderChange(java.lang.String afterLoaderChange) {
		getStateHelper().put(AFTER_LOADER_CHANGE, afterLoaderChange);
	}

	protected java.lang.String getAfterLoadingChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_LOADING_CHANGE, null);
	}

	protected void setAfterLoadingChange(java.lang.String afterLoadingChange) {
		getStateHelper().put(AFTER_LOADING_CHANGE, afterLoadingChange);
	}

	protected java.lang.String getAfterLoadingElChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_LOADING_EL_CHANGE, null);
	}

	protected void setAfterLoadingElChange(java.lang.String afterLoadingElChange) {
		getStateHelper().put(AFTER_LOADING_EL_CHANGE, afterLoadingElChange);
	}

	protected java.lang.String getAfterMaxHeightChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_MAX_HEIGHT_CHANGE, null);
	}

	protected void setAfterMaxHeightChange(java.lang.String afterMaxHeightChange) {
		getStateHelper().put(AFTER_MAX_HEIGHT_CHANGE, afterMaxHeightChange);
	}

	protected java.lang.String getAfterMaxWidthChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_MAX_WIDTH_CHANGE, null);
	}

	protected void setAfterMaxWidthChange(java.lang.String afterMaxWidthChange) {
		getStateHelper().put(AFTER_MAX_WIDTH_CHANGE, afterMaxWidthChange);
	}

	protected java.lang.String getAfterModalChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_MODAL_CHANGE, null);
	}

	protected void setAfterModalChange(java.lang.String afterModalChange) {
		getStateHelper().put(AFTER_MODAL_CHANGE, afterModalChange);
	}

	protected java.lang.String getAfterPaginationChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_PAGINATION_CHANGE, null);
	}

	protected void setAfterPaginationChange(java.lang.String afterPaginationChange) {
		getStateHelper().put(AFTER_PAGINATION_CHANGE, afterPaginationChange);
	}

	protected java.lang.String getAfterPaginationElChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_PAGINATION_EL_CHANGE, null);
	}

	protected void setAfterPaginationElChange(java.lang.String afterPaginationElChange) {
		getStateHelper().put(AFTER_PAGINATION_EL_CHANGE, afterPaginationElChange);
	}

	protected java.lang.String getAfterPaginationInstanceChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_PAGINATION_INSTANCE_CHANGE, null);
	}

	protected void setAfterPaginationInstanceChange(java.lang.String afterPaginationInstanceChange) {
		getStateHelper().put(AFTER_PAGINATION_INSTANCE_CHANGE, afterPaginationInstanceChange);
	}

	protected java.lang.String getAfterPausedChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_PAUSED_CHANGE, null);
	}

	protected void setAfterPausedChange(java.lang.String afterPausedChange) {
		getStateHelper().put(AFTER_PAUSED_CHANGE, afterPausedChange);
	}

	protected java.lang.String getAfterPausedLabelChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_PAUSED_LABEL_CHANGE, null);
	}

	protected void setAfterPausedLabelChange(java.lang.String afterPausedLabelChange) {
		getStateHelper().put(AFTER_PAUSED_LABEL_CHANGE, afterPausedLabelChange);
	}

	protected java.lang.String getAfterPlayingChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_PLAYING_CHANGE, null);
	}

	protected void setAfterPlayingChange(java.lang.String afterPlayingChange) {
		getStateHelper().put(AFTER_PLAYING_CHANGE, afterPlayingChange);
	}

	protected java.lang.String getAfterPlayingLabelChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_PLAYING_LABEL_CHANGE, null);
	}

	protected void setAfterPlayingLabelChange(java.lang.String afterPlayingLabelChange) {
		getStateHelper().put(AFTER_PLAYING_LABEL_CHANGE, afterPlayingLabelChange);
	}

	protected java.lang.String getAfterPreloadAllImagesChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_PRELOAD_ALL_IMAGES_CHANGE, null);
	}

	protected void setAfterPreloadAllImagesChange(java.lang.String afterPreloadAllImagesChange) {
		getStateHelper().put(AFTER_PRELOAD_ALL_IMAGES_CHANGE, afterPreloadAllImagesChange);
	}

	protected java.lang.String getAfterRepeatChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_REPEAT_CHANGE, null);
	}

	protected void setAfterRepeatChange(java.lang.String afterRepeatChange) {
		getStateHelper().put(AFTER_REPEAT_CHANGE, afterRepeatChange);
	}

	protected java.lang.String getAfterShowCloseChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_SHOW_CLOSE_CHANGE, null);
	}

	protected void setAfterShowCloseChange(java.lang.String afterShowCloseChange) {
		getStateHelper().put(AFTER_SHOW_CLOSE_CHANGE, afterShowCloseChange);
	}

	protected java.lang.String getAfterShowControlsChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_SHOW_CONTROLS_CHANGE, null);
	}

	protected void setAfterShowControlsChange(java.lang.String afterShowControlsChange) {
		getStateHelper().put(AFTER_SHOW_CONTROLS_CHANGE, afterShowControlsChange);
	}

	protected java.lang.String getAfterShowPlayerChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_SHOW_PLAYER_CHANGE, null);
	}

	protected void setAfterShowPlayerChange(java.lang.String afterShowPlayerChange) {
		getStateHelper().put(AFTER_SHOW_PLAYER_CHANGE, afterShowPlayerChange);
	}

	protected java.lang.String getAfterTabIndexChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_TAB_INDEX_CHANGE, null);
	}

	protected void setAfterTabIndexChange(java.lang.String afterTabIndexChange) {
		getStateHelper().put(AFTER_TAB_INDEX_CHANGE, afterTabIndexChange);
	}

	protected java.lang.String getAfterToolbarChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_TOOLBAR_CHANGE, null);
	}

	protected void setAfterToolbarChange(java.lang.String afterToolbarChange) {
		getStateHelper().put(AFTER_TOOLBAR_CHANGE, afterToolbarChange);
	}

	protected java.lang.String getAfterTotalLinksChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_TOTAL_LINKS_CHANGE, null);
	}

	protected void setAfterTotalLinksChange(java.lang.String afterTotalLinksChange) {
		getStateHelper().put(AFTER_TOTAL_LINKS_CHANGE, afterTotalLinksChange);
	}

	protected java.lang.String getAfterUseOriginalImageChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_USE_ORIGINAL_IMAGE_CHANGE, null);
	}

	protected void setAfterUseOriginalImageChange(java.lang.String afterUseOriginalImageChange) {
		getStateHelper().put(AFTER_USE_ORIGINAL_IMAGE_CHANGE, afterUseOriginalImageChange);
	}

	protected java.lang.String getAfterVisibleChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_VISIBLE_CHANGE, null);
	}

	protected void setAfterVisibleChange(java.lang.String afterVisibleChange) {
		getStateHelper().put(AFTER_VISIBLE_CHANGE, afterVisibleChange);
	}

	protected java.lang.String getAfterZIndexChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_ZINDEX_CHANGE, null);
	}

	protected void setAfterZIndexChange(java.lang.String afterZIndexChange) {
		getStateHelper().put(AFTER_ZINDEX_CHANGE, afterZIndexChange);
	}

	protected java.lang.String getOnAnimChange() {
		return (java.lang.String) getStateHelper().eval(ON_ANIM_CHANGE, null);
	}

	protected void setOnAnimChange(java.lang.String onAnimChange) {
		getStateHelper().put(ON_ANIM_CHANGE, onAnimChange);
	}

	protected java.lang.String getOnAutoPlayChange() {
		return (java.lang.String) getStateHelper().eval(ON_AUTO_PLAY_CHANGE, null);
	}

	protected void setOnAutoPlayChange(java.lang.String onAutoPlayChange) {
		getStateHelper().put(ON_AUTO_PLAY_CHANGE, onAutoPlayChange);
	}

	protected java.lang.String getOnBodyContentChange() {
		return (java.lang.String) getStateHelper().eval(ON_BODY_CONTENT_CHANGE, null);
	}

	protected void setOnBodyContentChange(java.lang.String onBodyContentChange) {
		getStateHelper().put(ON_BODY_CONTENT_CHANGE, onBodyContentChange);
	}

	protected java.lang.String getOnCaptionChange() {
		return (java.lang.String) getStateHelper().eval(ON_CAPTION_CHANGE, null);
	}

	protected void setOnCaptionChange(java.lang.String onCaptionChange) {
		getStateHelper().put(ON_CAPTION_CHANGE, onCaptionChange);
	}

	protected java.lang.String getOnCaptionElChange() {
		return (java.lang.String) getStateHelper().eval(ON_CAPTION_EL_CHANGE, null);
	}

	protected void setOnCaptionElChange(java.lang.String onCaptionElChange) {
		getStateHelper().put(ON_CAPTION_EL_CHANGE, onCaptionElChange);
	}

	protected java.lang.String getOnCaptionFromTitleChange() {
		return (java.lang.String) getStateHelper().eval(ON_CAPTION_FROM_TITLE_CHANGE, null);
	}

	protected void setOnCaptionFromTitleChange(java.lang.String onCaptionFromTitleChange) {
		getStateHelper().put(ON_CAPTION_FROM_TITLE_CHANGE, onCaptionFromTitleChange);
	}

	protected java.lang.String getOnCenteredChange() {
		return (java.lang.String) getStateHelper().eval(ON_CENTERED_CHANGE, null);
	}

	protected void setOnCenteredChange(java.lang.String onCenteredChange) {
		getStateHelper().put(ON_CENTERED_CHANGE, onCenteredChange);
	}

	protected java.lang.String getOnCloseElChange() {
		return (java.lang.String) getStateHelper().eval(ON_CLOSE_EL_CHANGE, null);
	}

	protected void setOnCloseElChange(java.lang.String onCloseElChange) {
		getStateHelper().put(ON_CLOSE_EL_CHANGE, onCloseElChange);
	}

	protected java.lang.String getOnControlLeftElChange() {
		return (java.lang.String) getStateHelper().eval(ON_CONTROL_LEFT_EL_CHANGE, null);
	}

	protected void setOnControlLeftElChange(java.lang.String onControlLeftElChange) {
		getStateHelper().put(ON_CONTROL_LEFT_EL_CHANGE, onControlLeftElChange);
	}

	protected java.lang.String getOnControlRightElChange() {
		return (java.lang.String) getStateHelper().eval(ON_CONTROL_RIGHT_EL_CHANGE, null);
	}

	protected void setOnControlRightElChange(java.lang.String onControlRightElChange) {
		getStateHelper().put(ON_CONTROL_RIGHT_EL_CHANGE, onControlRightElChange);
	}

	protected java.lang.String getOnCurrentIndexChange() {
		return (java.lang.String) getStateHelper().eval(ON_CURRENT_INDEX_CHANGE, null);
	}

	protected void setOnCurrentIndexChange(java.lang.String onCurrentIndexChange) {
		getStateHelper().put(ON_CURRENT_INDEX_CHANGE, onCurrentIndexChange);
	}

	protected java.lang.String getOnDelayChange() {
		return (java.lang.String) getStateHelper().eval(ON_DELAY_CHANGE, null);
	}

	protected void setOnDelayChange(java.lang.String onDelayChange) {
		getStateHelper().put(ON_DELAY_CHANGE, onDelayChange);
	}

	protected java.lang.String getOnImageChange() {
		return (java.lang.String) getStateHelper().eval(ON_IMAGE_CHANGE, null);
	}

	protected void setOnImageChange(java.lang.String onImageChange) {
		getStateHelper().put(ON_IMAGE_CHANGE, onImageChange);
	}

	protected java.lang.String getOnImageAnimChange() {
		return (java.lang.String) getStateHelper().eval(ON_IMAGE_ANIM_CHANGE, null);
	}

	protected void setOnImageAnimChange(java.lang.String onImageAnimChange) {
		getStateHelper().put(ON_IMAGE_ANIM_CHANGE, onImageAnimChange);
	}

	protected java.lang.String getOnInfoElChange() {
		return (java.lang.String) getStateHelper().eval(ON_INFO_EL_CHANGE, null);
	}

	protected void setOnInfoElChange(java.lang.String onInfoElChange) {
		getStateHelper().put(ON_INFO_EL_CHANGE, onInfoElChange);
	}

	protected java.lang.String getOnInfoTemplateChange() {
		return (java.lang.String) getStateHelper().eval(ON_INFO_TEMPLATE_CHANGE, null);
	}

	protected void setOnInfoTemplateChange(java.lang.String onInfoTemplateChange) {
		getStateHelper().put(ON_INFO_TEMPLATE_CHANGE, onInfoTemplateChange);
	}

	protected java.lang.String getOnLinksChange() {
		return (java.lang.String) getStateHelper().eval(ON_LINKS_CHANGE, null);
	}

	protected void setOnLinksChange(java.lang.String onLinksChange) {
		getStateHelper().put(ON_LINKS_CHANGE, onLinksChange);
	}

	protected java.lang.String getOnLoaderChange() {
		return (java.lang.String) getStateHelper().eval(ON_LOADER_CHANGE, null);
	}

	protected void setOnLoaderChange(java.lang.String onLoaderChange) {
		getStateHelper().put(ON_LOADER_CHANGE, onLoaderChange);
	}

	protected java.lang.String getOnLoadingChange() {
		return (java.lang.String) getStateHelper().eval(ON_LOADING_CHANGE, null);
	}

	protected void setOnLoadingChange(java.lang.String onLoadingChange) {
		getStateHelper().put(ON_LOADING_CHANGE, onLoadingChange);
	}

	protected java.lang.String getOnLoadingElChange() {
		return (java.lang.String) getStateHelper().eval(ON_LOADING_EL_CHANGE, null);
	}

	protected void setOnLoadingElChange(java.lang.String onLoadingElChange) {
		getStateHelper().put(ON_LOADING_EL_CHANGE, onLoadingElChange);
	}

	protected java.lang.String getOnMaxHeightChange() {
		return (java.lang.String) getStateHelper().eval(ON_MAX_HEIGHT_CHANGE, null);
	}

	protected void setOnMaxHeightChange(java.lang.String onMaxHeightChange) {
		getStateHelper().put(ON_MAX_HEIGHT_CHANGE, onMaxHeightChange);
	}

	protected java.lang.String getOnMaxWidthChange() {
		return (java.lang.String) getStateHelper().eval(ON_MAX_WIDTH_CHANGE, null);
	}

	protected void setOnMaxWidthChange(java.lang.String onMaxWidthChange) {
		getStateHelper().put(ON_MAX_WIDTH_CHANGE, onMaxWidthChange);
	}

	protected java.lang.String getOnModalChange() {
		return (java.lang.String) getStateHelper().eval(ON_MODAL_CHANGE, null);
	}

	protected void setOnModalChange(java.lang.String onModalChange) {
		getStateHelper().put(ON_MODAL_CHANGE, onModalChange);
	}

	protected java.lang.String getOnPaginationChange() {
		return (java.lang.String) getStateHelper().eval(ON_PAGINATION_CHANGE, null);
	}

	protected void setOnPaginationChange(java.lang.String onPaginationChange) {
		getStateHelper().put(ON_PAGINATION_CHANGE, onPaginationChange);
	}

	protected java.lang.String getOnPaginationElChange() {
		return (java.lang.String) getStateHelper().eval(ON_PAGINATION_EL_CHANGE, null);
	}

	protected void setOnPaginationElChange(java.lang.String onPaginationElChange) {
		getStateHelper().put(ON_PAGINATION_EL_CHANGE, onPaginationElChange);
	}

	protected java.lang.String getOnPaginationInstanceChange() {
		return (java.lang.String) getStateHelper().eval(ON_PAGINATION_INSTANCE_CHANGE, null);
	}

	protected void setOnPaginationInstanceChange(java.lang.String onPaginationInstanceChange) {
		getStateHelper().put(ON_PAGINATION_INSTANCE_CHANGE, onPaginationInstanceChange);
	}

	protected java.lang.String getOnPausedChange() {
		return (java.lang.String) getStateHelper().eval(ON_PAUSED_CHANGE, null);
	}

	protected void setOnPausedChange(java.lang.String onPausedChange) {
		getStateHelper().put(ON_PAUSED_CHANGE, onPausedChange);
	}

	protected java.lang.String getOnPausedLabelChange() {
		return (java.lang.String) getStateHelper().eval(ON_PAUSED_LABEL_CHANGE, null);
	}

	protected void setOnPausedLabelChange(java.lang.String onPausedLabelChange) {
		getStateHelper().put(ON_PAUSED_LABEL_CHANGE, onPausedLabelChange);
	}

	protected java.lang.String getOnPlayingChange() {
		return (java.lang.String) getStateHelper().eval(ON_PLAYING_CHANGE, null);
	}

	protected void setOnPlayingChange(java.lang.String onPlayingChange) {
		getStateHelper().put(ON_PLAYING_CHANGE, onPlayingChange);
	}

	protected java.lang.String getOnPlayingLabelChange() {
		return (java.lang.String) getStateHelper().eval(ON_PLAYING_LABEL_CHANGE, null);
	}

	protected void setOnPlayingLabelChange(java.lang.String onPlayingLabelChange) {
		getStateHelper().put(ON_PLAYING_LABEL_CHANGE, onPlayingLabelChange);
	}

	protected java.lang.String getOnPreloadAllImagesChange() {
		return (java.lang.String) getStateHelper().eval(ON_PRELOAD_ALL_IMAGES_CHANGE, null);
	}

	protected void setOnPreloadAllImagesChange(java.lang.String onPreloadAllImagesChange) {
		getStateHelper().put(ON_PRELOAD_ALL_IMAGES_CHANGE, onPreloadAllImagesChange);
	}

	protected java.lang.String getOnRepeatChange() {
		return (java.lang.String) getStateHelper().eval(ON_REPEAT_CHANGE, null);
	}

	protected void setOnRepeatChange(java.lang.String onRepeatChange) {
		getStateHelper().put(ON_REPEAT_CHANGE, onRepeatChange);
	}

	protected java.lang.String getOnShowCloseChange() {
		return (java.lang.String) getStateHelper().eval(ON_SHOW_CLOSE_CHANGE, null);
	}

	protected void setOnShowCloseChange(java.lang.String onShowCloseChange) {
		getStateHelper().put(ON_SHOW_CLOSE_CHANGE, onShowCloseChange);
	}

	protected java.lang.String getOnShowControlsChange() {
		return (java.lang.String) getStateHelper().eval(ON_SHOW_CONTROLS_CHANGE, null);
	}

	protected void setOnShowControlsChange(java.lang.String onShowControlsChange) {
		getStateHelper().put(ON_SHOW_CONTROLS_CHANGE, onShowControlsChange);
	}

	protected java.lang.String getOnShowPlayerChange() {
		return (java.lang.String) getStateHelper().eval(ON_SHOW_PLAYER_CHANGE, null);
	}

	protected void setOnShowPlayerChange(java.lang.String onShowPlayerChange) {
		getStateHelper().put(ON_SHOW_PLAYER_CHANGE, onShowPlayerChange);
	}

	protected java.lang.String getOnTabIndexChange() {
		return (java.lang.String) getStateHelper().eval(ON_TAB_INDEX_CHANGE, null);
	}

	protected void setOnTabIndexChange(java.lang.String onTabIndexChange) {
		getStateHelper().put(ON_TAB_INDEX_CHANGE, onTabIndexChange);
	}

	protected java.lang.String getOnToolbarChange() {
		return (java.lang.String) getStateHelper().eval(ON_TOOLBAR_CHANGE, null);
	}

	protected void setOnToolbarChange(java.lang.String onToolbarChange) {
		getStateHelper().put(ON_TOOLBAR_CHANGE, onToolbarChange);
	}

	protected java.lang.String getOnTotalLinksChange() {
		return (java.lang.String) getStateHelper().eval(ON_TOTAL_LINKS_CHANGE, null);
	}

	protected void setOnTotalLinksChange(java.lang.String onTotalLinksChange) {
		getStateHelper().put(ON_TOTAL_LINKS_CHANGE, onTotalLinksChange);
	}

	protected java.lang.String getOnUseOriginalImageChange() {
		return (java.lang.String) getStateHelper().eval(ON_USE_ORIGINAL_IMAGE_CHANGE, null);
	}

	protected void setOnUseOriginalImageChange(java.lang.String onUseOriginalImageChange) {
		getStateHelper().put(ON_USE_ORIGINAL_IMAGE_CHANGE, onUseOriginalImageChange);
	}

	protected java.lang.String getOnVisibleChange() {
		return (java.lang.String) getStateHelper().eval(ON_VISIBLE_CHANGE, null);
	}

	protected void setOnVisibleChange(java.lang.String onVisibleChange) {
		getStateHelper().put(ON_VISIBLE_CHANGE, onVisibleChange);
	}

	protected java.lang.String getOnZIndexChange() {
		return (java.lang.String) getStateHelper().eval(ON_ZINDEX_CHANGE, null);
	}

	protected void setOnZIndexChange(java.lang.String onZIndexChange) {
		getStateHelper().put(ON_ZINDEX_CHANGE, onZIndexChange);
	}

}