public class dataUser {
    private static final String accNumber = "9876543";
    private String password = "9876";
    private String tmp_accNumber;
    private String tmp_password;

    public void askAccNumber(String tmp_accNumber){
        this.tmp_accNumber = tmp_accNumber;
    }

    public void askPassword(String tmp_password){
        this.tmp_password = tmp_password;
    }

    public void setUpdatepassword(String password){
        this.password = password;
    }

    public String getDataUser(){
        return accNumber;
    }

    public boolean loginToAtm(){
        if(accNumber.equals(tmp_accNumber) && password.equals(tmp_password)){
            return true;
        }else{
            return false;
        }
    }
}
