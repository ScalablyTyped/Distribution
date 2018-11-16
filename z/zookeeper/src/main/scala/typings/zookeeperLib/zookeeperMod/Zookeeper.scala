package typings
package zookeeperLib.zookeeperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Zookeeper extends Client {
  def close(): scala.Unit = js.native
  def connect(callback: js.Function2[/* e */ nodeLib.Error | scala.Null, /* client */ Client, scala.Unit]): scala.Unit = js.native
}

