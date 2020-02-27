public class Person {
    // Instance Variables
      private String firstName;
      private String[] middleName;
      private String userName; 


    // Methods



    
    public String getfirstName(){
        return firstName;

    }

    public void setfirstName(String firstName){
        this.firstName = firstName;


    }

    public String getmiddleName(){
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < middleName.length; i++){
            sb.append( middleName [i]+"");
        }
        String middleName = sb.toString();
        return middleName;

    }

    public void setmiddleName(String middleName){
        this.middleName = middleName.split("");
        

    }

    public String getuserName(){
        return userName;

    }

    public void setuserName(String userName) {
        if (userName.length() > 10) {
                this.userName = userName.substring(0,10);
        }else{
                this.userName = userName;
             }       
        }
        

    }


