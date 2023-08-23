package restassuredTest1;

import java.util.List;

public class DeserializationPojo {
	
	private int page;
	private int per_page;
	private int total;
	private int total_pages;
	private List<DataPojo> data;
	private SupportPojo support;
	
	
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getPer_page() {
		return per_page;
	}
	public void setPer_page(int per_page) {
		this.per_page = per_page;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getTotal_pages() {
		return total_pages;
	}
	public void setTotal_pages(int total_pages) {
		this.total_pages = total_pages;
	}
	public List<DataPojo> getData() {
		return data;
	}
	public void setData(List<DataPojo> data) {
		this.data = data;
	}
	public SupportPojo getSupport() {
		return support;
	}
	public void setSupport(SupportPojo support) {
		this.support = support;
	}
	
	@Override
	public String toString() {
		return "DeserializationPojo [page=" + page + ", per_page=" + per_page + ", total=" + total + ", total_pages="
				+ total_pages + ", data=" + data + ", support=" + support + "]";
	}
	
	
	
	

}
