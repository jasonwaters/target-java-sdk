/*
 * Copyright 2021 Adobe. All rights reserved.
 * This file is licensed to you under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License. You may obtain a copy
 * of the License at http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under
 * the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR REPRESENTATIONS
 * OF ANY KIND, either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package com.adobe.target.edge.client.model.ondevice;

import java.util.List;
import java.util.Map;

public class OnDeviceDecisioningRules {
  private Map<String, List<OnDeviceDecisioningRule>> mboxes;
  private Map<String, List<OnDeviceDecisioningRule>> views;

  public Map<String, List<OnDeviceDecisioningRule>> getMboxes() {
    return mboxes;
  }

  public Map<String, List<OnDeviceDecisioningRule>> getViews() {
    return views;
  }

  @Override
  public String toString() {
    return "LocalDecisioningRules{" + "mboxes=" + mboxes + ", views=" + views + '}';
  }
}
