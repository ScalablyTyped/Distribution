package typings.zookeeper

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object zookeeperMod {
  
  /**
    * A promisified version of the ZooKeeper class
    * @class
    * @extends {ZooKeeper}
    */
  @JSImport("zookeeper", JSImport.Namespace)
  @js.native
  open class ^ protected () extends ZooKeeperPromise {
    def this(config: Any) = this()
  }
  
  /**
    * A promisified version of the ZooKeeper class
    * @class
    * @extends {ZooKeeper}
    */
  @js.native
  trait ZooKeeperPromise
    extends typings.zookeeper.zookeeperWithCallbacksMod.^ {
    
    /**
      * @param {string} path
      * @param {(string|Buffer)} data
      * @param {number} flags
      * @param {number|undefined} [ttl=undefined] ttl - positive integer, use only with a TTL flag
      * @fulfill {string}
      * @returns {Promise.<string>}
      */
    def create(path: String, data: String, flags: Double): js.Promise[String] = js.native
    def create(path: String, data: String, flags: Double, ttl: Double): js.Promise[String] = js.native
    def create(path: String, data: Buffer, flags: Double): js.Promise[String] = js.native
    def create(path: String, data: Buffer, flags: Double, ttl: Double): js.Promise[String] = js.native
    
    /**
      * @param {string} path
      * @param {number} version - an int32 value
      * @returns {Promise}
      */
    def delete_(path: String, version: Double): js.Promise[Any] = js.native
    
    /**
      * @param {string} path
      * @param {boolean} watch
      * @fulfill {stat}
      * @returns {Promise.<stat>}
      */
    def exists(path: String, watch: Boolean): js.Promise[stat] = js.native
    
    /**
      * @param {string} path
      * @param {boolean} watch
      * @fulfill {Array} [stat, data] - stat: object, data: string|Buffer
      * @returns {Promise.<Array>} [stat, data] - stat: object, data: string|Buffer
      */
    def get(path: String, watch: Boolean): js.Promise[js.Array[Any]] = js.native
    
    /**
      * @param {string} path
      * @fulfill {acl}
      * @returns {Promise.<acl>}
      */
    def get_acl(path: String): js.Promise[acl] = js.native
    
    /**
      * @param {string} path
      * @param {boolean} watch
      * @fulfill {Array.<string>}
      * @returns {Promise.<Array.<string>>}
      */
    def get_children(path: String, watch: Boolean): js.Promise[js.Array[String]] = js.native
    
    /**
      * @param {string} path
      * @param {boolean} watch
      * @fulfill {Array} [children, stat] - children: an array of strings, stat: object
      * @returns {Promise.<Array>} [children, stat] - children: an array of strings, stat: object
      */
    def get_children2(path: String, watch: Boolean): js.Promise[js.Array[Any]] = js.native
    
    /**
      * @param {boolean} watch
      * @fulfill {string|Buffer}
      * @returns {Promise.<string|Buffer>}
      */
    def getconfig(watch: Boolean): js.Promise[String | Buffer] = js.native
    
    /**
      * @deprecated
      * returns {ZkPromise}
      */
    def on_connected(): typings.zookeeper.zookeeperDeprecatedPromiseMod.^ = js.native
    
    /**
      * @param {string} path
      * @param {boolean} watch
      * @fulfill {boolean}
      * @returns {Promise.<boolean>}
      */
    def pathExists(path: String, watch: Boolean): js.Promise[Boolean] = js.native
    
    /**
      * @private
      * @param {function} fn
      * @param {Array} args
      * @returns {ZkPromise}
      */
    /* private */ var promisify: Any = js.native
    
    /**
      * @param {string|null} joining
      * @param {string|null} leaving
      * @param {string|null} members
      * @param {number} config_version
      * @returns {*}
      */
    def reconfig(joining: String, leaving: String, members: String, config_version: Double): Any = js.native
    def reconfig(joining: String, leaving: String, members: Null, config_version: Double): Any = js.native
    def reconfig(joining: String, leaving: Null, members: String, config_version: Double): Any = js.native
    def reconfig(joining: String, leaving: Null, members: Null, config_version: Double): Any = js.native
    def reconfig(joining: Null, leaving: String, members: String, config_version: Double): Any = js.native
    def reconfig(joining: Null, leaving: String, members: Null, config_version: Double): Any = js.native
    def reconfig(joining: Null, leaving: Null, members: String, config_version: Double): Any = js.native
    def reconfig(joining: Null, leaving: Null, members: Null, config_version: Double): Any = js.native
    
    /**
      * @param {string} path
      * @param {(string|Buffer)} data
      * @param {number} version - an int32 value
      * @fulfill {stat}
      * @returns {Promise.<stat>}
      */
    def set(path: String, data: String, version: Double): js.Promise[stat] = js.native
    def set(path: String, data: Buffer, version: Double): js.Promise[stat] = js.native
    
    /**
      * @param {string} path
      * @param {number} version - an int32 value
      * @param {acl} acl
      * @returns {Promise}
      */
    def set_acl(path: String, version: Double, acl: acl): js.Promise[Any] = js.native
    
    /**
      * @param {string} path
      * @returns {Promise}
      */
    def sync(path: String): js.Promise[Any] = js.native
    
    /**
      * @param {string} path
      * @param {function} watchCb
      * @fulfill {stat}
      * @returns {Promise.<stat>}
      */
    def w_exists(path: String, watchCb: js.Function): js.Promise[stat] = js.native
    
    /**
      * @param {string} path
      * @param {function} watchCb
      * @fulfill {Array} [stat, data] - stat: object, data: string|Buffer
      * @returns {Promise.<Array>} [stat, data] - stat: object, data: string|Buffer
      */
    def w_get(path: String, watchCb: js.Function): js.Promise[js.Array[Any]] = js.native
    
    /**
      * @param {string} path
      * @param {function} watchCb
      * @fulfill {Array.<string>}
      * @returns {Promise.<Array.<string>>}
      */
    def w_get_children(path: String, watchCb: js.Function): js.Promise[js.Array[String]] = js.native
    
    /**
      * @param {string} path
      * @param {function} watchCb
      * @fulfill {Array} [children, stat] - children: an array of strings, stat: object
      * @returns {Promise.<Array>} [children, stat] - children: an array of strings, stat: object
      */
    def w_get_children2(path: String, watchCb: js.Function): js.Promise[js.Array[Any]] = js.native
    
    /**
      * @param {function} watchCb
      * @fulfill {string|Buffer}
      * @returns {Promise.<string|Buffer>}
      */
    def w_getconfig(watchCb: js.Function): js.Promise[String | Buffer] = js.native
    
    /**
      * @param {string} path
      * @param {function} watchCb
      * @fulfill {boolean}
      * @returns {Promise.<boolean>}
      */
    def w_pathExists(path: String, watchCb: js.Function): js.Promise[Boolean] = js.native
  }
  
  /**
    * @class
    * @extends {EventEmitter}
    */
  /* was `typeof imported_zookeeperWithCallbacks` */
  type ZooKeeperPromiseBase = typings.zookeeper.zookeeperWithCallbacksMod.^
}
