# Portals for Native Playground

This repository contains a collection of iOS, Android, and web applications in a collection of platform-specific frameworks. Applications in this repository are organized first by platform then by framework. iOS and Android applications are configured to integrate with Ionic Portals.

The purpose of this repository is to allow developers to mix-and-match the provided applications to configure a "starter" Ionic Portals integration.

## Repository Breakdown

This repository contains starter applications for iOS, Android, and web.

iOS and Android applications contain two screens:

- An "entry" or "main" screen containing a button that navigates to
- A child screen containing a native header and a Portal sized to contain the remainder of the viewport

Ionic Portals is integrated into these applications. See platform specific sections below for additional details.

There are three Ionic Framework starters contained in this repository, one for Ionic Angular, Ionic React, and Ionic Vue. The web applications were created using the "blank" starter template and contain a single screen with the header component removed.

## iOS

This repository contains starter iOS applications using UIKit + Storyboards and Swift UI:

```bash
portals-playground-native/
├─ ios/
│  ├─ uikit/
│  ├─ swiftui/
```

### Building

You must first create a configuration file named `Config.xcconfig` within the appropriate directory, either:

- `ios/swiftui/Portals Playground`
- `ios/uikit/Portals Playground`

Populate the file with the following:

```bash
PORTALS_API_KEY=# Your key here
```

Starting from the repository root directory, install the Pods for the desired application:

```bash
cd ./ios/swiftui # or ./ios/uikit
pod install
```

After these steps have been taken, open the desired `.xcworkspace` file to launch the project in Xcode.

### Running

Before running the application, ensure that the web application to display through the Portal has been built using `npm`. This repository comes with three starter web applications that can be built with the following commands, run from the root of the repository:

```bash
npm run build -w ionic-angular
npm run build -w ionic-react
npm run build -w ionic-vue
```

There is a Build Phase Run Script that copies the built web application assets from their location in the repository into the iOS application. Both iOS applications contain the same script, and can be found in the `Portals Playground` target:

```bash
Portals Playground > Build Phases > [Ionic Portals] Copy Web Apps
```

By default, the script will attempt to copy the build output from the `ionic-angular` project. This can be modified as desired, with options for `ionic-react` and `ionic-vue` available, but commented out:

```bash
# Set to the web package you want to bundle.
# This must point to the distribution folder (e.g, 'www' or 'build')
APP_NAME="ionic-angular/www"
# APP_NAME = "ionic-react/build"
# APP_NAME = "ionic-vue/dist"
```

## Android

This repository contains starter Android applications using Java and Kotlin:

```bash
portals-playground-native/
├─ android/
│  ├─ java/
│  ├─ kotlin/
```

### Building

You must first create a configuration file named `secrets.xml` within the appropriate directory, either:

- `android/java/app/src/main/res/values`
- `android/kotlin/app/src/main/res/values`

Populate the file with the following:

```xml
<?xml version="1.0" encoding="utf-8"?>
<resources>
    <string name="portals_api_key">Your key here</string>
</resources>
```

### Running

Before running the application, ensure that the web application to display through the Portal has been built using `npm`. This repository comes with three starter web applications that can be built with the following commands, run from the root of the repository:

```bash
npm run build -w ionic-angular
npm run build -w ionic-react
npm run build -w ionic-vue
```

There is a pre-build gradle task that copies the built web application assets from their location in the repository into the Android application. Both Android applications contain the same script, and can be found in the appropriate location, either:

- `android/java/app/build.gradle`
- `android/kotlin/app/build.gradle`

The task is named `CopyWebAssets`. By default, the function will attempt to copy the build output from the `ionic-angular` project. This can be modified as desired, with options for `ionic-react` and `ionic-vue` available, but commented out:

```groovy
// Set to the web package you want to bundle.
// This must point to the distribution folder (e.g, 'www' or 'build')
def appName = 'ionic-angular/www'
// def appName = 'ionic-react/build'
// def appName = 'ionic-vue/dist'
```

## Web

This repository contains starter Ionic Framework applications using the "blank" starter template:

```bash
portals-playground-native/
├─ web/
│  ├─ ionic-angular/
│  ├─ ionic-react/
│  ├─ ionic-vue/
```

### Serving

You can serve any of the web applications under the `web` directory using npm workspace commands:

```bash
# Use one of the following to start the appropriate web app
npm run start -w ionic-angular
npm run start -w ionic-react
npm run serve -w ionic-vue
```

### Building

You can build any of the web applications under the `web` directory using npm workspace commands:

```bash
# Use one of the following to build the appropriate web app
npm run build -w ionic-angular
npm run build -w ionic-react
npm run build -w ionic-vue
```
