package com.ishara.desingpatterns.audiosystem;

public class AudioSystemSettings {
    
    private static volatile AudioSystemSettings audioSystemSettings;
    private static volatile Integer volume;
    private static volatile Integer bass;
    private static volatile Integer defultVolume = 10;
    private static volatile Integer defultBass = 10;
    
    private AudioSystemSettings() {
        if(audioSystemSettings!=null){
            throw new RuntimeException("Please Use getSystemSetting method");            
        }
    }
    
    public static AudioSystemSettings getSystemSetting(){
        if(audioSystemSettings==null){
            synchronized(AudioSystemSettings.class){
                if(audioSystemSettings==null){
                    audioSystemSettings = new AudioSystemSettings();
                    audioSystemSettings.volume =defultVolume;
                    audioSystemSettings.bass=defultBass;
                }
            }
        }
        return audioSystemSettings;
    }
    
    public void setVolume(Integer newVolume){
        audioSystemSettings.volume = newVolume;
    }
    public void setBass(Integer newBass){
        audioSystemSettings.bass = newBass;
    }
    
    public String displaySettings(){
        
        String settings = "volume:"+audioSystemSettings.volume.toString()+ System.lineSeparator()+"Bass:"+audioSystemSettings.bass.toString();
        return settings;
    }
}   
