package Contracts;


import java.util.ArrayList;

public class ListUsersResponse {
    private String per_page;

    private String total;

    private ListUsersData[] data;

    private String page;

    private String total_pages;

    public String getPer_page ()
    {
        return per_page;
    }

    public void setPer_page (String per_page)
    {
        this.per_page = per_page;
    }

    public String getTotal ()
    {
        return total;
    }

    public void setTotal (String total)
    {
        this.total = total;
    }

    public ListUsersData[] getData ()
    {
        return data;
    }

    public void setData (ListUsersData[] data)
    {
        this.data = data;
    }

    public String getPage ()
    {
        return page;
    }

    public void setPage (String page)
    {
        this.page = page;
    }

    public String getTotal_pages ()
    {
        return total_pages;
    }

    public void setTotal_pages (String total_pages)
    {
        this.total_pages = total_pages;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [per_page = "+per_page+", total = "+total+", data = "+data+", page = "+page+", total_pages = "+total_pages+"]";
    }
}
