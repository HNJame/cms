package com.xzjie.et.ad.model;

import java.io.Serializable;

public class AdSense implements Serializable {
    private Long id;

    private Long fromAd;

    private String referer;

    private Integer clicks;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getFromAd() {
        return fromAd;
    }

    public void setFromAd(Long fromAd) {
        this.fromAd = fromAd;
    }

    public String getReferer() {
        return referer;
    }

    public void setReferer(String referer) {
        this.referer = referer == null ? null : referer.trim();
    }

    public Integer getClicks() {
        return clicks;
    }

    public void setClicks(Integer clicks) {
        this.clicks = clicks;
    }
}