package com.chinni.iostream.file_from_outside_location;

import java.util.Map.Entry;
import java.util.Properties;

public class FileAccessDymacicPathInBothLocalAndServer {

	public static void main(String[] args) {
		String tomcatHome=System.getProperty("catalina.base");
		System.out.println(tomcatHome);
		Properties prop=System.getProperties();
		for(Entry<Object, Object> entry:prop.entrySet()) {
			System.out.println(entry.getKey()+"---"+entry.getValue());
		}
		/*
java.runtime.name---Java(TM) SE Runtime Environment
sun.boot.library.path---C:\Program Files\Java\jdk1.8.0_144\jre\bin
java.vm.version---25.144-b01
java.vm.vendor---Oracle Corporation
java.vendor.url---http://java.oracle.com/
path.separator---;
java.vm.name---Java HotSpot(TM) 64-Bit Server VM
file.encoding.pkg---sun.io
user.country---US
user.script---
sun.java.launcher---SUN_STANDARD
sun.os.patch.level---
java.vm.specification.name---Java Virtual Machine Specification
user.dir---C:\Users\sachari\git\CORE_JAVA
java.runtime.version---1.8.0_144-b01
java.awt.graphicsenv---sun.awt.Win32GraphicsEnvironment
java.endorsed.dirs---C:\Program Files\Java\jdk1.8.0_144\jre\lib\endorsed
os.arch---amd64
java.io.tmpdir---C:\Users\sachari\AppData\Local\Temp\
line.separator---

java.vm.specification.vendor---Oracle Corporation
user.variant---
os.name---Windows 8.1
sun.jnu.encoding---Cp1252
java.library.path---C:\Program Files\Java\jdk1.8.0_144\bin;C:\Windows\Sun\Java\bin;C:\Windows\system32;C:\Windows;C:/Program Files/Java/jre1.8.0_144/bin/server;C:/Program Files/Java/jre1.8.0_144/bin;C:/Program Files/Java/jre1.8.0_144/lib/amd64;C:\ProgramData\Oracle\Java\javapath;C:\Program Files (x86)\Intel\iCLS Client\;C:\Program Files\Intel\iCLS Client\;C:\Windows\system32;C:\Windows;C:\Windows\System32\Wbem;C:\Windows\System32\WindowsPowerShell\v1.0\;C:\Program Files\Intel\Intel(R) Management Engine Components\DAL;C:\Program Files (x86)\Intel\Intel(R) Management Engine Components\DAL;C:\Program Files\Intel\Intel(R) Management Engine Components\IPT;C:\Program Files (x86)\Intel\Intel(R) Management Engine Components\IPT;C:\Program Files\Java\jdk1.7.0_79\bin;E:\TOMCAT\apache-tomcat-7.0.85-windows-x64\apache-tomcat-7.0.85\bin;;E:\eclipse;;.
java.specification.name---Java Platform API Specification
java.class.version---52.0
sun.management.compiler---HotSpot 64-Bit Tiered Compilers
os.version---6.3
user.home---C:\Users\sachari
user.timezone---
java.awt.printerjob---sun.awt.windows.WPrinterJob
file.encoding---Cp1252
java.specification.version---1.8
java.class.path---C:\Program Files\Java\jdk1.8.0_144\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\rt.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\ext\zipfs.jar;C:\Users\sachari\git\CORE_JAVA\target\classes;C:\Users\sachari\.m2\repository\commons-io\commons-io\2.6\commons-io-2.6.jar;C:\Users\sachari\.m2\repository\commons-lang\commons-lang\2.3\commons-lang-2.3.jar
user.name---sachari
java.vm.specification.version---1.8
sun.java.command---com.chinni.iostream.file_from_outside_location.FileAccessDymacicPathInBothLocalAndServer
java.home---C:\Program Files\Java\jdk1.8.0_144\jre
sun.arch.data.model---64
user.language---en
java.specification.vendor---Oracle Corporation
awt.toolkit---sun.awt.windows.WToolkit
java.vm.info---mixed mode
java.version---1.8.0_144
java.ext.dirs---C:\Program Files\Java\jdk1.8.0_144\jre\lib\ext;C:\Windows\Sun\Java\lib\ext
sun.boot.class.path---C:\Program Files\Java\jdk1.8.0_144\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\rt.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\sunrsasign.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_144\jre\classes
java.vendor---Oracle Corporation
file.separator---\
java.vendor.url.bug---http://bugreport.sun.com/bugreport/
sun.io.unicode.encoding---UnicodeLittle
sun.cpu.endian---little
sun.desktop---windows
sun.cpu.isalist---amd64
		 */
		/*

E:\WORKSPACE\.metadata\.plugins\org.eclipse.wst.server.core\tmp0
java.runtime.name---Java(TM) SE Runtime Environment
sun.boot.library.path---C:\Program Files\Java\jdk1.8.0_144\jre\bin
java.vm.version---25.144-b01
shared.loader---
java.vm.vendor---Oracle Corporation
java.vendor.url---http://java.oracle.com/
path.separator---;
tomcat.util.buf.StringCache.byte.enabled---true
java.vm.name---Java HotSpot(TM) 64-Bit Server VM
file.encoding.pkg---sun.io
user.country---US
user.script---
sun.java.launcher---SUN_STANDARD
sun.os.patch.level---
java.vm.specification.name---Java Virtual Machine Specification
user.dir---E:\eclipse
java.runtime.version---1.8.0_144-b01
org.apache.catalina.startup.TldConfig.jarsToSkip---tomcat7-websocket.jar
java.awt.graphicsenv---sun.awt.Win32GraphicsEnvironment
java.endorsed.dirs---E:\TOMCAT\apache-tomcat-7.0.85-windows-x64\apache-tomcat-7.0.85\endorsed
os.arch---amd64
spring.profiles.active---production
java.io.tmpdir---C:\Users\sachari\AppData\Local\Temp\
line.separator---

java.vm.specification.vendor---Oracle Corporation
java.naming.factory.url.pkgs---org.apache.naming
user.variant---
os.name---Windows 8.1
sun.jnu.encoding---Cp1252
tomcat.util.scan.DefaultJarScanner.jarsToSkip---bootstrap.jar,commons-daemon.jar,tomcat-juli.jar,annotations-api.jar,el-api.jar,jsp-api.jar,servlet-api.jar,websocket-api.jar,catalina.jar,catalina-ant.jar,catalina-ha.jar,catalina-tribes.jar,jasper.jar,jasper-el.jar,ecj-*.jar,tomcat-api.jar,tomcat-util.jar,tomcat-coyote.jar,tomcat-dbcp.jar,tomcat-jni.jar,tomcat-spdy.jar,tomcat-i18n-en.jar,tomcat-i18n-es.jar,tomcat-i18n-fr.jar,tomcat-i18n-ja.jar,tomcat-juli-adapters.jar,catalina-jmx-remote.jar,catalina-ws.jar,tomcat-jdbc.jar,tools.jar,commons-beanutils*.jar,commons-codec*.jar,commons-collections*.jar,commons-dbcp*.jar,commons-digester*.jar,commons-fileupload*.jar,commons-httpclient*.jar,commons-io*.jar,commons-lang*.jar,commons-logging*.jar,commons-math*.jar,commons-pool*.jar,jstl.jar,taglibs-standard-spec-*.jar,geronimo-spec-jaxrpc*.jar,wsdl4j*.jar,ant.jar,ant-junit*.jar,aspectj*.jar,jmx.jar,h2*.jar,hibernate*.jar,httpclient*.jar,jmx-tools.jar,jta*.jar,log4j.jar,log4j-1*.jar,mail*.jar,slf4j*.jar,xercesImpl.jar,xmlParserAPIs.jar,xml-apis.jar,junit.jar,junit-*.jar,hamcrest*.jar,org.hamcrest*.jar,ant-launcher.jar,cobertura-*.jar,asm-*.jar,dom4j-*.jar,icu4j-*.jar,jaxen-*.jar,jdom-*.jar,jetty-*.jar,oro-*.jar,servlet-api-*.jar,tagsoup-*.jar,xmlParserAPIs-*.jar,xom-*.jar
java.library.path---C:\Program Files\Java\jdk1.8.0_144\bin;C:\Windows\Sun\Java\bin;C:\Windows\system32;C:\Windows;C:\Program Files\Java\jdk1.8.0_144\jre\bin;C:/Program Files/Java/jre1.8.0_144/bin/server;C:/Program Files/Java/jre1.8.0_144/bin;C:/Program Files/Java/jre1.8.0_144/lib/amd64;C:\ProgramData\Oracle\Java\javapath;C:\Program Files (x86)\Intel\iCLS Client\;C:\Program Files\Intel\iCLS Client\;C:\Windows\system32;C:\Windows;C:\Windows\System32\Wbem;C:\Windows\System32\WindowsPowerShell\v1.0\;C:\Program Files\Intel\Intel(R) Management Engine Components\DAL;C:\Program Files (x86)\Intel\Intel(R) Management Engine Components\DAL;C:\Program Files\Intel\Intel(R) Management Engine Components\IPT;C:\Program Files (x86)\Intel\Intel(R) Management Engine Components\IPT;C:\Program Files\Java\jdk1.7.0_79\bin;E:\TOMCAT\apache-tomcat-7.0.85-windows-x64\apache-tomcat-7.0.85\bin;;E:\eclipse;;.
java.specification.name---Java Platform API Specification
java.class.version---52.0
sun.management.compiler---HotSpot 64-Bit Tiered Compilers
os.version---6.3
java.util.concurrent.ForkJoinPool.common.threadFactory---org.apache.catalina.startup.SafeForkJoinWorkerThreadFactory
org.apache.catalina.startup.ContextConfig.jarsToSkip---
user.home---C:\Users\sachari
catalina.useNaming---true
user.timezone---Asia/Calcutta
java.awt.printerjob---sun.awt.windows.WPrinterJob
file.encoding---Cp1252
java.specification.version---1.8
catalina.home---E:\TOMCAT\apache-tomcat-7.0.85-windows-x64\apache-tomcat-7.0.85
java.class.path---C:\Program Files\Java\jdk1.8.0_144\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\rt.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\jfr.jar;E:\TOMCAT\apache-tomcat-7.0.85-windows-x64\apache-tomcat-7.0.85\bin\bootstrap.jar;E:\TOMCAT\apache-tomcat-7.0.85-windows-x64\apache-tomcat-7.0.85\bin\tomcat-juli.jar;C:\Program Files\Java\jdk1.8.0_144\lib\tools.jar
user.name---sachari
java.naming.factory.initial---org.apache.naming.java.javaURLContextFactory
package.definition---sun.,java.,org.apache.catalina.,org.apache.coyote.,org.apache.jasper.,org.apache.naming.,org.apache.tomcat.
java.vm.specification.version---1.8
sun.java.command---org.apache.catalina.startup.Bootstrap start
java.home---C:\Program Files\Java\jdk1.8.0_144\jre
sun.arch.data.model---64
user.language---en
java.specification.vendor---Oracle Corporation
awt.toolkit---sun.awt.windows.WToolkit
java.vm.info---mixed mode
java.version---1.8.0_144
java.ext.dirs---C:\Program Files\Java\jdk1.8.0_144\jre\lib\ext;C:\Windows\Sun\Java\lib\ext
sun.boot.class.path---C:\Program Files\Java\jdk1.8.0_144\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\rt.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\sunrsasign.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_144\jre\classes
server.loader---
java.vendor---Oracle Corporation
catalina.base---E:\WORKSPACE\.metadata\.plugins\org.eclipse.wst.server.core\tmp0
file.separator---\
java.vendor.url.bug---http://bugreport.sun.com/bugreport/
common.loader---${catalina.base}/lib,${catalina.base}/lib/*.jar,${catalina.home}/lib,${catalina.home}/lib/*.jar
sun.io.unicode.encoding---UnicodeLittle
sun.cpu.endian---little
wtp.deploy---E:\WORKSPACE\.metadata\.plugins\org.eclipse.wst.server.core\tmp0\wtpwebapps
package.access---sun.,org.apache.catalina.,org.apache.coyote.,org.apache.jasper.,org.apache.naming.resources.,org.apache.tomcat.
sun.desktop---windows
sun.cpu.isalist---amd64
*/
	}

}
