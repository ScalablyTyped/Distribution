package typings.zookeeper.zookeeperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Stat extends js.Object {
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
    val __obj = js.Dynamic.literal(aversion = aversion, ctime = ctime, cversion = cversion, czxid = czxid, dataLength = dataLength, ephemeralOwner = ephemeralOwner, mtime = mtime, mzxid = mzxid, numChildren = numChildren, pzxid = pzxid, version = version)
  
    __obj.asInstanceOf[Stat]
  }
}

