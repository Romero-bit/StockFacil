apply plugin: 'com.android.application'
apply plugin: 'com.google.gms.google-services' // Agrega esta línea

android {
  compileSdkVersion 33
  defaultConfig {
    applicationId "com.example.stockfacil"
    minSdkVersion 21
    targetSdkVersion 33
    versionCode 1
    versionName "1.0"
  }
}

dependencies {
  implementation 'androidx.appcompat:appcompat:1.6.1'
}