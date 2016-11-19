package conroller;

import entity.ElectricPower;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/****************************************************************
 * Работа с таблицей и формой электроэнергии
 ****************************************************************/

@ManagedBean
@SessionScoped
public class ElectricityController
{
    public List<ElectricPower> getElectricityOrdersTest()
    {
        List<ElectricPower> electricPowers = new ArrayList<ElectricPower>();

        ElectricPower electricPower = new ElectricPower();
        electricPower.setAmount(BigDecimal.ZERO);
        electricPower.setRate(BigDecimal.ZERO);
        electricPower.setNumberOf(0);
        electricPower.setPrevious(BigDecimal.ZERO);

        ElectricPower electricPower1 = new ElectricPower();
        electricPower1.setAmount(BigDecimal.ZERO);
        electricPower1.setRate(BigDecimal.ZERO);
        electricPower1.setNumberOf(0);
        electricPower1.setPrevious(BigDecimal.ZERO);

        ElectricPower electricPower2 = new ElectricPower();
        electricPower2.setAmount(BigDecimal.ZERO);
        electricPower2.setRate(BigDecimal.ZERO);
        electricPower2.setNumberOf(0);
        electricPower2.setPrevious(BigDecimal.ZERO);

        electricPowers.add(electricPower);
        electricPowers.add(electricPower1);
        electricPowers.add(electricPower2);

        return electricPowers;
    }
}
