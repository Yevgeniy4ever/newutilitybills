package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.math.BigDecimal;

/****************************************************************
 * Сущность
 * Телефон
 ****************************************************************/

@Entity
public class Phone extends BaseEntity
{
    //Сумма к оплате
    @Column
    private BigDecimal amount;

    //Предыдущие показания счетчика
    @Column
    private BigDecimal previous;

    public BigDecimal getPrevious()
    {
        return previous;
    }


    public void setPrevious(BigDecimal previous)
    {
        this.previous = previous;
    }

    public BigDecimal getAmount()
    {
        return amount;
    }

    public void setAmount(BigDecimal amount)
    {
        this.amount = amount;
    }
}
