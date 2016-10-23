package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.math.BigDecimal;

/****************************************************************
 * Сущность
 * Канализация
 ****************************************************************/

@Entity
public class Sewerage extends BaseEntity
{
    //Холодная/горячая
    @Column
    private String type;

    //Тариф
    @Column
    private BigDecimal rate;

    //Сумма к оплате
    @Column
    private BigDecimal amount;

    //Колличество
    @Column
    private Integer numberOf;

    //Предыдущие показания счетчика
    @Column
    private BigDecimal previous;


    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public BigDecimal getRate()
    {
        return rate;
    }

    public void setRate(BigDecimal rate)
    {
        this.rate = rate;
    }

    public BigDecimal getAmount()
    {
        return amount;
    }

    public void setAmount(BigDecimal amount)
    {
        this.amount = amount;
    }

    public Integer getNumberOf()
    {
        return numberOf;
    }

    public void setNumberOf(Integer numberOf)
    {
        this.numberOf = numberOf;
    }

    public BigDecimal getPrevious()
    {
        return previous;
    }

    public void setPrevious(BigDecimal previous)
    {
        this.previous = previous;
    }
}
