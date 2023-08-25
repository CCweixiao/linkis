/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.linkis.manager.engineplugin.hbase.shell;

import static org.apache.linkis.manager.engineplugin.hbase.constant.HBaseEngineConnConstant.DEFAULT_SHELL_DEBUG_LOG;
import static org.apache.linkis.manager.engineplugin.hbase.constant.HBaseEngineConnConstant.DEFAULT_SHELL_SESSION_IDLE_MS;
import static org.apache.linkis.manager.engineplugin.hbase.constant.HBaseEngineConnConstant.DEFAULT_SHELL_SESSION_INIT_MAX_TIMES;
import static org.apache.linkis.manager.engineplugin.hbase.constant.HBaseEngineConnConstant.DEFAULT_SHELL_SESSION_INIT_RETRY_INTERVAL_MS;
import static org.apache.linkis.manager.engineplugin.hbase.constant.HBaseEngineConnConstant.DEFAULT_SHELL_SESSION_INIT_TIMEOUT_MS;
import static org.apache.linkis.manager.engineplugin.hbase.constant.HBaseEngineConnConstant.HBASE_SHELL_DEBUG_LOG;
import static org.apache.linkis.manager.engineplugin.hbase.constant.HBaseEngineConnConstant.HBASE_SHELL_SESSION_IDLE_MS;
import static org.apache.linkis.manager.engineplugin.hbase.constant.HBaseEngineConnConstant.HBASE_SHELL_SESSION_INIT_MAX_TIMES;
import static org.apache.linkis.manager.engineplugin.hbase.constant.HBaseEngineConnConstant.HBASE_SHELL_SESSION_INIT_RETRY_INTERVAL_MS;
import static org.apache.linkis.manager.engineplugin.hbase.constant.HBaseEngineConnConstant.HBASE_SHELL_SESSION_INIT_TIMEOUT_MS;

import java.util.Map;

import org.apache.linkis.manager.engineplugin.hbase.HBasePropertiesParser;

public class HBaseShellSessionConfig {
    public static long initTimeout(Map<String, String> prop) {
        return HBasePropertiesParser.getLong(prop, HBASE_SHELL_SESSION_INIT_TIMEOUT_MS,
                DEFAULT_SHELL_SESSION_INIT_TIMEOUT_MS);
    }

    public static int maxRetryTimes(Map<String, String> prop) {
        return HBasePropertiesParser.getInt(prop, HBASE_SHELL_SESSION_INIT_MAX_TIMES,
                DEFAULT_SHELL_SESSION_INIT_MAX_TIMES);
    }

    public static long initRetryInterval(Map<String, String> prop) {
        return HBasePropertiesParser.getLong(prop, HBASE_SHELL_SESSION_INIT_RETRY_INTERVAL_MS,
                DEFAULT_SHELL_SESSION_INIT_RETRY_INTERVAL_MS);
    }

    public static long idleTimeMs(Map<String, String> prop) {
        return HBasePropertiesParser.getLong(prop, HBASE_SHELL_SESSION_IDLE_MS, DEFAULT_SHELL_SESSION_IDLE_MS);
    }

    public static boolean openDebugLog(Map<String, String> prop) {
        return HBasePropertiesParser.getBool(prop, HBASE_SHELL_DEBUG_LOG, DEFAULT_SHELL_DEBUG_LOG);
    }
}
