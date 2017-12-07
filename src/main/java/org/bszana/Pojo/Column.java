package org.bszana.Pojo;

public class Column {
	String label;
    String field;
    Boolean sort;
    Boolean filter;
    
    public Column(String label, String field, Boolean sort, Boolean filter) {
    	this.setField(field);
    	this.setLabel(label);
    	this.setSort(sort);
    	this.setFilter(filter);
    }
    
    public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getField() {
		return field;
	}
	public void setField(String field) {
		this.field = field;
	}
	public Boolean getSort() {
		return sort;
	}
	public void setSort(Boolean sort) {
		this.sort = sort;
	}
	public Boolean getFilter() {
		return filter;
	}
	public void setFilter(Boolean filter) {
		this.filter = filter;
	}
	public String getWidth() {
		return width;
	}
	public void setWidth(String width) {
		this.width = width;
	}
	String width;
}
