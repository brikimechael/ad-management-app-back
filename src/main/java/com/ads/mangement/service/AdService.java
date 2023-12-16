package com.ads.mangement.service;

import com.ads.mangement.model.Ad;
import com.ads.mangement.repository.AdRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class AdService {
    @Autowired
    private AdRepository adRepository;

    public List<Ad> getAllAds() {
        return adRepository.findAll();
    }

    public Ad createAd(Ad ad) {
        ad.setDateCreated(new Date());
        ad.setCreatedBy("system");
        return adRepository.save(ad);
    }

    public Optional<Ad> getAdById(Long id) {
        return adRepository.findById(id);
    }

}
