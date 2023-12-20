package com.ads.mangement.payload.request;


import com.ads.mangement.model.AdCategory;
import lombok.Data;

@Data
public class AdDTO {

    private String title;

    private AdCategory category;

    private String description;

    private String imageUrl;

    private double price;

    private boolean available;

}
