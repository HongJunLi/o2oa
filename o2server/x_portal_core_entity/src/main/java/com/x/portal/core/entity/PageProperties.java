package com.x.portal.core.entity;

import com.x.base.core.entity.JsonProperties;
import com.x.base.core.project.annotation.FieldDescribe;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class PageProperties extends JsonProperties {

	@FieldDescribe("关联Widget.")
	private List<String> relatedWidgetList = new ArrayList<>();

	@FieldDescribe("移动端关联Widget.")
	private List<String> mobileRelatedWidgetList = new ArrayList<>();

	@FieldDescribe("关联脚本.")
	private Map<String, String> relatedScriptMap = new LinkedHashMap<>();

	@FieldDescribe("移动端关联脚本.")
	private Map<String, String> mobileRelatedScriptMap = new LinkedHashMap<>();

	public List<String> getRelatedWidgetList() {
		return this.relatedWidgetList == null ? new ArrayList<>() : this.relatedWidgetList;
	}

	public List<String> getMobileRelatedWidgetList() {
		return this.mobileRelatedWidgetList == null ? new ArrayList<>() : this.mobileRelatedWidgetList;
	}

	public Map<String, String> getRelatedScriptMap() {
		return this.relatedScriptMap == null ? new LinkedHashMap<>() : this.relatedScriptMap;
	}

	public Map<String, String> getMobileRelatedScriptMap() {
		return this.mobileRelatedScriptMap == null ? new LinkedHashMap<>() : this.mobileRelatedScriptMap;
	}

	public void setRelatedWidgetList(List<String> relatedWidgetList) {
		this.relatedWidgetList = relatedWidgetList;
	}

	public void setMobileRelatedWidgetList(List<String> mobileRelatedWidgetList) {
		this.mobileRelatedWidgetList = mobileRelatedWidgetList;
	}

	public void setRelatedScriptMap(Map<String, String> relatedScriptMap) {
		this.relatedScriptMap = relatedScriptMap;
	}

	public void setMobileRelatedScriptMap(Map<String, String> mobileRelatedScriptMap) {
		this.mobileRelatedScriptMap = mobileRelatedScriptMap;
	}

}
