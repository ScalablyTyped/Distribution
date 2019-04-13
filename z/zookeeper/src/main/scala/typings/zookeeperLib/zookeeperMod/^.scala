package typings
package zookeeperLib.zookeeperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("zookeeper", JSImport.Namespace)
@js.native
class ^ protected () extends Zookeeper {
  def this(options: ConnectionOptions) = this()
}

@JSImport("zookeeper", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val ZOO_CREATOR_ALL_ACL: scala.Double = js.native
  // Dunno
  val ZOO_EPHEMERAL: zookeeperLib.zookeeperLibNumbers.`1` = js.native
  val ZOO_LOG_LEVEL_DEBUG: zookeeperLib.zookeeperLibNumbers.`4` = js.native
  // log levels
  val ZOO_LOG_LEVEL_ERROR: zookeeperLib.zookeeperLibNumbers.`1` = js.native
  val ZOO_LOG_LEVEL_INFO: zookeeperLib.zookeeperLibNumbers.`3` = js.native
  val ZOO_LOG_LEVEL_WARN: zookeeperLib.zookeeperLibNumbers.`2` = js.native
  // acl permissions
  val ZOO_OPEN_ACL_UNSAFE: scala.Double = js.native
  val ZOO_PERM_ADMIN: zookeeperLib.zookeeperLibNumbers.`16` = js.native
  val ZOO_PERM_ALL: zookeeperLib.zookeeperLibNumbers.`31` = js.native
  val ZOO_PERM_CREATE: zookeeperLib.zookeeperLibNumbers.`4` = js.native
  val ZOO_PERM_DELETE: zookeeperLib.zookeeperLibNumbers.`8` = js.native
  val ZOO_PERM_READ: zookeeperLib.zookeeperLibNumbers.`1` = js.native
  val ZOO_PERM_WRITE: zookeeperLib.zookeeperLibNumbers.`2` = js.native
  val ZOO_READ_ACL_UNSAFE: scala.Double = js.native
  val ZOO_SEQUENCE: zookeeperLib.zookeeperLibNumbers.`2` = js.native
}

