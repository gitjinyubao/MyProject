package entitty;

public class Page {
	private int CurrentPage;
	private int SumPage;
	private int PageSize;
	private int SumObject;
	
	
	public Page(int currentPage, int sumPage, int pageSize, int sumObject) {
		super();
		CurrentPage = currentPage;
		SumPage = sumPage;
		PageSize = pageSize;
		SumObject = sumObject;
	}
	public Page() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getCurrentPage() {
		return CurrentPage;
	}
	public void setCurrentPage(int currentPage) {
		if(currentPage>0)
		{
			CurrentPage = currentPage;	
		}
	}
	public int getSumPage() {
		return SumPage;
	}
	public void setSumPage(int sumPage) {
		SumPage = sumPage;
	}
	public int getPageSize() {
		return PageSize;
	}
	public void setPageSize(int pageSize) {
		PageSize = pageSize;
	}
	public int getSumObject() {
		return SumObject;
	}
	public void getSumPageByobject()
	{
		if(SumObject%PageSize==0)
		{
			SumPage=SumObject/PageSize;
		}
		else if(SumObject%PageSize!=0)
		{
			SumPage=SumObject/PageSize+1;
		}
	}
	public void setSumObject(int sumObject) {
		if(sumObject>=0)
		{
			SumObject = sumObject;
			this.getSumPageByobject();
		}
	}
}