package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        ClassicalMusic classicalMusic = context.getBean("musicBean", ClassicalMusic.class);
        
        System.out.println(classicalMusic.getSong());

        // Music music = context.getBean("musicBean", Music.class);

//            MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//            MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

//            boolean comparison = firstMusicPlayer == secondMusicPlayer;
//            System.out.println(comparison);

//            firstMusicPlayer.setVolume(10);

//            System.out.println(firstMusicPlayer.getName());
//            System.out.println(firstMusicPlayer.getVolume());

//            System.out.println(secondMusicPlayer.getName());
//            System.out.println(secondMusicPlayer.getVolume());

        context.close();
    }
}
