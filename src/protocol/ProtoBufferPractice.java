// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: msg.proto

package protocol;

public final class ProtoBufferPractice {
  private ProtoBufferPractice() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface msgInfoOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required int32 ID = 1;
    /**
     * <code>required int32 ID = 1;</code>
     */
    boolean hasID();
    /**
     * <code>required int32 ID = 1;</code>
     */
    int getID();

    // required int64 GoodID = 2;
    /**
     * <code>required int64 GoodID = 2;</code>
     */
    boolean hasGoodID();
    /**
     * <code>required int64 GoodID = 2;</code>
     */
    long getGoodID();

    // required string Url = 3;
    /**
     * <code>required string Url = 3;</code>
     */
    boolean hasUrl();
    /**
     * <code>required string Url = 3;</code>
     */
    java.lang.String getUrl();
    /**
     * <code>required string Url = 3;</code>
     */
    com.google.protobuf.ByteString
        getUrlBytes();

    // required string Guid = 4;
    /**
     * <code>required string Guid = 4;</code>
     */
    boolean hasGuid();
    /**
     * <code>required string Guid = 4;</code>
     */
    java.lang.String getGuid();
    /**
     * <code>required string Guid = 4;</code>
     */
    com.google.protobuf.ByteString
        getGuidBytes();

    // required string Type = 5;
    /**
     * <code>required string Type = 5;</code>
     */
    boolean hasType();
    /**
     * <code>required string Type = 5;</code>
     */
    java.lang.String getType();
    /**
     * <code>required string Type = 5;</code>
     */
    com.google.protobuf.ByteString
        getTypeBytes();

    // required int32 Order = 6;
    /**
     * <code>required int32 Order = 6;</code>
     */
    boolean hasOrder();
    /**
     * <code>required int32 Order = 6;</code>
     */
    int getOrder();
  }
  /**
   * Protobuf type {@code protobuf.msgInfo}
   */
  public static final class msgInfo extends
      com.google.protobuf.GeneratedMessage
      implements msgInfoOrBuilder {
    // Use msgInfo.newBuilder() to construct.
    private msgInfo(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private msgInfo(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final msgInfo defaultInstance;
    public static msgInfo getDefaultInstance() {
      return defaultInstance;
    }

    public msgInfo getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private msgInfo(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
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
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              iD_ = input.readInt32();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              goodID_ = input.readInt64();
              break;
            }
            case 26: {
              bitField0_ |= 0x00000004;
              url_ = input.readBytes();
              break;
            }
            case 34: {
              bitField0_ |= 0x00000008;
              guid_ = input.readBytes();
              break;
            }
            case 42: {
              bitField0_ |= 0x00000010;
              type_ = input.readBytes();
              break;
            }
            case 48: {
              bitField0_ |= 0x00000020;
              order_ = input.readInt32();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return protocol.ProtoBufferPractice.internal_static_protobuf_msgInfo_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return protocol.ProtoBufferPractice.internal_static_protobuf_msgInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              protocol.ProtoBufferPractice.msgInfo.class, protocol.ProtoBufferPractice.msgInfo.Builder.class);
    }

    public static com.google.protobuf.Parser<msgInfo> PARSER =
        new com.google.protobuf.AbstractParser<msgInfo>() {
      public msgInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new msgInfo(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<msgInfo> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required int32 ID = 1;
    public static final int ID_FIELD_NUMBER = 1;
    private int iD_;
    /**
     * <code>required int32 ID = 1;</code>
     */
    public boolean hasID() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required int32 ID = 1;</code>
     */
    public int getID() {
      return iD_;
    }

    // required int64 GoodID = 2;
    public static final int GOODID_FIELD_NUMBER = 2;
    private long goodID_;
    /**
     * <code>required int64 GoodID = 2;</code>
     */
    public boolean hasGoodID() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required int64 GoodID = 2;</code>
     */
    public long getGoodID() {
      return goodID_;
    }

    // required string Url = 3;
    public static final int URL_FIELD_NUMBER = 3;
    private java.lang.Object url_;
    /**
     * <code>required string Url = 3;</code>
     */
    public boolean hasUrl() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>required string Url = 3;</code>
     */
    public java.lang.String getUrl() {
      java.lang.Object ref = url_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          url_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string Url = 3;</code>
     */
    public com.google.protobuf.ByteString
        getUrlBytes() {
      java.lang.Object ref = url_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        url_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    // required string Guid = 4;
    public static final int GUID_FIELD_NUMBER = 4;
    private java.lang.Object guid_;
    /**
     * <code>required string Guid = 4;</code>
     */
    public boolean hasGuid() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>required string Guid = 4;</code>
     */
    public java.lang.String getGuid() {
      java.lang.Object ref = guid_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          guid_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string Guid = 4;</code>
     */
    public com.google.protobuf.ByteString
        getGuidBytes() {
      java.lang.Object ref = guid_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        guid_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    // required string Type = 5;
    public static final int TYPE_FIELD_NUMBER = 5;
    private java.lang.Object type_;
    /**
     * <code>required string Type = 5;</code>
     */
    public boolean hasType() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     * <code>required string Type = 5;</code>
     */
    public java.lang.String getType() {
      java.lang.Object ref = type_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          type_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string Type = 5;</code>
     */
    public com.google.protobuf.ByteString
        getTypeBytes() {
      java.lang.Object ref = type_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        type_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    // required int32 Order = 6;
    public static final int ORDER_FIELD_NUMBER = 6;
    private int order_;
    /**
     * <code>required int32 Order = 6;</code>
     */
    public boolean hasOrder() {
      return ((bitField0_ & 0x00000020) == 0x00000020);
    }
    /**
     * <code>required int32 Order = 6;</code>
     */
    public int getOrder() {
      return order_;
    }

    private void initFields() {
      iD_ = 0;
      goodID_ = 0L;
      url_ = "";
      guid_ = "";
      type_ = "";
      order_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasID()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasGoodID()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasUrl()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasGuid()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasType()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasOrder()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt32(1, iD_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt64(2, goodID_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeBytes(3, getUrlBytes());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeBytes(4, getGuidBytes());
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeBytes(5, getTypeBytes());
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        output.writeInt32(6, order_);
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, iD_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(2, goodID_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(3, getUrlBytes());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(4, getGuidBytes());
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(5, getTypeBytes());
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(6, order_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static protocol.ProtoBufferPractice.msgInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static protocol.ProtoBufferPractice.msgInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static protocol.ProtoBufferPractice.msgInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static protocol.ProtoBufferPractice.msgInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static protocol.ProtoBufferPractice.msgInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static protocol.ProtoBufferPractice.msgInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static protocol.ProtoBufferPractice.msgInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static protocol.ProtoBufferPractice.msgInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static protocol.ProtoBufferPractice.msgInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static protocol.ProtoBufferPractice.msgInfo parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(protocol.ProtoBufferPractice.msgInfo prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code protobuf.msgInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements protocol.ProtoBufferPractice.msgInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return protocol.ProtoBufferPractice.internal_static_protobuf_msgInfo_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return protocol.ProtoBufferPractice.internal_static_protobuf_msgInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                protocol.ProtoBufferPractice.msgInfo.class, protocol.ProtoBufferPractice.msgInfo.Builder.class);
      }

      // Construct using protobuf.ProtoBufferPractice.msgInfo.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        iD_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        goodID_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000002);
        url_ = "";
        bitField0_ = (bitField0_ & ~0x00000004);
        guid_ = "";
        bitField0_ = (bitField0_ & ~0x00000008);
        type_ = "";
        bitField0_ = (bitField0_ & ~0x00000010);
        order_ = 0;
        bitField0_ = (bitField0_ & ~0x00000020);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return protocol.ProtoBufferPractice.internal_static_protobuf_msgInfo_descriptor;
      }

      public protocol.ProtoBufferPractice.msgInfo getDefaultInstanceForType() {
        return protocol.ProtoBufferPractice.msgInfo.getDefaultInstance();
      }

      public protocol.ProtoBufferPractice.msgInfo build() {
        protocol.ProtoBufferPractice.msgInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public protocol.ProtoBufferPractice.msgInfo buildPartial() {
        protocol.ProtoBufferPractice.msgInfo result = new protocol.ProtoBufferPractice.msgInfo(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.iD_ = iD_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.goodID_ = goodID_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.url_ = url_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.guid_ = guid_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.type_ = type_;
        if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
          to_bitField0_ |= 0x00000020;
        }
        result.order_ = order_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof protocol.ProtoBufferPractice.msgInfo) {
          return mergeFrom((protocol.ProtoBufferPractice.msgInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(protocol.ProtoBufferPractice.msgInfo other) {
        if (other == protocol.ProtoBufferPractice.msgInfo.getDefaultInstance()) return this;
        if (other.hasID()) {
          setID(other.getID());
        }
        if (other.hasGoodID()) {
          setGoodID(other.getGoodID());
        }
        if (other.hasUrl()) {
          bitField0_ |= 0x00000004;
          url_ = other.url_;
          onChanged();
        }
        if (other.hasGuid()) {
          bitField0_ |= 0x00000008;
          guid_ = other.guid_;
          onChanged();
        }
        if (other.hasType()) {
          bitField0_ |= 0x00000010;
          type_ = other.type_;
          onChanged();
        }
        if (other.hasOrder()) {
          setOrder(other.getOrder());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasID()) {
          
          return false;
        }
        if (!hasGoodID()) {
          
          return false;
        }
        if (!hasUrl()) {
          
          return false;
        }
        if (!hasGuid()) {
          
          return false;
        }
        if (!hasType()) {
          
          return false;
        }
        if (!hasOrder()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        protocol.ProtoBufferPractice.msgInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (protocol.ProtoBufferPractice.msgInfo) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required int32 ID = 1;
      private int iD_ ;
      /**
       * <code>required int32 ID = 1;</code>
       */
      public boolean hasID() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required int32 ID = 1;</code>
       */
      public int getID() {
        return iD_;
      }
      /**
       * <code>required int32 ID = 1;</code>
       */
      public Builder setID(int value) {
        bitField0_ |= 0x00000001;
        iD_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 ID = 1;</code>
       */
      public Builder clearID() {
        bitField0_ = (bitField0_ & ~0x00000001);
        iD_ = 0;
        onChanged();
        return this;
      }

      // required int64 GoodID = 2;
      private long goodID_ ;
      /**
       * <code>required int64 GoodID = 2;</code>
       */
      public boolean hasGoodID() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required int64 GoodID = 2;</code>
       */
      public long getGoodID() {
        return goodID_;
      }
      /**
       * <code>required int64 GoodID = 2;</code>
       */
      public Builder setGoodID(long value) {
        bitField0_ |= 0x00000002;
        goodID_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int64 GoodID = 2;</code>
       */
      public Builder clearGoodID() {
        bitField0_ = (bitField0_ & ~0x00000002);
        goodID_ = 0L;
        onChanged();
        return this;
      }

      // required string Url = 3;
      private java.lang.Object url_ = "";
      /**
       * <code>required string Url = 3;</code>
       */
      public boolean hasUrl() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>required string Url = 3;</code>
       */
      public java.lang.String getUrl() {
        java.lang.Object ref = url_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          url_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string Url = 3;</code>
       */
      public com.google.protobuf.ByteString
          getUrlBytes() {
        java.lang.Object ref = url_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          url_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string Url = 3;</code>
       */
      public Builder setUrl(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        url_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string Url = 3;</code>
       */
      public Builder clearUrl() {
        bitField0_ = (bitField0_ & ~0x00000004);
        url_ = getDefaultInstance().getUrl();
        onChanged();
        return this;
      }
      /**
       * <code>required string Url = 3;</code>
       */
      public Builder setUrlBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        url_ = value;
        onChanged();
        return this;
      }

      // required string Guid = 4;
      private java.lang.Object guid_ = "";
      /**
       * <code>required string Guid = 4;</code>
       */
      public boolean hasGuid() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>required string Guid = 4;</code>
       */
      public java.lang.String getGuid() {
        java.lang.Object ref = guid_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          guid_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string Guid = 4;</code>
       */
      public com.google.protobuf.ByteString
          getGuidBytes() {
        java.lang.Object ref = guid_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          guid_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string Guid = 4;</code>
       */
      public Builder setGuid(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        guid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string Guid = 4;</code>
       */
      public Builder clearGuid() {
        bitField0_ = (bitField0_ & ~0x00000008);
        guid_ = getDefaultInstance().getGuid();
        onChanged();
        return this;
      }
      /**
       * <code>required string Guid = 4;</code>
       */
      public Builder setGuidBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        guid_ = value;
        onChanged();
        return this;
      }

      // required string Type = 5;
      private java.lang.Object type_ = "";
      /**
       * <code>required string Type = 5;</code>
       */
      public boolean hasType() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      /**
       * <code>required string Type = 5;</code>
       */
      public java.lang.String getType() {
        java.lang.Object ref = type_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          type_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string Type = 5;</code>
       */
      public com.google.protobuf.ByteString
          getTypeBytes() {
        java.lang.Object ref = type_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          type_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string Type = 5;</code>
       */
      public Builder setType(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000010;
        type_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string Type = 5;</code>
       */
      public Builder clearType() {
        bitField0_ = (bitField0_ & ~0x00000010);
        type_ = getDefaultInstance().getType();
        onChanged();
        return this;
      }
      /**
       * <code>required string Type = 5;</code>
       */
      public Builder setTypeBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000010;
        type_ = value;
        onChanged();
        return this;
      }

      // required int32 Order = 6;
      private int order_ ;
      /**
       * <code>required int32 Order = 6;</code>
       */
      public boolean hasOrder() {
        return ((bitField0_ & 0x00000020) == 0x00000020);
      }
      /**
       * <code>required int32 Order = 6;</code>
       */
      public int getOrder() {
        return order_;
      }
      /**
       * <code>required int32 Order = 6;</code>
       */
      public Builder setOrder(int value) {
        bitField0_ |= 0x00000020;
        order_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 Order = 6;</code>
       */
      public Builder clearOrder() {
        bitField0_ = (bitField0_ & ~0x00000020);
        order_ = 0;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:protobuf.msgInfo)
    }

    static {
      defaultInstance = new msgInfo(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:protobuf.msgInfo)
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_protobuf_msgInfo_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_protobuf_msgInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\tmsg.proto\022\010protobuf\"]\n\007msgInfo\022\n\n\002ID\030\001" +
      " \002(\005\022\016\n\006GoodID\030\002 \002(\003\022\013\n\003Url\030\003 \002(\t\022\014\n\004Gui" +
      "d\030\004 \002(\t\022\014\n\004Type\030\005 \002(\t\022\r\n\005Order\030\006 \002(\005B\037\n\010" +
      "protobufB\023ProtoBufferPractice"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_protobuf_msgInfo_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_protobuf_msgInfo_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_protobuf_msgInfo_descriptor,
              new java.lang.String[] { "ID", "GoodID", "Url", "Guid", "Type", "Order", });
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}