// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: statistics.proto

package org.tensorflow.metadata.v0;

/**
 * <pre>
 * Statistics for a weighted string feature in a dataset.
 * </pre>
 *
 * Protobuf type {@code tensorflow.metadata.v0.WeightedStringStatistics}
 */
public final class WeightedStringStatistics extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tensorflow.metadata.v0.WeightedStringStatistics)
    WeightedStringStatisticsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use WeightedStringStatistics.newBuilder() to construct.
  private WeightedStringStatistics(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private WeightedStringStatistics() {
    topValues_ = java.util.Collections.emptyList();
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new WeightedStringStatistics();
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private WeightedStringStatistics(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new NullPointerException();
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
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              topValues_ = new java.util.ArrayList<StringStatistics.FreqAndValue>();
              mutable_bitField0_ |= 0x00000001;
            }
            topValues_.add(
                input.readMessage(StringStatistics.FreqAndValue.parser(), extensionRegistry));
            break;
          }
          case 18: {
            RankHistogram.Builder subBuilder = null;
            if (rankHistogram_ != null) {
              subBuilder = rankHistogram_.toBuilder();
            }
            rankHistogram_ = input.readMessage(RankHistogram.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(rankHistogram_);
              rankHistogram_ = subBuilder.buildPartial();
            }

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
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        topValues_ = java.util.Collections.unmodifiableList(topValues_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return Statistics.internal_static_tensorflow_metadata_v0_WeightedStringStatistics_descriptor;
  }

  @Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return Statistics.internal_static_tensorflow_metadata_v0_WeightedStringStatistics_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            WeightedStringStatistics.class, Builder.class);
  }

  public static final int TOP_VALUES_FIELD_NUMBER = 1;
  private java.util.List<StringStatistics.FreqAndValue> topValues_;
  /**
   * <pre>
   * A sorted list of the most-frequent values and their weighted frequencies,
   * with the most-frequent being first.
   * </pre>
   *
   * <code>repeated .tensorflow.metadata.v0.StringStatistics.FreqAndValue top_values = 1;</code>
   */
  @Override
  public java.util.List<StringStatistics.FreqAndValue> getTopValuesList() {
    return topValues_;
  }
  /**
   * <pre>
   * A sorted list of the most-frequent values and their weighted frequencies,
   * with the most-frequent being first.
   * </pre>
   *
   * <code>repeated .tensorflow.metadata.v0.StringStatistics.FreqAndValue top_values = 1;</code>
   */
  @Override
  public java.util.List<? extends StringStatistics.FreqAndValueOrBuilder>
      getTopValuesOrBuilderList() {
    return topValues_;
  }
  /**
   * <pre>
   * A sorted list of the most-frequent values and their weighted frequencies,
   * with the most-frequent being first.
   * </pre>
   *
   * <code>repeated .tensorflow.metadata.v0.StringStatistics.FreqAndValue top_values = 1;</code>
   */
  @Override
  public int getTopValuesCount() {
    return topValues_.size();
  }
  /**
   * <pre>
   * A sorted list of the most-frequent values and their weighted frequencies,
   * with the most-frequent being first.
   * </pre>
   *
   * <code>repeated .tensorflow.metadata.v0.StringStatistics.FreqAndValue top_values = 1;</code>
   */
  @Override
  public StringStatistics.FreqAndValue getTopValues(int index) {
    return topValues_.get(index);
  }
  /**
   * <pre>
   * A sorted list of the most-frequent values and their weighted frequencies,
   * with the most-frequent being first.
   * </pre>
   *
   * <code>repeated .tensorflow.metadata.v0.StringStatistics.FreqAndValue top_values = 1;</code>
   */
  @Override
  public StringStatistics.FreqAndValueOrBuilder getTopValuesOrBuilder(
      int index) {
    return topValues_.get(index);
  }

  public static final int RANK_HISTOGRAM_FIELD_NUMBER = 2;
  private RankHistogram rankHistogram_;
  /**
   * <pre>
   * The rank histogram for the weighted values of the feature.
   * </pre>
   *
   * <code>.tensorflow.metadata.v0.RankHistogram rank_histogram = 2;</code>
   * @return Whether the rankHistogram field is set.
   */
  @Override
  public boolean hasRankHistogram() {
    return rankHistogram_ != null;
  }
  /**
   * <pre>
   * The rank histogram for the weighted values of the feature.
   * </pre>
   *
   * <code>.tensorflow.metadata.v0.RankHistogram rank_histogram = 2;</code>
   * @return The rankHistogram.
   */
  @Override
  public RankHistogram getRankHistogram() {
    return rankHistogram_ == null ? RankHistogram.getDefaultInstance() : rankHistogram_;
  }
  /**
   * <pre>
   * The rank histogram for the weighted values of the feature.
   * </pre>
   *
   * <code>.tensorflow.metadata.v0.RankHistogram rank_histogram = 2;</code>
   */
  @Override
  public RankHistogramOrBuilder getRankHistogramOrBuilder() {
    return getRankHistogram();
  }

  private byte memoizedIsInitialized = -1;
  @Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < topValues_.size(); i++) {
      output.writeMessage(1, topValues_.get(i));
    }
    if (rankHistogram_ != null) {
      output.writeMessage(2, getRankHistogram());
    }
    unknownFields.writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < topValues_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, topValues_.get(i));
    }
    if (rankHistogram_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getRankHistogram());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @Override
  public boolean equals(final Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof WeightedStringStatistics)) {
      return super.equals(obj);
    }
    WeightedStringStatistics other = (WeightedStringStatistics) obj;

    if (!getTopValuesList()
        .equals(other.getTopValuesList())) return false;
    if (hasRankHistogram() != other.hasRankHistogram()) return false;
    if (hasRankHistogram()) {
      if (!getRankHistogram()
          .equals(other.getRankHistogram())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getTopValuesCount() > 0) {
      hash = (37 * hash) + TOP_VALUES_FIELD_NUMBER;
      hash = (53 * hash) + getTopValuesList().hashCode();
    }
    if (hasRankHistogram()) {
      hash = (37 * hash) + RANK_HISTOGRAM_FIELD_NUMBER;
      hash = (53 * hash) + getRankHistogram().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static WeightedStringStatistics parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static WeightedStringStatistics parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static WeightedStringStatistics parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static WeightedStringStatistics parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static WeightedStringStatistics parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static WeightedStringStatistics parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static WeightedStringStatistics parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static WeightedStringStatistics parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static WeightedStringStatistics parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static WeightedStringStatistics parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static WeightedStringStatistics parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static WeightedStringStatistics parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(WeightedStringStatistics prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Statistics for a weighted string feature in a dataset.
   * </pre>
   *
   * Protobuf type {@code tensorflow.metadata.v0.WeightedStringStatistics}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tensorflow.metadata.v0.WeightedStringStatistics)
      WeightedStringStatisticsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return Statistics.internal_static_tensorflow_metadata_v0_WeightedStringStatistics_descriptor;
    }

    @Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return Statistics.internal_static_tensorflow_metadata_v0_WeightedStringStatistics_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              WeightedStringStatistics.class, Builder.class);
    }

    // Construct using org.tensorflow.metadata.v0.WeightedStringStatistics.newBuilder()
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
        getTopValuesFieldBuilder();
      }
    }
    @Override
    public Builder clear() {
      super.clear();
      if (topValuesBuilder_ == null) {
        topValues_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        topValuesBuilder_.clear();
      }
      if (rankHistogramBuilder_ == null) {
        rankHistogram_ = null;
      } else {
        rankHistogram_ = null;
        rankHistogramBuilder_ = null;
      }
      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return Statistics.internal_static_tensorflow_metadata_v0_WeightedStringStatistics_descriptor;
    }

    @Override
    public WeightedStringStatistics getDefaultInstanceForType() {
      return WeightedStringStatistics.getDefaultInstance();
    }

    @Override
    public WeightedStringStatistics build() {
      WeightedStringStatistics result = buildPartial();
      if (!result.isInitialized()) {
        throw Builder.newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public WeightedStringStatistics buildPartial() {
      WeightedStringStatistics result = new WeightedStringStatistics(this);
      int from_bitField0_ = bitField0_;
      if (topValuesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          topValues_ = java.util.Collections.unmodifiableList(topValues_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.topValues_ = topValues_;
      } else {
        result.topValues_ = topValuesBuilder_.build();
      }
      if (rankHistogramBuilder_ == null) {
        result.rankHistogram_ = rankHistogram_;
      } else {
        result.rankHistogram_ = rankHistogramBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @Override
    public Builder clone() {
      return super.clone();
    }
    @Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return super.setField(field, value);
    }
    @Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return super.addRepeatedField(field, value);
    }
    @Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof WeightedStringStatistics) {
        return mergeFrom((WeightedStringStatistics)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(WeightedStringStatistics other) {
      if (other == WeightedStringStatistics.getDefaultInstance()) return this;
      if (topValuesBuilder_ == null) {
        if (!other.topValues_.isEmpty()) {
          if (topValues_.isEmpty()) {
            topValues_ = other.topValues_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureTopValuesIsMutable();
            topValues_.addAll(other.topValues_);
          }
          onChanged();
        }
      } else {
        if (!other.topValues_.isEmpty()) {
          if (topValuesBuilder_.isEmpty()) {
            topValuesBuilder_.dispose();
            topValuesBuilder_ = null;
            topValues_ = other.topValues_;
            bitField0_ = (bitField0_ & ~0x00000001);
            topValuesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getTopValuesFieldBuilder() : null;
          } else {
            topValuesBuilder_.addAllMessages(other.topValues_);
          }
        }
      }
      if (other.hasRankHistogram()) {
        mergeRankHistogram(other.getRankHistogram());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @Override
    public final boolean isInitialized() {
      return true;
    }

    @Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      WeightedStringStatistics parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (WeightedStringStatistics) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<StringStatistics.FreqAndValue> topValues_ =
      java.util.Collections.emptyList();
    private void ensureTopValuesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        topValues_ = new java.util.ArrayList<StringStatistics.FreqAndValue>(topValues_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        StringStatistics.FreqAndValue, StringStatistics.FreqAndValue.Builder, StringStatistics.FreqAndValueOrBuilder> topValuesBuilder_;

    /**
     * <pre>
     * A sorted list of the most-frequent values and their weighted frequencies,
     * with the most-frequent being first.
     * </pre>
     *
     * <code>repeated .tensorflow.metadata.v0.StringStatistics.FreqAndValue top_values = 1;</code>
     */
    public java.util.List<StringStatistics.FreqAndValue> getTopValuesList() {
      if (topValuesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(topValues_);
      } else {
        return topValuesBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * A sorted list of the most-frequent values and their weighted frequencies,
     * with the most-frequent being first.
     * </pre>
     *
     * <code>repeated .tensorflow.metadata.v0.StringStatistics.FreqAndValue top_values = 1;</code>
     */
    public int getTopValuesCount() {
      if (topValuesBuilder_ == null) {
        return topValues_.size();
      } else {
        return topValuesBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * A sorted list of the most-frequent values and their weighted frequencies,
     * with the most-frequent being first.
     * </pre>
     *
     * <code>repeated .tensorflow.metadata.v0.StringStatistics.FreqAndValue top_values = 1;</code>
     */
    public StringStatistics.FreqAndValue getTopValues(int index) {
      if (topValuesBuilder_ == null) {
        return topValues_.get(index);
      } else {
        return topValuesBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * A sorted list of the most-frequent values and their weighted frequencies,
     * with the most-frequent being first.
     * </pre>
     *
     * <code>repeated .tensorflow.metadata.v0.StringStatistics.FreqAndValue top_values = 1;</code>
     */
    public Builder setTopValues(
        int index, StringStatistics.FreqAndValue value) {
      if (topValuesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTopValuesIsMutable();
        topValues_.set(index, value);
        onChanged();
      } else {
        topValuesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * A sorted list of the most-frequent values and their weighted frequencies,
     * with the most-frequent being first.
     * </pre>
     *
     * <code>repeated .tensorflow.metadata.v0.StringStatistics.FreqAndValue top_values = 1;</code>
     */
    public Builder setTopValues(
        int index, StringStatistics.FreqAndValue.Builder builderForValue) {
      if (topValuesBuilder_ == null) {
        ensureTopValuesIsMutable();
        topValues_.set(index, builderForValue.build());
        onChanged();
      } else {
        topValuesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * A sorted list of the most-frequent values and their weighted frequencies,
     * with the most-frequent being first.
     * </pre>
     *
     * <code>repeated .tensorflow.metadata.v0.StringStatistics.FreqAndValue top_values = 1;</code>
     */
    public Builder addTopValues(StringStatistics.FreqAndValue value) {
      if (topValuesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTopValuesIsMutable();
        topValues_.add(value);
        onChanged();
      } else {
        topValuesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * A sorted list of the most-frequent values and their weighted frequencies,
     * with the most-frequent being first.
     * </pre>
     *
     * <code>repeated .tensorflow.metadata.v0.StringStatistics.FreqAndValue top_values = 1;</code>
     */
    public Builder addTopValues(
        int index, StringStatistics.FreqAndValue value) {
      if (topValuesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTopValuesIsMutable();
        topValues_.add(index, value);
        onChanged();
      } else {
        topValuesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * A sorted list of the most-frequent values and their weighted frequencies,
     * with the most-frequent being first.
     * </pre>
     *
     * <code>repeated .tensorflow.metadata.v0.StringStatistics.FreqAndValue top_values = 1;</code>
     */
    public Builder addTopValues(
        StringStatistics.FreqAndValue.Builder builderForValue) {
      if (topValuesBuilder_ == null) {
        ensureTopValuesIsMutable();
        topValues_.add(builderForValue.build());
        onChanged();
      } else {
        topValuesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * A sorted list of the most-frequent values and their weighted frequencies,
     * with the most-frequent being first.
     * </pre>
     *
     * <code>repeated .tensorflow.metadata.v0.StringStatistics.FreqAndValue top_values = 1;</code>
     */
    public Builder addTopValues(
        int index, StringStatistics.FreqAndValue.Builder builderForValue) {
      if (topValuesBuilder_ == null) {
        ensureTopValuesIsMutable();
        topValues_.add(index, builderForValue.build());
        onChanged();
      } else {
        topValuesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * A sorted list of the most-frequent values and their weighted frequencies,
     * with the most-frequent being first.
     * </pre>
     *
     * <code>repeated .tensorflow.metadata.v0.StringStatistics.FreqAndValue top_values = 1;</code>
     */
    public Builder addAllTopValues(
        Iterable<? extends StringStatistics.FreqAndValue> values) {
      if (topValuesBuilder_ == null) {
        ensureTopValuesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, topValues_);
        onChanged();
      } else {
        topValuesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * A sorted list of the most-frequent values and their weighted frequencies,
     * with the most-frequent being first.
     * </pre>
     *
     * <code>repeated .tensorflow.metadata.v0.StringStatistics.FreqAndValue top_values = 1;</code>
     */
    public Builder clearTopValues() {
      if (topValuesBuilder_ == null) {
        topValues_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        topValuesBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * A sorted list of the most-frequent values and their weighted frequencies,
     * with the most-frequent being first.
     * </pre>
     *
     * <code>repeated .tensorflow.metadata.v0.StringStatistics.FreqAndValue top_values = 1;</code>
     */
    public Builder removeTopValues(int index) {
      if (topValuesBuilder_ == null) {
        ensureTopValuesIsMutable();
        topValues_.remove(index);
        onChanged();
      } else {
        topValuesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * A sorted list of the most-frequent values and their weighted frequencies,
     * with the most-frequent being first.
     * </pre>
     *
     * <code>repeated .tensorflow.metadata.v0.StringStatistics.FreqAndValue top_values = 1;</code>
     */
    public StringStatistics.FreqAndValue.Builder getTopValuesBuilder(
        int index) {
      return getTopValuesFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * A sorted list of the most-frequent values and their weighted frequencies,
     * with the most-frequent being first.
     * </pre>
     *
     * <code>repeated .tensorflow.metadata.v0.StringStatistics.FreqAndValue top_values = 1;</code>
     */
    public StringStatistics.FreqAndValueOrBuilder getTopValuesOrBuilder(
        int index) {
      if (topValuesBuilder_ == null) {
        return topValues_.get(index);  } else {
        return topValuesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * A sorted list of the most-frequent values and their weighted frequencies,
     * with the most-frequent being first.
     * </pre>
     *
     * <code>repeated .tensorflow.metadata.v0.StringStatistics.FreqAndValue top_values = 1;</code>
     */
    public java.util.List<? extends StringStatistics.FreqAndValueOrBuilder>
         getTopValuesOrBuilderList() {
      if (topValuesBuilder_ != null) {
        return topValuesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(topValues_);
      }
    }
    /**
     * <pre>
     * A sorted list of the most-frequent values and their weighted frequencies,
     * with the most-frequent being first.
     * </pre>
     *
     * <code>repeated .tensorflow.metadata.v0.StringStatistics.FreqAndValue top_values = 1;</code>
     */
    public StringStatistics.FreqAndValue.Builder addTopValuesBuilder() {
      return getTopValuesFieldBuilder().addBuilder(
          StringStatistics.FreqAndValue.getDefaultInstance());
    }
    /**
     * <pre>
     * A sorted list of the most-frequent values and their weighted frequencies,
     * with the most-frequent being first.
     * </pre>
     *
     * <code>repeated .tensorflow.metadata.v0.StringStatistics.FreqAndValue top_values = 1;</code>
     */
    public StringStatistics.FreqAndValue.Builder addTopValuesBuilder(
        int index) {
      return getTopValuesFieldBuilder().addBuilder(
          index, StringStatistics.FreqAndValue.getDefaultInstance());
    }
    /**
     * <pre>
     * A sorted list of the most-frequent values and their weighted frequencies,
     * with the most-frequent being first.
     * </pre>
     *
     * <code>repeated .tensorflow.metadata.v0.StringStatistics.FreqAndValue top_values = 1;</code>
     */
    public java.util.List<StringStatistics.FreqAndValue.Builder>
         getTopValuesBuilderList() {
      return getTopValuesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        StringStatistics.FreqAndValue, StringStatistics.FreqAndValue.Builder, StringStatistics.FreqAndValueOrBuilder>
        getTopValuesFieldBuilder() {
      if (topValuesBuilder_ == null) {
        topValuesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            StringStatistics.FreqAndValue, StringStatistics.FreqAndValue.Builder, StringStatistics.FreqAndValueOrBuilder>(
                topValues_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        topValues_ = null;
      }
      return topValuesBuilder_;
    }

    private RankHistogram rankHistogram_;
    private com.google.protobuf.SingleFieldBuilderV3<
        RankHistogram, RankHistogram.Builder, RankHistogramOrBuilder> rankHistogramBuilder_;
    /**
     * <pre>
     * The rank histogram for the weighted values of the feature.
     * </pre>
     *
     * <code>.tensorflow.metadata.v0.RankHistogram rank_histogram = 2;</code>
     * @return Whether the rankHistogram field is set.
     */
    public boolean hasRankHistogram() {
      return rankHistogramBuilder_ != null || rankHistogram_ != null;
    }
    /**
     * <pre>
     * The rank histogram for the weighted values of the feature.
     * </pre>
     *
     * <code>.tensorflow.metadata.v0.RankHistogram rank_histogram = 2;</code>
     * @return The rankHistogram.
     */
    public RankHistogram getRankHistogram() {
      if (rankHistogramBuilder_ == null) {
        return rankHistogram_ == null ? RankHistogram.getDefaultInstance() : rankHistogram_;
      } else {
        return rankHistogramBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The rank histogram for the weighted values of the feature.
     * </pre>
     *
     * <code>.tensorflow.metadata.v0.RankHistogram rank_histogram = 2;</code>
     */
    public Builder setRankHistogram(RankHistogram value) {
      if (rankHistogramBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        rankHistogram_ = value;
        onChanged();
      } else {
        rankHistogramBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The rank histogram for the weighted values of the feature.
     * </pre>
     *
     * <code>.tensorflow.metadata.v0.RankHistogram rank_histogram = 2;</code>
     */
    public Builder setRankHistogram(
        RankHistogram.Builder builderForValue) {
      if (rankHistogramBuilder_ == null) {
        rankHistogram_ = builderForValue.build();
        onChanged();
      } else {
        rankHistogramBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The rank histogram for the weighted values of the feature.
     * </pre>
     *
     * <code>.tensorflow.metadata.v0.RankHistogram rank_histogram = 2;</code>
     */
    public Builder mergeRankHistogram(RankHistogram value) {
      if (rankHistogramBuilder_ == null) {
        if (rankHistogram_ != null) {
          rankHistogram_ =
            RankHistogram.newBuilder(rankHistogram_).mergeFrom(value).buildPartial();
        } else {
          rankHistogram_ = value;
        }
        onChanged();
      } else {
        rankHistogramBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The rank histogram for the weighted values of the feature.
     * </pre>
     *
     * <code>.tensorflow.metadata.v0.RankHistogram rank_histogram = 2;</code>
     */
    public Builder clearRankHistogram() {
      if (rankHistogramBuilder_ == null) {
        rankHistogram_ = null;
        onChanged();
      } else {
        rankHistogram_ = null;
        rankHistogramBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The rank histogram for the weighted values of the feature.
     * </pre>
     *
     * <code>.tensorflow.metadata.v0.RankHistogram rank_histogram = 2;</code>
     */
    public RankHistogram.Builder getRankHistogramBuilder() {
      
      onChanged();
      return getRankHistogramFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The rank histogram for the weighted values of the feature.
     * </pre>
     *
     * <code>.tensorflow.metadata.v0.RankHistogram rank_histogram = 2;</code>
     */
    public RankHistogramOrBuilder getRankHistogramOrBuilder() {
      if (rankHistogramBuilder_ != null) {
        return rankHistogramBuilder_.getMessageOrBuilder();
      } else {
        return rankHistogram_ == null ?
            RankHistogram.getDefaultInstance() : rankHistogram_;
      }
    }
    /**
     * <pre>
     * The rank histogram for the weighted values of the feature.
     * </pre>
     *
     * <code>.tensorflow.metadata.v0.RankHistogram rank_histogram = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        RankHistogram, RankHistogram.Builder, RankHistogramOrBuilder>
        getRankHistogramFieldBuilder() {
      if (rankHistogramBuilder_ == null) {
        rankHistogramBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            RankHistogram, RankHistogram.Builder, RankHistogramOrBuilder>(
                getRankHistogram(),
                getParentForChildren(),
                isClean());
        rankHistogram_ = null;
      }
      return rankHistogramBuilder_;
    }
    @Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:tensorflow.metadata.v0.WeightedStringStatistics)
  }

  // @@protoc_insertion_point(class_scope:tensorflow.metadata.v0.WeightedStringStatistics)
  private static final WeightedStringStatistics DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new WeightedStringStatistics();
  }

  public static WeightedStringStatistics getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<WeightedStringStatistics>
      PARSER = new com.google.protobuf.AbstractParser<WeightedStringStatistics>() {
    @Override
    public WeightedStringStatistics parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new WeightedStringStatistics(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<WeightedStringStatistics> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<WeightedStringStatistics> getParserForType() {
    return PARSER;
  }

  @Override
  public WeightedStringStatistics getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

