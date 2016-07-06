package shiro.util;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.Factory;
import org.junit.Test;

public class ShiroUtil {
	
	String configFile=ShiroUtil.class.getResource("/config/").getPath();
	String userName="username";
	String password="root1";
	//private static Logger logger = LoggerFactory.getLogger(ShiroUtil.class);
	
	
	/**ALT+Shift+J 添加注释
	 * @param configFile
	 * @param userName
	 * @param password
	 */
	@Test
	public void login(){
		System.out.println(configFile);
		// // 读取配置文件，初始化SecurityManager工厂
		Factory<SecurityManager> fac = new IniSecurityManagerFactory("D:/hqml_crm/chifaner/target/classes/config/auth.ini");	
		// 获取securityManager实例  
		 SecurityManager securityManager = fac.getInstance();
        // 把securityManager实例绑定到SecurityUtils  
        SecurityUtils.setSecurityManager(securityManager);  
        // 得到当前执行的用户  
        Subject currentUser=SecurityUtils.getSubject();  
        // 创建token令牌，用户名/密码  
        UsernamePasswordToken token=new UsernamePasswordToken(userName, password);  
        try{  
            // 身份认证  
            currentUser.login(token);     
            System.out.println("身份认证成功！");  
        }catch(AuthenticationException e){  
            e.printStackTrace();  
            System.out.println("身份认证失败！");  
        }  
      System.out.println("11"+currentUser);  
	}
	
	
	public static void main(String args[]){
		ShiroUtil shiroUtil = new ShiroUtil();
		//shiroUtil.login("/config/auth.ini","username","root");
	}
}
