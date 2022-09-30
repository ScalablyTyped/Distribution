package typings.zookeeper

import typings.node.bufferMod.global.Buffer
import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object zookeeperWithCallbacksMod {
  
  /**
    * @class
    * @extends {EventEmitter}
    */
  @JSImport("zookeeperWithCallbacks", JSImport.Namespace)
  @js.native
  open class ^ protected () extends ZooKeeper {
    def this(config: String) = this()
    /** @param {object|string} config */
    def this(config: js.Object) = this()
  }
  
  /**
    * @class
    * @extends {EventEmitter}
    */
  @js.native
  trait ZooKeeper extends EventEmitter {
    
    /**
      * @param {string} path
      * @param {string|Buffer} data
      * @param {number} flags - an int32 value
      * @param {pathCb} pathCb
      * @returns {*}
      */
    def a_create(path: String, data: String, flags: Double, pathCb: pathCb): Any = js.native
    def a_create(path: String, data: Buffer, flags: Double, pathCb: pathCb): Any = js.native
    
    /**
      * @param {string} path
      * @param {string|Buffer} data
      * @param {number} flags - an int32 value
      * @param {number} ttl - a positive int32 value
      * @param {pathCb} pathCb
      * @returns {*}
      */
    def a_createTtl(path: String, data: String, flags: Double, ttl: Double, pathCb: pathCb): Any = js.native
    def a_createTtl(path: String, data: Buffer, flags: Double, ttl: Double, pathCb: pathCb): Any = js.native
    
    /**
      * @param {string} path
      * @param {number} version - an int32 value
      * @param {voidCb} voidCb
      * @returns {*}
      */
    def a_delete_(path: String, version: Double, voidCb: voidCb): Any = js.native
    
    /**
      * @param {string} path
      * @param {boolean} watch
      * @param {statCb} statCb
      * @returns {*}
      */
    def a_exists(path: String, watch: Boolean, statCb: statCb): Any = js.native
    
    /**
      * @param {string} path
      * @param {boolean} watch
      * @param {dataCb} dataCb
      * @returns {*}
      */
    def a_get(path: String, watch: Boolean, dataCb: dataCb): Any = js.native
    
    /**
      * @param {string} path
      * @param {aclCb} aclCb
      * @returns {*}
      */
    def a_get_acl(path: String, aclCb: aclCb): Any = js.native
    
    /**
      * @param {string} path
      * @param {boolean} watch
      * @param {childCb} childCb
      * @returns {*}
      */
    def a_get_children(path: String, watch: Boolean, childCb: childCb): Any = js.native
    
    /**
      * @param {string} path
      * @param {boolean} watch
      * @param {child2Cb} childCb
      * @returns {*}
      */
    def a_get_children2(path: String, watch: Boolean, childCb: child2Cb): Any = js.native
    
    /**
      * @param {boolean} watch
      * @param {dataCb} dataCb
      * @returns {*}
      */
    def a_getconfig(watch: Boolean, dataCb: dataCb): Any = js.native
    
    /**
      * @param {string|null} joining
      * @param {string|null} leaving
      * @param {string|null} members
      * @param {number} config_version
      * @param {dataCb} dataCb
      * @returns {*}
      */
    def a_reconfig(joining: String, leaving: String, members: String, config_version: Double, dataCb: dataCb): Any = js.native
    def a_reconfig(joining: String, leaving: String, members: Null, config_version: Double, dataCb: dataCb): Any = js.native
    def a_reconfig(joining: String, leaving: Null, members: String, config_version: Double, dataCb: dataCb): Any = js.native
    def a_reconfig(joining: String, leaving: Null, members: Null, config_version: Double, dataCb: dataCb): Any = js.native
    def a_reconfig(joining: Null, leaving: String, members: String, config_version: Double, dataCb: dataCb): Any = js.native
    def a_reconfig(joining: Null, leaving: String, members: Null, config_version: Double, dataCb: dataCb): Any = js.native
    def a_reconfig(joining: Null, leaving: Null, members: String, config_version: Double, dataCb: dataCb): Any = js.native
    def a_reconfig(joining: Null, leaving: Null, members: Null, config_version: Double, dataCb: dataCb): Any = js.native
    
    /**
      * @param {string} path
      * @param {string|Buffer} data
      * @param {number} version - an int32 value
      * @param {statCb} statCb
      * @returns {*}
      */
    def a_set(path: String, data: String, version: Double, statCb: statCb): Any = js.native
    def a_set(path: String, data: Buffer, version: Double, statCb: statCb): Any = js.native
    
    /**
      * @param {string} path
      * @param {number} version - an int32 value
      * @param {acl} acl
      * @param {voidCb} voidCb
      * @returns {*}
      */
    def a_set_acl(path: String, version: Double, acl: acl, voidCb: voidCb): Any = js.native
    
    /**
      * @param {string} path
      * @param {function} cb
      * @returns {*}
      */
    def a_sync(path: String, cb: js.Function): Any = js.native
    
    /**
      * @param {string} scheme
      * @param {string} auth
      * @param {voidCb} voidCb
      * @returns {*}
      */
    def add_auth(scheme: String, auth: String, voidCb: voidCb): Any = js.native
    
    /**
      * @param {string} path
      * @param {watchCb} watchCb
      * @param {statCb} statCb
      * @returns {*}
      */
    def aw_exists(path: String, watchCb: watchCb, statCb: statCb): Any = js.native
    
    /**
      * @param {string} path
      * @param {watchCb} watchCb
      * @param {dataCb} dataCb
      * @returns {*}
      */
    def aw_get(path: String, watchCb: watchCb, dataCb: dataCb): Any = js.native
    
    /**
      * @param {string} path
      * @param {watchCb} watchCb
      * @param {childCb} childCb
      * @returns {*}
      */
    def aw_get_children(path: String, watchCb: watchCb, childCb: childCb): Any = js.native
    
    /**
      * @param {string} path
      * @param {watchCb} watchCb
      * @param {child2Cb} childCb
      * @returns {*}
      */
    def aw_get_children2(path: String, watchCb: watchCb, childCb: child2Cb): Any = js.native
    
    /**
      * @param {watchCb} watchCb
      * @param {dataCb} dataCb
      * @returns {*}
      */
    def aw_getconfig(watchCb: watchCb, dataCb: dataCb): Any = js.native
    
    def client_id: Double = js.native
    /** @param {number} value */
    def client_id_=(arg: Double): Unit = js.native
    
    def client_password: String = js.native
    /** @param {string} value */
    def client_password_=(arg: String): Unit = js.native
    
    /** @returns {*} */
    def close(): Any = js.native
    
    var config: Any = js.native
    
    def connect(options: js.Function, cb: connectCb): Unit = js.native
    /**
      * @param {object|function} options
      * @param {connectCb} cb
      */
    def connect(options: js.Object, cb: connectCb): Unit = js.native
    
    var connectHandler: Any = js.native
    
    /**
      * @deprecated Use setEncoding()
      * @returns {boolean}
      */
    def data_as_buffer: Boolean = js.native
    /** @param {boolean} data_as_buffer */
    def data_as_buffer_=(arg: Boolean): Unit = js.native
    
    var encoding: String = js.native
    
    var errorHandler: Any = js.native
    
    def init(config: String): ZooKeeper = js.native
    /**
      * @param {object|string} config
      * @returns {ZooKeeper}
      */
    def init(config: js.Object): ZooKeeper = js.native
    
    def is_unrecoverable: Double = js.native
    /** @param {number} value */
    def is_unrecoverable_=(arg: Double): Unit = js.native
    
    /** @param {...*} args */
    def log(args: Any*): Unit = js.native
    
    var logger: Any = js.native
    
    /**
      * @param {string} path
      * @param {mkdirCb} cb
      */
    def mkdirp(path: String, cb: mkdirCb): Unit = js.native
    
    var native: Any = js.native
    
    /** @param {string} value */
    def setEncoding(value: String): Unit = js.native
    
    /** @param {object|boolean} logger */
    def setLogger(logger: js.Object): Unit = js.native
    def setLogger(logger: Boolean): Unit = js.native
    
    /**
      * @param {string} servers
      * @returns {*}
      */
    def set_servers(servers: String): Any = js.native
    
    def state: Double = js.native
    /** @param {number} value */
    def state_=(arg: Double): Unit = js.native
    
    def timeout: Double = js.native
    /** @param {number} value */
    def timeout_=(arg: Double): Unit = js.native
  }
  
  /**
    * The `EventEmitter` class is defined and exposed by the `events` module:
    *
    * ```js
    * const EventEmitter = require('events');
    * ```
    *
    * All `EventEmitter`s emit the event `'newListener'` when new listeners are
    * added and `'removeListener'` when existing listeners are removed.
    *
    * It supports the following option:
    * @since v0.1.26
    */
  /* was `typeof imported_events.EventEmitter` */
  type ZooKeeperBase = EventEmitter
}
