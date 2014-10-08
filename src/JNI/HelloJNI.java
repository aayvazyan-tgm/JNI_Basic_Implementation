package JNI;

import JNIUtils.NativeUtils;

import java.io.IOException;

public class HelloJNI {
    static {
        try {
            NativeUtils.loadLibraryFromJar("/resources/hello.dll");
        } catch (IOException e) {
            e.printStackTrace(); // This is probably not the best way to handle exception :-)
        }
    }

    // Declare a native method sayHello() that receives nothing and returns void
   private native void sayHello();
 
   // Test Driver
   public static void main(String[] args) {
      new HelloJNI().sayHello();  // invoke the native method
   }
}