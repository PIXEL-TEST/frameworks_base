/*
 * Copyright (C) 2023 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.credentialmanager.common

enum class BiometricPromptState {
    /** The biometric prompt hasn't been activated. */
    INACTIVE,
    /** The biometric prompt is active but data hasn't been returned yet. */
    PENDING,
    /** The biometric prompt has closed and returned data we then send to the provider activity. */
    COMPLETE,
    /**
     * The biometric prompt has been canceled by a developer signal. If this is true, certain
     * conditions can be triggered, such as no longer propagating ERROR_CANCELED.
     */
    CANCELED,
}