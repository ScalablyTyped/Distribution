package typings.yog2Kernel.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CleanCache extends js.Object {
  // 清除viewcache
  def cleanCache(): Unit
}

object CleanCache {
  @scala.inline
  def apply(cleanCache: () => Unit): CleanCache = {
    val __obj = js.Dynamic.literal(cleanCache = js.Any.fromFunction0(cleanCache))
    __obj.asInstanceOf[CleanCache]
  }
}

