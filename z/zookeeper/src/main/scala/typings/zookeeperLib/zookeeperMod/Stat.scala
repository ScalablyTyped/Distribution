package typings
package zookeeperLib.zookeeperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Stat extends js.Object {
  var aversion: scala.Double
  var ctime: scala.Double
  var cversion: scala.Double
  var czxid: scala.Double
  var dataLength: scala.Double
  var ephemeralOwner: java.lang.String
  var mtime: scala.Double
  var mzxid: scala.Double
  var numChildren: scala.Double
  var pzxid: scala.Double
  var version: scala.Double
}

object Stat {
  @scala.inline
  def apply(
    aversion: scala.Double,
    ctime: scala.Double,
    cversion: scala.Double,
    czxid: scala.Double,
    dataLength: scala.Double,
    ephemeralOwner: java.lang.String,
    mtime: scala.Double,
    mzxid: scala.Double,
    numChildren: scala.Double,
    pzxid: scala.Double,
    version: scala.Double
  ): Stat = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("aversion")(aversion)
    __obj.updateDynamic("ctime")(ctime)
    __obj.updateDynamic("cversion")(cversion)
    __obj.updateDynamic("czxid")(czxid)
    __obj.updateDynamic("dataLength")(dataLength)
    __obj.updateDynamic("ephemeralOwner")(ephemeralOwner)
    __obj.updateDynamic("mtime")(mtime)
    __obj.updateDynamic("mzxid")(mzxid)
    __obj.updateDynamic("numChildren")(numChildren)
    __obj.updateDynamic("pzxid")(pzxid)
    __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[Stat]
  }
}

