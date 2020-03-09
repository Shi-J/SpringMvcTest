package com.stone.mvc.model;

public class Address
{
    private String province; // 省
    private String town;    //  市
    private String district;  //  街道

    public Address()
    {
    }

    public Address(String province, String town, String district)
    {
        this.province = province;
        this.town = town;
        this.district = district;
    }

    @Override
    public String toString()
    {
        return "Address{" +
                "province='" + province + '\'' +
                ", town='" + town + '\'' +
                ", district='" + district + '\'' +
                '}';
    }

    public String getProvince()
    {
        return province;
    }

    public void setProvince(String province)
    {
        this.province = province;
    }

    public String getTown()
    {
        return town;
    }

    public void setTown(String town)
    {
        this.town = town;
    }

    public String getDistrict()
    {
        return district;
    }

    public void setDistrict(String district)
    {
        this.district = district;
    }
}
