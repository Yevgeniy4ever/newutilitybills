package conroller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/****************************************************************
 * Выбор квартиры с которой будем работать
 ****************************************************************/

@ManagedBean
@SessionScoped
public class ApartmentController
{
    private static final String MAIN_PAGE_URL = "main.xhtml";

    private String apartmentName;

    public String getApartmentGag()
    {
        setApartmentName("Гагарина");
        return MAIN_PAGE_URL;
    }
    public String getApartmentAim()
    {
        setApartmentName("Айманова");
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
