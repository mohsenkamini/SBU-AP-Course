public class TV {
    private boolean status;
    private int channel;
    private int volume;

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
        status=st;
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
    
    void incChannel () {
        if (status=true && channel+1 <= 100)
            channel++;
    }
    public static void main (String[] args) {
        TestTV.main();
    }
}

class TestTV {
    public static void main () {
        TV tv1 = new TV();
        for (int i =0; i < 120 ; i++)
        {
            tv1.incChannel();
            System.out.println(tv1.getChannel());
        }
    }
}