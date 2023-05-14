class Integral {

    private String result;

    public String getResult() {
        return result;
    }

    public Integral(String s) {
        this.result=s;
        calIntegral();
    }

    public void calIntegral() {
        result = "%" + result;
    }
}

class Integral2 extends Integral {
   public Integral2(String s) {
  
       super(s);
       calIntegral();
   }
}

 class Integral3 extends Integral2 {
    public Integral3(String s) {
    
        
        super(s);
        calIntegral();
    }
}

