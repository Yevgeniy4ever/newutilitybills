package conroller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 * @author Florinskiy Artyom
 */

@ManagedBean
@SessionScoped
public class MainPageController
{
    private String apartmentData;
    private String apartmentName;

    public String getApartmentData()
    {
        if (apartmentData == null)
        {
            return "Гагарина";
        }
        return apartmentData;
    }

    public void setApartmentData(String apartmentData)
    {
        this.apartmentData = apartmentData;
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
