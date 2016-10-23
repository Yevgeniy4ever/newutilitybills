package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.math.BigDecimal;

/****************************************************************
 * ��������
 * ��������������
 ****************************************************************/

@Entity
public class ElectricPower extends BaseEntity
{
    //�����
    @Column
    private BigDecimal rate;

    //����� � ������
    @Column
    private BigDecimal amount;

    //�����������
    @Column
    private Integer numberOf;

    //���������� ��������� ��������
    @Column
    private BigDecimal previous;


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
