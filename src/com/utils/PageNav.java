package com.utils;

public class PageNav {
	//记录总数
	private int total = 0;
	//当前页
	private int currentPage = 0;
	//每页显示的记录数
	private int pageSize = 5;
	//页面总数
	private int totalPage = 0;
	//样式模板
	private String pageTemplate = "";
	//链接锚点
	private String anchor = "";
	//页面占位符
	private String pageHolder = "{page}";
	
	/**
	 * 
	 * @param total 记录总数
	 * @param currentPage 当前页码
	 * @param pageSize 页面大小
	 * @param pageTemplate 样式模板
	 */
	public PageNav(int total, int currentPage, int pageSize, String pageTemplate) {
		super();
		this.total = total;
		this.currentPage = currentPage;
		this.pageSize = pageSize;
		this.totalPage = (int) Math.ceil((double) this.total / this.pageSize);
		this.pageTemplate = pageTemplate;
	}
	
	public String render(String preWord, String nextWord, int splitPage, String splitWord) {
		if (this.total < 1 || this.currentPage > this.totalPage) {
			return "";
		}
		
		String itemTag 		= "li";
		String textTag 		= "span";
		String currentClass = "current";
		String prevClass 	= "prev";
		String nextClass 	= "next";
		
		//定义item
		String itemBegin 		= String.format("<%s>", itemTag);
		String itemCurrentBegin = String.format("<%s calss=\"%s\">", itemTag, currentClass);
		String itemPrevBegin 	= String.format("<%s class=\"%s\">", itemTag, prevClass);
		String itemNextBegin 	= String.format("<%s class=\"%s\">", itemTag, nextClass);
		String itemEnd 			= String.format("</%s>", itemTag);
		
		String textBegin 		= String.format("<%s>", textTag);
		String textEnd 			= String.format("</%s>", textTag);
		
		String linkBegin 		= "<a href=\"%s\">";
		String linkCurrentBegin = "<a href=\"%s\" class=\""+ currentClass +"\">";
		String linkPrevBegin 	= "<a href=\"%s\" class=\""+ prevClass +"\">";
		String linkNextBegin 	= "<a href=\"%s\" class=\""+ nextClass +"\">";
		String linkEnd			= "</a>";
		
		int start = Math.max(1, this.currentPage - splitPage);
		int end = Math.min(this.totalPage, this.currentPage + splitPage);
		
		//最终return的html值
		StringBuffer page_html = new StringBuffer();
		
		//上一页
		if (this.currentPage > 1) {
			page_html.append(itemPrevBegin + String.format(linkPrevBegin, this.pageTemplate.replace(this.pageHolder, (this.currentPage - 1) + this.anchor)) + preWord);
			page_html.append(linkEnd + itemEnd);
		}
		
		//第一页
		if (start > 1) {
			page_html.append(itemBegin + String.format(linkBegin, this.pageTemplate.replace(this.pageHolder, "1")) + 1);
			page_html.append(linkEnd + itemEnd);
			if (start > 2) {
				//输出省略号
				page_html.append(itemBegin + textBegin + splitWord + textEnd + itemEnd);
			}
		}
		
		//输出中间页
		for(int i = start; i <= end; i++) {
			boolean current = (i == this.currentPage);
			page_html.append((current?itemCurrentBegin : itemBegin) + String.format(current?linkCurrentBegin:linkBegin, this.pageTemplate.replace(this.pageHolder, i + this.anchor)) + i + linkEnd + itemEnd);
		}
		
		//输出最后页
		if (end < this.totalPage) {
			if (end < this.totalPage - 1) {
				//输出省略号
				page_html.append(itemBegin + textBegin + splitWord + textEnd + itemEnd);
			}
			page_html.append(itemBegin + String.format(linkBegin, this.pageTemplate.replace(this.pageHolder, this.totalPage + this.anchor)) + this.totalPage);
			page_html.append(linkEnd + itemEnd);
		}
		
		//输出下一页
		if (this.currentPage < this.totalPage) {
			page_html.append(itemNextBegin + String.format(linkNextBegin, this.pageTemplate.replace(this.pageHolder, (this.currentPage + 1) + this.anchor)) + nextWord);
			page_html.append(linkEnd + itemEnd);
		}
		
		return page_html.toString();
	}
	
	public String render(String preWord, String nextWord) {
		return this.render(preWord, nextWord, 3, "...");
	}




	public void setAnchor(String anchor) {
		this.anchor = anchor;
	}

	public void setPageHolder(String pageHolder) {
		this.pageHolder = pageHolder;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PageNav test = new PageNav(9, 1, 4, "/index/?page={page}");
		System.out.println(test.render("上一页","下一页"));
	}

}
