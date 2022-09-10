package com.example.boot1.domain;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "address")
public class address {

    private String province;

    private String country;

    private String town;

    @Override
    public String toString() {
        return "address{" +
                "province='" + province + '\'' +
                ", country='" + country + '\'' +
                ", town='" + town + '\'' +
                '}';
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }
}
