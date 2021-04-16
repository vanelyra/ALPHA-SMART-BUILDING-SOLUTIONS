// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: energyEfficiency.proto

package grpc.services.energy;

/**
 * Protobuf type {@code energy.LightsResponse}
 */
public  final class LightsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:energy.LightsResponse)
    LightsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LightsResponse.newBuilder() to construct.
  private LightsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LightsResponse() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private LightsResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
          case 10: {
            grpc.services.energy.Lights.Builder subBuilder = null;
            if (light_ != null) {
              subBuilder = light_.toBuilder();
            }
            light_ = input.readMessage(grpc.services.energy.Lights.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(light_);
              light_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
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
    return grpc.services.energy.EnergyServiceImpl.internal_static_energy_LightsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return grpc.services.energy.EnergyServiceImpl.internal_static_energy_LightsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            grpc.services.energy.LightsResponse.class, grpc.services.energy.LightsResponse.Builder.class);
  }

  public static final int LIGHT_FIELD_NUMBER = 1;
  private grpc.services.energy.Lights light_;
  /**
   * <code>.energy.Lights light = 1;</code>
   */
  public boolean hasLight() {
    return light_ != null;
  }
  /**
   * <code>.energy.Lights light = 1;</code>
   */
  public grpc.services.energy.Lights getLight() {
    return light_ == null ? grpc.services.energy.Lights.getDefaultInstance() : light_;
  }
  /**
   * <code>.energy.Lights light = 1;</code>
   */
  public grpc.services.energy.LightsOrBuilder getLightOrBuilder() {
    return getLight();
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
    if (light_ != null) {
      output.writeMessage(1, getLight());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (light_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getLight());
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
    if (!(obj instanceof grpc.services.energy.LightsResponse)) {
      return super.equals(obj);
    }
    grpc.services.energy.LightsResponse other = (grpc.services.energy.LightsResponse) obj;

    boolean result = true;
    result = result && (hasLight() == other.hasLight());
    if (hasLight()) {
      result = result && getLight()
          .equals(other.getLight());
    }
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasLight()) {
      hash = (37 * hash) + LIGHT_FIELD_NUMBER;
      hash = (53 * hash) + getLight().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static grpc.services.energy.LightsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.services.energy.LightsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.services.energy.LightsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.services.energy.LightsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.services.energy.LightsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.services.energy.LightsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.services.energy.LightsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static grpc.services.energy.LightsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static grpc.services.energy.LightsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static grpc.services.energy.LightsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static grpc.services.energy.LightsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static grpc.services.energy.LightsResponse parseFrom(
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
  public static Builder newBuilder(grpc.services.energy.LightsResponse prototype) {
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
   * Protobuf type {@code energy.LightsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:energy.LightsResponse)
      grpc.services.energy.LightsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return grpc.services.energy.EnergyServiceImpl.internal_static_energy_LightsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return grpc.services.energy.EnergyServiceImpl.internal_static_energy_LightsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              grpc.services.energy.LightsResponse.class, grpc.services.energy.LightsResponse.Builder.class);
    }

    // Construct using grpc.services.energy.LightsResponse.newBuilder()
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
      if (lightBuilder_ == null) {
        light_ = null;
      } else {
        light_ = null;
        lightBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return grpc.services.energy.EnergyServiceImpl.internal_static_energy_LightsResponse_descriptor;
    }

    @java.lang.Override
    public grpc.services.energy.LightsResponse getDefaultInstanceForType() {
      return grpc.services.energy.LightsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public grpc.services.energy.LightsResponse build() {
      grpc.services.energy.LightsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public grpc.services.energy.LightsResponse buildPartial() {
      grpc.services.energy.LightsResponse result = new grpc.services.energy.LightsResponse(this);
      if (lightBuilder_ == null) {
        result.light_ = light_;
      } else {
        result.light_ = lightBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof grpc.services.energy.LightsResponse) {
        return mergeFrom((grpc.services.energy.LightsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(grpc.services.energy.LightsResponse other) {
      if (other == grpc.services.energy.LightsResponse.getDefaultInstance()) return this;
      if (other.hasLight()) {
        mergeLight(other.getLight());
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
      grpc.services.energy.LightsResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (grpc.services.energy.LightsResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private grpc.services.energy.Lights light_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        grpc.services.energy.Lights, grpc.services.energy.Lights.Builder, grpc.services.energy.LightsOrBuilder> lightBuilder_;
    /**
     * <code>.energy.Lights light = 1;</code>
     */
    public boolean hasLight() {
      return lightBuilder_ != null || light_ != null;
    }
    /**
     * <code>.energy.Lights light = 1;</code>
     */
    public grpc.services.energy.Lights getLight() {
      if (lightBuilder_ == null) {
        return light_ == null ? grpc.services.energy.Lights.getDefaultInstance() : light_;
      } else {
        return lightBuilder_.getMessage();
      }
    }
    /**
     * <code>.energy.Lights light = 1;</code>
     */
    public Builder setLight(grpc.services.energy.Lights value) {
      if (lightBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        light_ = value;
        onChanged();
      } else {
        lightBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.energy.Lights light = 1;</code>
     */
    public Builder setLight(
        grpc.services.energy.Lights.Builder builderForValue) {
      if (lightBuilder_ == null) {
        light_ = builderForValue.build();
        onChanged();
      } else {
        lightBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.energy.Lights light = 1;</code>
     */
    public Builder mergeLight(grpc.services.energy.Lights value) {
      if (lightBuilder_ == null) {
        if (light_ != null) {
          light_ =
            grpc.services.energy.Lights.newBuilder(light_).mergeFrom(value).buildPartial();
        } else {
          light_ = value;
        }
        onChanged();
      } else {
        lightBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.energy.Lights light = 1;</code>
     */
    public Builder clearLight() {
      if (lightBuilder_ == null) {
        light_ = null;
        onChanged();
      } else {
        light_ = null;
        lightBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.energy.Lights light = 1;</code>
     */
    public grpc.services.energy.Lights.Builder getLightBuilder() {
      
      onChanged();
      return getLightFieldBuilder().getBuilder();
    }
    /**
     * <code>.energy.Lights light = 1;</code>
     */
    public grpc.services.energy.LightsOrBuilder getLightOrBuilder() {
      if (lightBuilder_ != null) {
        return lightBuilder_.getMessageOrBuilder();
      } else {
        return light_ == null ?
            grpc.services.energy.Lights.getDefaultInstance() : light_;
      }
    }
    /**
     * <code>.energy.Lights light = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        grpc.services.energy.Lights, grpc.services.energy.Lights.Builder, grpc.services.energy.LightsOrBuilder> 
        getLightFieldBuilder() {
      if (lightBuilder_ == null) {
        lightBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            grpc.services.energy.Lights, grpc.services.energy.Lights.Builder, grpc.services.energy.LightsOrBuilder>(
                getLight(),
                getParentForChildren(),
                isClean());
        light_ = null;
      }
      return lightBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:energy.LightsResponse)
  }

  // @@protoc_insertion_point(class_scope:energy.LightsResponse)
  private static final grpc.services.energy.LightsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new grpc.services.energy.LightsResponse();
  }

  public static grpc.services.energy.LightsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LightsResponse>
      PARSER = new com.google.protobuf.AbstractParser<LightsResponse>() {
    @java.lang.Override
    public LightsResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new LightsResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<LightsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LightsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public grpc.services.energy.LightsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

