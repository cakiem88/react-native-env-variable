using ReactNative.Bridge;
using System;
using System.Collections.Generic;
using Windows.ApplicationModel.Core;
using Windows.UI.Core;

namespace React.Native.Env.Variable.RNReactNativeEnvVariable
{
    /// <summary>
    /// A module that allows JS to share data.
    /// </summary>
    class RNReactNativeEnvVariableModule : NativeModuleBase
    {
        /// <summary>
        /// Instantiates the <see cref="RNReactNativeEnvVariableModule"/>.
        /// </summary>
        internal RNReactNativeEnvVariableModule()
        {

        }

        /// <summary>
        /// The name of the native module.
        /// </summary>
        public override string Name
        {
            get
            {
                return "RNReactNativeEnvVariable";
            }
        }
    }
}
