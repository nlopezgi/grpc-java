// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: io/grpc/binarylog.proto

package io.grpc.binarylog;

/**
 * <pre>
 * Peer information
 * </pre>
 *
 * Protobuf type {@code grpc.binarylog.v1alpha.Peer}
 */
public  final class Peer extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:grpc.binarylog.v1alpha.Peer)
    PeerOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Peer.newBuilder() to construct.
  private Peer(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Peer() {
    peerType_ = 0;
    peer_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Peer(
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
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 8: {
            int rawValue = input.readEnum();

            peerType_ = rawValue;
            break;
          }
          case 18: {

            peer_ = input.readBytes();
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
    return io.grpc.binarylog.BinaryLogProto.internal_static_grpc_binarylog_v1alpha_Peer_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grpc.binarylog.BinaryLogProto.internal_static_grpc_binarylog_v1alpha_Peer_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grpc.binarylog.Peer.class, io.grpc.binarylog.Peer.Builder.class);
  }

  /**
   * Protobuf enum {@code grpc.binarylog.v1alpha.Peer.PeerType}
   */
  public enum PeerType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * peer is struct sockaddr_in
     * </pre>
     *
     * <code>PEER_IPV4 = 0;</code>
     */
    PEER_IPV4(0),
    /**
     * <pre>
     * peer is struct sockaddr_in6
     * </pre>
     *
     * <code>PEER_IPV6 = 1;</code>
     */
    PEER_IPV6(1),
    /**
     * <pre>
     * peer is struct sockaddr_un
     * </pre>
     *
     * <code>PEER_UNIX = 2;</code>
     */
    PEER_UNIX(2),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * peer is struct sockaddr_in
     * </pre>
     *
     * <code>PEER_IPV4 = 0;</code>
     */
    public static final int PEER_IPV4_VALUE = 0;
    /**
     * <pre>
     * peer is struct sockaddr_in6
     * </pre>
     *
     * <code>PEER_IPV6 = 1;</code>
     */
    public static final int PEER_IPV6_VALUE = 1;
    /**
     * <pre>
     * peer is struct sockaddr_un
     * </pre>
     *
     * <code>PEER_UNIX = 2;</code>
     */
    public static final int PEER_UNIX_VALUE = 2;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static PeerType valueOf(int value) {
      return forNumber(value);
    }

    public static PeerType forNumber(int value) {
      switch (value) {
        case 0: return PEER_IPV4;
        case 1: return PEER_IPV6;
        case 2: return PEER_UNIX;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<PeerType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        PeerType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<PeerType>() {
            public PeerType findValueByNumber(int number) {
              return PeerType.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return io.grpc.binarylog.Peer.getDescriptor().getEnumTypes().get(0);
    }

    private static final PeerType[] VALUES = values();

    public static PeerType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private PeerType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:grpc.binarylog.v1alpha.Peer.PeerType)
  }

  public static final int PEER_TYPE_FIELD_NUMBER = 1;
  private int peerType_;
  /**
   * <code>.grpc.binarylog.v1alpha.Peer.PeerType peer_type = 1;</code>
   */
  public int getPeerTypeValue() {
    return peerType_;
  }
  /**
   * <code>.grpc.binarylog.v1alpha.Peer.PeerType peer_type = 1;</code>
   */
  public io.grpc.binarylog.Peer.PeerType getPeerType() {
    io.grpc.binarylog.Peer.PeerType result = io.grpc.binarylog.Peer.PeerType.valueOf(peerType_);
    return result == null ? io.grpc.binarylog.Peer.PeerType.UNRECOGNIZED : result;
  }

  public static final int PEER_FIELD_NUMBER = 2;
  private com.google.protobuf.ByteString peer_;
  /**
   * <pre>
   * value depends on peer_type
   * </pre>
   *
   * <code>bytes peer = 2;</code>
   */
  public com.google.protobuf.ByteString getPeer() {
    return peer_;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (peerType_ != io.grpc.binarylog.Peer.PeerType.PEER_IPV4.getNumber()) {
      output.writeEnum(1, peerType_);
    }
    if (!peer_.isEmpty()) {
      output.writeBytes(2, peer_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (peerType_ != io.grpc.binarylog.Peer.PeerType.PEER_IPV4.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, peerType_);
    }
    if (!peer_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, peer_);
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
    if (!(obj instanceof io.grpc.binarylog.Peer)) {
      return super.equals(obj);
    }
    io.grpc.binarylog.Peer other = (io.grpc.binarylog.Peer) obj;

    boolean result = true;
    result = result && peerType_ == other.peerType_;
    result = result && getPeer()
        .equals(other.getPeer());
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
    hash = (37 * hash) + PEER_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + peerType_;
    hash = (37 * hash) + PEER_FIELD_NUMBER;
    hash = (53 * hash) + getPeer().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grpc.binarylog.Peer parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.binarylog.Peer parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.binarylog.Peer parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.binarylog.Peer parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.binarylog.Peer parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.binarylog.Peer parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.binarylog.Peer parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.binarylog.Peer parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.binarylog.Peer parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grpc.binarylog.Peer parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.binarylog.Peer parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.binarylog.Peer parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(io.grpc.binarylog.Peer prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
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
   * Peer information
   * </pre>
   *
   * Protobuf type {@code grpc.binarylog.v1alpha.Peer}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:grpc.binarylog.v1alpha.Peer)
      io.grpc.binarylog.PeerOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grpc.binarylog.BinaryLogProto.internal_static_grpc_binarylog_v1alpha_Peer_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grpc.binarylog.BinaryLogProto.internal_static_grpc_binarylog_v1alpha_Peer_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grpc.binarylog.Peer.class, io.grpc.binarylog.Peer.Builder.class);
    }

    // Construct using io.grpc.binarylog.Peer.newBuilder()
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
    public Builder clear() {
      super.clear();
      peerType_ = 0;

      peer_ = com.google.protobuf.ByteString.EMPTY;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grpc.binarylog.BinaryLogProto.internal_static_grpc_binarylog_v1alpha_Peer_descriptor;
    }

    public io.grpc.binarylog.Peer getDefaultInstanceForType() {
      return io.grpc.binarylog.Peer.getDefaultInstance();
    }

    public io.grpc.binarylog.Peer build() {
      io.grpc.binarylog.Peer result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public io.grpc.binarylog.Peer buildPartial() {
      io.grpc.binarylog.Peer result = new io.grpc.binarylog.Peer(this);
      result.peerType_ = peerType_;
      result.peer_ = peer_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.grpc.binarylog.Peer) {
        return mergeFrom((io.grpc.binarylog.Peer)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grpc.binarylog.Peer other) {
      if (other == io.grpc.binarylog.Peer.getDefaultInstance()) return this;
      if (other.peerType_ != 0) {
        setPeerTypeValue(other.getPeerTypeValue());
      }
      if (other.getPeer() != com.google.protobuf.ByteString.EMPTY) {
        setPeer(other.getPeer());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      io.grpc.binarylog.Peer parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grpc.binarylog.Peer) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int peerType_ = 0;
    /**
     * <code>.grpc.binarylog.v1alpha.Peer.PeerType peer_type = 1;</code>
     */
    public int getPeerTypeValue() {
      return peerType_;
    }
    /**
     * <code>.grpc.binarylog.v1alpha.Peer.PeerType peer_type = 1;</code>
     */
    public Builder setPeerTypeValue(int value) {
      peerType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.grpc.binarylog.v1alpha.Peer.PeerType peer_type = 1;</code>
     */
    public io.grpc.binarylog.Peer.PeerType getPeerType() {
      io.grpc.binarylog.Peer.PeerType result = io.grpc.binarylog.Peer.PeerType.valueOf(peerType_);
      return result == null ? io.grpc.binarylog.Peer.PeerType.UNRECOGNIZED : result;
    }
    /**
     * <code>.grpc.binarylog.v1alpha.Peer.PeerType peer_type = 1;</code>
     */
    public Builder setPeerType(io.grpc.binarylog.Peer.PeerType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      peerType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.grpc.binarylog.v1alpha.Peer.PeerType peer_type = 1;</code>
     */
    public Builder clearPeerType() {
      
      peerType_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString peer_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * value depends on peer_type
     * </pre>
     *
     * <code>bytes peer = 2;</code>
     */
    public com.google.protobuf.ByteString getPeer() {
      return peer_;
    }
    /**
     * <pre>
     * value depends on peer_type
     * </pre>
     *
     * <code>bytes peer = 2;</code>
     */
    public Builder setPeer(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      peer_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * value depends on peer_type
     * </pre>
     *
     * <code>bytes peer = 2;</code>
     */
    public Builder clearPeer() {
      
      peer_ = getDefaultInstance().getPeer();
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:grpc.binarylog.v1alpha.Peer)
  }

  // @@protoc_insertion_point(class_scope:grpc.binarylog.v1alpha.Peer)
  private static final io.grpc.binarylog.Peer DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grpc.binarylog.Peer();
  }

  public static io.grpc.binarylog.Peer getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Peer>
      PARSER = new com.google.protobuf.AbstractParser<Peer>() {
    public Peer parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Peer(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Peer> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Peer> getParserForType() {
    return PARSER;
  }

  public io.grpc.binarylog.Peer getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
