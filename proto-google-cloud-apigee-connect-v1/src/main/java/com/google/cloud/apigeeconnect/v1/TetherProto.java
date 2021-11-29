/*
 * Copyright 2020 Google LLC
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
// source: google/cloud/apigeeconnect/v1/tether.proto

package com.google.cloud.apigeeconnect.v1;

public final class TetherProto {
  private TetherProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_apigeeconnect_v1_EgressRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_apigeeconnect_v1_EgressRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_apigeeconnect_v1_Payload_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_apigeeconnect_v1_Payload_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_apigeeconnect_v1_StreamInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_apigeeconnect_v1_StreamInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_apigeeconnect_v1_EgressResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_apigeeconnect_v1_EgressResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_apigeeconnect_v1_HttpRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_apigeeconnect_v1_HttpRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_apigeeconnect_v1_Url_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_apigeeconnect_v1_Url_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_apigeeconnect_v1_Header_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_apigeeconnect_v1_Header_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_apigeeconnect_v1_HttpResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_apigeeconnect_v1_HttpResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n"
          + "*google/cloud/apigeeconnect/v1/tether.p"
          + "roto\022\035google.cloud.apigeeconnect.v1\032\036goo"
          + "gle/protobuf/duration.proto\032\027google/rpc/"
          + "status.proto\032\027google/api/client.proto\"\344\001\n\r"
          + "EgressRequest\022\n\n"
          + "\002id\030\001 \001(\t\0227\n"
          + "\007payload\030\002 \001(\0132&.google.cloud.apigeeconnect.v1.Payload\022?\n"
          + "\010endpoint\030\003"
          + " \001(\0162-.google.cloud.apigeeconnect.v1.TetherEndpoint\022\017\n"
          + "\007project\030\004 \001(\t\022\020\n"
          + "\010trace_id\030\005 \001(\t\022*\n"
          + "\007timeout\030\006 \001(\0132\031.google.protobuf.Duration\"\320\001\n"
          + "\007Payload\022B\n"
          + "\014http_request\030\001"
          + " \001(\0132*.google.cloud.apigeeconnect.v1.HttpRequestH\000\022@\n"
          + "\013stream_info\030\002"
          + " \001(\0132).google.cloud.apigeeconnect.v1.StreamInfoH\000\0227\n"
          + "\006action\030\003 \001(\0162%.google.cloud.apigeeconnect.v1.ActionH\000B\006\n"
          + "\004kind\"\030\n\n"
          + "StreamInfo\022\n\n"
          + "\002id\030\001 \001(\t\"\366\001\n"
          + "\016EgressResponse\022\n\n"
          + "\002id\030\001 \001(\t\022B\n\r"
          + "http_response\030\002 \001(\0132+.google.cloud.apigeeconnect.v1.HttpResponse\022\"\n"
          + "\006status\030\003 \001(\0132\022.google.rpc.Status\022\017\n"
          + "\007project\030\004 \001(\t\022\020\n"
          + "\010trace_id\030\005 \001(\t\022?\n"
          + "\010endpoint\030\006"
          + " \001(\0162-.google.cloud.apigeeconnect.v1.TetherEndpoint\022\014\n"
          + "\004name\030\007 \001(\t\"\240\001\n"
          + "\013HttpRequest\022\n\n"
          + "\002id\030\001 \001(\t\022\016\n"
          + "\006method\030\002 \001(\t\022/\n"
          + "\003url\030\003 \001(\0132\".google.cloud.apigeeconnect.v1.Url\0226\n"
          + "\007headers\030\004 \003(\0132%.google.cloud.apigeeconnect.v1.Header\022\014\n"
          + "\004body\030\005 \001(\014\"X\n"
          + "\003Url\0225\n"
          + "\006scheme\030\001 \001(\0162%.google.cloud.apigeeconnect.v1.Scheme\022\014\n"
          + "\004host\030\002 \001(\t\022\014\n"
          + "\004path\030\003 \001(\t\"%\n"
          + "\006Header\022\013\n"
          + "\003key\030\001 \001(\t\022\016\n"
          + "\006values\030\002 \003(\t\"\235\001\n"
          + "\014HttpResponse\022\n\n"
          + "\002id\030\001 \001(\t\022\016\n"
          + "\006status\030\002 \001(\t\022\023\n"
          + "\013status_code\030\003 \001(\005\022\014\n"
          + "\004body\030\004 \001(\014\0226\n"
          + "\007headers\030\005 \003(\0132%.google.cloud.apigeeconnect.v1.Header\022\026\n"
          + "\016content_length\030\006 \001(\003*5\n"
          + "\006Action\022\026\n"
          + "\022ACTION_UNSPECIFIED\020\000\022\023\n"
          + "\017OPEN_NEW_STREAM\020\001*n\n"
          + "\016TetherEndpoint\022\037\n"
          + "\033TETHER_ENDPOINT_UNSPECIFIED\020\000\022\017\n"
          + "\013APIGEE_MART\020\001\022\022\n"
          + "\016APIGEE_RUNTIME\020\002\022\026\n"
          + "\022APIGEE_MINT_RATING\020\003*+\n"
          + "\006Scheme\022\026\n"
          + "\022SCHEME_UNSPECIFIED\020\000\022\t\n"
          + "\005HTTPS\020\0012\307\001\n"
          + "\006Tether\022k\n"
          + "\006Egress\022-.google.cloud.apigeeconnect.v1.EgressRe"
          + "sponse\032,.google.cloud.apigeeconnect.v1.E"
          + "gressRequest\"\000(\0010\001\032P\312A\034apigeeconnect.goo"
          + "gleapis.com\322A.https://www.googleapis.com/auth/cloud-platformB\341\001\n"
          + "!com.google.cloud.apigeeconnect.v1B\013TetherProtoP\001ZJgoogl"
          + "e.golang.org/genproto/googleapis/cloud/a"
          + "pigeeconnect/v1;apigeeconnect\252\002\035Google.C"
          + "loud.ApigeeConnect.V1\312\002\035Google\\Cloud\\ApigeeConnect\\V1\352\002"
          + " Google::Cloud::ApigeeConnect::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.protobuf.DurationProto.getDescriptor(),
              com.google.rpc.StatusProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
            });
    internal_static_google_cloud_apigeeconnect_v1_EgressRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_apigeeconnect_v1_EgressRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_apigeeconnect_v1_EgressRequest_descriptor,
            new java.lang.String[] {
              "Id", "Payload", "Endpoint", "Project", "TraceId", "Timeout",
            });
    internal_static_google_cloud_apigeeconnect_v1_Payload_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_apigeeconnect_v1_Payload_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_apigeeconnect_v1_Payload_descriptor,
            new java.lang.String[] {
              "HttpRequest", "StreamInfo", "Action", "Kind",
            });
    internal_static_google_cloud_apigeeconnect_v1_StreamInfo_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_apigeeconnect_v1_StreamInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_apigeeconnect_v1_StreamInfo_descriptor,
            new java.lang.String[] {
              "Id",
            });
    internal_static_google_cloud_apigeeconnect_v1_EgressResponse_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_apigeeconnect_v1_EgressResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_apigeeconnect_v1_EgressResponse_descriptor,
            new java.lang.String[] {
              "Id", "HttpResponse", "Status", "Project", "TraceId", "Endpoint", "Name",
            });
    internal_static_google_cloud_apigeeconnect_v1_HttpRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_apigeeconnect_v1_HttpRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_apigeeconnect_v1_HttpRequest_descriptor,
            new java.lang.String[] {
              "Id", "Method", "Url", "Headers", "Body",
            });
    internal_static_google_cloud_apigeeconnect_v1_Url_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_apigeeconnect_v1_Url_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_apigeeconnect_v1_Url_descriptor,
            new java.lang.String[] {
              "Scheme", "Host", "Path",
            });
    internal_static_google_cloud_apigeeconnect_v1_Header_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_apigeeconnect_v1_Header_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_apigeeconnect_v1_Header_descriptor,
            new java.lang.String[] {
              "Key", "Values",
            });
    internal_static_google_cloud_apigeeconnect_v1_HttpResponse_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_apigeeconnect_v1_HttpResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_apigeeconnect_v1_HttpResponse_descriptor,
            new java.lang.String[] {
              "Id", "Status", "StatusCode", "Body", "Headers", "ContentLength",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.ClientProto.oauthScopes);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
