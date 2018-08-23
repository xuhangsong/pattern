package com.xhs.www.proxy.custom;

import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * @author xuhan  build  2018/8/23
 */
public class XHSProxy {

    public static final String ln = "\r\n";

    public static Object newProxyInstance(XHSClassLoader classLoader, Class<?>[] interfaces, XHSInvocationHandler h){
       try {
           //1动态生成源代码.java文件
           String str = getInstance(interfaces);
           //2、Java文件输出磁盘
           String filePath = XHSProxy.class.getResource("").getPath();
           System.out.println(filePath);
           File f = new File(filePath + "$Proxy0.java");
           FileWriter fw = new FileWriter(f);
           fw.write(str);
           fw.flush();
           fw.close();

           //3、把生成的.java文件编译成.class文件
           JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
           StandardJavaFileManager manage = compiler.getStandardFileManager(null,null,null);
           Iterable iterable = manage.getJavaFileObjects(f);

           JavaCompiler.CompilationTask task = compiler.getTask(null,manage,null,null,null,iterable);
           task.call();
           manage.close();

           //4、编译生成的.class文件加载到JVM中来
           Class proxyClass =  classLoader.findClass("$Proxy0");
           Constructor c = proxyClass.getConstructor(XHSInvocationHandler.class);
           f.delete();

           return c.newInstance(h);
       }catch(Exception e){
           e.printStackTrace();
       }

        return null;

    }

    public static String getInstance(Class<?>[] interfaces){
        StringBuilder sb = new StringBuilder("");
        sb.append("package com.xhs.www.proxy.custom;"+ln);
        sb.append("import com.xhs.www.proxy.jdk.Vehicle;"+ln);
        sb.append("import com.xhs.www.proxy.custom.XHSInvocationHandler;"+ln);
        sb.append("import java.lang.reflect.Method;"+ln);
        sb.append("import java.lang.reflect.Proxy;"+ln);
        sb.append("import java.lang.reflect.UndeclaredThrowableException;"+ln);

        sb.append("public final class $Proxy0 implements ");
        for(int i=0;i<interfaces.length;i++){
            if (i == 0) {
                sb.append(interfaces[i].getName());
            } else {
                sb.append("," + interfaces[i].getName());
            }
        }
        sb.append(" {"+ln);
            sb.append("public XHSInvocationHandler h;" + ln);
            sb.append("public $Proxy0(XHSInvocationHandler var1)  {"+ln);
                sb.append("this.h=var1;"+ln);
            sb.append("}"+ln);
            for(Method m:interfaces[0].getMethods()){
                sb.append("public final "+m.getReturnType()+" "+m.getName()+"(){"+ln);
                    sb.append("try{");
                        sb.append("this.h.invoke(this, Class.forName(\"com.xhs.www.proxy.jdk.Vehicle\").getMethod(\"run\"), (Object[])null);"+ln);
                    sb.append("}catch (RuntimeException | Error var2) {");
                        sb.append("throw var2;");
                    sb.append("} catch (Throwable var3) {");
                        sb.append("throw new UndeclaredThrowableException(var3);");
                    sb.append("}");
                    sb.append("}");
            }

        sb.append("}"+ln);

        return sb.toString();

    }
}
