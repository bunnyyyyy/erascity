import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.net.http.HttpResponse;

import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;





public class SongDetection {


    com.mashape.unirest.http.HttpResponse<String> response;
    

    public SongDetection() {
        //set up gui stuff
    }

    public void getSong1() {
        
    }



    public void getSong() {
       
        try {
            response = Unirest.get("https://shazam.p.rapidapi.com/shazam-events/list?artistId=73406786&l=en-US&from=2022-12-31&limit=50&offset=0")
            .header("X-RapidAPI-Key", ApiKey.APIKEY())
            .header("X-RapidAPI-Host", "shazam.p.rapidapi.com")
            .asString();
        } catch (UnirestException e) {
            e.printStackTrace();
        }

        int status = response.getStatus();
        System.out.println("Response status is:" + status);
        String body = response.getBody();
        System.out.println("Body is:" + body);


        
    }






}
