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
    private String apartment;

    private String itemData;


    public String getItemData()
    {
        if (itemData == null)
        {
            return "1";
        }
        return itemData;
    }

    public void setItemData(String itemData)
    {
        this.itemData = itemData;
    }

    public String getApartment()
    {
        if (apartment == null)
        {
            return "Гагарина";
        }
        return apartment;
    }

    public void setApartment(String apartment)
    {
        this.apartment = apartment;
    }
}
