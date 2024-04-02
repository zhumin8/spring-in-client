/*
 * Copyright 2024 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/language/v1beta2/language_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.language.v1beta2;

public interface AnalyzeEntitiesRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.language.v1beta2.AnalyzeEntitiesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Input document.
   * </pre>
   *
   * <code>
   * .google.cloud.language.v1beta2.Document document = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the document field is set.
   */
  boolean hasDocument();
  /**
   *
   *
   * <pre>
   * Required. Input document.
   * </pre>
   *
   * <code>
   * .google.cloud.language.v1beta2.Document document = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The document.
   */
  com.google.cloud.language.v1beta2.Document getDocument();
  /**
   *
   *
   * <pre>
   * Required. Input document.
   * </pre>
   *
   * <code>
   * .google.cloud.language.v1beta2.Document document = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.language.v1beta2.DocumentOrBuilder getDocumentOrBuilder();

  /**
   *
   *
   * <pre>
   * The encoding type used by the API to calculate offsets.
   * </pre>
   *
   * <code>.google.cloud.language.v1beta2.EncodingType encoding_type = 2;</code>
   *
   * @return The enum numeric value on the wire for encodingType.
   */
  int getEncodingTypeValue();
  /**
   *
   *
   * <pre>
   * The encoding type used by the API to calculate offsets.
   * </pre>
   *
   * <code>.google.cloud.language.v1beta2.EncodingType encoding_type = 2;</code>
   *
   * @return The encodingType.
   */
  com.google.cloud.language.v1beta2.EncodingType getEncodingType();
}