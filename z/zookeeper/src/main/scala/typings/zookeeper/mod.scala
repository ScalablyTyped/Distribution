package typings.zookeeper

import typings.node.Buffer
import typings.std.Error
import typings.zookeeper.anon.Auth
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("zookeeper", JSImport.Namespace)
  @js.native
  class ^ protected ()
    extends StObject
       with Zookeeper {
    def this(options: ConnectionOptions) = this()
  }
  
  @JSImport("zookeeper", "ZOO_CREATOR_ALL_ACL")
  @js.native
  val ZOO_CREATOR_ALL_ACL: Double = js.native
  
  /** node is automatically removed when client session goes away */
  @JSImport("zookeeper", "ZOO_EPHEMERAL")
  @js.native
  val ZOO_EPHEMERAL: /* 1 */ Double = js.native
  
  @JSImport("zookeeper", "ZOO_LOG_LEVEL_DEBUG")
  @js.native
  val ZOO_LOG_LEVEL_DEBUG: /* 4 */ Double = js.native
  
  // log levels
  @JSImport("zookeeper", "ZOO_LOG_LEVEL_ERROR")
  @js.native
  val ZOO_LOG_LEVEL_ERROR: /* 1 */ Double = js.native
  
  @JSImport("zookeeper", "ZOO_LOG_LEVEL_INFO")
  @js.native
  val ZOO_LOG_LEVEL_INFO: /* 3 */ Double = js.native
  
  @JSImport("zookeeper", "ZOO_LOG_LEVEL_WARN")
  @js.native
  val ZOO_LOG_LEVEL_WARN: /* 2 */ Double = js.native
  
  // acl permissions
  @JSImport("zookeeper", "ZOO_OPEN_ACL_UNSAFE")
  @js.native
  val ZOO_OPEN_ACL_UNSAFE: Double = js.native
  
  @JSImport("zookeeper", "ZOO_PERM_ADMIN")
  @js.native
  val ZOO_PERM_ADMIN: /* 16 */ Double = js.native
  
  @JSImport("zookeeper", "ZOO_PERM_ALL")
  @js.native
  val ZOO_PERM_ALL: /* 31 */ Double = js.native
  
  @JSImport("zookeeper", "ZOO_PERM_CREATE")
  @js.native
  val ZOO_PERM_CREATE: /* 4 */ Double = js.native
  
  @JSImport("zookeeper", "ZOO_PERM_DELETE")
  @js.native
  val ZOO_PERM_DELETE: /* 8 */ Double = js.native
  
  @JSImport("zookeeper", "ZOO_PERM_READ")
  @js.native
  val ZOO_PERM_READ: /* 1 */ Double = js.native
  
  @JSImport("zookeeper", "ZOO_PERM_WRITE")
  @js.native
  val ZOO_PERM_WRITE: /* 2 */ Double = js.native
  
  @JSImport("zookeeper", "ZOO_READ_ACL_UNSAFE")
  @js.native
  val ZOO_READ_ACL_UNSAFE: Double = js.native
  
  /** unique monotonically increasing sequence number is appended to the path name */
  @JSImport("zookeeper", "ZOO_SEQUENCE")
  @js.native
  val ZOO_SEQUENCE: /* 2 */ Double = js.native
  
  type ACL = Double | Auth
  
  type Callback[T] = js.Function3[/* rc */ Double, /* error */ String, /* value */ T, Unit]
  
  @js.native
  trait Client extends StObject {
    
    def a_create(path: String, data: String, flags: Double, callback: Callback[String]): Unit = js.native
    def a_create(path: String, data: Buffer, flags: Double, callback: Callback[String]): Unit = js.native
    
    def a_delete_(path: String, version: Double, callback: Callback[Unit]): Unit = js.native
    
    def a_exists(path: String, watch: Boolean, callback: Callback[Stat]): Unit = js.native
    
    def a_get(path: String, watch: Boolean, callback: Callback[Buffer | String]): Unit = js.native
    
    def a_get_acl(path: String, callback: aclCallback): Unit = js.native
    
    def a_get_children(path: String, watch: Boolean, callback: Callback[js.Array[String]]): Unit = js.native
    
    def a_get_children2(path: String, watch: Boolean, callback: child2Callback): Unit = js.native
    
    def a_set(path: String, data: String, version: Double, callback: Callback[Stat]): Unit = js.native
    def a_set(path: String, data: Buffer, version: Double, callback: Callback[Stat]): Unit = js.native
    
    def a_set_acl(path: String, version: Double, acl: js.Array[ACL], callback: Callback[Unit]): Unit = js.native
    
    def add_auth(schema: String, auth: String, callback: Callback[Unit]): Unit = js.native
    
    def aw_exists(path: String, watch_callback: watchCallback, callback: Callback[Stat]): Unit = js.native
    
    def aw_get(path: String, watch_callback: watchCallback, callback: Callback[Buffer | String]): Unit = js.native
    
    def aw_get_children(path: String, watch_callback: watchCallback, callback: Callback[js.Array[String]]): Unit = js.native
    
    def aw_get_children2(path: String, watch_callback: watchCallback, callback: child2Callback): Unit = js.native
    
    var client_id: js.UndefOr[String] = js.native
    
    var client_password: js.UndefOr[js.Any] = js.native
    
    var is_unrecoverable: js.UndefOr[Boolean] = js.native
    
    def mkdirp(path: String, callback: js.Function1[/* e */ js.UndefOr[Error], Unit]): Unit = js.native
    
    var state: js.UndefOr[Double] = js.native
    
    var timeout: js.UndefOr[Double] = js.native
  }
  
  trait ConnectionOptions extends StObject {
    
    var connect: js.UndefOr[String] = js.undefined
    
    var data_as_buffer: js.UndefOr[Boolean] = js.undefined
    
    var debug_level: js.UndefOr[Double] = js.undefined
    
    var host_order_deterministic: js.UndefOr[Boolean] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object ConnectionOptions {
    
    @scala.inline
    def apply(): ConnectionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConnectionOptions]
    }
    
    @scala.inline
    implicit class ConnectionOptionsMutableBuilder[Self <: ConnectionOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConnect(value: String): Self = StObject.set(x, "connect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectUndefined: Self = StObject.set(x, "connect", js.undefined)
      
      @scala.inline
      def setData_as_buffer(value: Boolean): Self = StObject.set(x, "data_as_buffer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setData_as_bufferUndefined: Self = StObject.set(x, "data_as_buffer", js.undefined)
      
      @scala.inline
      def setDebug_level(value: Double): Self = StObject.set(x, "debug_level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebug_levelUndefined: Self = StObject.set(x, "debug_level", js.undefined)
      
      @scala.inline
      def setHost_order_deterministic(value: Boolean): Self = StObject.set(x, "host_order_deterministic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHost_order_deterministicUndefined: Self = StObject.set(x, "host_order_deterministic", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  trait Stat extends StObject {
    
    var aversion: Double
    
    var ctime: Double
    
    var cversion: Double
    
    var czxid: Double
    
    var dataLength: Double
    
    var ephemeralOwner: String
    
    var mtime: Double
    
    var mzxid: Double
    
    var numChildren: Double
    
    var pzxid: Double
    
    var version: Double
  }
  object Stat {
    
    @scala.inline
    def apply(
      aversion: Double,
      ctime: Double,
      cversion: Double,
      czxid: Double,
      dataLength: Double,
      ephemeralOwner: String,
      mtime: Double,
      mzxid: Double,
      numChildren: Double,
      pzxid: Double,
      version: Double
    ): Stat = {
      val __obj = js.Dynamic.literal(aversion = aversion.asInstanceOf[js.Any], ctime = ctime.asInstanceOf[js.Any], cversion = cversion.asInstanceOf[js.Any], czxid = czxid.asInstanceOf[js.Any], dataLength = dataLength.asInstanceOf[js.Any], ephemeralOwner = ephemeralOwner.asInstanceOf[js.Any], mtime = mtime.asInstanceOf[js.Any], mzxid = mzxid.asInstanceOf[js.Any], numChildren = numChildren.asInstanceOf[js.Any], pzxid = pzxid.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[Stat]
    }
    
    @scala.inline
    implicit class StatMutableBuilder[Self <: Stat] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAversion(value: Double): Self = StObject.set(x, "aversion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCtime(value: Double): Self = StObject.set(x, "ctime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCversion(value: Double): Self = StObject.set(x, "cversion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCzxid(value: Double): Self = StObject.set(x, "czxid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataLength(value: Double): Self = StObject.set(x, "dataLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEphemeralOwner(value: String): Self = StObject.set(x, "ephemeralOwner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMtime(value: Double): Self = StObject.set(x, "mtime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMzxid(value: Double): Self = StObject.set(x, "mzxid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumChildren(value: Double): Self = StObject.set(x, "numChildren", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPzxid(value: Double): Self = StObject.set(x, "pzxid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Zookeeper
    extends StObject
       with Client {
    
    def close(): Unit = js.native
    
    def connect(callback: js.Function2[/* e */ Error | Null, /* client */ Client, Unit]): Unit = js.native
  }
  
  type aclCallback = js.Function4[/* rc */ Double, /* error */ String, /* acl */ js.Array[ACL], /* stat */ Stat, Unit]
  
  type child2Callback = js.Function4[
    /* rc */ Double, 
    /* error */ String, 
    /* children */ js.Array[String], 
    /* stat */ Stat, 
    Unit
  ]
  
  type watchCallback = js.Function3[/* type */ Double, /* state */ Double, /* path */ String, Unit]
}
