# Getting started
This is a simple exercise to set up an empty Android project with Groovy. In addition it also covers the necessary steps to set up the android test environment. 

## Initial setup
Set up the Android SDK on your desktop. Go to [http://developer.android.com/sdk/] and download the Android SDK tools. This can be found in the 'Other Download Options' link. The tutorial works with Android Studio. As it is a simple command line project, it suffices for you to download only the SDK tools.

 1. Download and extract the SDK tools.
 2. Set the environement variable ANDROID_HOME to the root of the extracted SDK.
 3. Launch the Android tools and install updates.


    ${ANDROID_HOME}/tools/android

 You must install at least

1. Android SDK Tools
2. Android SDK Platform-tools
3. Android SDK Build-tools
4. Under Android 5.0.1 (API 21):
 - SDK Platform
5. Under Extras:
 - Android Support Library
 - Intel x86 Emulator Accelerator (HAXM installer)
4. Install Intel x86 Emulator accelerator. Go to ${ANDROD_HOME}/extra/intel and install the downloaded package.

## Set up Android Virtual Device

Before working on the code, you need to create an Emulated Anroid Virtual Device (AVD). Invoke the following from the command line.

    ${ANDROID_HOME}/tools/android avd

 The easiest way is to browse for the standard device definitions and create one from there. Once created your own AVD. Go to the list of AVDs and start the device and make sure you can see an emulator running the emulated device in a separate window.
