public class LowerCase {
    String name;
    public LowerCase(String name){
        this.name = name;
    }
    public void isFirstLowercase() throws CustumeException {

        try{
          if  (name.charAt(0)>=97 && name.charAt(0)<=122) {


              throw new CustumeException("This First Letter is lowercase but it should be uppercase");
          }
            else {
              System.out.println("This is working Exception");
          }

        }
        catch(CustumeException e) {
            System.out.println("This is Should be Uppercase");
        }
    }


    public static void main(String[] args) throws CustumeException {
        String mystring = "tommy";
        LowerCase myobject = new LowerCase(mystring);
        myobject.isFirstLowercase();

    }



}
