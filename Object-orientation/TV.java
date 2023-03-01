public class TV {
    boolean status;
    int channel;
    int volume;

    TV(){
        status=true;
        channel=1;
        volume=10;
    }

    TV(int ch,int vol){
        status=true;
        channel=ch;
        volume=vol;
    }

    void setChannel (int ch){
        channel=ch;
    }

    void setVolume (int vol){
        volume=vol;
    }
    
    void setStatus (boolean st){
        Status=st;
    }
    
    int getChannel (){
        return channel;
    }

    int getVolume (){
        return volume;
    }

    boolean getStatus (){
        return status;
    }
       
}