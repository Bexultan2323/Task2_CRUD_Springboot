package com.example.Task2_CRUD.service;

import com.example.Task2_CRUD.model.Location;
import com.example.Task2_CRUD.repository.LocationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationService {

    public final LocationRepository locationRepository;

    public LocationService( LocationRepository locationRepository){
        this.locationRepository=locationRepository;
    }

    public List<Location> getAll(){
        return locationRepository.findAll();
    }


    public Location getById(long id){
        return locationRepository.findById(id).orElse(null);
    }


    public Location create(Location location){
        return locationRepository.save(location);
    }


    public Location update(Location location){
        return locationRepository.save(location);
    }

    public void delete(Long id){
        locationRepository.deleteById(id);
    }
}
