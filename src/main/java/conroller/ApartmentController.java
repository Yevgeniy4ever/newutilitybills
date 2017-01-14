package conroller;

import consts.Const;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/****************************************************************
 * Getting apartment type from main page
 ****************************************************************/

@ManagedBean
@SessionScoped
public class ApartmentController
{
    private static final String MAIN_PAGE_URL = "main.xhtml";

    private String apartmentName;

    public String getApartmentGag()
    {
        setApartmentName(Const.APARTMENT_GAGARIN);
        return MAIN_PAGE_URL;
    }
    public String getApartmentAim()
    {
        setApartmentName(Const.APARTMENT_AIMANOV);
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
