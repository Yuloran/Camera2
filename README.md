# google-camera-lib

Android Studio library project containing full working Google Camera2 activities,
based on **https://github.com/Yuloran/Camera2**

Plus the following patches:

- Update to AndroidX to allow integration with newer projects
- Added libpeg-turbo static libraries to ensure compatibility with Android 7+ devices **https://developer.android.com/about/versions/nougat/android-7.0-changes**


## Original codebase

The Google Camera2 Source Code, migrated from [Android Open Source Project](https://android.googlesource.com)
- Branch of Camera2: **[master](https://android.googlesource.com/platform/packages/apps/Camera2/)**
- Branch of frameworks/ex: **[master](https://android.googlesource.com/platform/frameworks/ex/)**

## Features

- Migrate to Android Studio Project, convenient to Read and Debug now.
- All compile errors with Android Studio have been fixed.


## Build Requirements

- Android Studio version: **3.2.1**
- Gradle Version: **4.6**
- Compile Sdk Version: **28**
- Build Tools Version: **28.0.3**
- CMake: install from the SDK Manager
- *Ignore all \*.mk files in this repository, those are used for ndk-bundle only! But are useful for studying!*

## [Migrate Tutorial](https://juejin.im/post/5c2f52786fb9a049a42f3077)

## Just Enjoy It!
