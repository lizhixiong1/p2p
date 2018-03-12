package com.util.common;

public class PageUtil {
	
	private int currentPage;
	private int prevPage;
	private int nextPage;
	private int lastPage;
	private int pageSize;
	private int count;
	private int startRecord;
	
	public PageUtil(String cpage, int pageSize, int count){
		
		this.count = count;
		this.pageSize = pageSize;
		//��ʼ�� ��ǰҳ
		initCurrentPage(cpage);
		//��ʼ�� ��һҳ
		initPrevPage();
		//��ʼ��  ĩҳ
		initLastPage(count,pageSize);
		//��ʼ��  ��һҳ
		initNextPage();
		//��ʼ��  ��ʼλ��
		initStartRecord();
	}
	private void initStartRecord() {
		startRecord = (currentPage-1)*pageSize;
	}
	private void initNextPage() {
		//��һҳ
		if(currentPage == lastPage){
			nextPage = lastPage;
		}else{
			nextPage = currentPage + 1;
		}
	}
	private void initLastPage(int count,int pageSize) {
		//����ĩҳ
		if(count%pageSize==0){
			lastPage = count/pageSize;
		}else{
			lastPage = count/pageSize+1;
		}
	}
	private void initPrevPage() {
	//��һҳ
		if(currentPage == 1){
			prevPage = currentPage;
		}else{
			prevPage = currentPage - 1;
		}
	}
	private void initCurrentPage(String cpage) {
		//��ҳ
		if(cpage==null){
			currentPage = 1;
		}else{
			currentPage = Integer.parseInt(cpage);
		}
	}
	public int getCurrentPage() {
		return currentPage;
	}
	public int getPrevPage() {
		return prevPage;
	}
	public int getNextPage() {
		return nextPage;
	}
	public int getLastPage() {
		return lastPage;
	}
	public int getPageSize() {
		return pageSize;
	}
	public int getCount() {
		return count;
	}
	public int getStartRecord() {
		return startRecord;
	}
	

}
