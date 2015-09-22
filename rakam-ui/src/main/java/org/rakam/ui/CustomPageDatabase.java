/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.rakam.ui;

import java.io.InputStream;
import java.util.List;
import java.util.Map;

/**
 * Created by buremba <Burak Emre Kabakcı> on 10/09/15 17:48.
 */
public interface CustomPageDatabase {
    void save(String project, String name, Map<String, String> files);
    List<String> list(String project);
    Map<String, String> get(String project, String name);
    InputStream getFile(String project, String name, String file);
    void delete(String project, String name);
}