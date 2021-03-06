package com.contribute.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * This class corresponds to the database table <tt>image</tt>
 * 
 * This file is generated by <tt>dwframe<tt>
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may be
 * OVERWRITTEN by someone else. To modify the file, you should go to find the file
 * <tt>{project-home}/dalgen/mybatis_generator.xml<tt>. Modify the configuration file
 * according to your needs, then run <tt>ant</tt> to generate this file in {project-home}/dalgen.
 * 
 * @author dwframe
 * @since 2018-07-16
 */
public class Image implements Serializable {
    /**
     * <pre>
     * 自增id
     * This field corresponds to the database column <tt>image.id<tt>
     * </pre>
     */
    private Long id;

    /**
     * <pre>
     * 从属id,商店id,商品id,用户id
     * This field corresponds to the database column <tt>image.from_id<tt>
     * </pre>
     */
    private Long fromId;

    /**
     * <pre>
     * 图片保存地址
     * This field corresponds to the database column <tt>image.image_address<tt>
     * </pre>
     */
    private String imageAddress;

    /**
     * <pre>
     * 创建时间
     * This field corresponds to the database column <tt>image.gmt_create<tt>
     * </pre>
     */
    private Date gmtCreate;

    /**
     * <pre>
     * 修改时间
     * This field corresponds to the database column <tt>image.gmt_update<tt>
     * </pre>
     */
    private Date gmtUpdate;

    /**
     * <pre>
     * 逻辑删除,0-未删除,1-删除,默认为0
     * This field corresponds to the database column <tt>image.is_delete<tt>
     * </pre>
     */
    private Integer isDelete;

    /** serialVersionUID */
    private static final long serialVersionUID = 1L;

    /**
     * <pre>
     * This field corresponds to the database column <tt>image.id<tt>
     * </pre>
     *
     * @return 自增id
     */
    public Long getId() {
        return id;
    }

    /**
     * <pre>
     * This field corresponds to the database column <tt>image.id<tt>
     * </pre>
     *
     * @param id 自增id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * <pre>
     * This field corresponds to the database column <tt>image.from_id<tt>
     * </pre>
     *
     * @return 从属id,商店id,商品id,用户id
     */
    public Long getFromId() {
        return fromId;
    }

    /**
     * <pre>
     * This field corresponds to the database column <tt>image.from_id<tt>
     * </pre>
     *
     * @param fromId 从属id,商店id,商品id,用户id
     */
    public void setFromId(Long fromId) {
        this.fromId = fromId;
    }

    /**
     * <pre>
     * This field corresponds to the database column <tt>image.image_address<tt>
     * </pre>
     *
     * @return 图片保存地址
     */
    public String getImageAddress() {
        return imageAddress;
    }

    /**
     * <pre>
     * This field corresponds to the database column <tt>image.image_address<tt>
     * </pre>
     *
     * @param imageAddress 图片保存地址
     */
    public void setImageAddress(String imageAddress) {
        this.imageAddress = imageAddress == null ? null : imageAddress.trim();
    }

    /**
     * <pre>
     * This field corresponds to the database column <tt>image.gmt_create<tt>
     * </pre>
     *
     * @return 创建时间
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * <pre>
     * This field corresponds to the database column <tt>image.gmt_create<tt>
     * </pre>
     *
     * @param gmtCreate 创建时间
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * <pre>
     * This field corresponds to the database column <tt>image.gmt_update<tt>
     * </pre>
     *
     * @return 修改时间
     */
    public Date getGmtUpdate() {
        return gmtUpdate;
    }

    /**
     * <pre>
     * This field corresponds to the database column <tt>image.gmt_update<tt>
     * </pre>
     *
     * @param gmtUpdate 修改时间
     */
    public void setGmtUpdate(Date gmtUpdate) {
        this.gmtUpdate = gmtUpdate;
    }

    /**
     * <pre>
     * This field corresponds to the database column <tt>image.is_delete<tt>
     * </pre>
     *
     * @return 逻辑删除,0-未删除,1-删除,默认为0
     */
    public Integer getIsDelete() {
        return isDelete;
    }

    /**
     * <pre>
     * This field corresponds to the database column <tt>image.is_delete<tt>
     * </pre>
     *
     * @param isDelete 逻辑删除,0-未删除,1-删除,默认为0
     */
    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    /**
     *
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", fromId=").append(fromId);
        sb.append(", imageAddress=").append(imageAddress);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", gmtUpdate=").append(gmtUpdate);
        sb.append(", isDelete=").append(isDelete);
        sb.append("]");
        return sb.toString();
    }

    /**
     *
     * @param that
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Image other = (Image) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getFromId() == null ? other.getFromId() == null : this.getFromId().equals(other.getFromId()))
            && (this.getImageAddress() == null ? other.getImageAddress() == null : this.getImageAddress().equals(other.getImageAddress()))
            && (this.getGmtCreate() == null ? other.getGmtCreate() == null : this.getGmtCreate().equals(other.getGmtCreate()))
            && (this.getGmtUpdate() == null ? other.getGmtUpdate() == null : this.getGmtUpdate().equals(other.getGmtUpdate()))
            && (this.getIsDelete() == null ? other.getIsDelete() == null : this.getIsDelete().equals(other.getIsDelete()));
    }

    /**
     *
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getFromId() == null) ? 0 : getFromId().hashCode());
        result = prime * result + ((getImageAddress() == null) ? 0 : getImageAddress().hashCode());
        result = prime * result + ((getGmtCreate() == null) ? 0 : getGmtCreate().hashCode());
        result = prime * result + ((getGmtUpdate() == null) ? 0 : getGmtUpdate().hashCode());
        result = prime * result + ((getIsDelete() == null) ? 0 : getIsDelete().hashCode());
        return result;
    }
}