// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v1/rpc/errdetails/error_details.proto

// Protobuf Java Version: 3.25.3
package org.vdaas.vald.api.v1.rpc;

/**
 * <pre>
 * Describes when the clients can retry a failed request. Clients could ignore
 * the recommendation here or retry when this information is missing from error
 * responses.
 *
 * It's always recommended that clients should use exponential backoff when
 * retrying.
 *
 * Clients should wait until `retry_delay` amount of time has passed since
 * receiving the error response before retrying.  If retrying requests also
 * fail, clients should use an exponential backoff scheme to gradually increase
 * the delay between retries based on `retry_delay`, until either a maximum
 * number of retries have been reached or a maximum retry delay cap has been
 * reached.
 * </pre>
 *
 * Protobuf type {@code rpc.v1.RetryInfo}
 */
public final class RetryInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:rpc.v1.RetryInfo)
    RetryInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RetryInfo.newBuilder() to construct.
  private RetryInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RetryInfo() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RetryInfo();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.vdaas.vald.api.v1.rpc.ErrorDetailsProto.internal_static_rpc_v1_RetryInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.vdaas.vald.api.v1.rpc.ErrorDetailsProto.internal_static_rpc_v1_RetryInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.vdaas.vald.api.v1.rpc.RetryInfo.class, org.vdaas.vald.api.v1.rpc.RetryInfo.Builder.class);
  }

  private int bitField0_;
  public static final int RETRY_DELAY_FIELD_NUMBER = 1;
  private com.google.protobuf.Duration retryDelay_;
  /**
   * <pre>
   * Clients should wait at least this long between retrying the same request.
   * </pre>
   *
   * <code>.google.protobuf.Duration retry_delay = 1 [json_name = "retryDelay"];</code>
   * @return Whether the retryDelay field is set.
   */
  @java.lang.Override
  public boolean hasRetryDelay() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Clients should wait at least this long between retrying the same request.
   * </pre>
   *
   * <code>.google.protobuf.Duration retry_delay = 1 [json_name = "retryDelay"];</code>
   * @return The retryDelay.
   */
  @java.lang.Override
  public com.google.protobuf.Duration getRetryDelay() {
    return retryDelay_ == null ? com.google.protobuf.Duration.getDefaultInstance() : retryDelay_;
  }
  /**
   * <pre>
   * Clients should wait at least this long between retrying the same request.
   * </pre>
   *
   * <code>.google.protobuf.Duration retry_delay = 1 [json_name = "retryDelay"];</code>
   */
  @java.lang.Override
  public com.google.protobuf.DurationOrBuilder getRetryDelayOrBuilder() {
    return retryDelay_ == null ? com.google.protobuf.Duration.getDefaultInstance() : retryDelay_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getRetryDelay());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getRetryDelay());
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.vdaas.vald.api.v1.rpc.RetryInfo)) {
      return super.equals(obj);
    }
    org.vdaas.vald.api.v1.rpc.RetryInfo other = (org.vdaas.vald.api.v1.rpc.RetryInfo) obj;

    if (hasRetryDelay() != other.hasRetryDelay()) return false;
    if (hasRetryDelay()) {
      if (!getRetryDelay()
          .equals(other.getRetryDelay())) return false;
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasRetryDelay()) {
      hash = (37 * hash) + RETRY_DELAY_FIELD_NUMBER;
      hash = (53 * hash) + getRetryDelay().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.vdaas.vald.api.v1.rpc.RetryInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.vdaas.vald.api.v1.rpc.RetryInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.vdaas.vald.api.v1.rpc.RetryInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.vdaas.vald.api.v1.rpc.RetryInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.vdaas.vald.api.v1.rpc.RetryInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.vdaas.vald.api.v1.rpc.RetryInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.vdaas.vald.api.v1.rpc.RetryInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.vdaas.vald.api.v1.rpc.RetryInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static org.vdaas.vald.api.v1.rpc.RetryInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static org.vdaas.vald.api.v1.rpc.RetryInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.vdaas.vald.api.v1.rpc.RetryInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.vdaas.vald.api.v1.rpc.RetryInfo parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.vdaas.vald.api.v1.rpc.RetryInfo prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Describes when the clients can retry a failed request. Clients could ignore
   * the recommendation here or retry when this information is missing from error
   * responses.
   *
   * It's always recommended that clients should use exponential backoff when
   * retrying.
   *
   * Clients should wait until `retry_delay` amount of time has passed since
   * receiving the error response before retrying.  If retrying requests also
   * fail, clients should use an exponential backoff scheme to gradually increase
   * the delay between retries based on `retry_delay`, until either a maximum
   * number of retries have been reached or a maximum retry delay cap has been
   * reached.
   * </pre>
   *
   * Protobuf type {@code rpc.v1.RetryInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:rpc.v1.RetryInfo)
      org.vdaas.vald.api.v1.rpc.RetryInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.vdaas.vald.api.v1.rpc.ErrorDetailsProto.internal_static_rpc_v1_RetryInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.vdaas.vald.api.v1.rpc.ErrorDetailsProto.internal_static_rpc_v1_RetryInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.vdaas.vald.api.v1.rpc.RetryInfo.class, org.vdaas.vald.api.v1.rpc.RetryInfo.Builder.class);
    }

    // Construct using org.vdaas.vald.api.v1.rpc.RetryInfo.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getRetryDelayFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      retryDelay_ = null;
      if (retryDelayBuilder_ != null) {
        retryDelayBuilder_.dispose();
        retryDelayBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.vdaas.vald.api.v1.rpc.ErrorDetailsProto.internal_static_rpc_v1_RetryInfo_descriptor;
    }

    @java.lang.Override
    public org.vdaas.vald.api.v1.rpc.RetryInfo getDefaultInstanceForType() {
      return org.vdaas.vald.api.v1.rpc.RetryInfo.getDefaultInstance();
    }

    @java.lang.Override
    public org.vdaas.vald.api.v1.rpc.RetryInfo build() {
      org.vdaas.vald.api.v1.rpc.RetryInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.vdaas.vald.api.v1.rpc.RetryInfo buildPartial() {
      org.vdaas.vald.api.v1.rpc.RetryInfo result = new org.vdaas.vald.api.v1.rpc.RetryInfo(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(org.vdaas.vald.api.v1.rpc.RetryInfo result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.retryDelay_ = retryDelayBuilder_ == null
            ? retryDelay_
            : retryDelayBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.vdaas.vald.api.v1.rpc.RetryInfo) {
        return mergeFrom((org.vdaas.vald.api.v1.rpc.RetryInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.vdaas.vald.api.v1.rpc.RetryInfo other) {
      if (other == org.vdaas.vald.api.v1.rpc.RetryInfo.getDefaultInstance()) return this;
      if (other.hasRetryDelay()) {
        mergeRetryDelay(other.getRetryDelay());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              input.readMessage(
                  getRetryDelayFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.Duration retryDelay_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Duration, com.google.protobuf.Duration.Builder, com.google.protobuf.DurationOrBuilder> retryDelayBuilder_;
    /**
     * <pre>
     * Clients should wait at least this long between retrying the same request.
     * </pre>
     *
     * <code>.google.protobuf.Duration retry_delay = 1 [json_name = "retryDelay"];</code>
     * @return Whether the retryDelay field is set.
     */
    public boolean hasRetryDelay() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Clients should wait at least this long between retrying the same request.
     * </pre>
     *
     * <code>.google.protobuf.Duration retry_delay = 1 [json_name = "retryDelay"];</code>
     * @return The retryDelay.
     */
    public com.google.protobuf.Duration getRetryDelay() {
      if (retryDelayBuilder_ == null) {
        return retryDelay_ == null ? com.google.protobuf.Duration.getDefaultInstance() : retryDelay_;
      } else {
        return retryDelayBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Clients should wait at least this long between retrying the same request.
     * </pre>
     *
     * <code>.google.protobuf.Duration retry_delay = 1 [json_name = "retryDelay"];</code>
     */
    public Builder setRetryDelay(com.google.protobuf.Duration value) {
      if (retryDelayBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        retryDelay_ = value;
      } else {
        retryDelayBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Clients should wait at least this long between retrying the same request.
     * </pre>
     *
     * <code>.google.protobuf.Duration retry_delay = 1 [json_name = "retryDelay"];</code>
     */
    public Builder setRetryDelay(
        com.google.protobuf.Duration.Builder builderForValue) {
      if (retryDelayBuilder_ == null) {
        retryDelay_ = builderForValue.build();
      } else {
        retryDelayBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Clients should wait at least this long between retrying the same request.
     * </pre>
     *
     * <code>.google.protobuf.Duration retry_delay = 1 [json_name = "retryDelay"];</code>
     */
    public Builder mergeRetryDelay(com.google.protobuf.Duration value) {
      if (retryDelayBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          retryDelay_ != null &&
          retryDelay_ != com.google.protobuf.Duration.getDefaultInstance()) {
          getRetryDelayBuilder().mergeFrom(value);
        } else {
          retryDelay_ = value;
        }
      } else {
        retryDelayBuilder_.mergeFrom(value);
      }
      if (retryDelay_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * Clients should wait at least this long between retrying the same request.
     * </pre>
     *
     * <code>.google.protobuf.Duration retry_delay = 1 [json_name = "retryDelay"];</code>
     */
    public Builder clearRetryDelay() {
      bitField0_ = (bitField0_ & ~0x00000001);
      retryDelay_ = null;
      if (retryDelayBuilder_ != null) {
        retryDelayBuilder_.dispose();
        retryDelayBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Clients should wait at least this long between retrying the same request.
     * </pre>
     *
     * <code>.google.protobuf.Duration retry_delay = 1 [json_name = "retryDelay"];</code>
     */
    public com.google.protobuf.Duration.Builder getRetryDelayBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getRetryDelayFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Clients should wait at least this long between retrying the same request.
     * </pre>
     *
     * <code>.google.protobuf.Duration retry_delay = 1 [json_name = "retryDelay"];</code>
     */
    public com.google.protobuf.DurationOrBuilder getRetryDelayOrBuilder() {
      if (retryDelayBuilder_ != null) {
        return retryDelayBuilder_.getMessageOrBuilder();
      } else {
        return retryDelay_ == null ?
            com.google.protobuf.Duration.getDefaultInstance() : retryDelay_;
      }
    }
    /**
     * <pre>
     * Clients should wait at least this long between retrying the same request.
     * </pre>
     *
     * <code>.google.protobuf.Duration retry_delay = 1 [json_name = "retryDelay"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Duration, com.google.protobuf.Duration.Builder, com.google.protobuf.DurationOrBuilder> 
        getRetryDelayFieldBuilder() {
      if (retryDelayBuilder_ == null) {
        retryDelayBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Duration, com.google.protobuf.Duration.Builder, com.google.protobuf.DurationOrBuilder>(
                getRetryDelay(),
                getParentForChildren(),
                isClean());
        retryDelay_ = null;
      }
      return retryDelayBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:rpc.v1.RetryInfo)
  }

  // @@protoc_insertion_point(class_scope:rpc.v1.RetryInfo)
  private static final org.vdaas.vald.api.v1.rpc.RetryInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.vdaas.vald.api.v1.rpc.RetryInfo();
  }

  public static org.vdaas.vald.api.v1.rpc.RetryInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RetryInfo>
      PARSER = new com.google.protobuf.AbstractParser<RetryInfo>() {
    @java.lang.Override
    public RetryInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<RetryInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RetryInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.vdaas.vald.api.v1.rpc.RetryInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

