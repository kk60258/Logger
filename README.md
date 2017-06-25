# Logger
mylogger

add this line to build.gradle in root project
allprojects {
    repositories {
        jcenter()
+        maven { url 'https://jitpack.io' }
    }
}

add this line to build.gradle in your app folder

dependencies {
compile 'com.github.kk60258:Logger:v1.0'
}

If ManifestMerger conflicts in support lib, add this in AndroidManifest.xml

    <meta-data android:name= "android.support.VERSION"
    tools:node="replace"/>
    
