package com.utils;

public class PageNav {
	//��¼����
	private int total = 0;
	//��ǰҳ
	private int currentPage = 0;
	//ÿҳ��ʾ�ļ�¼��
	private int pageSize = 5;
	//ҳ������
	private int totalPage = 0;
	//��ʽģ��
	private String pageTemplate = "";
	//����ê��
	private String anchor = "";
	//ҳ��ռλ��
	private String pageHolder = "{page}";
	
	/**
	 * 
	 * @param total ��¼����
	 * @param currentPage ��ǰҳ��
	 * @param pageSize ҳ���С
	 * @param pageTemplate ��ʽģ��
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
		
		//����item
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
		
		//����return��htmlֵ
		StringBuffer page_html = new StringBuffer();
		
		//��һҳ
		if (this.currentPage > 1) {
			page_html.append(itemPrevBegin + String.format(linkPrevBegin, this.pageTemplate.replace(this.pageHolder, (this.currentPage - 1) + this.anchor)) + preWord);
			page_html.append(linkEnd + itemEnd);
		}
		
		//��һҳ
		if (start > 1) {
			page_html.append(itemBegin + String.format(linkBegin, this.pageTemplate.replace(this.pageHolder, "1")) + 1);
			page_html.append(linkEnd + itemEnd);
			if (start > 2) {
				//���ʡ�Ժ�
				page_html.append(itemBegin + textBegin + splitWord + textEnd + itemEnd);
			}
		}
		
		//����м�ҳ
		for(int i = start; i <= end; i++) {
			boolean current = (i == this.currentPage);
			page_html.append((current?itemCurrentBegin : itemBegin) + String.format(current?linkCurrentBegin:linkBegin, this.pageTemplate.replace(this.pageHolder, i + this.anchor)) + i + linkEnd + itemEnd);
		}
		
		//������ҳ
		if (end < this.totalPage) {
			if (end < this.totalPage - 1) {
				//���ʡ�Ժ�
				page_html.append(itemBegin + textBegin + splitWord + textEnd + itemEnd);
			}
			page_html.append(itemBegin + String.format(linkBegin, this.pageTemplate.replace(this.pageHolder, this.totalPage + this.anchor)) + this.totalPage);
			page_html.append(linkEnd + itemEnd);
		}
		
		//�����һҳ
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
		System.out.println(test.render("��һҳ","��һҳ"));
	}

}
