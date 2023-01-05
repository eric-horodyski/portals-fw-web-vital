# Frameworks Web Vitals Evaluation

The purpose of this repository is to measure metrics captured by the [web vitals](https://github.com/GoogleChrome/web-vitals) library to help troubleshoot latency issues with web applications that load within Portals.

When running the Android application, use the Chrome Inspect tool (chrome://inspect/#devices) to view metrics printed out to the console.

The following metrics are important in determining visual latency:

- Time to First Byte (TTFB) - Metric that measures the time between the request for a resource and when the first byte of a response begins to arrive.
- First Contentful Paint (FCP) - Metric that measures the time from when the page starts loading to when any part of the page's content is rendered on the screen.

With Portals, FCP is the more relevant metric, measuring when the user starts to "see" the web application loading.

## Running

First, run the following npm commands at the root of this repository:

```
npm run build -w ionic-angular
npm run build -w ionic-react
npm run build -w ionic-vue
```

Then, create a configuration file named `secrets.xml` within the appropriate directory:

- `android/java/app/src/main/res/values`

Populate the file with the following:

```xml
<?xml version="1.0" encoding="utf-8"?>
<resources>
    <string name="portals_api_key">Your key here</string>
</resources>
```

Once complete, load the Android project in `android/java` within Android Studio and run!

When the application is running on device or an emulator, press the button to navigate to the Portals view, and use Chrome Inspect to open up DevTools for each Portal and evaluate the metrics printed from web-vitals.
