public class LandLine implements Phone{

    private String myPhoneNo;
    private boolean isPowerOn;
    private boolean isRinging;

    public LandLine(String myPhoneNo) {
        this.myPhoneNo = myPhoneNo;
        isPowerOn=true;
        isRinging=false;
    }

    public String getMyPhoneNo() {
        return myPhoneNo;
    }

    public void setMyPhoneNo(String myPhoneNo) {
        this.myPhoneNo = myPhoneNo;
    }

    public void setPowerOn(boolean powerOn) {
        isPowerOn = powerOn;
    }

    public void setRinging(boolean ringing) {
        isRinging = ringing;
    }

    @Override
    public void isPowerOn() {
       this.isPowerOn=true;
    }

    @Override
    public void callNumber(String PhoneNo) {
  if(isPowerOn){
      System.out.println("You are calling "+PhoneNo);
  }
  else {
      System.out.println("Your LandLine if Off :(");
  }
  return;
    }

    @Override
    public void receiveCall(String PhoneNo) {
  if(isPowerOn && myPhoneNo.equals(PhoneNo)){
   this.isRinging=true;
      System.out.println("Hey"+myPhoneNo+" you are receiving a call");

  }
  else{
      System.out.println("Call not received");
  }
  return;
    }

    @Override
    public boolean answerCall() {
        if(isRinging){
            System.out.println("call answered");
            this.isRinging=false;
            return true;
        }
        return false;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
