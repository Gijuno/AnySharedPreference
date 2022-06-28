# AnySharedPreference [![](https://jitpack.io/v/Gijuno/AnySharedPreference.svg)](https://jitpack.io/#Gijuno/AnySharedPreference)

## Installation
Add this code on your project
``` gradle
// build.gradle (Module:)

dependencies {
  ....
  implementation 'com.github.Gijuno:AnySharedPreference:0.0.1' // <--
}
```
```` gradle
// settings.gradle (Project Settings)

dependencyResolutionManagement {
  ....
  repositories {
    ....
    maven { url 'https://jitpack.io' } // <--
  }
}
````

## How to use
```` kotlin
// ex) set STRING and get STRING

AnySharedPreference(context).setString("key", "value")

val key = AnySharedPreference(context).setString("key", "value")

Log.d("test", key)
````

### All Types
```` kotlin
AnySharedPreference(context).setString("stringKey", "value")
AnySharedPreference(context).setInt("intKey", 1)
AnySharedPreference(context).setBoolean("BooleanKey", true)
AnySharedPreference(context).setFloat("FloatKey", 0.1f)
AnySharedPreference(context).setArray("ArrayKey", arrayOf("a","b","c"), "`") // only string array now 😅
AnySharedPreference(context).setList("ListKey, listOf("a","b","c"), "`") // only string list now 😅
AnySharedPreference(context).setArrayList("ArrayListKey", arrayListOf("a","b","c"), "`") // only string arrayList now 😅
````

