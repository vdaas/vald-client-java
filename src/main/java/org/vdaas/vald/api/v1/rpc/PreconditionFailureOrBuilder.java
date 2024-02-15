// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v1/rpc/errdetails/error_details.proto

// Protobuf Java Version: 3.25.2
package org.vdaas.vald.api.v1.rpc;

public interface PreconditionFailureOrBuilder extends
    // @@protoc_insertion_point(interface_extends:rpc.v1.PreconditionFailure)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Describes all precondition violations.
   * </pre>
   *
   * <code>repeated .rpc.v1.PreconditionFailure.Violation violations = 1 [json_name = "violations"];</code>
   */
  java.util.List<org.vdaas.vald.api.v1.rpc.PreconditionFailure.Violation> 
      getViolationsList();
  /**
   * <pre>
   * Describes all precondition violations.
   * </pre>
   *
   * <code>repeated .rpc.v1.PreconditionFailure.Violation violations = 1 [json_name = "violations"];</code>
   */
  org.vdaas.vald.api.v1.rpc.PreconditionFailure.Violation getViolations(int index);
  /**
   * <pre>
   * Describes all precondition violations.
   * </pre>
   *
   * <code>repeated .rpc.v1.PreconditionFailure.Violation violations = 1 [json_name = "violations"];</code>
   */
  int getViolationsCount();
  /**
   * <pre>
   * Describes all precondition violations.
   * </pre>
   *
   * <code>repeated .rpc.v1.PreconditionFailure.Violation violations = 1 [json_name = "violations"];</code>
   */
  java.util.List<? extends org.vdaas.vald.api.v1.rpc.PreconditionFailure.ViolationOrBuilder> 
      getViolationsOrBuilderList();
  /**
   * <pre>
   * Describes all precondition violations.
   * </pre>
   *
   * <code>repeated .rpc.v1.PreconditionFailure.Violation violations = 1 [json_name = "violations"];</code>
   */
  org.vdaas.vald.api.v1.rpc.PreconditionFailure.ViolationOrBuilder getViolationsOrBuilder(
      int index);
}
