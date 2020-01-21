package typings.yog2Kernel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCleanCache extends js.Object {
  // 清除viewcache
  def cleanCache(): Unit
}

object AnonCleanCache {
  @scala.inline
  def apply(cleanCache: () => Unit): AnonCleanCache = {
    val __obj = js.Dynamic.literal(cleanCache = js.Any.fromFunction0(cleanCache))
  
    __obj.asInstanceOf[AnonCleanCache]
  }
}

