class My_UserException extends Exception{
    public My_UserException(String userExceptiontThrow){
        super(userExceptiontThrow);
    }
}
class My_PasswordRequiredException extends Exception{
    public My_PasswordRequiredException(String PasswordRequiredExceptionThrow){
        super(PasswordRequiredExceptionThrow);
    }
}
class My_PasswordWrongException extends Exception{
    public My_PasswordWrongException(String PasswordWrongExceptionThrow){
        super(PasswordWrongExceptionThrow);
    }
}
class UserNamePassword{
    final String username="vignesh";
    final String password="Vignesh25#";
    public boolean username(String givenUsername) throws My_UserException {
        if(givenUsername=="" || givenUsername==null || givenUsername!=username){
            throw new My_UserException("Please enter the valid username");
        }else {
            return username==givenUsername;
        }
    }
    public boolean passwordValidation(String givenpassword) throws My_PasswordRequiredException {
        String valid="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$";
        if(!(givenpassword.matches(valid))){
            throw new My_PasswordRequiredException("Password must contains minimum 8 characters and any one Special character");
        }
        else {
            return givenpassword.matches(valid);
        }
    }
    public boolean password(String givenPassword) throws My_PasswordWrongException {
        if(password!=givenPassword){
            throw new My_PasswordWrongException("Password doesn't match");
        }
        else {
            return password==givenPassword;
        }
    }
}
public class Exception_Task2 {

    public static void main(String arg[]){

        UserNamePassword user = new UserNamePassword();
        String userGivenUsername ="vignesh";
        String userGivenPassword="Vignesh25#";

        try{
                if(user.username(userGivenUsername)== true){
                    try {
                        if(user.passwordValidation(userGivenPassword)== true){
                            try{
                            if(user.password(userGivenPassword)==true){
                                System.out.println("Login Successfully");
                            }
                            else {
                                System.out.println("Something error");
                            }
                            }catch (My_PasswordWrongException throwPasswordWrongException){
                                System.out.println(throwPasswordWrongException.getMessage());
                            }
                        }
                        else {
                            System.out.println("Something error");
                        }
                    }catch (My_PasswordRequiredException throwPasswordRequiredException){
                        System.out.println(throwPasswordRequiredException.getMessage());
                    }

                }

                else {
                    System.out.println("Something error");
                }
        }catch (My_UserException throwUserException){
            System.out.println(throwUserException.getMessage());
        }

    }
}
