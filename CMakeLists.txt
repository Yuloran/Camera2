# Sets the minimum version of CMake required to build your native library.
# This ensures that a certain set of CMake features is available to
# your build.

cmake_minimum_required(VERSION 3.4.1)

# Specifies a library name, specifies whether the library is STATIC or
# SHARED, and provides relative paths to the source code. You can
# define multiple libraries by adding multiple add.library() commands,
# and CMake builds them for you. When you build your app, Gradle
# automatically packages shared libraries with your APK.

##################################################
###              NDK built-in libs             ###
##################################################
find_library( # Defines the name of the path variable that stores the
        # location of the NDK library.
        jnigraphics-lib

        # Specifies the name of the NDK library that
        # CMake needs to locate.
        jnigraphics)

find_library( # Defines the name of the path variable that stores the
        # location of the NDK library.
        log-lib

        # Specifies the name of the NDK library that
        # CMake needs to locate.
        log)

##################################################
###          Prebuilt libs: libjpeg            ###
##################################################
add_library( # Specifies the target library.
        libjpeg

        # Sets the library as a shared library.
        SHARED

        # Sets the library as a imported library.
        IMPORTED)

set_target_properties( # Specifies the target library.
        libjpeg

        # Specifies the parameter you want to define.
        PROPERTIES IMPORTED_LOCATION

        # Provides the path to the library you want to import.
        # Must be Absolute Path, relative path is Not Support!
        ${PROJECT_SOURCE_DIR}/jni/libs/${ANDROID_ABI}/libjpeg.so)

##################################################
###       App libs: libjni_tinyplanet          ###
##################################################
add_library( # Specifies the name of the library.
        jni_tinyplanet

        # Sets the library as a shared library.
        SHARED

        # Provides a relative path to your source file(s).
        jni/tinyplanet/tinyplanet.cc)

# Links your native library against one or more other native libraries.
target_link_libraries( # Specifies the target library.
        jni_tinyplanet

        # Links the log library to the target library.
        ${jnigraphics-lib}
        ${log-lib})

##################################################
###          App libs: libjni_jpegutil         ###
##################################################
add_library( # Specifies the name of the library.
        jni_jpegutil

        # Sets the library as a shared library.
        SHARED

        # Provides a relative path to your source file(s).
        jni/jpegutil/jpegutil.cpp jni/jpegutil/jpegutilnative.cpp)

# Links your native library against one or more other native libraries.
target_link_libraries( # Specifies the target library.
        jni_jpegutil

        # Links the log library to the target library.
        libjpeg
        ${jnigraphics-lib}
        ${log-lib})

##################################################
###           Include Headers                  ###
##################################################
# Optinal, CMake tookit recoganizes *.h automatically
#include_directories(jni)