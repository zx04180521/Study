package Exception;

import java.util.Scanner;

public class RegisterException {
    private static String userName = "12345678";
    private static String passerWord = "123456";

    public static void main(String[] args) throws UserError, PasswordError {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入账号：");
        String str1 = sc.nextLine();
        System.out.print("请输入密码：");
        String str2 = sc.nextLine();
//        try{
        login(str1, str2);
//        }catch (UserError userError){
//            userError.printStackTrace();
//        }catch (PasswordError passwordError){
//            passwordError.printStackTrace();
//        }
    }

    private static void login(String userName, String passerWord) throws PasswordError, UserError {
        if (!RegisterException.userName.equals(userName)){
            throw new UserError("用户名错误");
        }
        if (!RegisterException.passerWord.equals(passerWord)){
            throw new PasswordError("密码错误");
        }
        System.out.println("登录成功");
    }
}
