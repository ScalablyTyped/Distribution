package typings.zookeeper.zookeeperMod

import typings.zookeeper.zookeeperNumbers.`16`
import typings.zookeeper.zookeeperNumbers.`1`
import typings.zookeeper.zookeeperNumbers.`2`
import typings.zookeeper.zookeeperNumbers.`31`
import typings.zookeeper.zookeeperNumbers.`3`
import typings.zookeeper.zookeeperNumbers.`4`
import typings.zookeeper.zookeeperNumbers.`8`
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
  val ZOO_CREATOR_ALL_ACL: Double = js.native
  // Dunno
  val ZOO_EPHEMERAL: `1` = js.native
  val ZOO_LOG_LEVEL_DEBUG: `4` = js.native
  // log levels
  val ZOO_LOG_LEVEL_ERROR: `1` = js.native
  val ZOO_LOG_LEVEL_INFO: `3` = js.native
  val ZOO_LOG_LEVEL_WARN: `2` = js.native
  // acl permissions
  val ZOO_OPEN_ACL_UNSAFE: Double = js.native
  val ZOO_PERM_ADMIN: `16` = js.native
  val ZOO_PERM_ALL: `31` = js.native
  val ZOO_PERM_CREATE: `4` = js.native
  val ZOO_PERM_DELETE: `8` = js.native
  val ZOO_PERM_READ: `1` = js.native
  val ZOO_PERM_WRITE: `2` = js.native
  val ZOO_READ_ACL_UNSAFE: Double = js.native
  val ZOO_SEQUENCE: `2` = js.native
}

