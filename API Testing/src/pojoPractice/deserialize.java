package pojoPractice;

import java.util.List;

import pojo.WebAutomation;

public class deserialize {
	
	
	private String per_page;
	private String total;
	private String total_pages;
	private List<data> data;
	private support support;
	
	private String page;
	public String getPage() {
		return page;
	}
	public void setPage(String page) {
		this.page = page;
	}
	public String getPer_page() {
		return per_page;
	}
	public void setPer_page(String per_page) {
		this.per_page = per_page;
	}
	public String getTotal() {
		return total;
	}
	public void setTotal(String total) {
		this.total = total;
	}
	public String getTotal_pages() {
		return total_pages;
	}
	public void setTotal_pages(String total_pages) {
		this.total_pages = total_pages;
	}
	public List<pojoPractice.data> getData() {
		return data;
	}
	public void setData(List<pojoPractice.data> data) {
		this.data = data;
	}
	public pojoPractice.support getSupport() {
		return support;
	}
	public void setSupport(pojoPractice.support support) {
		this.support = support;
	}
	

}
