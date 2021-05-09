/*
 * Copyright 2008-2013 Don Brown
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
File buildLog = new File((String) basedir, "build.log")
def text = buildLog.getText()
text = text.replaceAll("\r\n", "\n")
def v1 = text.contains("[INFO] Executing 'org.apache.maven.plugins:maven-dependency-plugin' in blocking mode.")
def v2 = text.contains("""[INFO] The following files have been resolved:
[INFO]    junit:junit:jar:4.11:test
[INFO]    org.hamcrest:hamcrest-core:jar:1.3:test
[INFO]    org.slf4j:slf4j-api:jar:1.7.4:provided
[INFO]    org.slf4j:slf4j-nop:jar:1.7.4:runtime""");
return v1 && v2;
