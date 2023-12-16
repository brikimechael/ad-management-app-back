package com.ads.mangement.controller;

import com.ads.mangement.model.Ad;
import com.ads.mangement.service.AdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/ads")
public class AdController {
    @Autowired
    private AdService adService;

    @GetMapping
    public List<Ad> getAllAds() {
        return adService.getAllAds();
    }

    @PostMapping
    public Ad createAd(@RequestBody Ad ad) {
        return adService.createAd(ad);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Ad> getAdById(@PathVariable Long id) {
        Optional<Ad> ad = adService.getAdById(id);
        return ad.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

}