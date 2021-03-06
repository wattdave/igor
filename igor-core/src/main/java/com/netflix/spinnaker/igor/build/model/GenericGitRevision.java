/*
 * Copyright 2016 Schibsted ASA.
 *
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
package com.netflix.spinnaker.igor.build.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.time.Instant;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.experimental.Wither;

/** TODO(rz): Rename to GitRevision. */
@Getter
@EqualsAndHashCode(of = "sha1")
@Builder
@Wither
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GenericGitRevision {
  private String name;
  private String branch;
  private String sha1;
  private String committer;
  private String compareUrl;
  private String message;
  private Instant timestamp;
  private String remoteUrl;
}
