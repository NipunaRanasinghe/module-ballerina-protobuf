/*
 * Copyright (c) 2021, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package io.ballerina.stdlib.protobuf.nativeimpl;

import io.ballerina.runtime.api.creators.ErrorCreator;
import io.ballerina.runtime.api.utils.StringUtils;
import io.ballerina.runtime.api.values.BError;

/**
 * This class will hold the native an API to generate errors of the protobuf library.
 *
 * @since 1.0.1
 */
public class ErrorGenerator {

    private ErrorGenerator() {}

    public static BError createError(Errors errorType, String errorMsg) {

        return ErrorCreator.createError(ModuleUtils.getProtoTypesAnyModule(), errorType.name(),
                StringUtils.fromString(errorMsg), null, null);
    }
}
