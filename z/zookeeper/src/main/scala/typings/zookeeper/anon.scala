package typings.zookeeper

import org.scalablytyped.runtime.Instantiable1
import typings.zookeeper.mod.ZooKeeperPromise
import typings.zookeeper.zookeeperWithCallbacksMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Auth extends StObject {
    
    var auth: String
    
    var perms: Double
    
    var scheme: String
  }
  object Auth {
    
    inline def apply(auth: String, perms: Double, scheme: String): Auth = {
      val __obj = js.Dynamic.literal(auth = auth.asInstanceOf[js.Any], perms = perms.asInstanceOf[js.Any], scheme = scheme.asInstanceOf[js.Any])
      __obj.asInstanceOf[Auth]
    }
    
    extension [Self <: Auth](x: Self) {
      
      inline def setAuth(value: String): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      inline def setPerms(value: Double): Self = StObject.set(x, "perms", value.asInstanceOf[js.Any])
      
      inline def setScheme(value: String): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TypeofZooKeeperPromise
    extends StObject
       with Instantiable1[/* config */ Any, ZooKeeperPromise] {
    
    def Promise: /* import warning: importer.ImportType#apply Failed type conversion: typeof ZooKeeperPromise */ js.Any = js.native
    
    /** @deprecated */
    def ZK: /* import warning: importer.ImportType#apply Failed type conversion: typeof ZooKeeperPromise */ js.Any = js.native
    
    /** @deprecated */
    def ZooKeeper: /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_zookeeperWithCallbacks */ js.Any = js.native
    
    def constants: /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_zookeeperConstants */ js.Any = js.native
  }
  
  trait TypeofimportedZookeeperC extends StObject {
    
    var ZAPIERROR: Double
    
    var ZAUTHFAILED: Double
    
    var ZBADARGUMENTS: Double
    
    var ZBADVERSION: Double
    
    var ZCLOSING: Double
    
    var ZCONNECTIONLOSS: Double
    
    var ZDATAINCONSISTENCY: Double
    
    var ZINVALIDACL: Double
    
    var ZINVALIDCALLBACK: Double
    
    var ZINVALIDSTATE: Double
    
    var ZMARSHALLINGERROR: Double
    
    var ZNOAUTH: Double
    
    var ZNOCHILDRENFOREPHEMERALS: Double
    
    var ZNODEEXISTS: Double
    
    var ZNONODE: Double
    
    var ZNOTEMPTY: Double
    
    var ZNOTHING: Double
    
    var ZOK: Double
    
    var ZOOKEEPER_READ: Double
    
    var ZOOKEEPER_WRITE: Double
    
    var ZOO_ASSOCIATING_STATE: Double
    
    var ZOO_AUTH_FAILED_STATE: Double
    
    var ZOO_CHANGED_EVENT: Double
    
    var ZOO_CHILD_EVENT: Double
    
    var ZOO_CONNECTED_STATE: Double
    
    var ZOO_CONNECTING_STATE: Double
    
    var ZOO_CONTAINER: Double
    
    var ZOO_CREATED_EVENT: Double
    
    var ZOO_CREATOR_ALL_ACL: Auth
    
    var ZOO_DELETED_EVENT: Double
    
    var ZOO_EPHEMERAL: Double
    
    var ZOO_EPHEMERAL_SEQUENTIAL: Double
    
    var ZOO_EXPIRED_SESSION_STATE: Double
    
    var ZOO_LOG_LEVEL_DEBUG: Double
    
    var ZOO_LOG_LEVEL_ERROR: Double
    
    var ZOO_LOG_LEVEL_INFO: Double
    
    var ZOO_LOG_LEVEL_WARN: Double
    
    var ZOO_NOTWATCHING_EVENT: Double
    
    var ZOO_OPEN_ACL_UNSAFE: Auth
    
    var ZOO_PERM_ADMIN: Double
    
    var ZOO_PERM_ALL: Double
    
    var ZOO_PERM_CREATE: Double
    
    var ZOO_PERM_DELETE: Double
    
    var ZOO_PERM_READ: Double
    
    var ZOO_PERM_WRITE: Double
    
    var ZOO_PERSISTENT: Double
    
    var ZOO_PERSISTENT_SEQUENTIAL: Double
    
    var ZOO_PERSISTENT_SEQUENTIAL_WITH_TTL: Double
    
    var ZOO_PERSISTENT_WITH_TTL: Double
    
    var ZOO_READ_ACL_UNSAFE: Auth
    
    var ZOO_SEQUENCE: Double
    
    var ZOO_SESSION_EVENT: Double
    
    var ZOPERATIONTIMEOUT: Double
    
    var ZRUNTIMEINCONSISTENCY: Double
    
    var ZSESSIONEXPIRED: Double
    
    var ZSESSIONMOVED: Double
    
    var ZSYSTEMERROR: Double
    
    var ZUNIMPLEMENTED: Double
    
    var on_closed: String
    
    var on_connected: String
    
    var on_connecting: String
    
    var on_event_changed: String
    
    var on_event_child: String
    
    var on_event_created: String
    
    var on_event_deleted: String
    
    var on_event_notwatching: String
  }
  object TypeofimportedZookeeperC {
    
    inline def apply(
      ZAPIERROR: Double,
      ZAUTHFAILED: Double,
      ZBADARGUMENTS: Double,
      ZBADVERSION: Double,
      ZCLOSING: Double,
      ZCONNECTIONLOSS: Double,
      ZDATAINCONSISTENCY: Double,
      ZINVALIDACL: Double,
      ZINVALIDCALLBACK: Double,
      ZINVALIDSTATE: Double,
      ZMARSHALLINGERROR: Double,
      ZNOAUTH: Double,
      ZNOCHILDRENFOREPHEMERALS: Double,
      ZNODEEXISTS: Double,
      ZNONODE: Double,
      ZNOTEMPTY: Double,
      ZNOTHING: Double,
      ZOK: Double,
      ZOOKEEPER_READ: Double,
      ZOOKEEPER_WRITE: Double,
      ZOO_ASSOCIATING_STATE: Double,
      ZOO_AUTH_FAILED_STATE: Double,
      ZOO_CHANGED_EVENT: Double,
      ZOO_CHILD_EVENT: Double,
      ZOO_CONNECTED_STATE: Double,
      ZOO_CONNECTING_STATE: Double,
      ZOO_CONTAINER: Double,
      ZOO_CREATED_EVENT: Double,
      ZOO_CREATOR_ALL_ACL: Auth,
      ZOO_DELETED_EVENT: Double,
      ZOO_EPHEMERAL: Double,
      ZOO_EPHEMERAL_SEQUENTIAL: Double,
      ZOO_EXPIRED_SESSION_STATE: Double,
      ZOO_LOG_LEVEL_DEBUG: Double,
      ZOO_LOG_LEVEL_ERROR: Double,
      ZOO_LOG_LEVEL_INFO: Double,
      ZOO_LOG_LEVEL_WARN: Double,
      ZOO_NOTWATCHING_EVENT: Double,
      ZOO_OPEN_ACL_UNSAFE: Auth,
      ZOO_PERM_ADMIN: Double,
      ZOO_PERM_ALL: Double,
      ZOO_PERM_CREATE: Double,
      ZOO_PERM_DELETE: Double,
      ZOO_PERM_READ: Double,
      ZOO_PERM_WRITE: Double,
      ZOO_PERSISTENT: Double,
      ZOO_PERSISTENT_SEQUENTIAL: Double,
      ZOO_PERSISTENT_SEQUENTIAL_WITH_TTL: Double,
      ZOO_PERSISTENT_WITH_TTL: Double,
      ZOO_READ_ACL_UNSAFE: Auth,
      ZOO_SEQUENCE: Double,
      ZOO_SESSION_EVENT: Double,
      ZOPERATIONTIMEOUT: Double,
      ZRUNTIMEINCONSISTENCY: Double,
      ZSESSIONEXPIRED: Double,
      ZSESSIONMOVED: Double,
      ZSYSTEMERROR: Double,
      ZUNIMPLEMENTED: Double,
      on_closed: String,
      on_connected: String,
      on_connecting: String,
      on_event_changed: String,
      on_event_child: String,
      on_event_created: String,
      on_event_deleted: String,
      on_event_notwatching: String
    ): TypeofimportedZookeeperC = {
      val __obj = js.Dynamic.literal(ZAPIERROR = ZAPIERROR.asInstanceOf[js.Any], ZAUTHFAILED = ZAUTHFAILED.asInstanceOf[js.Any], ZBADARGUMENTS = ZBADARGUMENTS.asInstanceOf[js.Any], ZBADVERSION = ZBADVERSION.asInstanceOf[js.Any], ZCLOSING = ZCLOSING.asInstanceOf[js.Any], ZCONNECTIONLOSS = ZCONNECTIONLOSS.asInstanceOf[js.Any], ZDATAINCONSISTENCY = ZDATAINCONSISTENCY.asInstanceOf[js.Any], ZINVALIDACL = ZINVALIDACL.asInstanceOf[js.Any], ZINVALIDCALLBACK = ZINVALIDCALLBACK.asInstanceOf[js.Any], ZINVALIDSTATE = ZINVALIDSTATE.asInstanceOf[js.Any], ZMARSHALLINGERROR = ZMARSHALLINGERROR.asInstanceOf[js.Any], ZNOAUTH = ZNOAUTH.asInstanceOf[js.Any], ZNOCHILDRENFOREPHEMERALS = ZNOCHILDRENFOREPHEMERALS.asInstanceOf[js.Any], ZNODEEXISTS = ZNODEEXISTS.asInstanceOf[js.Any], ZNONODE = ZNONODE.asInstanceOf[js.Any], ZNOTEMPTY = ZNOTEMPTY.asInstanceOf[js.Any], ZNOTHING = ZNOTHING.asInstanceOf[js.Any], ZOK = ZOK.asInstanceOf[js.Any], ZOOKEEPER_READ = ZOOKEEPER_READ.asInstanceOf[js.Any], ZOOKEEPER_WRITE = ZOOKEEPER_WRITE.asInstanceOf[js.Any], ZOO_ASSOCIATING_STATE = ZOO_ASSOCIATING_STATE.asInstanceOf[js.Any], ZOO_AUTH_FAILED_STATE = ZOO_AUTH_FAILED_STATE.asInstanceOf[js.Any], ZOO_CHANGED_EVENT = ZOO_CHANGED_EVENT.asInstanceOf[js.Any], ZOO_CHILD_EVENT = ZOO_CHILD_EVENT.asInstanceOf[js.Any], ZOO_CONNECTED_STATE = ZOO_CONNECTED_STATE.asInstanceOf[js.Any], ZOO_CONNECTING_STATE = ZOO_CONNECTING_STATE.asInstanceOf[js.Any], ZOO_CONTAINER = ZOO_CONTAINER.asInstanceOf[js.Any], ZOO_CREATED_EVENT = ZOO_CREATED_EVENT.asInstanceOf[js.Any], ZOO_CREATOR_ALL_ACL = ZOO_CREATOR_ALL_ACL.asInstanceOf[js.Any], ZOO_DELETED_EVENT = ZOO_DELETED_EVENT.asInstanceOf[js.Any], ZOO_EPHEMERAL = ZOO_EPHEMERAL.asInstanceOf[js.Any], ZOO_EPHEMERAL_SEQUENTIAL = ZOO_EPHEMERAL_SEQUENTIAL.asInstanceOf[js.Any], ZOO_EXPIRED_SESSION_STATE = ZOO_EXPIRED_SESSION_STATE.asInstanceOf[js.Any], ZOO_LOG_LEVEL_DEBUG = ZOO_LOG_LEVEL_DEBUG.asInstanceOf[js.Any], ZOO_LOG_LEVEL_ERROR = ZOO_LOG_LEVEL_ERROR.asInstanceOf[js.Any], ZOO_LOG_LEVEL_INFO = ZOO_LOG_LEVEL_INFO.asInstanceOf[js.Any], ZOO_LOG_LEVEL_WARN = ZOO_LOG_LEVEL_WARN.asInstanceOf[js.Any], ZOO_NOTWATCHING_EVENT = ZOO_NOTWATCHING_EVENT.asInstanceOf[js.Any], ZOO_OPEN_ACL_UNSAFE = ZOO_OPEN_ACL_UNSAFE.asInstanceOf[js.Any], ZOO_PERM_ADMIN = ZOO_PERM_ADMIN.asInstanceOf[js.Any], ZOO_PERM_ALL = ZOO_PERM_ALL.asInstanceOf[js.Any], ZOO_PERM_CREATE = ZOO_PERM_CREATE.asInstanceOf[js.Any], ZOO_PERM_DELETE = ZOO_PERM_DELETE.asInstanceOf[js.Any], ZOO_PERM_READ = ZOO_PERM_READ.asInstanceOf[js.Any], ZOO_PERM_WRITE = ZOO_PERM_WRITE.asInstanceOf[js.Any], ZOO_PERSISTENT = ZOO_PERSISTENT.asInstanceOf[js.Any], ZOO_PERSISTENT_SEQUENTIAL = ZOO_PERSISTENT_SEQUENTIAL.asInstanceOf[js.Any], ZOO_PERSISTENT_SEQUENTIAL_WITH_TTL = ZOO_PERSISTENT_SEQUENTIAL_WITH_TTL.asInstanceOf[js.Any], ZOO_PERSISTENT_WITH_TTL = ZOO_PERSISTENT_WITH_TTL.asInstanceOf[js.Any], ZOO_READ_ACL_UNSAFE = ZOO_READ_ACL_UNSAFE.asInstanceOf[js.Any], ZOO_SEQUENCE = ZOO_SEQUENCE.asInstanceOf[js.Any], ZOO_SESSION_EVENT = ZOO_SESSION_EVENT.asInstanceOf[js.Any], ZOPERATIONTIMEOUT = ZOPERATIONTIMEOUT.asInstanceOf[js.Any], ZRUNTIMEINCONSISTENCY = ZRUNTIMEINCONSISTENCY.asInstanceOf[js.Any], ZSESSIONEXPIRED = ZSESSIONEXPIRED.asInstanceOf[js.Any], ZSESSIONMOVED = ZSESSIONMOVED.asInstanceOf[js.Any], ZSYSTEMERROR = ZSYSTEMERROR.asInstanceOf[js.Any], ZUNIMPLEMENTED = ZUNIMPLEMENTED.asInstanceOf[js.Any], on_closed = on_closed.asInstanceOf[js.Any], on_connected = on_connected.asInstanceOf[js.Any], on_connecting = on_connecting.asInstanceOf[js.Any], on_event_changed = on_event_changed.asInstanceOf[js.Any], on_event_child = on_event_child.asInstanceOf[js.Any], on_event_created = on_event_created.asInstanceOf[js.Any], on_event_deleted = on_event_deleted.asInstanceOf[js.Any], on_event_notwatching = on_event_notwatching.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeofimportedZookeeperC]
    }
    
    extension [Self <: TypeofimportedZookeeperC](x: Self) {
      
      inline def setOn_closed(value: String): Self = StObject.set(x, "on_closed", value.asInstanceOf[js.Any])
      
      inline def setOn_connected(value: String): Self = StObject.set(x, "on_connected", value.asInstanceOf[js.Any])
      
      inline def setOn_connecting(value: String): Self = StObject.set(x, "on_connecting", value.asInstanceOf[js.Any])
      
      inline def setOn_event_changed(value: String): Self = StObject.set(x, "on_event_changed", value.asInstanceOf[js.Any])
      
      inline def setOn_event_child(value: String): Self = StObject.set(x, "on_event_child", value.asInstanceOf[js.Any])
      
      inline def setOn_event_created(value: String): Self = StObject.set(x, "on_event_created", value.asInstanceOf[js.Any])
      
      inline def setOn_event_deleted(value: String): Self = StObject.set(x, "on_event_deleted", value.asInstanceOf[js.Any])
      
      inline def setOn_event_notwatching(value: String): Self = StObject.set(x, "on_event_notwatching", value.asInstanceOf[js.Any])
      
      inline def setZAPIERROR(value: Double): Self = StObject.set(x, "ZAPIERROR", value.asInstanceOf[js.Any])
      
      inline def setZAUTHFAILED(value: Double): Self = StObject.set(x, "ZAUTHFAILED", value.asInstanceOf[js.Any])
      
      inline def setZBADARGUMENTS(value: Double): Self = StObject.set(x, "ZBADARGUMENTS", value.asInstanceOf[js.Any])
      
      inline def setZBADVERSION(value: Double): Self = StObject.set(x, "ZBADVERSION", value.asInstanceOf[js.Any])
      
      inline def setZCLOSING(value: Double): Self = StObject.set(x, "ZCLOSING", value.asInstanceOf[js.Any])
      
      inline def setZCONNECTIONLOSS(value: Double): Self = StObject.set(x, "ZCONNECTIONLOSS", value.asInstanceOf[js.Any])
      
      inline def setZDATAINCONSISTENCY(value: Double): Self = StObject.set(x, "ZDATAINCONSISTENCY", value.asInstanceOf[js.Any])
      
      inline def setZINVALIDACL(value: Double): Self = StObject.set(x, "ZINVALIDACL", value.asInstanceOf[js.Any])
      
      inline def setZINVALIDCALLBACK(value: Double): Self = StObject.set(x, "ZINVALIDCALLBACK", value.asInstanceOf[js.Any])
      
      inline def setZINVALIDSTATE(value: Double): Self = StObject.set(x, "ZINVALIDSTATE", value.asInstanceOf[js.Any])
      
      inline def setZMARSHALLINGERROR(value: Double): Self = StObject.set(x, "ZMARSHALLINGERROR", value.asInstanceOf[js.Any])
      
      inline def setZNOAUTH(value: Double): Self = StObject.set(x, "ZNOAUTH", value.asInstanceOf[js.Any])
      
      inline def setZNOCHILDRENFOREPHEMERALS(value: Double): Self = StObject.set(x, "ZNOCHILDRENFOREPHEMERALS", value.asInstanceOf[js.Any])
      
      inline def setZNODEEXISTS(value: Double): Self = StObject.set(x, "ZNODEEXISTS", value.asInstanceOf[js.Any])
      
      inline def setZNONODE(value: Double): Self = StObject.set(x, "ZNONODE", value.asInstanceOf[js.Any])
      
      inline def setZNOTEMPTY(value: Double): Self = StObject.set(x, "ZNOTEMPTY", value.asInstanceOf[js.Any])
      
      inline def setZNOTHING(value: Double): Self = StObject.set(x, "ZNOTHING", value.asInstanceOf[js.Any])
      
      inline def setZOK(value: Double): Self = StObject.set(x, "ZOK", value.asInstanceOf[js.Any])
      
      inline def setZOOKEEPER_READ(value: Double): Self = StObject.set(x, "ZOOKEEPER_READ", value.asInstanceOf[js.Any])
      
      inline def setZOOKEEPER_WRITE(value: Double): Self = StObject.set(x, "ZOOKEEPER_WRITE", value.asInstanceOf[js.Any])
      
      inline def setZOO_ASSOCIATING_STATE(value: Double): Self = StObject.set(x, "ZOO_ASSOCIATING_STATE", value.asInstanceOf[js.Any])
      
      inline def setZOO_AUTH_FAILED_STATE(value: Double): Self = StObject.set(x, "ZOO_AUTH_FAILED_STATE", value.asInstanceOf[js.Any])
      
      inline def setZOO_CHANGED_EVENT(value: Double): Self = StObject.set(x, "ZOO_CHANGED_EVENT", value.asInstanceOf[js.Any])
      
      inline def setZOO_CHILD_EVENT(value: Double): Self = StObject.set(x, "ZOO_CHILD_EVENT", value.asInstanceOf[js.Any])
      
      inline def setZOO_CONNECTED_STATE(value: Double): Self = StObject.set(x, "ZOO_CONNECTED_STATE", value.asInstanceOf[js.Any])
      
      inline def setZOO_CONNECTING_STATE(value: Double): Self = StObject.set(x, "ZOO_CONNECTING_STATE", value.asInstanceOf[js.Any])
      
      inline def setZOO_CONTAINER(value: Double): Self = StObject.set(x, "ZOO_CONTAINER", value.asInstanceOf[js.Any])
      
      inline def setZOO_CREATED_EVENT(value: Double): Self = StObject.set(x, "ZOO_CREATED_EVENT", value.asInstanceOf[js.Any])
      
      inline def setZOO_CREATOR_ALL_ACL(value: Auth): Self = StObject.set(x, "ZOO_CREATOR_ALL_ACL", value.asInstanceOf[js.Any])
      
      inline def setZOO_DELETED_EVENT(value: Double): Self = StObject.set(x, "ZOO_DELETED_EVENT", value.asInstanceOf[js.Any])
      
      inline def setZOO_EPHEMERAL(value: Double): Self = StObject.set(x, "ZOO_EPHEMERAL", value.asInstanceOf[js.Any])
      
      inline def setZOO_EPHEMERAL_SEQUENTIAL(value: Double): Self = StObject.set(x, "ZOO_EPHEMERAL_SEQUENTIAL", value.asInstanceOf[js.Any])
      
      inline def setZOO_EXPIRED_SESSION_STATE(value: Double): Self = StObject.set(x, "ZOO_EXPIRED_SESSION_STATE", value.asInstanceOf[js.Any])
      
      inline def setZOO_LOG_LEVEL_DEBUG(value: Double): Self = StObject.set(x, "ZOO_LOG_LEVEL_DEBUG", value.asInstanceOf[js.Any])
      
      inline def setZOO_LOG_LEVEL_ERROR(value: Double): Self = StObject.set(x, "ZOO_LOG_LEVEL_ERROR", value.asInstanceOf[js.Any])
      
      inline def setZOO_LOG_LEVEL_INFO(value: Double): Self = StObject.set(x, "ZOO_LOG_LEVEL_INFO", value.asInstanceOf[js.Any])
      
      inline def setZOO_LOG_LEVEL_WARN(value: Double): Self = StObject.set(x, "ZOO_LOG_LEVEL_WARN", value.asInstanceOf[js.Any])
      
      inline def setZOO_NOTWATCHING_EVENT(value: Double): Self = StObject.set(x, "ZOO_NOTWATCHING_EVENT", value.asInstanceOf[js.Any])
      
      inline def setZOO_OPEN_ACL_UNSAFE(value: Auth): Self = StObject.set(x, "ZOO_OPEN_ACL_UNSAFE", value.asInstanceOf[js.Any])
      
      inline def setZOO_PERM_ADMIN(value: Double): Self = StObject.set(x, "ZOO_PERM_ADMIN", value.asInstanceOf[js.Any])
      
      inline def setZOO_PERM_ALL(value: Double): Self = StObject.set(x, "ZOO_PERM_ALL", value.asInstanceOf[js.Any])
      
      inline def setZOO_PERM_CREATE(value: Double): Self = StObject.set(x, "ZOO_PERM_CREATE", value.asInstanceOf[js.Any])
      
      inline def setZOO_PERM_DELETE(value: Double): Self = StObject.set(x, "ZOO_PERM_DELETE", value.asInstanceOf[js.Any])
      
      inline def setZOO_PERM_READ(value: Double): Self = StObject.set(x, "ZOO_PERM_READ", value.asInstanceOf[js.Any])
      
      inline def setZOO_PERM_WRITE(value: Double): Self = StObject.set(x, "ZOO_PERM_WRITE", value.asInstanceOf[js.Any])
      
      inline def setZOO_PERSISTENT(value: Double): Self = StObject.set(x, "ZOO_PERSISTENT", value.asInstanceOf[js.Any])
      
      inline def setZOO_PERSISTENT_SEQUENTIAL(value: Double): Self = StObject.set(x, "ZOO_PERSISTENT_SEQUENTIAL", value.asInstanceOf[js.Any])
      
      inline def setZOO_PERSISTENT_SEQUENTIAL_WITH_TTL(value: Double): Self = StObject.set(x, "ZOO_PERSISTENT_SEQUENTIAL_WITH_TTL", value.asInstanceOf[js.Any])
      
      inline def setZOO_PERSISTENT_WITH_TTL(value: Double): Self = StObject.set(x, "ZOO_PERSISTENT_WITH_TTL", value.asInstanceOf[js.Any])
      
      inline def setZOO_READ_ACL_UNSAFE(value: Auth): Self = StObject.set(x, "ZOO_READ_ACL_UNSAFE", value.asInstanceOf[js.Any])
      
      inline def setZOO_SEQUENCE(value: Double): Self = StObject.set(x, "ZOO_SEQUENCE", value.asInstanceOf[js.Any])
      
      inline def setZOO_SESSION_EVENT(value: Double): Self = StObject.set(x, "ZOO_SESSION_EVENT", value.asInstanceOf[js.Any])
      
      inline def setZOPERATIONTIMEOUT(value: Double): Self = StObject.set(x, "ZOPERATIONTIMEOUT", value.asInstanceOf[js.Any])
      
      inline def setZRUNTIMEINCONSISTENCY(value: Double): Self = StObject.set(x, "ZRUNTIMEINCONSISTENCY", value.asInstanceOf[js.Any])
      
      inline def setZSESSIONEXPIRED(value: Double): Self = StObject.set(x, "ZSESSIONEXPIRED", value.asInstanceOf[js.Any])
      
      inline def setZSESSIONMOVED(value: Double): Self = StObject.set(x, "ZSESSIONMOVED", value.asInstanceOf[js.Any])
      
      inline def setZSYSTEMERROR(value: Double): Self = StObject.set(x, "ZSYSTEMERROR", value.asInstanceOf[js.Any])
      
      inline def setZUNIMPLEMENTED(value: Double): Self = StObject.set(x, "ZUNIMPLEMENTED", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TypeofimportedZookeeperW
    extends StObject
       with Instantiable1[(/* config */ js.Object) | (/* config */ String), ^] {
    
    /** @deprecated @returns {number} -100 */
    def ZAPIERROR: Double = js.native
    
    /** @deprecated @returns {number} -115 */
    def ZAUTHFAILED: Double = js.native
    
    /** @deprecated @returns {number} -8 */
    def ZBADARGUMENTS: Double = js.native
    
    /** @deprecated @returns {number} -103 */
    def ZBADVERSION: Double = js.native
    
    /** @deprecated @returns {number} -116 */
    def ZCLOSING: Double = js.native
    
    /** @deprecated @returns {number} -4 */
    def ZCONNECTIONLOSS: Double = js.native
    
    /** @deprecated @returns {number} -3 */
    def ZDATAINCONSISTENCY: Double = js.native
    
    /** @deprecated @returns {number} -114 */
    def ZINVALIDACL: Double = js.native
    
    /** @deprecated @returns {number} -113 */
    def ZINVALIDCALLBACK: Double = js.native
    
    /** @deprecated @returns {number} -9 */
    def ZINVALIDSTATE: Double = js.native
    
    /** @deprecated @returns {number} -5 */
    def ZMARSHALLINGERROR: Double = js.native
    
    /** @deprecated @returns {number} -102 */
    def ZNOAUTH: Double = js.native
    
    /** @deprecated @returns {number} -108 */
    def ZNOCHILDRENFOREPHEMERALS: Double = js.native
    
    /** @deprecated @returns {number} -110 */
    def ZNODEEXISTS: Double = js.native
    
    /** @deprecated @returns {number} -101 */
    def ZNONODE: Double = js.native
    
    /** @deprecated @returns {number} -111 */
    def ZNOTEMPTY: Double = js.native
    
    /** @deprecated @returns {number} -117 */
    def ZNOTHING: Double = js.native
    
    /** @deprecated @returns {number} 0 */
    def ZOK: Double = js.native
    
    /** @deprecated @returns {number} 2 */
    def ZOOKEEPER_READ: Double = js.native
    
    /** @deprecated @returns {number} 1 */
    def ZOOKEEPER_WRITE: Double = js.native
    
    /** @deprecated @returns {number} 2 */
    def ZOO_ASSOCIATING_STATE: Double = js.native
    
    /** @deprecated @returns {number} -113 */
    def ZOO_AUTH_FAILED_STATE: Double = js.native
    
    /** @deprecated @returns {number} 3 */
    def ZOO_CHANGED_EVENT: Double = js.native
    
    /** @deprecated @returns {number} 4 */
    def ZOO_CHILD_EVENT: Double = js.native
    
    /** @deprecated @returns {string} "/zookeeper/config" */
    def ZOO_CONFIG_NODE: String = js.native
    
    /** @deprecated @returns {number} 3 */
    def ZOO_CONNECTED_STATE: Double = js.native
    
    /** @deprecated @returns {number} 1 */
    def ZOO_CONNECTING_STATE: Double = js.native
    
    /** @deprecated @returns {number} 1 */
    def ZOO_CREATED_EVENT: Double = js.native
    
    /** @deprecated @returns {{perms:number, scheme:string, auth:string}} */
    def ZOO_CREATOR_ALL_ACL: Auth = js.native
    
    /** @deprecated @returns {number} 2 */
    def ZOO_DELETED_EVENT: Double = js.native
    
    /** @deprecated @returns {number} 1 */
    def ZOO_EPHEMERAL: Double = js.native
    
    /** @deprecated @returns {number} -112 */
    def ZOO_EXPIRED_SESSION_STATE: Double = js.native
    
    /** @deprecated @returns {number} 4 */
    def ZOO_LOG_LEVEL_DEBUG: Double = js.native
    
    /** @deprecated @returns {number} 1 */
    def ZOO_LOG_LEVEL_ERROR: Double = js.native
    
    /** @deprecated @returns {number} 3 */
    def ZOO_LOG_LEVEL_INFO: Double = js.native
    
    /** @deprecated @returns {number} 2 */
    def ZOO_LOG_LEVEL_WARN: Double = js.native
    
    /** @deprecated @returns {number} -2 */
    def ZOO_NOTWATCHING_EVENT: Double = js.native
    
    /** @deprecated @returns {{perms:number, scheme:string, auth:string}} */
    def ZOO_OPEN_ACL_UNSAFE: Auth = js.native
    
    /** @deprecated @returns {number} 16 */
    def ZOO_PERM_ADMIN: Double = js.native
    
    /** @deprecated @returns {number} 31 */
    def ZOO_PERM_ALL: Double = js.native
    
    /** @deprecated @returns {number} 4 */
    def ZOO_PERM_CREATE: Double = js.native
    
    /** @deprecated @returns {number} 8 */
    def ZOO_PERM_DELETE: Double = js.native
    
    /** @deprecated @returns {number} 1 */
    def ZOO_PERM_READ: Double = js.native
    
    /** @deprecated @returns {number} 2 */
    def ZOO_PERM_WRITE: Double = js.native
    
    /** @deprecated @returns {{perms:number, scheme:string, auth:string}} */
    def ZOO_READ_ACL_UNSAFE: Auth = js.native
    
    /** @deprecated @returns {number} 2 */
    def ZOO_SEQUENCE: Double = js.native
    
    /** @deprecated @returns {number} -1 */
    def ZOO_SESSION_EVENT: Double = js.native
    
    /** @deprecated @returns {number} -7 */
    def ZOPERATIONTIMEOUT: Double = js.native
    
    /** @deprecated @returns {number} -2 */
    def ZRUNTIMEINCONSISTENCY: Double = js.native
    
    /** @deprecated @returns {number} -112 */
    def ZSESSIONEXPIRED: Double = js.native
    
    /** @deprecated @returns {number} -118 */
    def ZSESSIONMOVED: Double = js.native
    
    /** @deprecated @returns {number} -1 */
    def ZSYSTEMERROR: Double = js.native
    
    /** @deprecated @returns {number} -6 */
    def ZUNIMPLEMENTED: Double = js.native
    
    /** @deprecated use strings directly */
    def on_closed: String = js.native
    
    /** @deprecated use strings directly */
    def on_connected: String = js.native
    
    /** @deprecated use strings directly */
    def on_connecting: String = js.native
    
    /** @deprecated use strings directly */
    def on_event_changed: String = js.native
    
    /** @deprecated use strings directly */
    def on_event_child: String = js.native
    
    /** @deprecated use strings directly */
    def on_event_created: String = js.native
    
    /** @deprecated use strings directly */
    def on_event_deleted: String = js.native
    
    /** @deprecated use strings directly */
    def on_event_notwatching: String = js.native
  }
}
