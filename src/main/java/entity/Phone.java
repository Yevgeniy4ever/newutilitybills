package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.math.BigDecimal;

/****************************************************************
 * ��������
 * �������
 ****************************************************************/

@Entity
public class Phone extends BaseEntity
{
    //����� � ������
    @Column
    private BigDecimal amount;

    //���������� ��������� ��������
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
