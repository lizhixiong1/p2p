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
		//初始化 当前页
		initCurrentPage(cpage);
		//初始化 上一页
		initPrevPage();
		//初始化  末页
		initLastPage(count,pageSize);
		//初始化  下一页
		initNextPage();
		//初始化  起始位置
		initStartRecord();
	}
	private void initStartRecord() {
		startRecord = (currentPage-1)*pageSize;
	}
	private void initNextPage() {
		//下一页
		if(currentPage == lastPage){
			nextPage = lastPage;
		}else{
			nextPage = currentPage + 1;
		}
	}
	private void initLastPage(int count,int pageSize) {
		//计算末页
		if(count%pageSize==0){
			lastPage = count/pageSize;
		}else{
			lastPage = count/pageSize+1;
		}
	}
	private void initPrevPage() {
	//上一页
		if(currentPage == 1){
			prevPage = currentPage;
		}else{
			prevPage = currentPage - 1;
		}
	}
	private void initCurrentPage(String cpage) {
		//首页
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
