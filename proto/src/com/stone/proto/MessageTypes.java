// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MessageType.proto

package com.stone.proto;

public final class MessageTypes {
  private MessageTypes() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  /**
   * Protobuf enum {@code MessageType}
   *
   * <pre>
   * 消息类型;
   * </pre>
   */
  public enum MessageType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>SERVER_REGISTER_REQUEST = 100;</code>
     *
     * <pre>
     * server
     * </pre>
     */
    SERVER_REGISTER_REQUEST(0, 100),
    /**
     * <code>GAME_REGISTER_TO_AGENT = 101;</code>
     *
     * <pre>
     * game register to agent
     * </pre>
     */
    GAME_REGISTER_TO_AGENT(1, 101),
    /**
     * <code>AG_PLAYER_LOGOUT = 200;</code>
     *
     * <pre>
     * AG-GA 200-300
     * </pre>
     */
    AG_PLAYER_LOGOUT(2, 200),
    /**
     * <code>GA_PLAYER_LOGOUT_OK = 201;</code>
     */
    GA_PLAYER_LOGOUT_OK(3, 201),
    /**
     * <code>AG_FORWARD_BEGIN = 1000;</code>
     *
     * <pre>
     * AGForward begin - end
     * </pre>
     */
    AG_FORWARD_BEGIN(4, 1000),
    /**
     * <code>AG_FORWARD_END = 10000;</code>
     */
    AG_FORWARD_END(5, 10000),
    /**
     * <code>CG_PLAYER_LOGIN = 1001;</code>
     *
     * <pre>
     * request login
     * </pre>
     */
    CG_PLAYER_LOGIN(6, 1001),
    /**
     * <code>GC_PLAYER_LOGIN_RESULT = 1002;</code>
     *
     * <pre>
     * login result
     * </pre>
     */
    GC_PLAYER_LOGIN_RESULT(7, 1002),
    /**
     * <code>CG_GET_ROLE_LIST = 1003;</code>
     *
     * <pre>
     * get role list
     * </pre>
     */
    CG_GET_ROLE_LIST(8, 1003),
    /**
     * <code>GC_GET_ROLE_LIST = 1004;</code>
     *
     * <pre>
     * return role list
     * </pre>
     */
    GC_GET_ROLE_LIST(9, 1004),
    /**
     * <code>CG_SELECT_ROLE = 1005;</code>
     *
     * <pre>
     * select role
     * </pre>
     */
    CG_SELECT_ROLE(10, 1005),
    /**
     * <code>GC_ROLE_INFO = 1006;</code>
     *
     * <pre>
     * role info
     * </pre>
     */
    GC_ROLE_INFO(11, 1006),
    /**
     * <code>CG_CREATE_ROLE = 1007;</code>
     *
     * <pre>
     * create role
     * </pre>
     */
    CG_CREATE_ROLE(12, 1007),
    /**
     * <code>GC_CREATE_ROLE_RESULT = 1008;</code>
     *
     * <pre>
     * create role result
     * </pre>
     */
    GC_CREATE_ROLE_RESULT(13, 1008),
    /**
     * <code>GC_ENTER_SCENE = 1009;</code>
     *
     * <pre>
     * enter scene
     * </pre>
     */
    GC_ENTER_SCENE(14, 1009),
    /**
     * <code>CG_ENTER_SCENE_READY = 1010;</code>
     *
     * <pre>
     * enter scene ready
     * </pre>
     */
    CG_ENTER_SCENE_READY(15, 1010),
    /**
     * <code>CG_SYNC = 1011;</code>
     *
     * <pre>
     * sync
     * </pre>
     */
    CG_SYNC(16, 1011),
    /**
     * <code>GC_SYNC = 1012;</code>
     *
     * <pre>
     * sync
     * </pre>
     */
    GC_SYNC(17, 1012),
    /**
     * <code>CG_REQUEST_MOVE = 1013;</code>
     *
     * <pre>
     * CG_REQUEST_MOVE
     * </pre>
     */
    CG_REQUEST_MOVE(18, 1013),
    /**
     * <code>GC_BROADCAST_MOVE = 1014;</code>
     *
     * <pre>
     * GC_BROADCAST_MOVE
     * </pre>
     */
    GC_BROADCAST_MOVE(19, 1014),
    /**
     * <code>GC_SCENE_OBJECT_APPEAR = 1015;</code>
     *
     * <pre>
     * Scene object appear
     * </pre>
     */
    GC_SCENE_OBJECT_APPEAR(20, 1015),
    ;

    /**
     * <code>SERVER_REGISTER_REQUEST = 100;</code>
     *
     * <pre>
     * server
     * </pre>
     */
    public static final int SERVER_REGISTER_REQUEST_VALUE = 100;
    /**
     * <code>GAME_REGISTER_TO_AGENT = 101;</code>
     *
     * <pre>
     * game register to agent
     * </pre>
     */
    public static final int GAME_REGISTER_TO_AGENT_VALUE = 101;
    /**
     * <code>AG_PLAYER_LOGOUT = 200;</code>
     *
     * <pre>
     * AG-GA 200-300
     * </pre>
     */
    public static final int AG_PLAYER_LOGOUT_VALUE = 200;
    /**
     * <code>GA_PLAYER_LOGOUT_OK = 201;</code>
     */
    public static final int GA_PLAYER_LOGOUT_OK_VALUE = 201;
    /**
     * <code>AG_FORWARD_BEGIN = 1000;</code>
     *
     * <pre>
     * AGForward begin - end
     * </pre>
     */
    public static final int AG_FORWARD_BEGIN_VALUE = 1000;
    /**
     * <code>AG_FORWARD_END = 10000;</code>
     */
    public static final int AG_FORWARD_END_VALUE = 10000;
    /**
     * <code>CG_PLAYER_LOGIN = 1001;</code>
     *
     * <pre>
     * request login
     * </pre>
     */
    public static final int CG_PLAYER_LOGIN_VALUE = 1001;
    /**
     * <code>GC_PLAYER_LOGIN_RESULT = 1002;</code>
     *
     * <pre>
     * login result
     * </pre>
     */
    public static final int GC_PLAYER_LOGIN_RESULT_VALUE = 1002;
    /**
     * <code>CG_GET_ROLE_LIST = 1003;</code>
     *
     * <pre>
     * get role list
     * </pre>
     */
    public static final int CG_GET_ROLE_LIST_VALUE = 1003;
    /**
     * <code>GC_GET_ROLE_LIST = 1004;</code>
     *
     * <pre>
     * return role list
     * </pre>
     */
    public static final int GC_GET_ROLE_LIST_VALUE = 1004;
    /**
     * <code>CG_SELECT_ROLE = 1005;</code>
     *
     * <pre>
     * select role
     * </pre>
     */
    public static final int CG_SELECT_ROLE_VALUE = 1005;
    /**
     * <code>GC_ROLE_INFO = 1006;</code>
     *
     * <pre>
     * role info
     * </pre>
     */
    public static final int GC_ROLE_INFO_VALUE = 1006;
    /**
     * <code>CG_CREATE_ROLE = 1007;</code>
     *
     * <pre>
     * create role
     * </pre>
     */
    public static final int CG_CREATE_ROLE_VALUE = 1007;
    /**
     * <code>GC_CREATE_ROLE_RESULT = 1008;</code>
     *
     * <pre>
     * create role result
     * </pre>
     */
    public static final int GC_CREATE_ROLE_RESULT_VALUE = 1008;
    /**
     * <code>GC_ENTER_SCENE = 1009;</code>
     *
     * <pre>
     * enter scene
     * </pre>
     */
    public static final int GC_ENTER_SCENE_VALUE = 1009;
    /**
     * <code>CG_ENTER_SCENE_READY = 1010;</code>
     *
     * <pre>
     * enter scene ready
     * </pre>
     */
    public static final int CG_ENTER_SCENE_READY_VALUE = 1010;
    /**
     * <code>CG_SYNC = 1011;</code>
     *
     * <pre>
     * sync
     * </pre>
     */
    public static final int CG_SYNC_VALUE = 1011;
    /**
     * <code>GC_SYNC = 1012;</code>
     *
     * <pre>
     * sync
     * </pre>
     */
    public static final int GC_SYNC_VALUE = 1012;
    /**
     * <code>CG_REQUEST_MOVE = 1013;</code>
     *
     * <pre>
     * CG_REQUEST_MOVE
     * </pre>
     */
    public static final int CG_REQUEST_MOVE_VALUE = 1013;
    /**
     * <code>GC_BROADCAST_MOVE = 1014;</code>
     *
     * <pre>
     * GC_BROADCAST_MOVE
     * </pre>
     */
    public static final int GC_BROADCAST_MOVE_VALUE = 1014;
    /**
     * <code>GC_SCENE_OBJECT_APPEAR = 1015;</code>
     *
     * <pre>
     * Scene object appear
     * </pre>
     */
    public static final int GC_SCENE_OBJECT_APPEAR_VALUE = 1015;


    public final int getNumber() { return value; }

    public static MessageType valueOf(int value) {
      switch (value) {
        case 100: return SERVER_REGISTER_REQUEST;
        case 101: return GAME_REGISTER_TO_AGENT;
        case 200: return AG_PLAYER_LOGOUT;
        case 201: return GA_PLAYER_LOGOUT_OK;
        case 1000: return AG_FORWARD_BEGIN;
        case 10000: return AG_FORWARD_END;
        case 1001: return CG_PLAYER_LOGIN;
        case 1002: return GC_PLAYER_LOGIN_RESULT;
        case 1003: return CG_GET_ROLE_LIST;
        case 1004: return GC_GET_ROLE_LIST;
        case 1005: return CG_SELECT_ROLE;
        case 1006: return GC_ROLE_INFO;
        case 1007: return CG_CREATE_ROLE;
        case 1008: return GC_CREATE_ROLE_RESULT;
        case 1009: return GC_ENTER_SCENE;
        case 1010: return CG_ENTER_SCENE_READY;
        case 1011: return CG_SYNC;
        case 1012: return GC_SYNC;
        case 1013: return CG_REQUEST_MOVE;
        case 1014: return GC_BROADCAST_MOVE;
        case 1015: return GC_SCENE_OBJECT_APPEAR;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<MessageType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static com.google.protobuf.Internal.EnumLiteMap<MessageType>
        internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<MessageType>() {
            public MessageType findValueByNumber(int number) {
              return MessageType.valueOf(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(index);
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.stone.proto.MessageTypes.getDescriptor().getEnumTypes().get(0);
    }

    private static final MessageType[] VALUES = values();

    public static MessageType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int index;
    private final int value;

    private MessageType(int index, int value) {
      this.index = index;
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:MessageType)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021MessageType.proto*\364\003\n\013MessageType\022\033\n\027S" +
      "ERVER_REGISTER_REQUEST\020d\022\032\n\026GAME_REGISTE" +
      "R_TO_AGENT\020e\022\025\n\020AG_PLAYER_LOGOUT\020\310\001\022\030\n\023G" +
      "A_PLAYER_LOGOUT_OK\020\311\001\022\025\n\020AG_FORWARD_BEGI" +
      "N\020\350\007\022\023\n\016AG_FORWARD_END\020\220N\022\024\n\017CG_PLAYER_L" +
      "OGIN\020\351\007\022\033\n\026GC_PLAYER_LOGIN_RESULT\020\352\007\022\025\n\020" +
      "CG_GET_ROLE_LIST\020\353\007\022\025\n\020GC_GET_ROLE_LIST\020" +
      "\354\007\022\023\n\016CG_SELECT_ROLE\020\355\007\022\021\n\014GC_ROLE_INFO\020" +
      "\356\007\022\023\n\016CG_CREATE_ROLE\020\357\007\022\032\n\025GC_CREATE_ROL" +
      "E_RESULT\020\360\007\022\023\n\016GC_ENTER_SCENE\020\361\007\022\031\n\024CG_E",
      "NTER_SCENE_READY\020\362\007\022\014\n\007CG_SYNC\020\363\007\022\014\n\007GC_" +
      "SYNC\020\364\007\022\024\n\017CG_REQUEST_MOVE\020\365\007\022\026\n\021GC_BROA" +
      "DCAST_MOVE\020\366\007\022\033\n\026GC_SCENE_OBJECT_APPEAR\020" +
      "\367\007B\037\n\017com.stone.protoB\014MessageTypes"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
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