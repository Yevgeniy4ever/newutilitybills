package conroller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/****************************************************************
 * ����� �������� � ������� ����� ��������
 ****************************************************************/

@ManagedBean
@SessionScoped
public class ApartmentController
{
    private static final String MAIN_PAGE_URL = "main.xhtml";

    private String apartmentName;

    public String getApartmentGag()
    {
        setApartmentName("��������");
        return MAIN_PAGE_URL;
    }
    public String getApartmentAim()
    {
        setApartmentName("��������");
        return MAIN_PAGE_URL;
    }

    public String getApartmentName()
    {
        return apartmentName;
    }

    public void setApartmentName(String apartmentName)
    {
        this.apartmentName = apartmentName;
    }
}
