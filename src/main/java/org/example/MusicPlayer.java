package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MusicPlayer {
    private ClassicalMusic classicalMusic;
//    private String name;
//    private int volume;

    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic) {
        this.classicalMusic = classicalMusic;
    }

    public void playMusic() {
        System.out.println("Playing : " + classicalMusic.getSong());
    }

//    public Music getMusic() {
//        return music;
//    }
//
//    public void setMusic(Music music) {
//        this.classicalMusic = music;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getVolume() {
//        return volume;
//    }
//
//    public void setVolume(int volume) {
//        this.volume = volume;
//    }


}
