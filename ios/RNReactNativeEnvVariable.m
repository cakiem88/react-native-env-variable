
#import "RNReactNativeEnvVariable.h"

@implementation RNReactNativeEnvVariable
- (dispatch_queue_t)methodQueue
{
    return dispatch_get_main_queue();
}
RCT_EXPORT_MODULE()

- (NSDictionary *)constantsToExport {
    return @{
             @"environment": [NSProcessInfo processInfo].environment,
             };
}
//- (NSObject *)constantsToExport {
//    return [NSProcessInfo processInfo].environment;
//}

@end

