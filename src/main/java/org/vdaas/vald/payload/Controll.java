// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: payload.proto

package org.vdaas.vald.payload;

/**
 * Protobuf type {@code payload.Controll}
 */
public  final class Controll extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:payload.Controll)
    ControllOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Controll.newBuilder() to construct.
  private Controll(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Controll() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Controll();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Controll(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.vdaas.vald.payload.ValdPayload.internal_static_payload_Controll_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.vdaas.vald.payload.ValdPayload.internal_static_payload_Controll_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.vdaas.vald.payload.Controll.class, org.vdaas.vald.payload.Controll.Builder.class);
  }

  public interface CreateIndexRequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:payload.Controll.CreateIndexRequest)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 pool_size = 1 [(.validate.rules) = { ... }</code>
     * @return The poolSize.
     */
    int getPoolSize();
  }
  /**
   * Protobuf type {@code payload.Controll.CreateIndexRequest}
   */
  public  static final class CreateIndexRequest extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:payload.Controll.CreateIndexRequest)
      CreateIndexRequestOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CreateIndexRequest.newBuilder() to construct.
    private CreateIndexRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CreateIndexRequest() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new CreateIndexRequest();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private CreateIndexRequest(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {

              poolSize_ = input.readUInt32();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.vdaas.vald.payload.ValdPayload.internal_static_payload_Controll_CreateIndexRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.vdaas.vald.payload.ValdPayload.internal_static_payload_Controll_CreateIndexRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.vdaas.vald.payload.Controll.CreateIndexRequest.class, org.vdaas.vald.payload.Controll.CreateIndexRequest.Builder.class);
    }

    public static final int POOL_SIZE_FIELD_NUMBER = 1;
    private int poolSize_;
    /**
     * <code>uint32 pool_size = 1 [(.validate.rules) = { ... }</code>
     * @return The poolSize.
     */
    public int getPoolSize() {
      return poolSize_;
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
      if (poolSize_ != 0) {
        output.writeUInt32(1, poolSize_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (poolSize_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, poolSize_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof org.vdaas.vald.payload.Controll.CreateIndexRequest)) {
        return super.equals(obj);
      }
      org.vdaas.vald.payload.Controll.CreateIndexRequest other = (org.vdaas.vald.payload.Controll.CreateIndexRequest) obj;

      if (getPoolSize()
          != other.getPoolSize()) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + POOL_SIZE_FIELD_NUMBER;
      hash = (53 * hash) + getPoolSize();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.vdaas.vald.payload.Controll.CreateIndexRequest parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.vdaas.vald.payload.Controll.CreateIndexRequest parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.vdaas.vald.payload.Controll.CreateIndexRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.vdaas.vald.payload.Controll.CreateIndexRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.vdaas.vald.payload.Controll.CreateIndexRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.vdaas.vald.payload.Controll.CreateIndexRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.vdaas.vald.payload.Controll.CreateIndexRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.vdaas.vald.payload.Controll.CreateIndexRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.vdaas.vald.payload.Controll.CreateIndexRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.vdaas.vald.payload.Controll.CreateIndexRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.vdaas.vald.payload.Controll.CreateIndexRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.vdaas.vald.payload.Controll.CreateIndexRequest parseFrom(
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
    public static Builder newBuilder(org.vdaas.vald.payload.Controll.CreateIndexRequest prototype) {
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
     * Protobuf type {@code payload.Controll.CreateIndexRequest}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:payload.Controll.CreateIndexRequest)
        org.vdaas.vald.payload.Controll.CreateIndexRequestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.vdaas.vald.payload.ValdPayload.internal_static_payload_Controll_CreateIndexRequest_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.vdaas.vald.payload.ValdPayload.internal_static_payload_Controll_CreateIndexRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.vdaas.vald.payload.Controll.CreateIndexRequest.class, org.vdaas.vald.payload.Controll.CreateIndexRequest.Builder.class);
      }

      // Construct using org.vdaas.vald.payload.Controll.CreateIndexRequest.newBuilder()
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
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        poolSize_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.vdaas.vald.payload.ValdPayload.internal_static_payload_Controll_CreateIndexRequest_descriptor;
      }

      @java.lang.Override
      public org.vdaas.vald.payload.Controll.CreateIndexRequest getDefaultInstanceForType() {
        return org.vdaas.vald.payload.Controll.CreateIndexRequest.getDefaultInstance();
      }

      @java.lang.Override
      public org.vdaas.vald.payload.Controll.CreateIndexRequest build() {
        org.vdaas.vald.payload.Controll.CreateIndexRequest result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.vdaas.vald.payload.Controll.CreateIndexRequest buildPartial() {
        org.vdaas.vald.payload.Controll.CreateIndexRequest result = new org.vdaas.vald.payload.Controll.CreateIndexRequest(this);
        result.poolSize_ = poolSize_;
        onBuilt();
        return result;
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
        if (other instanceof org.vdaas.vald.payload.Controll.CreateIndexRequest) {
          return mergeFrom((org.vdaas.vald.payload.Controll.CreateIndexRequest)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.vdaas.vald.payload.Controll.CreateIndexRequest other) {
        if (other == org.vdaas.vald.payload.Controll.CreateIndexRequest.getDefaultInstance()) return this;
        if (other.getPoolSize() != 0) {
          setPoolSize(other.getPoolSize());
        }
        this.mergeUnknownFields(other.unknownFields);
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
        org.vdaas.vald.payload.Controll.CreateIndexRequest parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.vdaas.vald.payload.Controll.CreateIndexRequest) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int poolSize_ ;
      /**
       * <code>uint32 pool_size = 1 [(.validate.rules) = { ... }</code>
       * @return The poolSize.
       */
      public int getPoolSize() {
        return poolSize_;
      }
      /**
       * <code>uint32 pool_size = 1 [(.validate.rules) = { ... }</code>
       * @param value The poolSize to set.
       * @return This builder for chaining.
       */
      public Builder setPoolSize(int value) {
        
        poolSize_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 pool_size = 1 [(.validate.rules) = { ... }</code>
       * @return This builder for chaining.
       */
      public Builder clearPoolSize() {
        
        poolSize_ = 0;
        onChanged();
        return this;
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


      // @@protoc_insertion_point(builder_scope:payload.Controll.CreateIndexRequest)
    }

    // @@protoc_insertion_point(class_scope:payload.Controll.CreateIndexRequest)
    private static final org.vdaas.vald.payload.Controll.CreateIndexRequest DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.vdaas.vald.payload.Controll.CreateIndexRequest();
    }

    public static org.vdaas.vald.payload.Controll.CreateIndexRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<CreateIndexRequest>
        PARSER = new com.google.protobuf.AbstractParser<CreateIndexRequest>() {
      @java.lang.Override
      public CreateIndexRequest parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new CreateIndexRequest(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<CreateIndexRequest> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CreateIndexRequest> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.vdaas.vald.payload.Controll.CreateIndexRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

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
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.vdaas.vald.payload.Controll)) {
      return super.equals(obj);
    }
    org.vdaas.vald.payload.Controll other = (org.vdaas.vald.payload.Controll) obj;

    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.vdaas.vald.payload.Controll parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.vdaas.vald.payload.Controll parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.vdaas.vald.payload.Controll parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.vdaas.vald.payload.Controll parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.vdaas.vald.payload.Controll parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.vdaas.vald.payload.Controll parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.vdaas.vald.payload.Controll parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.vdaas.vald.payload.Controll parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.vdaas.vald.payload.Controll parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.vdaas.vald.payload.Controll parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.vdaas.vald.payload.Controll parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.vdaas.vald.payload.Controll parseFrom(
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
  public static Builder newBuilder(org.vdaas.vald.payload.Controll prototype) {
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
   * Protobuf type {@code payload.Controll}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:payload.Controll)
      org.vdaas.vald.payload.ControllOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.vdaas.vald.payload.ValdPayload.internal_static_payload_Controll_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.vdaas.vald.payload.ValdPayload.internal_static_payload_Controll_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.vdaas.vald.payload.Controll.class, org.vdaas.vald.payload.Controll.Builder.class);
    }

    // Construct using org.vdaas.vald.payload.Controll.newBuilder()
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
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.vdaas.vald.payload.ValdPayload.internal_static_payload_Controll_descriptor;
    }

    @java.lang.Override
    public org.vdaas.vald.payload.Controll getDefaultInstanceForType() {
      return org.vdaas.vald.payload.Controll.getDefaultInstance();
    }

    @java.lang.Override
    public org.vdaas.vald.payload.Controll build() {
      org.vdaas.vald.payload.Controll result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.vdaas.vald.payload.Controll buildPartial() {
      org.vdaas.vald.payload.Controll result = new org.vdaas.vald.payload.Controll(this);
      onBuilt();
      return result;
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
      if (other instanceof org.vdaas.vald.payload.Controll) {
        return mergeFrom((org.vdaas.vald.payload.Controll)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.vdaas.vald.payload.Controll other) {
      if (other == org.vdaas.vald.payload.Controll.getDefaultInstance()) return this;
      this.mergeUnknownFields(other.unknownFields);
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
      org.vdaas.vald.payload.Controll parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.vdaas.vald.payload.Controll) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
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


    // @@protoc_insertion_point(builder_scope:payload.Controll)
  }

  // @@protoc_insertion_point(class_scope:payload.Controll)
  private static final org.vdaas.vald.payload.Controll DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.vdaas.vald.payload.Controll();
  }

  public static org.vdaas.vald.payload.Controll getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Controll>
      PARSER = new com.google.protobuf.AbstractParser<Controll>() {
    @java.lang.Override
    public Controll parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Controll(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Controll> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Controll> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.vdaas.vald.payload.Controll getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

