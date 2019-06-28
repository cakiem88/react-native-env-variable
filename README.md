
# react-native-react-native-env-variable

## Getting started

`$ npm install react-native-react-native-env-variable --save`

### Mostly automatic installation

`$ react-native link react-native-react-native-env-variable`

### Manual installation


#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-react-native-env-variable` and add `RNReactNativeEnvVariable.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libRNReactNativeEnvVariable.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.reactlibrary.RNReactNativeEnvVariablePackage;` to the imports at the top of the file
  - Add `new RNReactNativeEnvVariablePackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-react-native-env-variable'
  	project(':react-native-react-native-env-variable').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-react-native-env-variable/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-react-native-env-variable')
  	```

#### Windows
[Read it! :D](https://github.com/ReactWindows/react-native)

1. In Visual Studio add the `RNReactNativeEnvVariable.sln` in `node_modules/react-native-react-native-env-variable/windows/RNReactNativeEnvVariable.sln` folder to their solution, reference from their app.
2. Open up your `MainPage.cs` app
  - Add `using React.Native.Env.Variable.RNReactNativeEnvVariable;` to the usings at the top of the file
  - Add `new RNReactNativeEnvVariablePackage()` to the `List<IReactPackage>` returned by the `Packages` method


## Usage
```javascript
import RNReactNativeEnvVariable from 'react-native-react-native-env-variable';

// TODO: What to do with the module?
RNReactNativeEnvVariable;
```
  