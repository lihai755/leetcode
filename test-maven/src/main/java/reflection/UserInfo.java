package reflection;

public class UserInfo {
	private String userName;  
    private Integer age;  
    public String school;  
  
    public UserInfo() {  
    }  
    public UserInfo(String name, Integer age, String shool) {  
        this.userName = name;  
        this.age = age;  
        this.school = shool;  
    }  
    public UserInfo(String name, Integer age) {  
        this.userName = name;  
        this.age = age;  
    }  
    public String getInfo(String n, Integer i) {  
        return "success" + n + i;  
    }  
    public void getMyInfo(String mName, String mBirth, Integer age) {  
        System.out.println("我是一个来自" + mBirth + "的名叫：" + mName + "的" + age  
                + "岁的选手");  
    }  
    public Integer getAge() {  
        return age;  
    }  
    public void setAge(Integer age) {  
        this.age = age;  
    }  
    public String getUserName() {  
        return userName;  
    }  
    public void setUserName(String userName) {  
        this.userName = userName;  
    }
	
}
