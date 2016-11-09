package conroller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 * @author Florinskiy Artyom
 * @date 28.10.2016
 */

@ManagedBean
@SessionScoped
public class MainPageController
{
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
}
