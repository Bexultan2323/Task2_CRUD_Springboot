package com.example.Task2_CRUD.service;

import com.example.Task2_CRUD.model.Location;
import com.example.Task2_CRUD.model.Notification;
import com.example.Task2_CRUD.repository.LocationRepository;
import com.example.Task2_CRUD.repository.NotificationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotificationService {

    public final NotificationRepository notificationRepository;

    public NotificationService( NotificationRepository notificationRepository){
        this.notificationRepository=notificationRepository;
    }

    public List<Notification> getAll(){
        return notificationRepository.findAll();
    }


    public Notification getById(long id){
        return notificationRepository.findById(id).orElse(null);
    }


    public Notification create(Notification notification){
        return notificationRepository.save(notification);
    }


    public Notification update(Notification notification){
        return notificationRepository.save(notification);
    }

    public void delete(Long id){
        notificationRepository.deleteById(id);
    }
}
