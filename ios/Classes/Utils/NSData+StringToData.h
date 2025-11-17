//
//  NSData+StringToData.h
//  OneToken
//
//  Created by xiaoliang on 2020/11/17.
//  Copyright © 2020 OneToken. All rights reserved..
//
#import <Foundation/Foundation.h>

@interface NSData (StringToData)
+ (NSString*)hexStringForData:(NSData*)data;
@end
