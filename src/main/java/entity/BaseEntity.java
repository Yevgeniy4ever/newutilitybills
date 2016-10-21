package entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

@MappedSuperclass
abstract class BaseEntity implements Serializable
{
    @Id
    @Column
    private String id;

    @Column
    private Date createTime;

    public BaseEntity()
    {
        id = UUID.randomUUID().toString();
        createTime = new Date();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
