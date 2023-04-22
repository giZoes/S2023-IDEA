package String_Class;

public class HelloWorld {
    public void judge(String fileName,String email){
        if (fileName.lastIndexOf(".java")>0&&fileName.substring(fileName.lastIndexOf(".java")).equals(".java")){
            System.out.println("Java文件名正确");
        }else {
            System.out.println("Java文件名无效");
        }
        if (email.contains("@") &&email.indexOf("@")==email.lastIndexOf("@")&&email.indexOf(".")>email.indexOf("@")){
            System.out.println("邮箱名正确");
        }else {
            System.out.println("邮箱名无效");
        }
    }
}
